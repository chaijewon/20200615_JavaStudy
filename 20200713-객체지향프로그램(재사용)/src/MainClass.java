/*
 *    ���� => ������ ������� Ŭ������ ��� (�ݺ� �ڵ��� ����)
 *      1) ��� (is-a) 
 *          �̹� ������� ����� �����ؼ� ��� 
 *          public class MyWindow extends JFrame
 *                                =======
 *                                Ȯ��� Ŭ���� 
 *      2) ���� (has-a)
 *          �̹� ������� ����� ������� �״�� ��� 
 *          public class MyWindow 
 *          {
 *              JFrame f=new JFrame();
 *          }
 */
/*
 *      AŬ������ ������ �ִ� ��� ���� ��� => ���� (private , static ,������)
 *      public class A
 *      {
 *         private String name;
 *         int age;
 *         public void display();
 *      }
 *      
 *      public class B extends A
 *      {
 *         
 *         int age;
 *         public void display();
 *      }
 *      
 *      *** �ڹ� ����� ���� ��� 
 *      
 */
import javax.swing.*;
public class MainClass{
	/*
	 * public MainClass()// �����ڴ� �������̸� public�޼ҵ�� ����� {
	 * 
	 * }
	 */
	public MainClass() {
		// ��� 
		//super.setSize(300, 300);
		//this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass();
	}

}





