package com.sist.client;
// 윈도우 => JFrame
// 윈도우와 관련된 클래스를 읽어온다 
import javax.swing.*;
import java.awt.*; // Color,Layout
import java.awt.event.*;// interface
/*
 *    재사용 
 *      = 상속 (is-a) : 기존의 클래스를 변경해서 사용
 *      public class ClientMainFrame extends JFrame
 *                   ===============
 *                    JFrame의 기능을 전체 가지고 온다 
 *      class A
 *      {
 *         O X W
 *      }
 *      class B extends A
 *      {
 *          O X W
 *      }
 *      = 포함 (has-a) : 기존의 클래스를 변경없이 사용
 *      public class ClientMainFrame
 *      {
 *          JFrame f=new JFrame();
 *      }
 *      
 */
public class ClientMainFrame extends JFrame implements ActionListener,MouseListener{
    // 윈도우 크기 결정  => 생성자에서 사용  ==> 291 page
	JLabel title=new JLabel("영화 예매  & 추천 프로그램",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	DetailForm df=new DetailForm();
	ControllPanel cp;
	int curpage=1;
	int totalpage=16;
	public ClientMainFrame()
	{
		cp=new ControllPanel(this);
		// 새로운 창 => 현재 실행중인 윈도우창을 전송 
		/*
		 *   클래스에서 생성자 사용 => 선언이 아니라 => 구현할때 
		 *   예)
		 *       데이터베이스 : 오라클연결 
		 *       네트워크 : 셋팅 => IP,PORT => 핸드폰 (개통)
		 *       웹 : 쿠키에서 값읽기 => 지동로그인 
		 */
		title.setFont(new Font("굴림체",Font.BOLD,55));
		//title.setOpaque(true);
		//title.setBackground(Color.magenta);
		setLayout(null);// JFrame (BorderLayout) 사용자 정의로 배치 => null
		title.setBounds(10, 15, 1570, 100);
		// 추가 => add()
		add(title);
		// 메뉴 배치
		mf.setBounds(10, 120, 100, 300 );
		add(mf);
		// 채팅폼 
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// 출력화면 
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// X버튼 클릭시 종료
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		
		cp.ff.b1.addActionListener(this);// 이전
		cp.ff.b2.addActionListener(this);// 다음
		
		df.b2.addActionListener(this);// 목록
		
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this);
		cp.lf.tf.addActionListener(this);
		
		/*
		 * for(int i=0;i<10;i++) { cp.ff.mc[i].addMouseListener(this); }
		 */
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        // 생성자는 호출시에 반드시  => new 생성자()
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();
	}
	public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==df.b2)
		{
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==cp.ff.b1)// 이전버튼
		{
			if(curpage>1)
			{
				curpage--;
				cp.ff.p.removeAll();// JPanel의 모든 기능을 삭제
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();//JPanel의 원래 기능을 재배치
			}
			
		}
		else if(e.getSource()==cp.ff.b2)// 다음버튼
		{
			if(curpage<totalpage)
			{
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
		else if(e.getSource()==cp.lf.b1)
		{
			cp.lf.movieAllData(1);
		}
		else if(e.getSource()==cp.lf.b2)
		{
			cp.lf.movieAllData(2);
		}
		else if(e.getSource()==cp.lf.b3)
		{
			cp.lf.movieAllData(3);
		}
		else if(e.getSource()==cp.lf.b4)
		{
			cp.lf.movieAllData(4);
		}
		else if(e.getSource()==cp.lf.b5)
		{
			cp.lf.movieAllData(5);
		}
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf)
		{
			// 1. 입력된 값 읽기
			String ss=cp.lf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				cp.lf.tf.requestFocus();
				return; // 메소드 종료 
			}
			cp.lf.movieFindData(ss);
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			if(e.getSource()==cp.ff.mc[i])
			{
				if(e.getClickCount()==2)
				{
					int a=(i+1)+((curpage*10)-10);
					//JOptionPane.showMessageDialog(this, "mno="+a);
					//System.out.println(a);
					df.detailPrint(a);
					//cp.card.show(cp,"DF");
					df.setVisible(true);
					break;
				}
			}
		}
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
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}







