package com.sist.util;
// java.util : ���α׷��ּ� ���� ����ϴ� Ŭ������ ����
// java.util => �ݵ�� import�� ����Ѵ� 
import java.util.*;
/*
 *    Random
 *    ****StringTokenizer
 *    ****Date 
 *    Calendar
 *    ****ArrayList , Vector 
 *    ****HashMap 
 *    ===================
 *     = regex
 *     = reflect
 *    =================== Web
 */
public class MainClass {
    /*
     *   Random() => ����(���Ǽ��� ��ǻ�Ͱ� ����)
     *   ========
     *     => ���� => nextInt() => 0~21�� 4õ (int ����)
     *               nextInt(int n) ==> �����ε� => ������ ������ ������ ���� ���´� 
     *                                            n���� ����
     *               nextInt(100) => 0~99 => 0~100 nextInt(101)
     *               ========================================== static�� �ƴϴ� 
     *               �ν��Ͻ� 
     *               
     *               static => Random.nextInt()
     *               instance => ���� 
     *                           Random r=new Random();
     *                           r.nextInt()
     *                           
     *                static => �����ϰ� ���ÿ� ���� 
     *                instance => �޸� �Ҵ�ÿ� ���� 
     *                            ==========
     *                              new ������()
     *                              
     *                              
     *                String s1="Hello Java";
     *                String s2="Hello Oracle";
     *                
     *                Math.random()
     *                
     *                String.valueOf()
     *               
     */
	public void random() {
		Random r=new Random();
		int a=r.nextInt(101);// int a=(int)(Math.random()*101)
		// 0~100  r.nextInt(100) 0~99  
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MainClass m=new MainClass();// m=>random()
        m.random();
        MainClass m1=new MainClass();// m1=>random()
        m1.random();
        //MainClass.random();
        // ����� ���� �޼ҵ�� �ڵ� ȣ���� ���� 
	}

}




