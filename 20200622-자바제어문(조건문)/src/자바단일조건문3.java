// ���ǹ� �����ϴ� ��� 
/*
 *    if(���ǹ�) : ���ǹ��� ������ ����� ==> true/false
 *      ==> �ʿ��� ���(���� : true)���� ������ ����
 *          false�� ��쿡�� �ǳʶڴ� (������ �������� ���Ѵ�) 
 */
public class �ڹٴ������ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=11; System.out.println("1"); System.out.println("2"); // a���� ¦���� ��쿡 ���
		 * if(a%2==0) System.out.println("3");
		 * 
		 * System.out.println("4"); System.out.println("5");
		 */
		
		// ���ĺ��� ���� => �빮�� , �ҹ��� 
		char alpha='ȫ';
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"��(��) �빮���Դϴ�");
		if(alpha>='a' && alpha<='z')
			System.out.println(alpha+"��(��) �ҹ����Դϴ�");
		if(alpha>='0' && alpha<='9')
			System.out.println(alpha+"��(��) �����Դϴ�");
		if(alpha>='��' && alpha<='�R')
			System.out.println(alpha+"��(��) �ѱ��Դϴ�");
		//Ư������ 
		if(alpha=='\t' || alpha=='\n')
			System.out.println("Ư������ �Դϴ�");
		
	}

}





