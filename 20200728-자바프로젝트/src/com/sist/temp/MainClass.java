package com.sist.temp;
import java.io.*; 
import java.util.*;// split , StringTokenizer 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� �б� => ����ó�� 
		FileReader fr=null; // ���� �б�
		// ���Ͽ� ���� : FileWriter ==> ���� ��Ʈ�� (�ѱ� ����) => 2byte
		/*
		 *    FileInputStream
		 *    FileOutputStream 
		 *    ==================== 1byte (png,jpg...zip)
		 */
		System.out.println("���� �б�");
		try
		{
			// ���� �б� 
			System.out.println("Start...");
			fr=new FileReader("c:\\javaDev\\daum_movie.txt");
			int i=0; // �ѱ��� �б� => ������ ��ȣ
			System.out.println("fr="+fr);
			while((i=fr.read())!=-1)
			{
				System.out.print(i);
			}
		}catch(Exception ex) 
		{
			// ���� ó�� => ����� 
			/*
			 *   ���� �޼��� Ȯ��   getMessage()
			 *   Trace => ������� => �ش���ġ ã�� printStackTrace() 
			 */
			ex.printStackTrace();
		}
		finally
		{
			// ���� �ݱ� , ������ ���� , ��Ʈ��ũ ���� ���� , ����Ŭ ���� ���� 
			try
			{
			   fr.close();
			}catch(Exception ex) {}
		}
		
	}

}
