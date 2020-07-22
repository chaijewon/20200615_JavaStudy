package com.sist.lang;
/*
 *     java.lang 
 *     =========
 *       = Object 
 *         1) �ֻ��� Ŭ���� => ��� ���������� ���� 
 *            class A
 *            Object obj=new A();
 *            Object obj=10.5;
 *            Object[] obj={new A(),10.5,100,'A',"Hello"}
 *            double[] d={10.5,'A',100,10.5F}
 *         2) ��� Ŭ����(����� ����) => ����� ������ 
 *            =================== Object�� ������ �ִ� ��� ����� ��� �� �� �ִ�
 *         3) �ֿ� ���(�޼ҵ�) 
 *            clone() => prototype : ���� (�޸� ����)
 *            
 *            
 *       = String
 *       = StringBuffer
 *       = System
 *       = Math
 *       = Wrapper : ��� ���������� ����ϱ� ���� Ŭ������ ���� 
 *         =========
 *          Double => double
 *          Byte   => byte
 *          Integer => int
 *          Boolean => boolean 
 *          =================== �ڽ� / ��ڽ�
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
 *            this.a=100;// �ڽ��� Ŭ���� 
 *            super.a=200;// ����� ���� Ŭ����
 *         }
 *    }
 *    
 *    
 *    ��� 
 *      extends ====> class
 *      ======= ����
 *      implements => interface (Ŭ������ ����)
 *      ========== ���� 
 *      
 *      => Ŭ���� 
 *         1) new => ó������ ���� 
 *         2) ���� (X) ==> Ŭ����=>�Ű������� ����
 *            �޼ҵ带 ���ؼ� ���� 
 *         3) ���� => ����� �ͺ��� ���� 
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
        
        // ��Ī , ���� �޸𸮸� ���� 
        A c=new A();
        c.aa=100;
        A d=c;// ������ ���� ��Ҹ� ������ �ִ� 
        System.out.println(d.aa);
        d.aa=1000;
        System.out.println(c.aa);
        
        A e=a.clone();
        System.out.println(e.aa);//1000
        
	}

}





