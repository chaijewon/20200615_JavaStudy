/*
 *    ����ڰ� ==> �⵵�� �Է� ==> ���⿩�� Ȯ�� 
 *    = 4�⸶�� => 2�� (29)  year%4==0
 *    = 100�⸶�� ����             year%100!=0
 *    = 400�⸶��                   year%400==0
 *    ===================
 */
import java.util.*;
public class �ڹټ������ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int year=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("�⵵ �Է�:");
        //�Է��� ���� �޴´� ==> year�� ���� 
        year=scan.nextInt();
        
        // ���� ���θ� Ȯ�� ==> ���� (�ϱ�)
        // ���� , �Ⱓ ���� ==> &&
        // ���� , �Ⱓ ������ �ȵ� ��� ==> ||
        // ���� => &&
        if((year%4==0 && year%100!=0)||(year%400==0)) // �����̶�� 
        {
        	System.out.println(year+"��(��) �����Դϴ�");
        }
        else //������ �ƴ϶�� 
        {
        	System.out.println(year+"��(��) ������ �ƴϴ�");
        }
        
	}

}




