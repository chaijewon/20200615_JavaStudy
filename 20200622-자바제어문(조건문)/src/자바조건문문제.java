/*
 *    1. ������ �Է¹޾Ƽ� 
 *       ¦������ Ȧ������ Ȯ��  => 10�� ¦����,11�� Ȧ���� 
 *                           ========= ========= if~else
 *    2. ���� 3���� �Է��� �޾Ƽ� 
 *       ����,���
 *       ���� => ���ǹ� 
 *         60�̻� => D
 *         70    => C
 *         80    => B
 *         90    => A
 *         �������� F
 *         
 *         �������� : 80
 *         �������� : 80
 *         �������� : 80
 *         
 *         ���� : 240
 *         ��� : 80.0
 *         ���� : B
 */
import java.util.*;
public class �ڹ����ǹ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("���� �Է�:");
        // Ű����� �Էµ� ���� �ޱ�
        int a=scan.nextInt();
        
        // ¦�� / Ȧ�� 
        if(a%2==0) // true�� ����
        	System.out.println(a+"��(��) ¦���Դϴ�");
        else // false�϶� ����
        	System.out.println(a+"��(��) Ȧ���Դϴ�");
	}

}




