// �Է� 
import java.util.*;//ScannerŬ������ ������ �´� 
public class �ڹ����ǹ�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // scan ==> �������� ���� �� �ִ� 
        System.out.print("�������� �������� �������� �Է�:");
        // Ű����� �Էµ� ������ �ޱ� 
        int kor=scan.nextInt();
        int eng=scan.nextInt();
        int math=scan.nextInt();
        int total=kor+eng+math;
        double avg=total/3.0;
        char score='A';
        // avg=85  => D 
        if(avg>=90)
        {
        	score='A';
        }
        
        // ���� 
        else if(avg>=80)
        {
        	score='B';
        }
        
        // ���� 
        else if(avg>=70)
        {
        	score='C';
        }
        
        // ���� 
        else if(avg>=60)
        {
        	score='D';
        }
        else
        {
        	score='F';
        }
        
        System.out.println("����:"+total);
        System.out.printf("���:%.2f%n",avg);//
        // %n => printf  \n
        System.out.println("����:"+score);
	}

}
