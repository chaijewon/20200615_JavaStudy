// ����ڰ� ���ĺ��� �Է��ϸ�  B ==> AB
//  D => ABCD
//  char ===> scan.next().charAt(0) 
/*
 *    "ABCDE"  ==> scan.next()
 *     =====
 *     01234
 *     'A' => charAt(0)
 *     'B' => charAt(1) 
 *     
 *     111121111311111111141111111115
 *     112111311114111115
 *     ���� ���� ==> �ݺ��� ����� ���� 
 *     ======= ���� 
 */
import java.util.*;
public class �ݺ���_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char user=' ';
        // while ==> ������ false�ɶ����� �����ϴ� ���� : ��������
        char c='A';
        // ���� �����ϴ� ��� 
        Scanner scan=new Scanner(System.in);
        System.out.print("���ĺ� �Է�(�빮��):");
        user=scan.next().charAt(0);
        
        while(c<=user)
        {
        	System.out.print(c);
        	c++;
        }
        
	}

}




