package com.sist.server;
// network => net => ���̺귯�� 
import java.util.*;

import com.sist.common.Function;

import java.io.*;// ����� (������ Ŭ���̾�Ʈ�� ������ �ְ� �ޱ�)
import java.net.*;// �ٸ� ��ǻ�Ϳ� ���� 
/*
 *    �Ϲ� ���� (Application) => Socket(���� ���=>����Ʈ����� ����)
 *    ������ => URL
 *    ============================================���������� ���α׷� TCP
 *      
 */
// Server => ���Ӹ� ��� => ���� 
// Client => ���� ��� ��� => Ŭ���̾�Ʈ���� ���� ��� => ������ �̿� 
public class Server implements Runnable{
    private ServerSocket ss;// ������ �޴� Ŭ���� => ���� ���� 
    private final int PORT=3355;
    // Ŭ���̾�Ʈ ���ӽÿ� ����(IP,PORT)
    private Vector<Client> waitVc=new Vector<Client>();
    // �����忡�� ����ȭ ���α׷� 
    
    // ���� ���� 
    public Server()
    {
    	try
    	{
    		ss=new ServerSocket(PORT);
    		/*
    		 *   bind() => IP , PORT �����ִ� ���� 
    		 *      ===> �ڵ��� (����)
    		 *   listen() => ������ (Ŭ���̾�Ʈ�� �����ϱ������� ���)
    		 */
    		System.out.println("Server Start...");
    	}catch(Exception ex){}
    }
    // Ŭ���̾�Ʈ�� ������ ���� ��� => ���� ����� �����ϰ� ������� ���� 
    @Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				Socket s=ss.accept();
				// accept() : Ư���� �޼ҵ� => Ŭ���̾�Ʈ�� ���ӽÿ��� ȣ��Ǵ� �޼ҵ�
				Client client=new Client(s);
				client.start(); // Ŭ���̾�Ʈ�� ��� ���� 
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� ���� 
		Server server=new Server();
		new Thread(server).start();
		// ServerŬ������ �ִ� run()�� ȣ�� 
	}
	// ���� Ŭ���� => Server�� ������ �ִ� ������ ���� ������ �����ϰ� ����� 
	class Client extends Thread
	{
		// Ŭ���̾�Ʈ�� ���� 
		Socket s;
		// Ŭ���̾�Ʈ�κ��� ��û�� �޴´� 
		BufferedReader in;
		// ��û�� ó���� �� ������ ����� ����  
		OutputStream out;
		// ���� ���� 
		String id,name,sex,pos;
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// Ŭ���̾�Ʈ ��û�� �޼ҵ带 �о���� �޸� ���� 
				out=s.getOutputStream();
			}catch(Exception ex) {}
		}
		// ��� ? => ��� (��û ó��)
		public void run()
		{
			try
			{
				while(true)
				{
					// Ŭ���̾�Ʈ�� ��û�� ������ �޴´� 
					String msg=in.readLine();
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					//  100|id|��ȭ��|����
					switch(protocol)
					{
						case Function.LOGIN:
						{
							// �α��� ó�� 
							// �����Ͱ� �ޱ� 
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							pos="����";// ������� �⺻ ���� 
							
							// ������ ��� ����� => �α����� ������ �����ش�
							this.messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex
									+"|"+pos);
							// ������ ����� ������ ���� 
							waitVc.add(this);
							// Client client=new Client();
							messageTo(Function.MYLOG+"|"+id);
							// �α���â���� => ����â���� ���� 
							for(Client user:waitVc)
							{
								messageTo(Function.LOGIN+"|"
							     +user.id+"|"+user.name+"|"+user.sex
							     +"|"+user.pos);
							}
							// ����޼��� ��� 
							messageAll(Function.WAITCHAT+"|[��"+name+"���� �����ϼ̽��ϴ�]");
							// ������ ������ ���� 
							
						}
						break;
						case Function.WAITCHAT:
						{
							messageAll(Function.WAITCHAT+"|["+name+"]"+st.nextToken());
						}
						break;
							
					}
				}
			}catch(Exception ex){}
		}
		// ���� ó�� 
		// ���������� ���� 
		public synchronized void messageTo(String msg)
		{
			// synchronized
			/*
			 *   ������� default : �񵿱�ȭ 
			 *   synchronized => ����ȭ 
			 */
			try
			{
				out.write((msg+"\n").getBytes());
				// ���ڵ� ==> ���ڵ�
			}catch(Exception ex){}
		}
		// ��ü������ ���� 
		public synchronized void messageAll(String msg)
		{
			try
			{
				for(Client user:waitVc)
				{
					user.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
	}
	

}






