/*
 *    ���׿����� 
 *      ��������� ( + , - , *  , /  , % )
 *      => �ڹٿ��� �����ϴ� ��� �����ڴ� ����� ��ȯ �� �� �ִ�
 *      => �ڹ����α׷����� ���� ���� ���Ǵ� ������ 
 *      => ������ 
 *          1) ����ȯ ==> ���� ū ������������ ����
 *          2) / 
 *             = 0���� ������ ������ �߻� 
 *             = ����/����=����
 *          3) %
 *             = ������ ������ => ��ȣ�� ������ ��ȣ�� ���´� 
 *               (-5) % (-2) => -1
 *               ==
 *               (5) % (-2)  => 1
 *               
 *          4) ��� �������� �켱������ 
 *             *,/,%�� +,-���� �켱������ ����
 *             => �켱������ �� �𸣸� => ()�� �̿��ؼ� �켱���� ����
 *             (3+4)*7
 *               ===
 *             =
 *      
 */
public class ���׿�����_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=3;
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int m=a/b;
		int n=a%b;
		
		System.out.printf("%d+%d=%d%n",a,b,c);//\n
		System.out.printf("%d-%d=%d%n",a,b,d);
		System.out.printf("%d*%d=%d%n",a,b,e);
		System.out.printf("%d/%d=%d%n",a,b,m);
		System.out.printf("%d%%%d=%d%n",a,b,n);
	}

}







