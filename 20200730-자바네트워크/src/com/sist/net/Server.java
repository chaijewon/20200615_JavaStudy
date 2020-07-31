package com.sist.net;
import java.io.*;
import java.net.*;
import java.util.*;
/*
 *    ���� ���� 
 *      ServerSocket (Socket=��ȭ��)
 *    ���ӽÿ� ó�� 
 *      accept() 
 *    ��� 
 *      write()
 *      read()
 */
public class Server implements Runnable{
    // ���� �޴� Socket => ��ȯ ����
	ServerSocket ss=null;
	// ���� ���� 
	// �Ѱ��� ��ǻ�Ϳ����� �������� ���� ������ �Ұ��� 
	// ������ ���� ���� 
	Vector<Client> waitVc=new Vector<Client>();
	public Server()
	{
		try
		{
			ss=new ServerSocket(3355);// bind(ip,port) => listen()
			// �������� 
			System.out.println("Server Start!!");
		}catch(Exception ex){}
	}
	// ���ӽÿ� ó�� 
	public void run()
	{
		try
		{
			while(true)
			{
				Socket s=ss.accept(); // ������ ���� ��� => �������� IP,PORT�� Ȯ�� 
				// IP,PORT => Socket (�߽��� ����)
				/*
				 * System.out.println( "������ IP:"+s.getInetAddress().getHostAddress());
				 * System.out.println("�������� PORT(���ἱ):"+s.getPort());
				 */
				Client c=new Client(s);// �����ڿ� ������ ���� ��Ų�� 
				waitVc.add(c);// Ŭ���̾�Ʈ ���� 
				c.start();// �����ڿ� ����� �����϶� 
			}
		}catch(Exception ex) {}
	}
	// �����ڸ��� ���� ����� ������ ���� 
	class Client extends Thread
	{
		Socket s;// ������ Ŭ���̾�Ʈ ���� 
		OutputStream out; // Ŭ���̾�Ʈ�� ����� ���� 
		BufferedReader in; // Ŭ����Ʈ ��û�ÿ� ���� �޴� Ŭ���� 
		public Client(Socket s)
		{
			try
			{
			  this.s=s;// s=> Ŭ���̾�Ʈ 
			  out=s.getOutputStream();
			  in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			}catch(Exception ex) {}
			
		}
		// ��Ž��� 
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine();
					// ä�� ���ڿ� �ޱ�
					for(Client user:waitVc)
					{
						user.out.write((msg+"\n").getBytes());
						// ��Ʈ��ũ => 1byte ==> ������ (�ѱ�) => 2byte�� ��ȯ 
					}
				}
			}catch(Exception ex) {}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Server server=new Server();// �������� 
        new Thread(server).start();// ����ó�� => ������ ��ٸ��� 
	}

}






