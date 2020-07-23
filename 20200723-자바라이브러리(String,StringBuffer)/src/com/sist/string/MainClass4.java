package com.sist.string;
// StringBuffer : 문자열을 결합할 경우   ==>  append()
import java.io.*;// => CheckException => 예외처리를 하고 사용 
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// 파일 읽기 
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
        	System.out.println("걸린시간:"+(end-start));
        }catch(Exception ex){}
	}

}





