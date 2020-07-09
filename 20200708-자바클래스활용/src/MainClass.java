import java.util.*;

// 성적 계산 
// 학생 정보 데이터형을 제작 => 사용자 정의 데이터형 
class Student{
	String name;//null => 모든 클래스 (주소) 주소가 없는 경우 (null)
	int kor; // 0
	int eng;
	int math;
	int total;
	double avg; // 0.0
	int rank;
	static int aaa;
}
public class MainClass {

	static void process()
	{
		Student s=null;
		//int a=10;
		int a=0;
		for(int i=0;i<10;i++)
		{
			
			//s=new Student();
			System.out.println(s);
		}
		//Student[] std=new Student[3]; // 3명 
		// int[] arr=new int[3] ==> {0,0,0}
		// 클래스 ==> null
		// 입력 => 초기값
		/*Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
			// 메모리 할당 
			std[i]=new Student();
			System.out.println(std[i]);
			System.out.print("이름 입력:");
			std[i].name=scan.next();
			
			System.out.print("국어 점수 입력:");
			std[i].kor=scan.nextInt();
			
			System.out.print("영어 점수 입력:");
			std[i].eng=scan.nextInt();
			
			System.out.print("수학 점수 입력:");
			std[i].math=scan.nextInt();
			
			
			std[i].total=std[i].kor+std[i].eng+std[i].math;
			std[i].avg=std[i].total/3.0;
		}
		
		// 출력 
		for(Student s:std)
		{
			System.out.println(s.name+" "
		      +s.kor+" "+s.eng+" "+s.math+" "
		      +s.total+" "+s.avg);
			
		}*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student.aaa=100;
        Student s=new Student();
	}

}



