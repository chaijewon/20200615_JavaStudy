// 입력 
import java.util.*;//Scanner클래스를 가지고 온다 
public class 자바조건문문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // scan ==> 여러번을 받을 수 있다 
        System.out.print("국어점수 영어점수 수학점수 입력:");
        // 키보드로 입력된 정수를 받기 
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
        
        // 포함 
        else if(avg>=80)
        {
        	score='B';
        }
        
        // 포함 
        else if(avg>=70)
        {
        	score='C';
        }
        
        // 포함 
        else if(avg>=60)
        {
        	score='D';
        }
        else
        {
        	score='F';
        }
        
        System.out.println("총점:"+total);
        System.out.printf("평균:%.2f%n",avg);//
        // %n => printf  \n
        System.out.println("학점:"+score);
	}

}
