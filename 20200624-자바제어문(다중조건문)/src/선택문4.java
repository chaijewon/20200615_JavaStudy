/*
 *    case ����  => case 1:
 *    case ����  => case 'A':
 *    case ���ڿ� => case "+": case "LOGIN" "CHAT"...
 */
import java.util.*;
public class ���ù�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=0,b=0;
        int result=0;
        
        Scanner scan=new Scanner(System.in);
        System.out.print("���� 2�� �Է�(3 5):");
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.print("������ �Է�(+,-,*,/):");
        //String op=;
        switch(scan.next())
        {
        case "+":
        	System.out.printf("%d+%d=%d\n",a,b,a+b);
        	break;
        case "-":
        	System.out.printf("%d-%d=%d\n",a,b,a-b);
        	break;
        case "*":
        	System.out.printf("%d*%d=%d\n",a,b,a*b);
        	break;
        case "/":
        	if(b==0)
        	{
        		System.out.println("0���� ���� �� �����ϴ�!!");
        	}
        	else
        	{
        	  System.out.printf("%d/%d=%d\n",a,b,a/b);
        	}
        	break;
        default:
        	System.out.println("�߸��� ������ �Դϴ�!!");
        }
	}

}



