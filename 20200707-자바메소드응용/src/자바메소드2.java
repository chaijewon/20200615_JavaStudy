// ���� ���� ���� => ����,���,����
import java.util.*;
public class �ڹٸ޼ҵ�2 {
    // �Է� 
	static int userInput(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+" ���� �Է�:");
		int score=scan.nextInt();
		return score;
	}
	static int total(int kor,int eng,int math)
	{
		return kor+eng+math;
	}
	// ���
	static void avg(int total)
	{
		System.out.printf("���:%.2f\n",total/3.0);
	}
	
	// ���� 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor=userInput("����");
        int eng=userInput("����");
        int math=userInput("����");
        int total=total(kor,eng,math);// ������,�޼ҵ�
        
        // ���
        System.out.println("��������:"+kor);
        System.out.println("��������:"+eng);
        System.out.println("��������:"+math);
        System.out.println("����:"+total);
        avg(total);
	}

}



