// ������ ������ ��¥ ��� 
// 6 => 30   7 => 31
/*
 *    31 , 28 , 31  , 30  , 31 , 30
 *    31,  31 , 30  , 31  , 30 , 31
 *    
 *    => 28 , 30 , 31
 */
import java.util.*;
public class �������ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int month=0;
        
        // ������� �Է°��� �޴´� 
        Scanner scan=new Scanner(System.in);
        /*
         *   ���� ==> nextInt()
         *   ���ڿ� ==> next(),nextLine()
         *   �Ǽ� ==> nextDouble()
         *   �� ==> nextBoolean()
         */
        System.out.print("���ϴ� ���� �Է�(1~12):");
        // �޸𸮿� ���� ==> ����
        month=scan.nextInt();
        
        // ����  ==> ������ , ��� ==> �޼ҵ�
        /*
        if(month==1)
        	System.out.println("1���� 31�ϱ��� �ֽ��ϴ�");
        else if(month==2)
        	System.out.println("2���� 28�ϱ��� �ֽ��ϴ�");
        else if(month==3)
        	System.out.println("3���� 31�ϱ��� �ֽ��ϴ�");
        else if(month==4)
        	System.out.println("4���� 30�ϱ��� �ֽ��ϴ�");
        else if(month==5)
        	System.out.println("5���� 31�ϱ��� �ֽ��ϴ�");
        else if(month==6)
        	System.out.println("6���� 30�ϱ��� �ֽ��ϴ�");
        else if(month==7)
        	System.out.println("7���� 31�ϱ��� �ֽ��ϴ�");
        else if(month==8)
        	System.out.println("8���� 31�ϱ��� �ֽ��ϴ�");
        else if(month==9)
        	System.out.println("9���� 30�ϱ��� �ֽ��ϴ�");
        else if(month==10)
        	System.out.println("10���� 31�ϱ��� �ֽ��ϴ�");
        else if(month==11)
        	System.out.println("11���� 30�ϱ��� �ֽ��ϴ�");
        else if(month==12)
        	System.out.println("12���� 31�ϱ��� �ֽ��ϴ�");
        	
           ==> ����ȭ , ������ 
                      ===== ��������
                      ==> �ҽ��ڵ� ���� 
        */
        /*
        if(month==1 || month==3 || month==5 
        		|| month==7 || month==8 || month==10
        		|| month==12)
        {
        	 System.out.println(month+"���� 31�ϱ��� �ֽ��ϴ�");
        }
        else if(month==4 || month==6 || month==9 || month==11)
        {
        	System.out.println(month+"���� 30�ϱ��� �ֽ��ϴ�");
        }
        else if(month==2)
        {
        	System.out.println(month+"���� 28�ϱ��� �ֽ��ϴ�");
        }
        */
        if(month==4 || month==6 || month==9 || month==11)
        {
        	System.out.println(month+"���� 30�ϱ��� �ֽ��ϴ�");
        }
        else if(month==2)
        {
        	System.out.println(month+"���� 28�ϱ��� �ֽ��ϴ�");
        }
        else
        {
        	System.out.println(month+"���� 31�ϱ��� �ֽ��ϴ�");
        }
	}

}




