/*
 *   �޼ҵ� : �Ѱ��� ��ɸ� ���� => ������ �ٽ� ����� �� �ְ� �����
 *          ���� 
 *           => ���� 
 *           => �ݺ� ���� 
 *   ����)
 *         ��ȯ���� ���� ��� : void
 *         �Ű������� ���� ��� (�Ű����� => �ַ� ����ڰ� ��û�� ��) 
 *         ��ȯ���� ���� => ����ڰ� ��û�� ������ ����� => �ݵ�� �Ѱ��� ����
 *                      �������� ��� : �迭,Ŭ����
 *         �Ű������� ���� => ���̵� �ߺ�üũ (=> id),�����ȣ �˻�(��,��)
 *                        �α��� (id,password)
 *         ��ȯ��(������)  �޼ҵ��(�Ű�����,�Ű�����..)
 *         {
 *             ���� => return => 
 *         }
 *         
 *         void process()
 *         {
 *             if(key==ENTER)
 *             {
 *                return;// ������ ���� 
 *             }
 *             ����
 *             System.out.println("aaaa");
 *             return; => return ���� �ؿ��� �ҽ� �ڵ��� �� �� ���� 
 *             ���� 
 *             = break
 *             = continue
 *             = return
 *         }
 *         
 *         int add(int a,int b)
 *         {
 *             return a+b;
 *         }
 *         
 *         ȣ�� 
 *         int a =  add(10,20)
 *         
 *         void add(int a,int b)
 *         
 *         add(10,20)
 *         
 *         ȣ��ø��� => �޼ҵ� ó������ => return���� ���� => �ٽ� ȣ���� ��ġ ���ƿ´�
 */
// ����ڰ� �⵵�� �Է��ϸ� ���⿩�� 
// ������ �ٽ� ����� �� �ֳ�? => ������ ����, �߰��� ���� (modify , new) 
/*
 *    ����Ʈ 
 *    =====
 *      = �α���
 *      = ȸ������ 
 *      = �Խ���
 *      = ��������
 */
import java.util.*;//Scanner
public class �ڹٸ޼ҵ� {
    // ����� �Է� => �⵵ 
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
        System.out.print("�⵵�� �Է�:");
        int year=scan.nextInt();
		return year;
	}
	// ���⿩�θ� Ȯ���ϴ� ��� ==> ����
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0)||(year%400==0))
        {
        	bCheck=true;
        }
        else
        {
        	bCheck=false;
        }
		return bCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan=new Scanner(System.in); System.out.print("�⵵�� �Է�:"); int
		 * year=scan.nextInt();
		 * 
		 * if((year%4==0 && year%100!=0)||(year%400==0)) {
		 * System.out.println(year+"�⵵�� �����Դϴ�"); } else {
		 * System.out.println(year+"�⵵�� ������ �ƴմϴ�"); }
		 */
		int year=userInput();
		boolean bCheck=isYear(year);
		if(bCheck==true)
			System.out.println("�����Դϴ�");
		else
			System.out.println("�����̾ƴմϴ�");
        
	}
}




