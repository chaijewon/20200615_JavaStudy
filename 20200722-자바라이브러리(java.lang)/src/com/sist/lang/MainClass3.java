package com.sist.lang;
class B
{
	int x,y;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Call By Value => ���� ����  ==> �Ű����� ���۹� (�޸� �ٸ� �޸�)
		int x=10;
		int y=20;
		
		int i=x;
		int j=y;
		
		int temp=i;
		i=j;
		j=temp;
		
		System.out.println("i="+i+",j="+j);
		System.out.println("x="+x+",y="+y);
		// Call By Reference => �ּ� ���� 
		
		B b=new B();
		b.x=10;
		b.y=20;
		B c=b;// ����  => swap(B c) ==> swap(b) => ������
		c.x=100;
		c.y=200;
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println(b.x);// 100
		System.out.println(b.y);// 200
		/*
		 *   �Ű����� => class,�迭 ==> ���� (�ּ�)
		 *   �Ű����� => �⺻�� ������ ,String ==> ���纻 
		 *   
		 *   ==>
		 *    �޸�(Ŭ����) => ���� ��� (����)
		 *    �޸�(Ŭ����) => �̹� ������� Ŭ������ ��� => ���� => clone()
		 *    �޸�(Ŭ����) => ���ο� ����(ó������ ���) => new
		 */
	}

}





