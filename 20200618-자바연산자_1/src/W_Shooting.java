import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Vector;


public class W_Shooting {

	public static void main(String[] args) 
	{
		System.out.println("Start!");
		W_Shooting_frame wsf=new W_Shooting_frame();
	}

}
class W_Shooting_frame extends Frame implements KeyListener, Runnable
{
	//�⺻ �����츦 �����ϴ� �������� �����
	//KeyListener : Ű���� �Է� �̺�Ʈ�� �޴´�
	//Runnable : �����带 �����ϰ� �Ѵ�

	public final static int UP_PRESSED		=0x001;
	public final static int DOWN_PRESSED	=0x002;
	public final static int LEFT_PRESSED	=0x004;
	public final static int RIGHT_PRESSED	=0x008;
	public final static int FIRE_PRESSED	=0x010;
	
	GameScreen gamescreen;//Canvas ��ü�� ����� ȭ�� ��ȭ ���� Ŭ����

	Thread mainwork;//������ ��ü
	boolean roof=true;//������ ���� ����
	Random rnd = new Random();	 // ���� ����

	//���� ��� ���� ����
	int status;//������ ����
	int cnt;//���� ����� ��Ʈ�� ����
	int delay;//���� ������. 1/1000�� ����.
	long pretime;//���� ������ �����ϱ� ���� �ð� üũ��
	int keybuff;//Ű ���۰�

	//AudioClip[] aclip=new AudioClip[3];

	//���ӿ� ����
	int score;//����
	int mylife;//���� ���
	int gamecnt;//���� �帧 ��Ʈ��
	int scrspeed=16;//��ũ�� �ӵ�
	int level;//���� ����

	int myx,myy;//�÷��̾� ��ġ. ȭ�� ��ǥ�迡 *100 �� ����.
	int myspeed;//�÷��̾� �̵� �ӵ�
	int mydegree;//�÷��̾� �̵� ����
		//���� 4����Ű-8���� ���۰迡���� �̵� ������ ������ �������� ������ ���⼭�� �巡 ��ġ��ũ�� �������̽���
		//�̽ĵ� ���� ����� 4����Ű ���۰踦 0, 45, 90, 135, 180, 225, 270, 315�� �������� �����ϴ� ������ �Ѵ�.
	int mywidth, myheight;//�÷��̾� ĳ������ �ʺ� ����
	int mymode=1;//�÷��̾� ĳ������ ���� (0���� ������� ����,����(����),���÷���,������,���)
	int myimg;//�÷��̾� �̹���
	int mycnt;
	boolean myshoot=false;//�Ѿ� �߻簡 ������ �ִ°�
	int myshield;//�ǵ� ���� ����
	boolean my_inv=false;//Ű���� ����

	int gScreenWidth=640;//���� ȭ�� �ʺ�
	int gScreenHeight=480;//���� ȭ�� ����

	Vector bullets=new Vector();//�Ѿ� ����. �Ѿ��� ������ ������ �� ���� ������ ���������� �����Ѵ�.
	Vector enemies=new Vector();//�� ĳ���� ����.
	Vector effects=new Vector();//����Ʈ ����
	Vector items=new Vector();//������ ����
	//���� ���̺��� ����� ������ ó���ӵ��� �ǿ����� ��ĥ �� �ִ�.

	//�ӵ��� ���ؼ��� ũ�⸦ �˳��ϰ� ���� ���̺��� ����ϴµ�, �ҽ��� ������������, ���ʿ��� �޸𸮸� �����ϰ� �ǹǷ� ������ ���� �����Ѵ�.
	//��, C ���̽� �÷������� �̽��� ��츦 ����� �Ѵٸ� class�� Vector, Hashtable ���� ���� �̽��ϱ� ��������Ƿ� ������ ���Ѵ�.
	
	W_Shooting_frame(){

		//�⺻���� ������ ���� ����. ���Ӱ� �������� ����� ���� ���� ������ ���� â�� �غ��ϴ� ����.
		setIconImage(makeImage("c:\\rsc\\icon.png"));
		setBackground(new Color(0xffffff));//������ �⺻ ���� ���� (R=ff, G=ff, B=ff : �Ͼ��)
		setTitle("Fan Game");//������ �̸� ����
		setLayout(null);//�������� ���̾ƿ��� ������ ����
		setBounds(100,100,640,480);//�������� ���� ��ġ�� �ʺ� ���� ����
		setResizable(false);//�������� ũ�⸦ ������ �� ����
		setVisible(true);//������ ǥ��
		
		addKeyListener(this);//Ű �Է� �̺�Ʈ ������ Ȱ��ȭ
		addWindowListener(new MyWindowAdapter());//�������� �ݱ� ��ư Ȱ��ȭ

		gamescreen=new GameScreen(this);//ȭ�� ��ȭ�� ���� ĵ���� ��ü
		gamescreen.setBounds(0,0,gScreenWidth,gScreenHeight);
		add(gamescreen);//Canvas ��ü�� �����ӿ� �ø���

		systeminit();
		initialize();
	}

	public void systeminit(){//���α׷� �ʱ�ȭ

		status=0;
		cnt=0;
		delay=17;// 17/1000�� = 58 (������/��)
		keybuff=0;

		mainwork=new Thread(this);
		mainwork.start();
	}
	public void initialize(){//���� �ʱ�ȭ

		Init_TITLE();
		gamescreen.repaint();
	}

	// ������ ��Ʈ
	public void run(){
		try
		{
			while(roof){
				pretime=System.currentTimeMillis();

				gamescreen.repaint();//ȭ�� ������Ʈ
				process();//���� ó��
				keyprocess();//Ű ó��

				if(System.currentTimeMillis()-pretime<delay) Thread.sleep(delay-System.currentTimeMillis()+pretime);
					//���� ������ ó���ϴµ� �ɸ� �ð��� üũ�ؼ� �����̰����� �����Ͽ� �����̸� �����ϰ� �����Ѵ�.
					//���� ���� �ð��� ������ �ð����� ũ�ٸ� ���� �ӵ��� �������� �ȴ�.

				if(status!=4) cnt++;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// Ű �̺�Ʈ ������ ó��
	public void keyPressed(KeyEvent e) {
		//if(status==2&&(mymode==2||mymode==0)){
		if(status==2){
			switch(e.getKeyCode()){
			case KeyEvent.VK_SPACE:
				keybuff|=FIRE_PRESSED;
				break;
			case KeyEvent.VK_LEFT:
				keybuff|=LEFT_PRESSED;//��ƼŰ�� ������ ó��
				break;
			case KeyEvent.VK_UP:
				keybuff|=UP_PRESSED;
				break;
			case KeyEvent.VK_RIGHT:
				keybuff|=RIGHT_PRESSED;
				break;
			case KeyEvent.VK_DOWN:
				keybuff|=DOWN_PRESSED;
				break;
			case KeyEvent.VK_1:
				if(myspeed>1) myspeed--;
				break;
			case KeyEvent.VK_2:
				if(myspeed<9) myspeed++;
				break;
			case KeyEvent.VK_3:
				if(status==2) status=4;
				break;
			/*case KeyEvent.VK_1:
				System.out.println("����Ʈ �׽�Ʈ");
				Effect effect=new Effect(0, RAND(30,gScreenWidth-30)*100,RAND(30,gScreenHeight-30)*100, 0);
				effects.add(effect);
				break;*/
			default:
				break;
			}
		} else if(status!=2) keybuff=e.getKeyCode();
	}
	public void keyReleased(KeyEvent e) {
		//if(status==2&&(mymode==2||mymode==0)){
		//if(status==2){
			switch(e.getKeyCode()){
			case KeyEvent.VK_SPACE:
				keybuff&=~FIRE_PRESSED;
				myshoot=true;
				break;
			case KeyEvent.VK_LEFT:
				keybuff&=~LEFT_PRESSED;//��ƼŰ�� ���� ó��
				break;
			case KeyEvent.VK_UP:
				keybuff&=~UP_PRESSED;
				break;
			case KeyEvent.VK_RIGHT:
				keybuff&=~RIGHT_PRESSED;
				break;
			case KeyEvent.VK_DOWN:
				keybuff&=~DOWN_PRESSED;
				break;
			}
		//}
		//PC ȯ�濡���� �⺻������ Ű������ �ݺ��Է��� ����������,
		//�׷��� ���� �÷��������� Ű ���۰��� ���� ������ ������ ���� ������ ����Ʈ ���θ� �����Ѵ�.
	}
	public void keyTyped(KeyEvent e) {
	}

	// ���� �Ǵ�, ������ �̺�Ʈ, CPU ���� ó��
	private void process(){
		switch(status){
		case 0://Ÿ��Ʋȭ��
			break;
		case 1://��ŸƮ
			process_MY();
			if(mymode==2) status=2;
			break;
		case 2://����ȭ��
			process_MY();
			process_ENEMY();
			process_BULLET();
			process_EFFECT();
			process_GAMEFLOW();
			process_ITEM();
			break;
		case 3://���ӿ���
			process_ENEMY();
			process_BULLET();
			process_GAMEFLOW();
			break;
		case 4://�Ͻ�����
			break;
		default:
			break;
		}
		if(status!=4) gamecnt++;
	}

	// Ű �Է� ó��
	// Ű �̺�Ʈ���� �Է� ó���� �� ���, �̺�Ʈ ���������� �߻��� �� �����Ƿ� �̺�Ʈ������ Ű ���۸��� �����ϰ�, ���� ������ ���۰��� ���� ó���� �Ѵ�.
	private void keyprocess(){
		switch(status){
		case 0://Ÿ��Ʋȭ��
			if(keybuff==KeyEvent.VK_SPACE) {
				Init_GAME();
				Init_MY();
				status=1;
			}
			break;
		case 2://����ȭ��
			if(mymode==2||mymode==0){
				switch(keybuff){
				case 0:
					mydegree=-1;
					myimg=0;
					break;
				case FIRE_PRESSED:
					mydegree=-1;
					myimg=6;
					break;
				case UP_PRESSED:
					mydegree=0;
					myimg=2;
					break;
				case UP_PRESSED|FIRE_PRESSED:
					mydegree=0;
					myimg=6;
					break;
				case LEFT_PRESSED:
					mydegree=90;
					myimg=4;
					break;
				case LEFT_PRESSED|FIRE_PRESSED:
					mydegree=90;
					myimg=6;
					break;
				case RIGHT_PRESSED:
					mydegree=270;
					myimg=2;
					break;
				case RIGHT_PRESSED|FIRE_PRESSED:
					mydegree=270;
					myimg=6;
					break;
				case UP_PRESSED|LEFT_PRESSED:
					mydegree=45;
					myimg=4;
					break;
				case UP_PRESSED|LEFT_PRESSED|FIRE_PRESSED:
					mydegree=45;
					myimg=6;
					break;
				case UP_PRESSED|RIGHT_PRESSED:
					mydegree=315;
					myimg=2;
					break;
				case UP_PRESSED|RIGHT_PRESSED|FIRE_PRESSED:
					mydegree=315;
					myimg=6;
					break;
				case DOWN_PRESSED:
					mydegree=180;
					myimg=2;
					break;
				case DOWN_PRESSED|FIRE_PRESSED:
					mydegree=180;
					myimg=6;
					break;
				case DOWN_PRESSED|LEFT_PRESSED:
					mydegree=135;
					myimg=4;
					break;
				case DOWN_PRESSED|LEFT_PRESSED|FIRE_PRESSED:
					mydegree=135;
					myimg=6;
					break;
				case DOWN_PRESSED|RIGHT_PRESSED:
					mydegree=225;
					myimg=2;
					break;
				case DOWN_PRESSED|RIGHT_PRESSED|FIRE_PRESSED:
					mydegree=225;
					myimg=6;
					break;
				default:
					//System.out.println(""+keybuff);
					keybuff=0;
					mydegree=-1;
					myimg=0;
					break;
				}
			}
			break;
		case 3:
			if(gamecnt++>=200&&keybuff==KeyEvent.VK_SPACE){
				Init_TITLE();
				status=0;
				keybuff=0;
			}
			break;
		case 4:
			if(gamecnt++>=200&&keybuff==KeyEvent.VK_3) status=2;
			break;
		default:
			break;
		}
	}


	//�����ƾ �϶�
	public void Init_TITLE(){
		int i;
		/*gamescreen.bg=null;
		gamescreen.bg_f=null;
		for(i=0;i<4;i++) gamescreen.cloud[i]=null;
		for(i=0;i<4;i++) gamescreen.bullet[i]=null;
		gamescreen.enemy[0]=null;
		gamescreen.explo=null;
		gamescreen.item=null;
		gamescreen._start=null;
		gamescreen._over=null;
		System.gc();*/

		gamescreen.title=makeImage("c:\\rsc\\title.png");
		gamescreen.title_key=makeImage("c:\\rsc\\pushspace.png");

		//aclip[0]=myaudio.getClip("./snd/bgm_0.au");
		//aclip[0].loop();
	}
	public void Init_GAME(){
		int i;
		/*gamescreen.title=null;
		gamescreen.title_key=null;
		System.gc();*/

		gamescreen.bg=makeImage("c:\\rsc\\����.JPG");//bg.png
		gamescreen.bgFlip=makeImage("c:\\rsc\\cloud_flip.jpg");//2013-10
		gamescreen.bg_f=makeImage("c:\\rsc\\bg_f.png");
		for(i=0;i<4;i++) gamescreen.cloud[i]=makeImage("c:\\rsc\\cloud"+i+".png");
		for(i=0;i<4;i++) gamescreen.bullet[i]=makeImage("c:\\rsc\\game/bullet_"+i+".png");
		gamescreen.enemy[0]=makeImage("c:\\rsc\\game\\enemy0.png");
		gamescreen.explo=makeImage("c:\\rsc\\game\\explode.png");
		gamescreen.item[0]=makeImage("c:\\rsc\\game\\item0.png");
		gamescreen.item[1]=makeImage("c:\\rsc\\game\\item1.png");
		gamescreen.item[2]=makeImage("c:\\rsc\\game\\item2.png");//������ �߰�
		gamescreen._start=makeImage("c:\\rsc\\game\\start.png");
		gamescreen._over=makeImage("c:\\rsc\\game\\gameover.png");
		gamescreen.shield=makeImage("c:\\rsc\\game\\shield.png");
		gamescreen.enemy[1]=makeImage("c:\\rsc\\game\\enemy1.png");//���� �߰�
		gamescreen.enemy[2]=makeImage("c:\\rsc\\game\\enemy2.png");//��ġ �׿����
		
		gamescreen.num=makeImage("c:\\rsc\\gnum.png");//2013-10
		gamescreen.uiUp=makeImage("c:\\rsc\\ui_up.png");//2013-10
		
		keybuff=0;
		bullets.clear();
		enemies.clear();
		effects.clear();
		items.clear();
		level=0;
		gamecnt=0;
	}
	public void Init_MY(){
		for(int i=0;i<9;i++){
			if(i<10)
				gamescreen.chr[i]=makeImage("c:\\rsc\\player\\my_0"+i+".png");
			else
				gamescreen.chr[i]=makeImage("c:\\rsc\\player\\my_"+i+".png");
		}
		Init_MYDATA();
	}
	public void Init_MYDATA(){
		score=0;
		myx=0;
		myy=23000;
		myspeed=4;
		mydegree=-1;
		//mywidth, myheight;//�÷��̾� ĳ������ �ʺ� ����
		mymode=1;
		myimg=2;
		mycnt=0;
		mylife=3;
		keybuff=0;
	}
	public void process_MY(){
		Bullet shoot;
		switch(mymode){
		case 1:
			myx+=200;
			if(myx>20000) mymode=2;
			break;
		case 0:
			if(mycnt--==0) {
				mymode=2;
				myimg=0;
			}
		case 2:
			if(mydegree!=-1&&my_inv) mydegree=(mydegree+180)%360;
			if(mydegree>-1) {
				myx-=(myspeed*Math.sin(Math.toRadians(mydegree))*100);
				myy-=(myspeed*Math.cos(Math.toRadians(mydegree))*100);
			}
			if(myimg==6) {
				myx-=20;
				if(cnt%4==0||myshoot){
					myshoot=false;
					shoot=new Bullet(myx+2500, myy+1500, 0, 0, RAND(245,265), 8);
					bullets.add(shoot);
					shoot=new Bullet(myx+2500, myy+1500, 0, 0, RAND(268,272), 9);
					bullets.add(shoot);
					shoot=new Bullet(myx+2500, myy+1500, 0, 0, RAND(275,295), 8);
					bullets.add(shoot);
				}
				//8myy+=70;
			}
			break;
		case 3:
			//keybuff=0;
			myimg=8;
			if(mycnt--==0) {
				mymode=0;
				mycnt=50;
			}
			break;
		}
		if(myx<2000) myx=2000;
		if(myx>62000) myx=62000;
		if(myy<3000) myy=3000;
		if(myy>45000) myy=45000;
	}
	public void process_ENEMY(){
		int i;
		Enemy buff;
		for(i=0;i<enemies.size();i++){
			buff=(Enemy)(enemies.elementAt(i));
			if(!buff.move()) enemies.remove(i);
		}
	}
	public void process_BULLET(){
		Bullet buff;
		Enemy ebuff;
		Effect expl;
		int i,j, dist;
		for(i=0;i<bullets.size();i++){
			buff=(Bullet)(bullets.elementAt(i));
			buff.move();
			if(buff.dis.x<10||buff.dis.x>gScreenWidth+10||buff.dis.y<10||buff.dis.y>gScreenHeight+10) {
				bullets.remove(i);//ȭ�� ������ ������ �Ѿ� ����
				continue;
			}
			if(buff.from==0) {//�÷��̾ �� �Ѿ��� ������ ���� ����
				for(j=0;j<enemies.size();j++){
					ebuff=(Enemy)(enemies.elementAt(j));
					dist=GetDistance(buff.dis.x,buff.dis.y, ebuff.dis.x,ebuff.dis.y);
					//if(dist<1500) {//�߰��� �Ÿ��� ���� ������ ������ ������ ���� ��
					if(dist<ebuff.hitrange) {//�߰��� �Ÿ��� ���� ������ ������ ������ ���� �� - hitrange : �� ĳ���͸��� �׸��� ���� ���������Ǵ� ������ �ٸ���
						if(ebuff.life--<=0){//�� ������ ����
							if(ebuff.kind==1){
								if(gamecnt<2100) gamecnt=2100;
							}
							enemies.remove(j);//�� ĳ���� �Ұ�
							expl=new Effect(0, ebuff.pos.x, buff.pos.y, 0);
							effects.add(expl);//���� ����Ʈ �߰�
							//Item tem=new Item(ebuff.pos.x, buff.pos.y, RAND(1,(level+1)*20)/((level+1)*20));//���� ����� �ִ밪�� ���� �����Ǵ� �������� 1�� �ȴ�
							int itemKind=RAND(1,100);
							Item tem;
							if(itemKind<=70)
								tem=new Item(ebuff.pos.x, buff.pos.y,0);
							else if(itemKind<=95)
								tem=new Item(ebuff.pos.x, buff.pos.y,2);
							else
								tem=new Item(ebuff.pos.x, buff.pos.y,1);
							items.add(tem);
						}
						//expl=new Effect(0, ebuff.pos.x, buff.pos.y, 0);
						expl=new Effect(0, buff.pos.x, buff.pos.y, 0);
						effects.add(expl);
						score++;//���� �߰�
						bullets.remove(i);//�Ѿ� �Ұ�
						break;//�Ѿ��� �ҰŵǾ����Ƿ� ���� �ƿ�
					}
				}
			} else {//���� �� �Ѿ��� �÷��̾�� ���� ����
				if(mymode!=2) continue;
				dist=GetDistance(myx/100,myy/100, buff.dis.x,buff.dis.y);
				if(dist<500) {
					if(myshield==0){
						mymode=3;
						mycnt=30;
						bullets.remove(i);
						expl=new Effect(0, myx-2000, myy, 0);
						effects.add(expl);
						if(--mylife<=0) {
							status=3;
							gamecnt=0;
						}
					} else {//�ǵ尡 ���� ���
						myshield--;
						bullets.remove(i);
					}
				}
			}
		}
	}
	public void process_EFFECT(){
		int i;
		Effect buff;
		for(i=0;i<effects.size();i++){
			buff=(Effect)(effects.elementAt(i));
			if(cnt%3==0) buff.cnt--;
			if(buff.cnt==0) effects.remove(i);
		}
	}
	public void process_GAMEFLOW(){
		int control=0;
		int newy=0, mode=0;
		// ���� ���� �������� �߰�
		if(gamescreen.boss){
			// ������ �����Ǿ� �ִ� ��Ȳ�� ó��
			if(level>1){// ���� ������ 2 �̻��̸�, ������ ���߿� ���� ĳ���͵��� ������� ���´�
				//������ ���� �ó�����
				// : ����ī��Ʈ(gamecnt) 0~200 : ������ ����
				// : ����ī��Ʈ(gamecnt) 801~1000 : ������ 60ī��Ʈ ������ ����
				// : ����ī��Ʈ(gamecnt) 1601~2199 : ������ 30ī���� ������ ����
				if(800<gamecnt&&gamecnt<1000){// ������ �����ϰ� �ð��� �� ������ ���� ĳ���͵��� �������� �����Ѵ�
					if(gamecnt%60==0) {
						newy=RAND(30,gScreenHeight-30)*100;
						if(newy<24000) mode=0; else mode=1;
						Enemy en=new Enemy(this, 0, gScreenWidth*100, newy, 0,mode);
						enemies.add(en);
					}
				}else
				if(1600<gamecnt&&gamecnt<2200){// �������� �Ĺݺο� ���鼭 ���� ��������� ������ �ż�����
					if(gamecnt%30==0) {
						Enemy en;
						newy=RAND(30,gScreenHeight-30)*100;
						if(newy<24000) mode=0; else mode=1;
						if(level>1&&RAND(1,100)<level*10)
							en=new Enemy(this, 2, gScreenWidth*100, newy, 2,0);
						else
							en=new Enemy(this, 0, gScreenWidth*100, newy, 0,mode);
						enemies.add(en);
					}
				}
			}
			if(gamecnt>2210){// ������ Ÿ�� �ƿ����� �������� �����Ѵ�
				gamescreen.boss=false;
				gamecnt=0;
				System.out.println("���� Ÿ�Ӿƿ�");
			}
		}else{
			if(gamecnt<500) control=1;
			else if(gamecnt<1000) control=2;
			else if(gamecnt<1300) control=0;
			else if(gamecnt<1700) control=1;
			else if(gamecnt<2000) control=2;
			else if(gamecnt<2400) control=3;
			else {
				// ������ ������ �÷��ִ� �κп���, ������ �÷��ָ鼭 ���� ĳ���͸� �����Ų��
				System.out.println("���� ����");
				gamescreen.boss=true;
				Enemy en=new Enemy(this, 1, gScreenWidth*100, 24000, 1, 0);// img ���� 1, kind ���� 1
				enemies.add(en);
				gamecnt=0;
				level++;
			}
			if(control>0) {
				newy=RAND(30,gScreenHeight-30)*100;
				if(newy<24000) mode=0; else mode=1;
			}
			Enemy en;
			switch(control){
			case 1:
				if(gamecnt%90==0) {
					if(RAND(1,3)!=3&&level>0)
						en=new Enemy(this, 2, gScreenWidth*100, newy, 2,mode);
					else
						en=new Enemy(this, 0, gScreenWidth*100, newy, 0,mode);
					enemies.add(en);
				}
				break;
			case 2:
				if(gamecnt%50==0) {
					if(RAND(1,3)!=3&&level>0)
						en=new Enemy(this, 2, gScreenWidth*100, newy, 2,mode);
					else
						en=new Enemy(this, 0, gScreenWidth*100, newy, 0,mode);
					enemies.add(en);
				}
				break;
			case 3:
				if(gamecnt%20==0) {
					if(RAND(1,3)!=3&&level>0)
						en=new Enemy(this, 2, gScreenWidth*100, newy, 2,mode);
					else
						en=new Enemy(this, 0, gScreenWidth*100, newy, 0,mode);
					enemies.add(en);
				}
				break;
			}
		}
	}
	public void process_ITEM(){
		int i, dist;
		Item buff;
		for(i=0;i<items.size();i++){
			buff=(Item)(items.elementAt(i));
			dist=GetDistance(myx/100,myy/100, buff.dis.x,buff.dis.y);
			if(dist<1000) {//������ ȹ��
				switch(buff.kind){
				case 0://�Ϲ� ����
					score+=100;
					break;
				case 1://�ǵ�
					myshield=5;
					break;
				case 2://���� ������
					//Enemy ebuff;
					//Effect expl;
					
					//�� ���� ȿ��
					int j=enemies.size();
					for(int k=0;k<j;k++){
						Enemy ebuff=(Enemy)(enemies.elementAt(k));
						if(ebuff==null) continue;//���� �ش� �ε����� �� ĳ���Ͱ� �����Ǿ����� ���� ��츦 ���
						if(ebuff.kind==1) {//�ش� �ε����� �Ҵ�� �� ĳ���Ͱ� ���� ĳ������ ���� ���꿡 �ش����� �ʰ� HP�� ������ ���δ�. 1 ���϶�� 1.
							score+=300;
							ebuff.life=ebuff.life/2;
							if(ebuff.life<=1) ebuff.life=1;
							continue;
						}
						Effect expl=new Effect(0, ebuff.pos.x,ebuff.pos.y, 0);
						effects.add(expl);//���� ����Ʈ �߰�
						ebuff.pos.x=-10000;//���� ó������ �Ұŵ� �� �ֵ���
						score+=50;
						//enemies.remove(ebuff);//�� ĳ���� �Ұ�
					}
					
					//�� �Ѿ� ���� �Ұ�
					j=bullets.size();
					for(int k=0;k<j;k++){
						Bullet bbuff=(Bullet)(bullets.elementAt(k));
						if(bbuff.from!=0) {
							bbuff.pos.x=-10000;
							score++;
						}
						//bullets.remove(bbuff);
					}
					break;
				}
				items.remove(i);
			} else
				if(buff.move()) items.remove(i);
		}
	}

	public Image makeImage(String furl){
		Image img;
		Toolkit tk=Toolkit.getDefaultToolkit();
		img=tk.getImage(furl);
		try {
			//�������
			MediaTracker mt = new MediaTracker(this);
			mt.addImage(img, 0);
			mt.waitForID(0);
			//�������, getImage�� �о���� �̹����� �ε��� �Ϸ�ƴ��� Ȯ���ϴ� �κ�
		} catch (Exception ee) {
			ee.printStackTrace();
			return null;
		}	
		return img;
	}
	public int GetDistance(int x1,int y1,int x2,int y2){
		return Math.abs((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
	}
	public int RAND(int startnum, int endnum) //��������(startnum���� ramdom����), �������� ����� ����.
	{
		int a, b;
		if(startnum<endnum)
			b = endnum - startnum; //b�� ���� ���� �߻� ��
		else
			b = startnum - endnum;
		a = Math.abs(rnd.nextInt()%(b+1));
		return (a+startnum);
	}
	int getAngle(int sx, int sy, int dx, int dy){
		int vx=dx-sx;
		int vy=dy-sy;
		double rad=Math.atan2(vx,vy);
		int degree=(int)((rad*180)/Math.PI);
		return (degree+180);
	}

	public boolean readGameFlow(String fname){
		String buff;
		try
		{
			BufferedReader fin=new BufferedReader(new FileReader(fname));
			if((buff=fin.readLine())!=null) {
				System.out.println(Integer.parseInt(buff));
			}
			fin.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
}

class GameScreen extends Canvas
{
	//���� ������ ���� ��� ���ϴ� Ŭ����
	//������ ȭ�� ��¿����� ���ӿ��� �������� ���̴� �������� ���� ���� ������ �ʴ� ���� ����.
	W_Shooting_frame main;
	int cnt, gamecnt;

	//ȭ�� �׸���� ����
	int x,y;//�÷��̾� ĳ������ ��ǥ

	Image dblbuff;//������۸��� �����
	Graphics gc;//������۸��� �׷��� ���ؽ�Ʈ

	Image bg,bg_f, bgFlip;//���ȭ�� //2013-10
	Image cloud[]=new Image[5];//����
	Image title, title_key;//Ÿ��Ʋȭ��

	Image chr[]=new Image[9];//�÷��̾� ĳ����
	Image enemy[]=new Image[5];//�� ĳ����
	Image bullet[]=new Image[5];//�Ѿ�
	Image explo;//����
	Image item[]=new Image[3];//������
	
	Image num;//2013-10
	Image uiUp;//2013-10

	Image _start;//���۷ΰ�
	Image _over;//���ӿ����ΰ�
	Image shield;//�ǵ�

	Font font;

	int v[]={-2,-1,0,1,2,1,0,-1};
	int v2[]={-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4,-5,-6,-7};
	int step=0;

	boolean boss=false;//�������� �߰�

	GameScreen(W_Shooting_frame main){
		this.main=main;
		font=new Font("Default",Font.PLAIN,9);
	}

	public void paint(Graphics g){
		if(gc==null) {
			dblbuff=createImage(main.gScreenWidth,main.gScreenHeight);//���� ���۸��� ������ũ�� ���� ����. ���� paint �Լ� ������ �� ��� �Ѵ�. �׷��� ������ null�� ��ȯ�ȴ�.
			if(dblbuff==null) System.out.println("������ũ�� ���� ���� ����");
			else gc=dblbuff.getGraphics();//������ũ�� ���ۿ� �׸��� ���� �׷��� ���ؽ�Ʈ ȹ��
			return;
		}
		update(g);
	}
	public void update(Graphics g){//ȭ�� ���ڰŸ��� ���̱� ����, paint���� ȭ���� �ٷ� ��ȭ���� �ʰ� update �޼ҵ带 ȣ���ϰ� �Ѵ�.
		cnt=main.cnt;
		gamecnt=main.gamecnt;
		if(gc==null) return;
		dblpaint();//������ũ�� ���ۿ� �׸���
		g.drawImage(dblbuff,0,0,this);//������ũ�� ���۸� ����ȭ�鿡 �׸���.
	}
	public void dblpaint(){
		//���� �׸��� ������ �� �Լ����� ��� ���Ѵ�.
		switch(main.status){
		case 0://Ÿ��Ʋȭ��
			Draw_TITLE();
			gc.setColor(new Color(0));
			gc.drawString("Education ver.", 10,40);
			break;
		case 1://���� ��ŸƮ
			Draw_BG();
			Draw_MY();
			Draw_BG2();
			drawImageAnc(_start, 0,270, 3);
			break;
		case 2://����ȭ��
		case 4://�Ͻ�����
			Draw_BG();
			Draw_MY();
			Draw_ENEMY();
			Draw_BULLET();
			Draw_EFFECT();
			Draw_ITEM();
			Draw_BG2();
			Draw_UI();
			break;
		case 3://���ӿ���
			Draw_BG();
			Draw_ENEMY();
			Draw_BULLET();
			Draw_BG2();
			drawImageAnc(_over, 320,240, 4);
			Draw_UI();
			break;
		default:
			break;
		}
	}

	public void Draw_TITLE(){
		gc.drawImage(title,0,0,this);
		if(cnt%20<10) gc.drawImage(title_key, 320-201,370, this);
	}
	public void Draw_BG(){
		int i;
		
		//������ �����̱� ���� �߰� �ڵ�
		int step1 = (cnt%2560)/2;//2013-10
		step1=step1>=640?step1-1280:step1;//2013-10
		int step2 = step1>=0?640-step1:-(640+step1);//2013-10
		gc.drawImage(bg,0-step1,0,this);//2013-10
		gc.drawImage(bgFlip,step2,0,this);//2013-10
		
		for(i=0;i<12;i++) gc.drawImage(cloud[3], i*64-((cnt/1)%128), 370, this);//2013-10 : ������ �����̰� �Ǹ鼭 �� ���� ���� ������ �̵� �ӵ��� ���� ����
		for(i=-1;i<14;i++) gc.drawImage(cloud[2], i*64-(cnt%128)*2, 395, this);
	}
	public void Draw_BG2(){
		int i;
		step=(cnt%(bg_f.getWidth(this)/main.scrspeed))*main.scrspeed;
		gc.drawImage(bg_f,0-step,540-bg_f.getHeight(this)+v[(cnt/20)%8]*2,this);
		//System.out.println("���"+step);
		if(step>=bg_f.getWidth(this)-main.gScreenWidth) {
			gc.drawImage(bg_f,0-step+bg_f.getWidth(this),540-bg_f.getHeight(this)+v[(cnt/20)%8]*2,this);
		}
		for(i=-1;i<14;i++) gc.drawImage(cloud[0], i*128-(cnt%128)*8, 435, this);
	}
	public void Draw_MY(){
		int myx,myy;
		myx=main.myx/100;
		myy=main.myy/100;
		switch(main.mymode){
		case 0://����
		case 1://�����̸鼭 ����
			if(main.cnt%20<10) drawImageAnc(chr[2+(main.cnt/5)%2], myx, myy, 4);
			break;
		case 2://���÷���
			if(main.myimg==6) drawImageAnc(chr[main.myimg+(main.cnt/3)%2], myx, myy, 4);
			else if(main.myimg!=8) drawImageAnc(chr[main.myimg+(main.cnt/5)%2], myx, myy, 4);
			else if(main.myimg==8) drawImageAnc(chr[main.myimg], myx, myy, 4);
			break;
		case 3://������
			if(main.cnt%6<3) drawImageAnc(chr[8], myx, myy, 4);
			break;
		}
		if(main.myshield>2) drawImageAnc(shield, (int)(Math.sin(Math.toRadians((cnt%72)*5))*16+myx), (int)(Math.cos(Math.toRadians((cnt%72)*5))*16+myy), (main.cnt/6%7)*64,0, 64,64, 4);//�ǵ� �������� 3 �̻�
		else if(main.myshield>0&&main.cnt%4<2) drawImageAnc(shield, (int)(Math.sin(Math.toRadians((cnt%72)*5))*16+myx), (int)(Math.cos(Math.toRadians((cnt%72)*5))*16+myy), (main.cnt/6%7)*64,0, 64,64, 4);//�ǵ� �������� 1, 2�� ����
	}
	public void Draw_ENEMY(){
		int i;
		Enemy buff;
		for(i=0;i<main.enemies.size();i++){
			buff=(Enemy)(main.enemies.elementAt(i));
			switch(buff.img){
			case 0:
				drawImageAnc(enemy[0], buff.dis.x, buff.dis.y, ((cnt/8)%7)*36,0, 36,36, 4);
				break;
			case 1:
				drawImageAnc(enemy[1], buff.dis.x, buff.dis.y, 4);//���� ���
				break;
			case 2://��ġ �׿����
				switch(buff.mode){
				case 0://���ʿ��� ���������� ����
				case 1://���ڸ����� ��� ����
				case 2://�Ʒ��� �̵�
				case 3://���� �̵�
					drawImageAnc(enemy[2], buff.dis.x, buff.dis.y, 0,0,36,50,4);
					break;
				case 5://�ڷ� ���� ����
					drawImageAnc(enemy[2], buff.dis.x, buff.dis.y, 72,0,36,50,4);
					break;
				case 4://�����ؼ� ���� ������ ���а� �������� �Ѿ� �߻�
					drawImageAnc(enemy[2], buff.dis.x, buff.dis.y, 36,0,36,50,4);
					break;
				}
			default:
				break;
			}
		}
	}
	public void Draw_BULLET(){
		Bullet buff;
		int i;
		for(i=0;i<main.bullets.size();i++){
			buff=(Bullet)(main.bullets.elementAt(i));
			switch(buff.img_num){
			case 0:
			case 1:
			case 2:
			case 3:
				drawImageAnc(bullet[buff.img_num], buff.dis.x-6,buff.dis.y-6, 4);
				break;
			}
		}
	}
	public void Draw_EFFECT(){
		int i;
		Effect buff;
		for(i=0;i<main.effects.size();i++){
			buff=(Effect)(main.effects.elementAt(i));
			drawImageAnc(explo, buff.dis.x, buff.dis.y, ((16-buff.cnt)%4)*64,((16-buff.cnt)/4)*64,64,64, 4);
		}
	}
	public void Draw_ITEM(){
		int i;
		Item buff;
		for(i=0;i<main.items.size();i++){
			buff=(Item)(main.items.elementAt(i));
			drawImageAnc(item[buff.kind], buff.dis.x, buff.dis.y, ((main.cnt/4)%7)*36,0, 36,36, 4);
		}
	}
	public void Draw_UI(){
		//String str1="SCORE "+main.score+"   LIFE "+main.mylife+"   SPEED "+main.myspeed+"  LEVEL "+(main.level+1);//2013-10
		String str2="[1] Speed down   [2] Speed up   [3] Pause";
//		gc.setColor(new Color(0));
//		gc.drawString(str1, 9,40);
//		gc.drawString(str1, 11,40);
//		gc.drawString(str1, 10,39);
//		gc.drawString(str1, 10,41);
//		gc.setColor(new Color(0xffffff));
//		gc.drawString(str1, 10,40);

		gc.setColor(new Color(0));
		gc.drawString(str2, 9,main.gScreenHeight-10);
		gc.drawString(str2, 11,main.gScreenHeight-10);
		gc.drawString(str2, 10,main.gScreenHeight-11);
		gc.drawString(str2, 10,main.gScreenHeight-9);
		gc.setColor(new Color(0xffffff));
		gc.drawString(str2, 10,main.gScreenHeight-10);
		
		//�׷����� UI�� ���� �߰� �ڵ�
		gc.drawImage(uiUp, 16, 25, this);//2013-10
		
		drawImageNum(num, 320, 40, main.score, 8);//2013-10
		drawImageNum(num, 52, 40, main.mylife, 2);//2013-10
		drawImageNum(num, 576, 40, main.level, 2);//2013-10
		
	}
	
	//2013-10
	public void drawImageNum(Image img, int x, int y, int value, int digit){
		//���ڸ� �̹����� ��ȯ�� �����ش�
		
		int width = img.getWidth(this)/10;
		int height = img.getHeight(this);
		
		String valueStr = String.valueOf(value);
		if(valueStr.length()<digit)
			valueStr = "0000000000".substring(0, digit-valueStr.length()) + valueStr;
		int _xx = x-valueStr.length()*width/2;
		for(int i=0;i<valueStr.length();i++)
			drawImageAnc(num, _xx+i*width, y, (valueStr.charAt(i)-'0')*width, 0, width,height, 0);

	}
	//2013-10
	
	public void drawImageAnc(Image img, int x, int y, int anc){
		//��Ŀ���� ������ �̹��� ��� ��ġ�� �����Ѵ�.
		//��) anc==0 : �»���� ����, anc==4 : �̹��� �߾��� ����
		int imgw, imgh;
		imgw=img.getWidth(this);
		imgh=img.getHeight(this);
		x=x-(anc%3)*(imgw/2);
		y=y-(anc/3)*(imgh/2);
		
		gc.drawImage(img, x,y, this);
	}
	public void drawImageAnc(Image img, int x, int y, int sx,int sy, int wd,int ht, int anc){//sx,sy���� wd,ht��ŭ Ŭ�����ؼ� �׸���.
		if(x<0) {
			wd+=x;
			sx-=x;
			x=0;
		}
		if(y<0) {
			ht+=y;
			sy-=y;
			y=0;
		}
		if(wd<0||ht<0) return;
		x=x-(anc%3)*(wd/2);
		y=y-(anc/3)*(ht/2);
		gc.setClip(x, y, wd, ht);
		gc.drawImage(img, x-sx, y-sy, this);
		gc.setClip(0,0, main.gScreenWidth+10,main.gScreenHeight+30);
	}


}
class Bullet
{
	// ���ӿ� �����ϴ� �Ѿ��� ó���ϱ� ���� Ŭ����
	// �޸� ȿ���� ���ؼ��� �Ѿ˿� ���� �ּ����� ������ ��� ���� ������, ó�� ������ ���� ������ ��ü ó�� ��ƾ�� �����Ѵ�.
	Point dis;//�Ѿ��� ǥ�� ��ǥ. ���� ��ǥ���� *100 �����̴�.
	Point pos;//�Ѿ��� ��� ��ǥ. ���� ��ǥ���� *100 �����̴�.
	Point _pos;//�Ѿ��� ���� ��ǥ
	int degree;//�Ѿ��� ���� ���� (����)
		//�Ѿ��� ���� ������ x, y ���������ε� ǥ�� �����ϴ�. ������ �� ��� ������ ź�� ������ ���������.
	int speed;//�Ѿ��� �̵� �ӵ�
	int img_num;//�Ѿ��� �̹��� ��ȣ
	int from;//�Ѿ��� ���� �߻��ߴ°�
	Bullet(int x, int y, int img_num, int from, int degree, int speed){
		pos=new Point(x,y);
		dis=new Point(x/100,y/100);
		_pos=new Point(x,y);
		this.img_num=img_num;
		this.from=from;
		this.degree=degree;
		this.speed=speed;
	}
	public void move(){
		_pos=pos;//���� ��ǥ ����
		pos.x-=(speed*Math.sin(Math.toRadians(degree))*100);
		pos.y-=(speed*Math.cos(Math.toRadians(degree))*100);
		dis.x=pos.x/100;
		dis.y=pos.y/100;
		//if(pos.x<0||pos.y>gScreenWidth*100||pos.y<0||pos.y>gScreenHeight*100) ebullet[i].pic=255;
	}
}
class Enemy
{
	//���ӿ� �����ϴ� �� ĳ���� ���� Ŭ����
	W_Shooting_frame main;
	Point pos;
	Point _pos;
	Point dis;
	int img;
	int kind;
	int life;
	int mode;
	int cnt;
	int shoottype;
	int hitrange;//�پ��� ũ���� �� ĳ���� ������ ���� ���� ���� ������ �߰��Ѵ�.
	Bullet bul;
	Enemy(W_Shooting_frame main, int img, int x, int y, int kind, int mode){
		this.main=main;
		pos=new Point(x,y);
		_pos=new Point(x,y);
		dis=new Point(x/100,y/100);
		this.kind=kind;
		this.img=img;
		this.mode=mode;
		life=6+main.RAND(0,5)*main.level;//���� ������ ���� �������� ź�� ��� �ð��� ª������
		cnt=main.RAND(main.level*5,80);
		shoottype=main.RAND(0,4);
		hitrange=1500;
		switch(kind){
		case 0://ť�� �׿���� ���� ����
			break;
		case 1://���� ���� ����
			life=400+300*main.level;
			mode=0;
			hitrange=12000;
			break;
		case 2://��ġ �׿���� ���� ����
			life=20+main.RAND(0,10)*main.level;
			hitrange=2000;
			cnt=-(main.RAND(30,50));
			break;
		}
		/*
		if(kind==1){//������ ��� ���� �Ķ���͸� �������Ѵ�
			life=400+300*main.level;
			mode=0;
			hitrange=12000;
		}
		*/
	}
	public boolean move(){
		boolean ret=true;
		
		//�켱�� ����
		switch(kind){
		case 2://��ġ �׿������ ���
			if(mode!=4) break;
			if(cnt<30&&cnt%5==0){
				bul=new Bullet(pos.x, pos.y, 2, 1, 90, 5);
				main.bullets.add(bul);
			}
			if(cnt>50){
				if(main.RAND(1,100)<50){
					mode=1;//���� �̵��� ������ ����
					cnt=30;
				}else{
					mode=5;//����
					cnt=0;
				}
			}
			break;
		case 0://�Ϲ� �� ĳ������ ���
			switch(shoottype){//���� ���¿� ���� ���� �ٸ� ������ �Ѵ�.
			case 0://�÷��̾ ���� 3���� �����Ѵ�
				if(cnt%100==0||cnt%103==0||cnt%106==0) {//cnt�� ���� ������ üũ�Ѵ�
					bul=new Bullet(pos.x, pos.y, 2, 1, main.getAngle(pos.x,pos.y,main.myx,main.myy), 3);
					main.bullets.add(bul);
				}
				break;
			case 1://Ÿ�̸ӿ� ���� 4����ź�� �߻��Ѵ�
				if(cnt%90==0||cnt%100==0||cnt%110==0) {
					bul=new Bullet(pos.x, pos.y, 2, 1, (0+(cnt%36)*10)%360, 3);
					main.bullets.add(bul);
					bul=new Bullet(pos.x, pos.y, 2, 1, (30+(cnt%36)*10)%360, 3);
					main.bullets.add(bul);
					bul=new Bullet(pos.x, pos.y, 2, 1, (60+(cnt%36)*10)%360, 3);
					main.bullets.add(bul);
					bul=new Bullet(pos.x, pos.y, 2, 1, (90+(cnt%36)*10)%360, 3);
					main.bullets.add(bul);
				}
				break;
			case 2://ª�� �������� �÷��̾� ��ó�� ���� �� �߾� �߻��Ѵ�
				if(cnt%30==0||cnt%60==0||cnt%90==0||cnt%120==0||cnt%150==0||cnt%180==0) {
					bul=new Bullet(pos.x, pos.y, 2, 1, (main.getAngle(pos.x,pos.y,main.myx,main.myy)+main.RAND(-20,20))%360, 2);
					main.bullets.add(bul);
				}
				break;
			case 3://�÷��̾ ���� 3����ź�� �߻��Ѵ�
				if(cnt%90==0||cnt%110==0||cnt%130==0){
					bul=new Bullet(pos.x, pos.y, 2, 1, main.getAngle(pos.x,pos.y,main.myx,main.myy), 2);
					main.bullets.add(bul);
					bul=new Bullet(pos.x, pos.y, 2, 1, (main.getAngle(pos.x,pos.y,main.myx,main.myy)-20)%360, 2);
					main.bullets.add(bul);
					bul=new Bullet(pos.x, pos.y, 2, 1, (main.getAngle(pos.x,pos.y,main.myx,main.myy)+20)%360, 2);
					main.bullets.add(bul);
				}
				break;
			case 4://�ƹ��� ���ݵ� �����ʴ´�
				break;
			}
			break;
		case 1://���� ĳ������ ����, mode�� ���� ���� ����� �ٲ۴�.
			int lv,i;
			switch(mode){//mode ���� ���� �������� �����Ѵ�. �����ӿ� ���� ���� ��ĵ� �ٲ��ش�.
			case 5:
				if(main.level>=10) lv=5; else lv=(10-main.level)*5;
				if(cnt%lv==0||cnt%(lv+5)==0||cnt%(lv+15)==0) {
					for(i=0;i<4+(50-lv)/5;i++){
						bul=new Bullet(pos.x, pos.y, 2, 1, (30*i+(cnt%36)*10)%360, 5);
						main.bullets.add(bul);
					}
					/*bul=new Bullet(pos.x, pos.y, 2, 1, (30+(cnt%36)*10)%360, 4);
					main.bullets.add(bul);
					bul=new Bullet(pos.x, pos.y, 2, 1, (60+(cnt%36)*10)%360, 4);
					main.bullets.add(bul);
					bul=new Bullet(pos.x, pos.y, 2, 1, (90+(cnt%36)*10)%360, 4);
					main.bullets.add(bul);*/
				}
				break;
			case 7:
				if(main.level>=10) lv=1; else lv=10-main.level;
				if(cnt%lv==0){
					bul=new Bullet(pos.x-3000+main.RAND(-10,+10)*100, pos.y+main.RAND(10,80)*100, 2, 1, 90, 5+(10-lv)/2);
					main.bullets.add(bul);
				}
				break;
			}
			break;
		}

		//�̵� ó��
		switch(kind){
		case 2://��ġ �׿������ ���
			/*
			��ġ �׿���� �̵� �ó�����
			1. �����ʿ��� �����Ͽ� �������� �̵��ϴ� ȭ�� 70~80% ���� ��ġ�� �����Ѵ�.
			2. �÷��̾��� y��ǥ�� �����Ͽ� ���Ϸ� ���� ���� �̵��ϴ�
			3. �����Ͽ�
			4. ���� ������ ���а� ����
			5. 2~4�� �� �� ������ ��
			6. �ڷ� ���� �������� 
			*/
			switch(mode){
			case 0://���ʿ��� ���������� ����
				pos.x-=500;
				if(cnt>=0&&pos.x<main.gScreenWidth*80) {
					mode=1;
					cnt=0;
				}
				break;
			case 1://���ڸ����� ��� ����
				if(pos.x>main.gScreenWidth*80){//���� ���� ����� x��ġ�� �ƴϸ� �� �� �������� �̵��Ѵ�
					mode=0;
					break;
				}
				if(cnt>=30) {
					if(pos.y>main.myy) mode=3;
					else mode=2;
					cnt=0;
				}
				break;
			case 2://�Ʒ��� �̵�
				if(pos.y<main.gScreenHeight*90&&cnt<20)
					pos.y+=250;
				else {
					mode=4;//����
					cnt=0;
				}
				break;
			case 3://���� �̵�
				if(pos.y>6400&&cnt<20)
					pos.y-=250;
				else {
					mode=4;//����
					cnt=0;
				}
				break;
			case 5://�ڷ� ���� ����
				pos.x+=350;
				break;
			case 4://�����ؼ� ���� ������ ���а� �Ѿ� �߻�
				break;
			}
			break;
		case 0://�Ϲ� ĳ����
			switch(mode){
			case 0:
				pos.x-=500;
				pos.y+=80;
				if(pos.x<main.myx) mode=2;
				break;
			case 1:
				pos.x-=500;
				pos.y-=80;
				if(pos.x<main.myx) mode=3;
				break;
			case 2:
				pos.x+=600;
				pos.y+=240;
				break;
			case 3:
				pos.x+=600;
				pos.y-=240;
				break;
			}
			break;
		case 1://����ĳ����
		/*
			���� ĳ���� ������ �ó����� (mode ���� ����)
			0. ȭ�� �������� ���� �������� ���´�.
			1. �÷��̾�� ���� ������ �Ʒ���(mode=2), �Ʒ��� ������ ����(mode=3) ���� ���� (���� ��ǥ �������� 120��Ʈ) �̵��Ѵ�.
			4. ȭ�� �߾ӱ��� ���´�
			5. 0.�� ��ġ���� �ǵ��ư���.
			6. ȭ�� �ٱ����� ���� �������.
			7. ��� �� �ڸ����� ����� �� mode=1�� ���ư���
			8. ��� �� �ڸ����� ����� �� mode=5�� ��ȯ�Ѵ�
		*/
			if(main.gamecnt==1200) mode=4;
			if(main.gamecnt==2210) mode=6;
			switch(mode){
			case 0:
				pos.x-=100;
				if(pos.x<53000) mode=1;
				break;
			case 1:
				if(cnt%30==0){
					if(pos.y>main.myy) mode=3;
					else if(pos.y<main.myy) mode=2;
					_pos.x=pos.x;
					_pos.y=pos.y;//�̵� �Ÿ��� üũ�ϱ� ���� �̵��� ���۵Ǵ� ��ġ�� ����
				}
				break;
			case 2:
				if(pos.y+400<42000)
					pos.y+=400;
				else{
					cnt=0;
					mode=7;
				}
				if(pos.y-_pos.y>12000) {
					cnt=0;
					mode=7;
				}
				break;
			case 3:
				if(pos.y-400>6000)
					pos.y-=400;
				else{
					cnt=0;
					mode=7;
				}
				if(_pos.y-pos.y>12000) {
					cnt=0;
					mode=7;
				}
				break;
			case 4:
				pos.x-=800;
				if(pos.x<30000) {
					mode=8;
					cnt=0;
				}
				break;
			case 5:
				pos.x+=350;
				if(pos.x>53000) mode=1;
				break;
			case 6:
				pos.x+=500;
				break;
			case 7:
				if(cnt>100) mode=1;
				break;
			case 8:
				if(cnt>90) mode=5;
				break;
			}
			break;
		}
		dis.x=pos.x/100;
		dis.y=pos.y/100;
		if(dis.x<0||dis.x>640||dis.y<0||dis.y>480) ret=false;

		cnt++;
		return ret;
	}
}
class Effect
{
	//���� ���� ����Ʈ ���� Ŭ����
	Point pos;
	Point _pos;
	Point dis;
	int img;
	int kind;
	int cnt;
	Effect(int img, int x, int y, int kind){
		pos=new Point(x,y);
		_pos=new Point(x,y);
		dis=new Point(x/100,y/100);
		this.kind=kind;
		this.img=img;
		cnt=16;
	}
}
class Item
{
	//������ ���� Ŭ����
	Point pos;
	Point dis;
	int speed;
	int cnt;
	int kind;
	Item(int x, int y, int kind){
		this.kind=kind;
		pos=new Point(x,y);
		dis=new Point(x/100,y/100);
		speed=-200;
		cnt=0;
	}
	public boolean move(){
		boolean ret=false;
		pos.x-=speed;
		cnt++;
		if(cnt>=50) speed=200;
		else if(cnt>=30) speed=100;
		else if(cnt>=20) speed=-100;
		dis.x=pos.x/100;
		if(pos.x<0) ret=true;
		return ret;
	}
}

class MyWindowAdapter extends WindowAdapter
{
	// �����츦 �ݱ� ���� �ΰ� Ŭ����. ���� �ݴ� ������
	// setVisible(false);
	// dispose();
	// System.exit(0);
	// �̻� �� �������� �̷������.
	//
	MyWindowAdapter(){
	}
	public void windowClosing(WindowEvent e) {
		Window wnd = e.getWindow();
		wnd.setVisible(false);
		wnd.dispose();
		System.exit(0);
	}
}
