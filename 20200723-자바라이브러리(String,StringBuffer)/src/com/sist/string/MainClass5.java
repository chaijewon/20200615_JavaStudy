package com.sist.string;

import java.io.FileReader;
/*
 *   StringBuffer : ����ȭ
 *   StringBuilder : �񵿱�ȭ 
 *   ======================= ���ڿ� ���� (������)
 *   
 */
public class MainClass5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		//String data="";
		//StringBuffer sb=new StringBuffer();
		StringBuilder sb=new StringBuilder();
    	FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
    	int i=0;
    	while((i=fr.read())!=-1)// -1 EOF
    	{
    		//data+=String.valueOf((char)i);
    		sb.append(String.valueOf((char)i));
    	}
    	fr.close();
    	long end=System.currentTimeMillis();
    	System.out.println("����ð�:"+(end-start));
	}

}




