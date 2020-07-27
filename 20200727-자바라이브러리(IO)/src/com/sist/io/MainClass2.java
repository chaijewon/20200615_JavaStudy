package com.sist.io;
// ���Ͽ� ���� => ȸ������ , ��� , �Խ��� 
/*
 *     ���� => ���� => ArrayList
 *     ������ => ArrayList�� ��Ƽ� => ���� 
 */
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *    ���� ����� 
		 *    ========
		 *      r => read
		 *      w => write => create
		 *      a => append
		 *    FileOutputStream(1byte)
		 *    ������ 
		 *      new FileOutputStream("��θ�")
		 *      new FileOutputStream("��θ�",true/false) => false�� �⺻ Default
		 *    FileWriter(2byte)
		 */
		//FileOutputStream fos=null;
		FileWriter fos=null;
        try
        {
        	// ����
        	//fos=new FileOutputStream("c:\\javaDev\\temp.txt",true);// append
        	fos=new FileWriter("c:\\javaDev\\temp.txt",true);
        	// ���� 
        	String str="ABCDEFGHEIJJJSNSNSSN";
        	//fos.write('L');
        	//fos.write('M');
        	//fos.write('N');
        	fos.write(str+"\r\n");
        	// getBytes() => ���ڿ��� ����Ʈ �迭�� ������ �� ��� 
        	System.out.println("���� �Ϸ�!!");
        }catch(Exception ex)
        {
        	// ���� ó�� 
        	System.out.println(ex.getMessage());
        }
        finally
        {
            // ���� �ݱ�  
        	// finally ==> ���� �ݱ� , ���� �ݱ� , ����Ŭ ���� ����
        	try
        	{
        	  fos.close();
        	}catch(Exception ex) {}
        }
	}

}









