package com.sist.exception;
/*
 *    예외회피 
 *      = 에러에 대한 예측이 가능하게 만든다 
 *        대부분의 프로그램은 => 직접처리 (try~catch)
 *        ==> API(자바,라이브러리)
 *      = 프로그래머가 예외처리를 각자 프로그램에 맞게 처리 유도 
 *      = 형식)
 *         메소드() throws 예측한 예외 클래스 등록 
 *         예) 순서없이 나열이 가능 
 *            public void display() throws Exception,ArrayIndexOutOfBoundsException,NumberFormatException
 *            {
 *            }
 *         ==> 예외처리는 호출하는 메소드에서 처리 
 */

public class MainClass {
    public int div(int a,int b) throws Exception
    {
    	return a/b;// 0으로 나누면 에어가 발생할 수 있다
    }
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        MainClass m=new MainClass();
        int res=0;
		try {
			res = m.div(10, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(res);
        
	}

}





