import java.util.*;

import javax.swing.JOptionPane;

public class �ڹ���¸޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \n�� newLine => ���ο� �ٿ� ��� 
		// \t�� �� => ���� ���� 
		/*
		 * System.out.printf("%d*%d=%d\t",2,2,4); System.out.printf("%d*%d=%d",3,2,6);
		 */
		
		Scanner scan=new Scanner(System.in);
		/*
		 *  Scanner : �������� 
		 *  scan : ����
		 *  new : �޸𸮿� ���� 
		 *  Scanner(System.in) : �ʱ�ȭ
		 */
		System.out.print("1' ���� �Է�:");
		int a=scan.nextInt();// �Էµ� ������ �о�ͼ� a��� �޸𸮿� ���� 
		//System.out.print("2' ���� �Է�:");
		int b=scan.nextInt();
		// ���
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//JOptionPane.showInputDialog("����");
		// Scanner => ���������� ��� 
	}

}











