/*
 *    ����� �����Է� => ¦��,Ȧ�� 
 *    
 *    �޼ҵ� => ����� => ���ϰ�
 *            �޼ҵ� ��ü���� ��� => ���ϰ�(X) void 
 *            
 *    1) => �Է�
 *    2) => �Է� ó��
 *    3) => ��� ��� 
 */
import java.util.*;
public class �ڹٸ޼ҵ�3 {
    static int userInput()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("���� �Է�:");
    	int num=scan.nextInt();
    	
    	return num;
    }
    // ������+���=�޼ҵ�
    /*
     *   Ŭ���� : ����+�޼ҵ�
     *   =====
     */
    static void process(int num)
    {
    	if(num%2==0)
    		System.out.println(num+"��(��) ¦���Դϴ�");
    	else
    		System.out.println(num+"��(��) Ȧ���Դϴ�");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����� �Է°��� �޴´� 
		int num=userInput();
		
		process(num);
		
	}

}



