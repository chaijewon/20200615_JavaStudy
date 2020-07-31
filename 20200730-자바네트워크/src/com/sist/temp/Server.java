package com.sist.temp;
/*
 *     ���� => IP ���� (��ȭ��ȣ)
 *            Ŭ���̾�Ʈ���� ���� ==> �����ȣ (PORT) => (��ȭ��)
 *            PORT => 0~65535 => ������� PORT (0~1023)
 *                 ��) HTTP => 80
 *                     SMTP => 25  , FTP => 21 , TELNET => 23...
 *                     ��Ÿ) Spring : 8080 
 *                          React  : 3000
 *                          ����Ŭ    : 1521   MS-SQL : 1433
 *                          �ӵ� : 4000 
 *                     => ���� : 20000��
 *                     => ȭ��  : 30000��
 *      ���� ���� 
 *        1) bind => �ڵ��� ���� 
 *           =====
 *             IP+PORT
 *        2) ������ => listen
 *        3) ���Ӵ�� => ���� ==> accept() : �߽��� ��ȭ��ȣ�� ���� 
 *                                            ======= IP
 *        4) ���� => ����ȭ 
 *                  =====
 *                  ArrayList : �񵿱�ȭ  
 *                  Vector : ����ȭ 
 *                  
 *        5) ������ ����  : write()
 *        6) ����ں��� ��û : readLine() 
 *        
 *        �������� �ϴ� ���� 
 *        =============
 *         1) ����� ��û�ޱ� 
 *         2) ��ûó�� => ã�� 
 *         3) ������� ����� => ���� 
 *         
 *        ==> ���� 
 *            1) 1:1 (Peer TO Peer)
 *            2) 1:�� => �����ʹ� ���� 
 *                      ����ڰ� ���� ��û�� �� �� �ְ� ����� 
 *                      => ����� ��û�� �޾Ƽ� ó���ϴ� ���α׷��� ���� 
 *                      => ��� => ���� ���� (������)
 *            ===============================================
 *            ������ 
 *              => �ڿ��� ���� ȿ�������� ��� 
 *              => ����ڿ� ���� ���伺�� ���
 *              => �۾��� �и��ȴ� (�ҽ��� ����ȭ)
 *              => CPU�� ȿ�������� ��� => �ӵ��� �������� 
 *              => �������� ���α׷� => ���μ��� (�����尡 1���̻� ����)
 *            �����带 ���� ��� 
 *            ==============
 *             1. �������̽� 
 *                Runnable =====> run()
 *                class A implements Runnable => ������ 
 *             2. Thread Ŭ���� ��� 
 *                class A extends Thread => �Ϲ� ������ 
 *            ������ ���� ���� 
 *             ����                    ���(�����忡�� ����ϴ� ������ ����) ������ ����
 *             new Thread()       start()                   run()
 *             ==> �������� ���� ���� run()���� 
 *             ==> ������� �ݵ�� �Ѱ��� ���۸� ����
 *                 run() => ���� => interrupt() 
 *                       => �Ͻ����� => sleep() , wait() , join()
 *             
 */
class MyTheard extends Thread
{
	// ���� 
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(getName()+":"+i);
				Thread.sleep(50);// 1/1000
			}
		}catch(Exception ex) {}
	}
}
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyTheard t1=new MyTheard();
        MyTheard t2=new MyTheard();
        MyTheard t3=new MyTheard();
        
        // ���� => JVM (1. ���� ���� => 1~10) => ����� ���� ������ (5)
        // 1: MIN_PRIORITY , 10 : MAX_PRIORITY , 5 : NORM_PRIORITY
        // �� �����帶�� �̸� �ο� Thread-0 , Thread-1......
        // �ڹ����α׷��� MAX_PRIORITY(main),MIN_PRIORITY(gc)
        
        // �̸� �ο�
        t1.setName("����");
        t2.setName("�λ�");
        t3.setName("����");
        // ���� �ο� 
        t1.setPriority(10);
        t2.setPriority(1);
        t3.setPriority(1);
        // run��ȣ�� => start() => �ڵ����� run()ȣ��ȴ� 
        t1.start();
        t2.start();
        t3.start();
	}

}









