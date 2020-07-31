package com.sist.client;
import java.util.*;
import javax.swing.*;

import com.sist.common.Function;

import java.awt.*;
import java.awt.event.*;
///////////////// 네트워크 관련
import java.net.*;
import java.io.*;
////////////////////////////
public class ClientMainFrame extends JFrame implements ActionListener,Runnable{
    CardLayout card=new CardLayout();
    Login login=new Login();
    WaitRoom wr=new WaitRoom();
    // 네트워크 
    Socket s;//전화기 
    BufferedReader in;// 수신
    OutputStream out;// 송신
    public ClientMainFrame()
    {
    	setLayout(card);
    	add("LOGIN",login);
    	add("WR",wr);
    	
    	setSize(1024, 950);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	login.b1.addActionListener(this);
    	login.b2.addActionListener(this);
    	
    	wr.tf.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        new ClientMainFrame();
	}
	public void connection(String id,String name,String sex)
	{
		// 서버연결 => 로그인 요청 
		try
		{
			s=new Socket("localhost",3355);
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			out=s.getOutputStream();
			
			// 연결이 되면 로그인요청 
			out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
		}catch(Exception ex) {}
		// 연결이 되면 => 서버부터 지시를 받는다 
		new Thread(this).start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			String id=login.tf.getText();
			String name=login.pf.getText();
			String sex="";
			if(login.rb1.isSelected())
				sex="남자";
			else
				sex="여자";
			connection(id, name, sex);
		}
		else if(e.getSource()==wr.tf)
		{
			// 입력된 데이터 읽기
			String msg=wr.tf.getText();
			if(msg.length()<1) return;
			
			try
			{
				out.write((Function.WAITCHAT+"|"+msg+"\n").getBytes());
			}catch(Exception ex) {}
			
			wr.tf.setText("");
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();
				StringTokenizer st=new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
					case Function.LOGIN:
					{
						String[] data= {
							st.nextToken(),	
							st.nextToken(),
							st.nextToken(),
							st.nextToken()
						};
						wr.model2.addRow(data);
					}
					break;
					case Function.MYLOG:
					{
						setTitle(st.nextToken());
						card.show(getContentPane(), "WR");
					}
					break;
					case Function.WAITCHAT:
					{
						wr.bar.setValue(wr.bar.getMaximum());
						wr.ta.append(st.nextToken()+"\n");
					}
					break;
				}
			}
		}catch(Exception ex) {}
	}

}
