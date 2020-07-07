// 국어 영어 수학 => 총점,평균,학점
import java.util.*;
public class 자바메소드2 {
    // 입력 
	static int userInput(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+" 점수 입력:");
		int score=scan.nextInt();
		return score;
	}
	static int total(int kor,int eng,int math)
	{
		return kor+eng+math;
	}
	// 평균
	static void avg(int total)
	{
		System.out.printf("평균:%.2f\n",total/3.0);
	}
	
	// 학점 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor=userInput("국어");
        int eng=userInput("영어");
        int math=userInput("수학");
        int total=total(kor,eng,math);// 변수명,메소드
        
        // 출력
        System.out.println("국어점수:"+kor);
        System.out.println("영어점수:"+eng);
        System.out.println("수학점수:"+math);
        System.out.println("총점:"+total);
        avg(total);
	}

}



