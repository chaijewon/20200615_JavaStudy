package com.sist.client;
// ������ => JFrame
// ������� ���õ� Ŭ������ �о�´� 
import javax.swing.*;
import java.awt.*; // Color,Layout
import java.awt.event.*;// interface
/*
 *    ���� 
 *      = ��� (is-a) : ������ Ŭ������ �����ؼ� ���
 *      public class ClientMainFrame extends JFrame
 *                   ===============
 *                    JFrame�� ����� ��ü ������ �´� 
 *      class A
 *      {
 *         O X W
 *      }
 *      class B extends A
 *      {
 *          O X W
 *      }
 *      = ���� (has-a) : ������ Ŭ������ ������� ���
 *      public class ClientMainFrame
 *      {
 *          JFrame f=new JFrame();
 *      }
 *      
 */
public class ClientMainFrame extends JFrame implements ActionListener{
    // ������ ũ�� ����  => �����ڿ��� ���  ==> 291 page
	JLabel title=new JLabel("��ȭ ����  & ��õ ���α׷�",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControllPanel cp=new ControllPanel();
	int curpage=1;
	int totalpage=16;
	public ClientMainFrame()
	{
		/*
		 *   Ŭ�������� ������ ��� => ������ �ƴ϶� => �����Ҷ� 
		 *   ��)
		 *       �����ͺ��̽� : ����Ŭ���� 
		 *       ��Ʈ��ũ : ���� => IP,PORT => �ڵ��� (����)
		 *       �� : ��Ű���� ���б� => �����α��� 
		 */
		title.setFont(new Font("����ü",Font.BOLD,55));
		//title.setOpaque(true);
		//title.setBackground(Color.magenta);
		setLayout(null);// JFrame (BorderLayout) ����� ���Ƿ� ��ġ => null
		title.setBounds(10, 15, 1570, 100);
		// �߰� => add()
		add(title);
		// �޴� ��ġ
		mf.setBounds(10, 120, 100, 300 );
		add(mf);
		// ä���� 
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// ���ȭ�� 
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// X��ư Ŭ���� ����
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		
		cp.ff.b1.addActionListener(this);// ����
		cp.ff.b2.addActionListener(this);// ����
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        // �����ڴ� ȣ��ÿ� �ݵ��  => new ������()
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
			cp.card.show(cp, "DF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==cp.ff.b1)// ������ư
		{
			if(curpage>1)
			{
				curpage--;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
			
		}
		else if(e.getSource()==cp.ff.b2)// ������ư
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
	}

}







