import java.util.Scanner;// Scanner ==> ������ ������� �ڹ������� �о� �´� 
/*
 *    class Scanner{
 *    }
 *    
 *    �����Է�:
 *      100
 */
public class �ڹ�����¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �Է°� �ޱ� 
		/*
		 *    System.out.println("���� �Է�:");
		 *    System.out.print("���� �Է�:\n");
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("�Ǽ� �Է�:"); // \n , \t
		double a=scan.nextDouble();
		// double a=100  a=100.0
		// char a=97  ==> a='a'
		
		
		System.out.println("a="+a);
	}

}





