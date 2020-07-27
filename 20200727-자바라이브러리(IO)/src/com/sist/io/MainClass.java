package com.sist.io;
/*
 *    IO 
 *    ==
 *     => Input/Output
 *        ���� / �б� 
 *        *** 1. �޸� �����
 *        2. ���� ����� 
 *        3. ��Ʈ��ũ �����
 *        
 *     => IO 
 *        ==
 *         ��Ʈ�� �̿�  => ������ ��� (��Ȯ�� ����)
 *         �ܹ��� (�Է� , ��� ��ΰ� �ٸ���)
 *         
 *        = 1byte (�Ϲ� ����)
 *          ����Ʈ ��Ʈ��
 *             InputStream / OutputStream => �������̽�  => read/write
 *              => ���ε� /�ٿ�ε� 
 *        = 2byte (����) => �ѱ�
 *          ���� ��Ʈ�� 
 *             ***Reader  / Writer (O) => �������̽� 
 *             
 *        = ��ü��ü�� ����  : ����ȭ  
 *          ============ 
 *           = ObjectInputStream
 *           = ObjectOutputStream
 *           
 *        = �ӵ��� ������ => Buffer
 *          ***BufferedInputStream 
 *          ***BufferedOutputStream
 *          
 *          =====> XML,JSON,CSV(������ �Ľ��ϴ� ����� ���� �ִ�) : Web(Spring)
 *          
 *          *** ������ 
 *          1. �ݵ�� import java.io.*
 *          2. �ݵ�� ����ó�� (CheckException)
 *          
 *          1. ���� �б� 
 *             =======
 *              FileInputStream (1byte) => �ѱ��� �ִ� ��쿡�� �ѱ��� ������ 
 *              FileReader (2byte) 
 *              =======================
 *              1) ������ �б� 
 *                 FileInputStream fis=new FileInputStream("�����θ�");
 *                                              c:\\javaDev\\a.txt
 *                 while(���ϳ�����) ==> -1(EOF)
 *                 {
 *                     ��� 
 *                 }
 *                 =============
 *                 fis.close()
 *                 ============= finally => try/catch�� ������� ���� 
 *                 
 *              *** ������ �б� ��� 
 *              1) �ѱ��� �б�
 *                 int read() => ���ڹ�ȣ 
 *                     A ==>  65 ==> (char)i
 *              2) �������� ���ÿ� �д� ��� 
 *                 int read() => ���� ����Ʈ ���� 
 *                 
 *              *** ������ ���� (����)
 *                 FileOutputStream 
 *                 =================
 *                   write() => �ѱ��ھ� ���� 
 *                   
 *                   
 *          IO 
 *           = FileInputStream , FileReader
 *           = FileOutputStream , FileWriter
 *           = BufferedReader , BufferedWriter
 *           = ObjectInputStream/ObjectOutputStream
 *           = BufferedInputStream,BufferedOutputStream
 *          ===========================================
 *          
 *             ������ 
 *            =======
 *              ����ȭ�� ������ : ����Ŭ (***)
 *              ������ȭ ������ : ������ �ȴ� => �ʿ���� �����͵� ���� 
 *                            html,xml,json
 *              ====================================
 *              ������ȭ ������ : ���е� ���� , ���� , Ʈ����   => ������ => ��������
 *                            => REGEX(����)
 *              ====================================
 *          
 */
import java.io.*; 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream fis=null;// �ݵ�� �ʱⰪ�� �ο� => png,jpg,zip...
		// ��� Ŭ������ �ʱⰪ ==> null
		FileReader fis=null;// �ѱ��� ���Ե� ������ �о� �ö� 
		// �ڹٿ��� ����=> Ansi�� ������ �ȴ� 
        try
        {
        	// ���� �б� 
        	//fis=new FileInputStream("c:\\javaDev\\news1.txt");
        	fis=new FileReader("c:\\javaDev\\news1.txt");
        	// ������ �о ����â�� ��� 
        	int i=0; // �ѱ��ھ� �д´� => �ѱ��ھ� ������ �´� , ���ڹ�ȣ 
        	while((i=fis.read())!=-1) // -1 ������ ��(EOF)
        	{
        		System.out.print((char)i);
        	}
        	
        }catch(Exception ex)
        {
        	// ���� ó��
        	System.out.println(ex.getMessage());
        }
        finally
        {
        	// ���� �ݱ� 
        	try
        	{
        	   fis.close();
        	}catch(Exception ex){}
        }
	}

}







