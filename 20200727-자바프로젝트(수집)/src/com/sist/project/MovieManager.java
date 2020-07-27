package com.sist.project;
import java.io.FileWriter;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 *       try
 *       {
 *           for()
 *           {
 *               try
 *               {
 *               }catch(Exception e){} ���� ==> continue => for ������
 *           }
 *       }catch(Exception e){}
 *       
 *       try
 *       {
 *           for()
 *           {
 *              
 *           } break
 *       }catch(Exception e){}
 */
public class MovieManager {
    public void movieAllData() 
    {
     try {
	    	ArrayList<MovieVO> list=
	    			new ArrayList<MovieVO>();
	    	String[] site={
	    		"https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page=",
	    		"https://movie.daum.net/premovie/scheduled?reservationOnly=N&sort=reservation&page=",
	    		"https://movie.daum.net/boxoffice/weekly",
	    		"https://movie.daum.net/boxoffice/monthly",
	    		"https://movie.daum.net/boxoffice/yearly"
	    	};
	    	// <a href="/moviedb/main?movieId=135083" class="name_movie"
	    	// HTML (���������� ����Ǵ� ���) 
	    	// �±� <> , �Ӽ� 
	    	// ȭ�� UI => ����  => id(�ߺ��� ����),class(�ߺ��̵ɶ�)
	    	int mno=107;
	    	int cno=5;
	    	
	    	//for(int i=4;i<=6;i++)
	    	{
	    		// ����Ʈ �����ؼ� �����͸� �ѹ��� �б� => �޸� ���� => Document
	    		Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get();
	    	    Elements link=doc.select("a.name_movie");// css
	    	    for(int j=0;j<link.size();j++)
	    	    {
	    	    	// class Elements extends ArrayList
	    	    	//System.out.println(link.get(j).attr("href"));
	    	    	// �󼼺��� 
	    	    	try {
		    	    	String url="https://movie.daum.net"+link.get(j).attr("href");
		    	    	Document doc2=Jsoup.connect(url).get();
		    	    	
		    	    	Element poster=doc2.selectFirst("span.thumb_img img");
		    	    	System.out.println("������:"+poster.attr("src"));
		    	    	Element title=doc2.selectFirst("span.txt_name");
		    	    	System.out.println("����:"+title.text());
		    	    	// <img src="�̹������">
		    	    	//<span class="txt_name">����</span>
		    	    	Element score=doc2.selectFirst("div.info_origin a");
		    	    	System.out.println("���:"+score.text());
		    	    	
		    	    	Element director=doc2.select("dd.type_ellipsis a.link_person").get(0);
		    	    	System.out.println("����:"+director.text());
		    	    	Element actor=doc2.select("dd.type_ellipsis a.link_person").get(1);
		    	    	System.out.println("�⿬:"+actor.text());
		    	    	
		    	    	Element genre=doc2.select("dl.list_movie dd").get(0);
		    	    	System.out.println("�帣:"+genre.text());
		    	    	
		    	    	Element regdate=doc2.select("dl.list_movie dd").get(2);
		    	    	System.out.println("�帣:"+regdate.text());
		    	    	
		    	    	Element grade=doc2.select("dl.list_movie dd").get(3);
		    	    	System.out.println("�帣:"+grade.text());
		    	    	
		    	    	Element showUser=doc2.selectFirst("dd#totalAudience em.emph_g");
		    	    	System.out.println("����:"+showUser.text());
		    	    	
		    	    	Element story=doc2.selectFirst("div.desc_movie p");
		    	    	System.out.println("�ٰŸ�:"+story.text());
		    	    	
		    	    	
		    	    	String msg=mno+"|"+cno+"|"+title.text()+"|"
		    	    			  +poster.attr("src")+"|"+score.text()
		    	    			  +"|"+director.text()+"|"+actor.text()
		    	    			  +"|"+genre.text()+"|"+regdate.text()
		    	    			  +"|"+grade.text()+"|"+showUser.text()
		    	    			  +"|"+story.text()+"\r\n";
		    	    	
		    	    	// ���Ͽ� ���� 
		    	    	FileWriter fw=new FileWriter("c:\\javaDev\\daum_movie.txt",true);
		    	    	fw.write(msg);
		    	    	fw.close();
		    	    	
		    	    	mno++;
		    	    			  
	    	    	}catch(Exception ex) {}
	    	    	
	    	    }
	    	}
      }catch(Exception ex)
      {
    	   System.out.println(ex.getMessage());// ���� �޼��� ��� 
      }
     // finally => ���� �ݱ� , ����Ŭ ���� ���� ���� , ��Ʈ��ũ ���� 
    }
    public void daumNewsData()
    {
    	try
    	{
    		for(int i=1;i<=11;i++)
    		{
    	    	Document doc=Jsoup.connect("https://movie.daum.net/magazine/new?tab=nws&regdate=20200727&page="+i).get();
    		    Elements title=doc.select("strong.tit_line a.link_txt");
    		    Elements poster=doc.select("a.thumb_line span.thumb_img");
    		    Elements content=doc.select("a.desc_line");
    		    Elements author=doc.select("span.state_line");
    		    Elements link=doc.select("strong.tit_line a.link_txt");
    		    // ��ũ�� ���硯�� 1911�� �Ⱓ�� �̷� �� �ѹ���
    		    
    		    for(int j=0;j<title.size();j++)
    		    {
    		    	System.out.println(title.get(j).text());
    		    	System.out.println(poster.get(j).attr("style"));
    		    	System.out.println(content.get(j).text());
    		    	System.out.println(author.get(j).text());
    		    	System.out.println(link.get(j).attr("href"));
    		    }
    		}
    	}catch(Exception ex) {System.out.println(ex.getMessage());}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ��ü ���� 
		MovieManager m=new MovieManager();
		//m.movieAllData();
		m.daumNewsData();
	}

}
