/*
 *    ���� ���ǹ� 
 *    if(���ǹ�)
 *    {
 *       ���ǹ��� true�� �����ϴ� ���� ����
 *    }
 *    else
 *    {
 *       ���ǹ��� false�϶� �����ϴ� ���� ���� 
 *    }
 *    
 *    ���ǹ� ==> �ٽ� (���� ����)
 *    
 *    ===> 137page 
 *    ==  ���� 
 *    <
 *    >
 *    !=
 *    ====== ���� ������ �� ��� 
 *    &&
 *    ||
 *    ======
 *    
 *    ch>='A' && ch<='Z'
 *    ch>='0' && ch<='9'
 *    ch>='��' && ch<='�R'  ==> ��ȣ�� �Ϸ������� ...
 *    
 *    1,2,3,4,5,6,7,8,9
 *    1,2,5,7,9
 *    ch==1 || ch==2 || ch==5 || ch==7 || ch==9
 *    
 *    ���ڿ� ==>  !=,== ������� �ʴ´� 
 *    equals()
 *    !equals()
 *    
 */
import java.util.*;
public class ���_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �����Ѱ��� �Է��� �޾Ƽ� => ���ĺ����� ���� Ȯ�� 
		// �������� 
		char ch='A'; // ���� => �ʱ�ȭ 
		/*
		 *   int => 0
		 *   double => 0.0
		 *   long => 0L
		 *   boolean => false
		 */
		// ���� �Ѱ� �Է� 
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		//"ABC" ==> �ڹٴ� ��� ���� ��ȣ 0���� �����Ѵ� 
		ch=scan.next().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch+"��(��) �����Դϴ�");
		}
		else
		{
			System.out.println(ch+"��(��) �����Դϴ�");
		}
		// ch>='0' && ch<='9'
		/*
		 * if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
		 * System.out.println(ch+"��(��) ���ĺ��Դϴ�!!"); } else {
		 * System.out.println(ch+"��(��) ���ĺ��� �ƴմϴ�!!"); }
		 */
	}
}








