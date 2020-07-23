package com.sist.string;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.*;

/*
 *    Find 
 *     =====================================================
 *     => 포함 contains()   ========> LIKE '%데이터%'  boolean
 *     => 시작 문자열 startsWith()  ==> LIKE '데이터%'   boolean
 *     => 끝 문자열  endsWith()     ==> LIKE  '%데이터'  boolean
 *     ===================================================== if
 *     
 *     100 + 200 = 300
 *     ========= 100200
 */
public class MainClass2 {
    public void find(String ss)
    {
    	try
    	{
    		for(int i=1;i<=3;i++)
    		{
    		   Document doc=Jsoup.connect("https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page="+i).get();
    		   Elements title=doc.select("a.name_movie");
    		   for(int j=0;j<title.size();j++)
    		   {
    			   // boolean java.lang.String.endsWith(String suffix)
    			   // boolean java.lang.String.startsWith(String prefix)
    			   // boolean java.lang.String.contains(CharSequence s)
    			   if(title.get(j).text().endsWith(ss))
    			   //if(title.get(j).text().startsWith(ss))
    			   //if(title.get(j).text().contains(ss))
    			   {
    			      System.out.println(title.get(j).text());
    			   }
    			   /*
    			    *   실제 찾기 => contains()
    			    *   서제스트 => startsWith() : 자동 완성기
    			    */
    		   }
    		}
    		
    	}catch(Exception ex){}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MainClass2 m=new MainClass2();
        Scanner scan=new Scanner(System.in);
        System.out.print("검색어:");
        String ss=scan.next(); 
        m.find(ss);
	}

}





