package com.sist.exception;
// �κ� ó�� 
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �κ������� try�� ��� �� �� �ִ� 
        try
        {
        	for(int i=1;i<=10;i++)
        	{
        		try
        		{
	        		System.out.println("i="+i);
	        		int a=i/(int)(Math.random()*3);//error 
	        		System.out.println("a="+a);
        		}catch(Exception e) {System.out.println("for�� i++�� �̵�");} 
        	}
        }catch(Exception ex) 
        {
        	System.out.println("���� �߻�");
        }
        System.out.println("���α׷� ���� ����!!");
	}

}
