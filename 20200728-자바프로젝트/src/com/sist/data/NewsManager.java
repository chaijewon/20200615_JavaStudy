package com.sist.data;
import java.util.*;
import java.io.*;
/*
 *    String data=title.get(j).text()+"|"
    		    +content.get(j).text().replace("|", " ")+"|"
    		    +author.get(j).text()+"|"
    		    +link.get(j).attr("href")+"|"
    		    +"https:"+img+"\r\n";
 */
public class NewsManager {
    private static ArrayList<NewsVO> list=
    		  new ArrayList<NewsVO>();
    // 프로그램 => 시작 => 데이터 읽어서 => ArrayList에 저장 
    /*
     *   파일 
     *   데이터베이스 
     *   ==========  한번만 수행 
     */
    static
    {
    	try
    	{
    		FileInputStream fis=
    				new FileInputStream("c:\\javaDev\\daum_news.txt");
    		BufferedReader in=
    				new BufferedReader(new InputStreamReader(fis));
    		while(true)
    		{
    			String data=in.readLine();
    			if(data==null) break;
    			
    			StringTokenizer st=new StringTokenizer(data,"|");
    			NewsVO vo=new NewsVO();
    			vo.setTitle(st.nextToken());// 컬럼 
    			vo.setContent(st.nextToken());
    			vo.setAuthor(st.nextToken());
    			vo.setLink(st.nextToken());
    			vo.setPoster(st.nextToken());
    			list.add(vo);
    		}
    		fis.close();
    	}catch(Exception ex){}
    }
    public ArrayList<NewsVO> newsListData(int page)
    {
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}





