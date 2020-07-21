package com.sist.data;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *   <ul class="list-toplist-slider" style="width: 531px;">
            <li>
              <img class="center-croping" alt="Ƽ��̼� ���� ����Ʈ 50�� ����"
                   data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/rjo80nepigkxn637.png?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"/>

              <a href="/top_lists/633_tiramisu"
                 onclick="trackEvent('CLICK_TOPLIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;�ϰ� ���� ���� ����Ʈ&quot;,&quot;position&quot;:0,&quot;link_key&quot;:&quot;LMUMANJ&quot;});">
                <figure class="ls-item">
                  <figcaption class="info">
                    <div class="info_inner_wrap">
                      <span class="title">Ƽ��̼� ���� ����Ʈ 50��</span>
                      <p class="desc">"�־� ����Ʈ�� ��� Ƽ��̼� �ƴϰھ�?"</p>
 */
public class MainClass3 {
    public static FoodHouseVO[] categoryFoodData()
    {
    	FoodHouseVO[] food=new FoodHouseVO[10];
    	try
    	{
    		Document doc=Jsoup.connect("https://www.mangoplate.com/top_lists/1965_hotel_bingsu").get();
    		Elements title=doc.select("span.title h3");
    		Elements score=doc.select("strong.point span");
    		Elements address=doc.select("p.etc");
    		Elements poster=doc.select("img.center-croping");
    		Elements review=doc.select("p.short_review");
    		for(int i=0;i<10;i++)
    		{
    			System.out.println(title.get(i).text());
    			System.out.println(score.get(i).text());
    			System.out.println(address.get(i).text());
    			System.out.println(poster.get(i).attr("data-original"));
    			System.out.println(review.get(i).text());
    			System.out.println("=================================");
    			food[i]=new FoodHouseVO();
    			food[i].setTitle(title.get(i).text());
    			food[i].setScore(Double.parseDouble(score.get(i).text()));
    			// ���ڿ� => ������ ��ȯ Double.parseDouble()
    			// ���ڿ� => ����  Integer.parseInt()
    			// ���ڿ� => ��  Boolean.parseBoolean()
    			// Wrapper Class 
    			food[i].setAddrss(address.get(i).text());
    			food[i].setPoster(poster.get(i).attr("data-original"));
    			food[i].setReview(review.get(i).text());
    		}
    		/*
    		 *    <p>aaaaaaa</p>
    		 *    <p data="aaaaaa"/>
    		 */
    	}catch(Exception ex)
    	{
    		ex.printStackTrace(); // ������ġ Ȯ�� 
    	}	
    	return food;
    }
	public static CategoryVO[] categoryListData()
	{
		CategoryVO[] cate=new CategoryVO[10];
		try
		{
		    Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
		    //System.out.println(doc);
		    Elements title=doc.select("div.info_inner_wrap span.title");
		    Elements subject=doc.select("div.info_inner_wrap p.desc");
		    Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
		    //Elements link=doc.select("");
		    /*
		     *   <p>aaa</p> p.text()
		     *   <p src=""> p.attr()
		     */
		    for(int i=0;i<10;i++)
		    {
		    	System.out.println("==================================");
		    	System.out.println(title.get(i).text());
		    	System.out.println(subject.get(i).text());
		    	System.out.println(poster.get(i).attr("data-lazy"));
				cate[i]=new CategoryVO();
				cate[i].setCno(i+1);
				cate[i].setTitle(title.get(i).text());
				cate[i].setSubject(subject.get(i).text());
				cate[i].setPoster(poster.get(i).attr("data-lazy"));
		    }
		}catch(Exception ex)
		{
			ex.printStackTrace();// �����ÿ� ��� ���� Ȯ�� 
		}
		return cate;
	}
	public static void main(String[] args) {
		categoryFoodData();
	}

}
