import javax.swing.*;
/*
 *   class JFrame{
 *   }
 *   
 *   void aaa()
 *   int aaa(int a)
 *   double aaa()
 *   char aaa(char c)
 *   
 *   ������ ==> �Ű������� ���� ��� ==> �ʱⰪ�� �׻� �����ϰ� ���� ���
 *            �Ű������� ����        ==> �ʱⰪ�� �����ؼ� ��� 
 *            
 *   void aaa(double d,double d1,double d2)
 *   void aaa(char d,double d1,int d2)
 *   void aaa(int d,float d1,double d2)
 *   void aaa(float d,double d1,double d2)
 *   
 *   aaa(4.5,'A',100)  double , char int
 *   
 *   void aaa(double d) double d=10
 *   
 *   aaa(10)
 *   
 *   int a='A'   ==> a=65
 */
public class MainClass3 {
	String name;
    static void aaa(int d) {
    	System.out.println(d);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        aaa(10);
        aaa('A');
        //aaa(10.5F);
        //aaa(true);
	}

}
