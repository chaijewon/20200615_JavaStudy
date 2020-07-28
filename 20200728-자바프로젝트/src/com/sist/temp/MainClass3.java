package com.sist.temp;
import java.io.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileInputStream fis=new FileInputStream("c:\\javaDev\\daum_movie.txt");
        	BufferedReader br=
        			new BufferedReader(new InputStreamReader(fis));
        	// InputStreamReader => 1byte => 2byte로 변환 
        	// 네트워크 , 메모리 , 파일 
        	while(true)
        	{
        		String data=br.readLine();
        		if(data==null) break;
        		System.out.println(data);
        	}
        	fis.close();
        }catch(Exception ex)
        {
        	System.out.println(ex.getMessage());
        }
	}

}
