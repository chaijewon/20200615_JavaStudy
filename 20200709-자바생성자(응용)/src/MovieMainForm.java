import javax.swing.*;// ������ ���� Ŭ���� 
import javax.swing.border.LineBorder;

import java.awt.*; // ���̾ƿ� (ȭ�� ��ġ)
import java.awt.event.*; // ��ư , �ؽ�Ʈ�� ���� => ���� (�̺�Ʈ)
import java.net.URL;
// �ڹٿ��� �����ϴ� �������� ��� ����� ����Ѵ� 
// �ڹٿ��� ����� �Ѱ��� ���� (���� ���)
public class MovieMainForm extends JFrame implements ActionListener,MouseListener{
    JMenuBar bar=new JMenuBar();
    JMenuItem home=new JMenuItem("Home");
    JMenuItem find=new JMenuItem("ã��");
    JMenuItem exit=new JMenuItem("����");
    // ���� => �����츦 �����ش� => ������ 
    CardLayout card=new CardLayout();
    MovieList ml=new MovieList();
    MovieDetail md=new MovieDetail();
    MovieFind mf=new MovieFind();
    
    int curpage=1;
    int totalpage=194;
    // ������� �ʱ�ȭ
    MovieMainForm() {
		// �޴� ���� 
    	JMenu menu=new JMenu("�޴�");
    	menu.add(home);
    	menu.add(find);
    	menu.addSeparator();// ���м�
    	menu.add(exit);
    	bar.add(menu);
    	
    	//�����쿡 ���� 
    	setJMenuBar(bar);
    	
    	// ���̾ƿ� ���� 
    	setLayout(card);
    	add("ML",ml);
    	add("MD",md);
    	add("MF",mf);
    	// ������ ũ�� ����
    	setSize(1300, 1000);
    	// ������ �����ش�
    	
    	setVisible(true);
    	
    	
    	home.addActionListener(this);
    	find.addActionListener(this);
    	exit.addActionListener(this);
    	
    	ml.b1.addActionListener(this);// ����
    	ml.b2.addActionListener(this);// ���� 
    	
    	moviePrint(1);
    	
    	for(int i=0;i<2;i++)
    	{
    		for(int j=0;j<5;j++)
    		{
    			ml.movie[i][j].addMouseListener(this);
    		}
    	}
    	
	}
    void moviePrint(int page)
    {
    	MovieVO[] movies=MovieManager.movieListData(page);
    	int k=0;
    	/*
    	 *   0  [0][0]   0/5  = 0    0%5 = 0
    	 *   1  [0][1]   1/5  = 0    1%5 = 1
    	 *   2  [0][2]   2/5  = 0
    	 *   3  [0][3]   3/5  = 0
    	 *   4  [0][4]   4/5  = 0
    	 *   
    	 *   5  [1][0]   5/5  = 1
    	 *   6  [1][1]   6/5  = 1
    	 *   7  [1][2]   7/5  = 1
    	 *   8  [1][3]   8/5  = 1
    	 *   9  [1][4]   9/5  = 1
    	 *   
    	 */
    	for(MovieVO vo:movies)
    	{
    		
    		try
    		{
    			// �����͸� �б�
    			URL url=new URL(vo.poster);
    			Image img=getImage(new ImageIcon(url), 
    					ml.movie[0][0].getWidth(),ml.movie[0][0].getHeight());
    			
    			ml.movie[k/5][k%5].setIcon(new ImageIcon(img));
    			k++;
    		}catch(Exception ex){System.out.println(ex.getMessage());}
    	}
    	
    	ml.pLa.setText(curpage+" page / "+totalpage+" pages");
    }
    static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	   UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
       new  MovieMainForm();// �����ڴ� �ݵ�� new ������()
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==home)
		{
			card.show(getContentPane(), "ML");
		}
		else if(e.getSource()==find)
		{
			card.show(getContentPane(), "MF");
		}
		else if(e.getSource()==exit)
		{
			System.exit(0);
		}
		else if(e.getSource()==ml.b1)// ����
		{
			if(curpage>1)
			{
				curpage--;
				moviePrint(curpage);
			}
		}
		else if(e.getSource()==ml.b2)// ����
		{
			if(curpage<totalpage)
			{
				curpage++;
				moviePrint(curpage);
			}
		}
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++)
    	{
    		for(int j=0;j<5;j++)
    		{
    			if(e.getSource()==ml.movie[i][j])
    			{
    				LineBorder line=new LineBorder(Color.yellow,5);
    				ml.movie[i][j].setBorder(line);
    			}
    		}
    	}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++)
    	{
    		for(int j=0;j<5;j++)
    		{
    			ml.movie[i][j].setBorder(null);
    		}
    	}
	}

}
