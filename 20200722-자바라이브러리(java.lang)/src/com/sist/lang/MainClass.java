package com.sist.lang;
/*
 *     java.lang 
 *     =========
 *       = Object 
 *         1) 최상위 클래스 => 모든 데이터형을 포함 
 *            class A
 *            Object obj=new A();
 *            Object obj=10.5;
 *            Object[] obj={new A(),10.5,100,'A',"Hello"}
 *            double[] d={10.5,'A',100,10.5F}
 *         2) 모든 클래스(사용자 정의) => 상속을 내린다 
 *            =================== Object가 가지고 있는 모든 기능을 사용 할 수 있다
 *         3) 주요 기능(메소드) 
 *            clone() => prototype : 복제 (메모리 복제)
 *            
 *            
 *       = String
 *       = StringBuffer
 *       = System
 *       = Math
 *       = Wrapper : 모든 데이터형을 사용하기 쉽게 클래스로 변경 
 *         =========
 *          Double => double
 *          Byte   => byte
 *          Integer => int
 *          Boolean => boolean 
 *          =================== 박싱 / 언박싱
 *          Integer i=10
 *          Integer i=new Integer(100);
 *          int k=i;
 */
/*
 *    class A
 *    {
 *        int a=10;
 *    }
 *    class B extends A
 *    {
 *         // int a;
 *         public B()
 *         {
 *            this.a=100;// 자신의 클래스 
 *            super.a=200;// 상속을 내린 클래스
 *         }
 *    }
 *    
 *    
 *    상속 
 *      extends ====> class
 *      ======= 단일
 *      implements => interface (클래스의 일종)
 *      ========== 다중 
 *      
 *      => 클래스 
 *         1) new => 처음부터 시작 
 *         2) 참조 (X) ==> 클래스=>매개변수로 전송
 *            메소드를 통해서 전송 
 *         3) 복제 => 변경된 것부터 시작 
 *         
 *         
 *         class A
 *         {
 *            int aa=10;
 *         }
 *         
 *         A aaa=new A();
 *         ==> display(aaa); ==> aaa.aa=1000 : Call By Reference
 *                           ==> Call By Value
 *         public void display(A a)
 *         {
 *            a.aa=1000;
 *         }
 */
class A implements Cloneable
{
	int aa=10;
	public A clone()
	{
		A a=new A();
		try
		{
			a=(A)super.clone();
			/*
			 *    Object (double) 
			 *    A (int)
			 *    
			 *    double d=10;
			 *    int a=(int)10.5
			 *    A a=(A)new Object()
			 */
		}catch(Exception e) {}
		return a;
	}
}
public class MainClass {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A(); // a.aa
        a.aa=100;
        A b=new A(); // b.aa
        System.out.println(b.aa);
        
        // 별칭 , 같은 메모리를 참조 
        A c=new A();
        c.aa=100;
        A d=c;// 동일한 저장 장소를 가지고 있다 
        System.out.println(d.aa);
        d.aa=1000;
        System.out.println(c.aa);
        
        A e=a.clone();
        System.out.println(e.aa);//1000
        
	}

}





