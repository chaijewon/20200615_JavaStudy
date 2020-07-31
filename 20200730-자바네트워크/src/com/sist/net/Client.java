package com.sist.net;
import java.net.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Client extends JFrame implements Runnable,ActionListener{
    JTextArea ta;
    JTextField tf;
    JButton b1,b2;
    // ��Ʈ��ũ ���� ���̺귯�� 
    Socket s; // ������ (��ȭ��)
    BufferedReader in;
    OutputStream out;
	public Client()
	{
		ta=new JTextArea();
		ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
		tf=new JTextField(30);
		tf.setEnabled(false);
		b1=new JButton("����");
		b2=new JButton("����");
		
		JPanel p=new JPanel();
		p.add(tf);p.add(b1);p.add(b2);
		
		add("Center",js);
		add("South",p);
		setSize(500, 500);
		setVisible(true);
		
		b1.addActionListener(this);// ����
		b2.addActionListener(this);// ����
		tf.addActionListener(this);// ���� => �Էµ� ���� ������ ����
	}
	// ������ ������ ������� �޾Ƽ� ��� 
	public void run()
	{
		try
		{
			while(true)
			{
				String msg=in.readLine();
				ta.append(msg+"\n");
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try { Socket s=new Socket("211.238.142.181",3355); }catch(Exception ex) {}
		 */
		new Client();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			try
			{
				s=new Socket("localhost",3355);
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// �������� ���� �о� �´� 
				out=s.getOutputStream();
				// ������ ���� ������ ��� 
				tf.setEnabled(true);// Ȱ��ȭ
				b1.setEnabled(false);
			}catch(Exception ex) {}
			   new Thread(this).start();
			   // �����κ��� ���� �о� �Ͷ� 
		}
		else if(e.getSource()==tf)
		{
			try
			{
				String msg=tf.getText();
				if(msg.length()<1) return;
				out.write((msg+"\n").getBytes());
				tf.setText("");
			}catch(Exception ex) {}
		}
	}

}
