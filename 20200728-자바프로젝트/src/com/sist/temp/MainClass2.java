package com.sist.temp;

import java.io.*; 
import java.util.*;// split , StringTokenizer 
public class MainClass2 {

	public static void main(String[] args) {
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\daum_movie.txt");
			//System.out.println("1");
			int i=0;
			StringBuffer sb=new StringBuffer();// ���ڿ� ���� 
			while((i=fr.read())!=-1)
			{
				//System.out.print((char)i);
			    sb.append(String.valueOf((char)i));
			}
			// ��� 
			System.out.println(sb.toString());
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
	}
}