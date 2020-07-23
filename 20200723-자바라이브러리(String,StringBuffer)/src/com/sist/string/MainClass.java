package com.sist.string;
/*
 *    java.lang
 *    =========
 *      String / StringBuffer
 *      =======
 *       1) ���ڿ��� �ּҴ�  "Hello" , "Java"...
 *       2) char[] => �����ϴ� Ŭ���� 
 *       ==================================== 
 *       3) �ֿ� ���(�޼ҵ�)
 *       =================
 *        1. length() : ������ ���� 
 *        2. trim()   : �¿��� �������� 
 *        3. substring() : ���ں��� 
 *        4. indexOf() , lastIndexOf() => ������ ��ġ 
 *        5. equals() : ����� ���ڸ� �� 
 *        6. ã�� ==> 
 *            ���� : contains   ===> LIKE
 *            ���� : startsWith
 *            ��    : endsWith
 *        ====================== �ν��Ͻ� �޼ҵ�
 *        7. static �޼ҵ� : valueOf() => ��� �⺻���� ���ڿ��� ��ȯ 
 *        
 *        
 *        String s1="Hello"
 *          s1.length()
 *        String s2="Hello Java"
 *          s2.length()
 *          
 *        String.valueOf()
 *                       
 */
public class MainClass {
   /*
    *   String s="0123456789"
    *     s.substring(3,7) end-1
    *     
    *     // &nbsp; ==> entity
    *     
    *     ENTITY nbsp  ' '
    *     => &nbsp;
    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="background-image: url(' https://mp-seoul-image-production-s3.mangoplate.com/0776fea76b4a824ff583128cb51dd45c.jpg ');";
        String temp=s.substring(s.indexOf("'")+1,s.lastIndexOf("'"));
        System.out.println(temp.trim());
        
        String ss="���� ���عٴٸ� ���鼭 ���� �����ʹ�Ƽ. ���ĸԴ� �� ���� �䰡 �ÿ����� ������ �ƽ����� �� ���� �� ���ĸ� �����⿡ ������ �ʴ�. ������ġ��";
        if(ss.length()>20)
        {
        	String sss=ss.substring(0,20)+"...";
        	System.out.println(sss);
        }
        
        String s1="Hello";
        String s2="Hello";
        String s3=new String("hello");
		/*
		 * if(s1==s3) { System.out.println("s1==s3"); } else {
		 * System.out.println("s1!=s3"); }
		 * 
		 *  equalsIgnoreCase : ��ҹ��� ������ ���� => �˻�
		 *  equals : ��ҹ��� ���� : �α��� ,���̵��ߺ� 
		 */
        if(s1.equalsIgnoreCase(s3))
        {
        	System.out.println("s1==s3");
        }
        else
        {
        	System.out.println("s1!=s3");
        }
        
        
        
	}

}




