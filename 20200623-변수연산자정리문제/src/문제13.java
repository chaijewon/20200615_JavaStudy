import java.util.*;
/*
 *   ���� ==> �Ѱ��� �����͸� ���� 
 *           ���� , �Ǽ� , ���� , true/false
 *           ==> �޸� ũ�� ���� 
 *               =========
 *                 �ڹٿ��� �޸� ũ�⸦ ���� ==> �⺻��
 *           ==> ��������(�ڷ���) 
 *               �Ǽ� : double(8byte),float(4byte)
 *                    =========================== f(F)
 *                    default : double
 *               ���� : byte(1byte) , 
 *                    short(2byte) , 
 *                    int(4byte) , ==> default(��� ������ int)
 *                    long(8byte)
 *                    
 *                    20000000000L
 *               ���� : char(2byte) 0~65535 => Unicode
 *               
 *               �� : boolean(1byte) => true/false
 */
public class ����13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k=(int)20000000000L;
		//long l=20000000000L;
		//System.out.println(k);
        /*
        int a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.print("������ ���� �Է�:");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        System.out.println(a*b+c);
        */
		//int a;
		String a;
		Scanner scan=new Scanner(System.in);
		/*
		 * System.out.print("(10~99):89>"); a=scan.next(); // a="77"
		 * if(a.charAt(0)==a.charAt(1)) {
		 * 
		 * } else {
		 * 
		 * }
		 */
		System.out.print("�Է�:");
		a=scan.next();
		System.out.println("a="+a);
		/*
		 * if(a%11==0) { System.out.println("10�ڸ��� 1�ڸ��� ����"); } else {
		 * System.out.println("10�ڸ��� 1�ڸ��� �ٸ���"); }
		 */
		
		
	}

}
