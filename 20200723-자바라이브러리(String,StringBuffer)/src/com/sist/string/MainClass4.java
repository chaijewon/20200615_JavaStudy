package com.sist.string;
// StringBuffer : ���ڿ��� ������ ���   ==>  append()
import java.io.*;// => CheckException => ����ó���� �ϰ� ��� 
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// ���� �б� 
        	//String data="";
        	long start=System.currentTimeMillis();
        	StringBuffer data=new StringBuffer();
        	FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
        	int i=0;
        	while((i=fr.read())!=-1)// -1 EOF
        	{
        		data.append(String.valueOf((char)i));
        	}
        	fr.close();
        	long end=System.currentTimeMillis();
        	System.out.println("�ɸ��ð�:"+(end-start));
        }catch(Exception ex){}
	}

}





