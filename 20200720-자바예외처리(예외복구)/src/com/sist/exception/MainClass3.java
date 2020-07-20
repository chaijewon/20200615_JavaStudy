package com.sist.exception;
// 부분 처리 
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부분적으로 try를 사용 할 수 있다 
        try
        {
        	for(int i=1;i<=10;i++)
        	{
        		try
        		{
	        		System.out.println("i="+i);
	        		int a=i/(int)(Math.random()*3);//error 
	        		System.out.println("a="+a);
        		}catch(Exception e) {System.out.println("for문 i++로 이동");} 
        	}
        }catch(Exception ex) 
        {
        	System.out.println("에러 발생");
        }
        System.out.println("프로그램 정상 종료!!");
	}

}
