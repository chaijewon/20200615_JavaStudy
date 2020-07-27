package com.sist.io;
import java.io.*;
import java.util.*;
/*
 *    FileInputStream , FileReader
 *    FileOutputStream , FileWriter
 *    BufferedReader , File
 *    
 *    �ڹ� ���α׷� 
 *    �ڹ� WEB�����α׷� (������)
 *    ======================= ������ (����ó��)
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois=null;
        try
        {
        	ois=new ObjectInputStream(
        			new FileInputStream("c:\\javaDev\\movie_test.txt"));
        	ArrayList<Movie> list=(ArrayList<Movie>)ois.readObject();
        	// ��� 
        	for(Movie m:list)
        	{
        		System.out.println(m.getMno()+" "+m.getTitle()+" "+m.getActor());
        	}
        }catch(Exception ex)
        {
        	// ���� ó�� 
        	System.out.println(ex.getMessage());// 
        }
        finally
        {
        	try
        	{
        		ois.close();
        	}catch(Exception ex) {}
        }
        
	}

}
