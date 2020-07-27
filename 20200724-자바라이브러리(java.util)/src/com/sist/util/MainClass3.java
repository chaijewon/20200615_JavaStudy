package com.sist.util;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5];//5~14
		
		String day="";
		for(int i=0;i<resDay.length;i++)
		{
			resDay[i]=r.nextInt(31)+1;
			day+=resDay[i]+"|";
		}
		day=day.substring(0,day.lastIndexOf("|"));
		
		System.out.println(day);
		
        //³¯Â¥º° ºĞ¸® 
		String[] resdays=day.split("\\|");// Á¤±Ô½Ä
		/*
		 *    Á¤±Ô½Ä
		 *     ^ => ½ÃÀÛ ¹®ÀÚ    ^A  => ^[°¡-ÆR] ^[A-Za-z] ^[0-9]
		 *                          [^°¡-ÆR] => Á¦¿Ü 
		 *                   Áö´Ï¹ÂÁ÷ 
		 *                     => 3»ó½Â => [^°¡-ÆR] ==> 3
		 *                     => 1ÇÏ°­ => [^0-9]
		 *     $ => ³¡¹®ÀÚ        A$
		 *     . => ÀÓÀÇÀÇ ÇÑ±ÛÀÚ (¸ğµç ±ÛÀÚ)  ==> \\.
		 *     | => ¼±ÅÃ 
		 *     ? => ÀÖÀ¸¸é Ãâ·Â , ¾øÀ¸¸é ¹ÌÃâ·Â 
		 */
		for(String s:resdays)
		{
			System.out.println(s);
		}
		System.out.println("=====StringTokenizer=====");
		StringTokenizer st=new StringTokenizer(day, "|");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
	}

}



