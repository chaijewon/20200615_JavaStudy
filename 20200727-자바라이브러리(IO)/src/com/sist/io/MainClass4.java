package com.sist.io;
import java.io.*;
import java.util.*;
/*
 *    FileInputStream , FileReader
 *    FileOutputStream , FileWriter
 *    BufferedReader , File
 *    
 *    자바 프로그램 
 *    자바 WEB프프로그램 (스프링)
 *    ======================= 공통기반 (예외처리)
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
        	// 출력 
        	for(Movie m:list)
        	{
        		System.out.println(m.getMno()+" "+m.getTitle()+" "+m.getActor());
        	}
        }catch(Exception ex)
        {
        	// 에러 처리 
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
