// 3���� ������ �Է¹޾Ƽ� => ���� ��� 
import java.util.*;
public class ���ù�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor=0,eng=0,math=0;
        char score='A';
        //  ====> ���α׷��� �ʿ��� �޸� ���� ���� Ȯ��
        // �Է�
        Scanner scan=new Scanner(System.in);
        System.out.print("���� 3���� �Է��ϼ���(90 90 90)?");
        kor=scan.nextInt();
        eng=scan.nextInt();
        math=scan.nextInt();
        
        // ������� ��� => ���� (������+���)
        // �޼ҵ� ==> �����͸� �����ؼ� ������� �Ѱ��ش�
        switch((kor+eng+math)/30)
        {
        case 10:
        case 9:
        	 score='A';
        	 break;
        case 8:
        	score='B';
        	break;
        case 7:
        	score='C';
        	break;
        case 6:
        	score='D';
        	break;
        //case 5:
        //case 4:
        //case 3:
        //case 2:
        //case 1:
        default:
        	score='F';
        	break;
        }
        
        System.out.println("===== ��� =====");
        System.out.println("���� :"+score);
        
	}

}




