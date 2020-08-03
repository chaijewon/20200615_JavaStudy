package com.sist.client;
// ������ => JFrame
// ������� ���õ� Ŭ������ �о�´� 
import javax.swing.*;

import com.sist.common.Function;

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
import java.io.*;
import java.net.*;
import java.util.*;
/*
 *    1. ����ڰ� ������ ��û 
 *    2. �������� ������ ������ �޾Ƽ� ��� (������) => �ڵ�ȭ 
 */
public class ClientMainFrame extends JFrame implements ActionListener,
MouseListener,Runnable{
    // ������ ũ�� ����  => �����ڿ��� ���  ==> 291 page
	JLabel title=new JLabel("��ȭ ����  & ��õ ���α׷�",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	DetailForm df=new DetailForm();
	Login login=new Login();
	ControllPanel cp;
	int curpage=1;
	int totalpage=16;
	// ��Ʈ��ũ ���� ���α׷� 
	Socket s; // ���� ��� 
	OutputStream out; // ������ ��û�� ���� => �α���,ä�� ���ڿ� , ���� ....
	BufferedReader in; // �����κ��� ���� �޾ƿ��� Ŭ����  ==> ������ 
	public ClientMainFrame()
	{
		cp=new ControllPanel(this);
		// ���ο� â => ���� �������� ������â�� ���� 
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
		//setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);// X��ư Ŭ���� ����
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b5.addActionListener(this);
		
		cp.ff.b1.addActionListener(this);// ����
		cp.ff.b2.addActionListener(this);// ����
		
		df.b2.addActionListener(this);// ���
		
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this);
		cp.lf.tf.addActionListener(this);
		
		
		// �α��� ó�� 
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		// ���� 
		mf.b7.addActionListener(this);
		
		// ä�� 
		cf.tf.addActionListener(this);
		
		/*
		 * for(int i=0;i<10;i++) { cp.ff.mc[i].addMouseListener(this); }
		 */
		
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
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==mf.b5)
		{
			cp.card.show(cp, "NF");
		}
		else if(e.getSource()==df.b2)
		{
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==cp.ff.b1)// ������ư
		{
			if(curpage>1)
			{
				curpage--;
				cp.ff.p.removeAll();// JPanel�� ��� ����� ����
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();//JPanel�� ���� ����� ���ġ
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
			// 1. �Էµ� �� �б�
			String ss=cp.lf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "�˻�� �Է��ϼ���");
				cp.lf.tf.requestFocus();
				return; // �޼ҵ� ���� 
			}
			cp.lf.movieFindData(ss);
		}
		
		else if(e.getSource()==login.b1)
		{
			String id=login.tf1.getText();
			if(id.length()<1)// ID�� �Է����� ���� ���
			{
				JOptionPane.showMessageDialog(this, "���̵� �Է��ϼ���");
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "��ȭ���� �Է��ϼ���");
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
				sex="����";
			else
				sex="����";
			
			// ������ �Է¹��� ������ ���� 
			try
			{
				// ����  => ������ ���� ������ ������ �ִ� 
				s=new Socket("localhost",3355);
				// �ۼ��� ��ġ Ȯ��
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				
				// �α��� ��û (������ ���۵Ǵ� �κ�)
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex){}
			    
			    //�������� �����ϴ� �����͸� �о ��� 
			    new Thread(this).start();
			    // run()�� ��ġ Ȯ�� ==> �ڽ��� Ŭ�����ȿ� ���� => (this)
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cf.tf)// ä�� 
		{
			String msg=cf.tf.getText();
			if(msg.length()<1)
				return;
			// �����͸� ������ ���� 
			try
			{
				out.write((msg+"\n").getBytes());
			}catch(Exception ex){}
			
			    cf.tf.setText("");
		}
		else if(e.getSource()==mf.b7)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
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
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// �������� ������ �����͸� �޾Ƽ� ó�� 
		try
		{
			while(true)
			{
				String msg=in.readLine();
				System.out.println("server=>"+msg);
				StringTokenizer st=
						  new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				   case Function.MYLOG:
				   {
					   setTitle(st.nextToken());
					   login.setVisible(false);// �α���â
					   setVisible(true);// ��ȭâ (Main) 
				   }
				   break;
				   case Function.LOGIN:
				   {
					   // ���̺� ��� 
					   String[] data= {
						  st.nextToken(), // id
						  st.nextToken(), // name
						  st.nextToken() // sex
					   };
					   cf.model.addRow(data);
				   }
				   break;
				   case Function.CHAT:
				   {
					     cf.ta.append(st.nextToken()+"\n");
				   }
				   break;
				   case Function.EXIT:
				   {
					   String id=st.nextToken();
					   for(int i=0;i<cf.model.getRowCount();i++)
					   {
						   String mid=cf.model.getValueAt(i,0).toString();
						   if(id.equals(mid))
						   {
							   cf.model.removeRow(i);
							   break;
						   }
					   }
				   }
				   break;
				   case Function.MYEXIT:
				   {
					   dispose();// ������ �޸� ���� 
					   System.exit(0);// ���α׷� ���� 
				   }
				   break;
				}
			}
		}catch(Exception ex) {}
	}

}







