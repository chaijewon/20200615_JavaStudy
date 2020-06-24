/*
 *    다중 조건문 => 조건이 많은 경우에 사용 
 *    ======== 조건이 맞는 문장만 실행(1번만 수행)
 *    int a=15;
 *    ========================================
 *    if(a%3==0)
 *      System.out.println("3의 배수"); ==> 종료
 *    else if(a%5==0)
 *      System.out.println("5의 배수");
 *    else if(a%7==0)
 *      System.out.println("7의 배수");
 *    ========================================
 *    
 *    if => 독립적 
 *    ========================================
 *    if(a%3==0)
 *      System.out.println("3의 배수"); ==> 종료
 *    ========================================
 *    if(a%5==0)
 *      System.out.println("5의 배수"); ==> 종료 
 *    ========================================
 *    if(a%7==0)
 *      System.out.println("7의 배수");
 *    ========================================
 *    
 *    형식)
 *         if(조건식)
 *         {
 *            조건이 true면 수행하는 문장 
 *            수행후에 종료 
 *         }
 *         else if(조건식)
 *         {
 *            조건이 true면 수행하는 문장 
 *            수행후에 종료 
 *         }
 *         else if(조건식)
 *         {
 *            조건이 true면 수행하는 문장 
 *            수행후에 종료 
 *         }
 *         else if(조건식)
 *         {
 *            조건이 true면 수행하는 문장 
 *            수행후에 종료 
 *         }
 *         ====================
 *         else
 *         {
 *             해당 조건이 없는 경우에 수행하는 문장 
 *         }
 *         ==================== 생략
 */
// 성적 계산 ==> 
/*
 *    3개의 점수를 받아서 
 *    총점 , 평균 , 학점  ===> 등수
 */
import java.util.*;
public class 다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 => 저장공간을 설정 
        int kor=0,eng=0,math=0;
        int total=0;
        double avg=0.0;
        char hakjum='A';
        
        //입력을 받는다 => 변수에 저장 
        Scanner scan=new Scanner(System.in);
        System.out.print("국어 점수 입력:");
        kor=scan.nextInt(); // 키보드로 입력한 정수를 읽어온다 
        System.out.print("영어 점수 입력:");
        eng=scan.nextInt();
        System.out.print("수학 점수 입력:");
        math=scan.nextInt();
        
        // 1. 총점 
        total=kor+eng+math;
        // 2. 평균 
        avg=total/3.0; // 소수점
        // 3. 학점 
        
        if(avg>=90)
        	hakjum='A';
        else if(avg>=80)
        	hakjum='B';
        else if(avg>=70)
        	hakjum='C';
        else if(avg>=60)
        	hakjum='D';
        else // 50,40,30,20,10
        	hakjum='F';
        
        // 4. 처리가 완료 ==> 화면에 출력 
        System.out.println("======= 성적 =======");
        System.out.println("국어 점수:"+kor);
        System.out.println("영어 점수:"+eng);
        System.out.println("수학 점수:"+math);
        System.out.println("총점:"+total);
        System.out.printf("평균:%.2f\n",avg);
        System.out.println("학점:"+hakjum);
        /*
         *   1. 데이터 저장 
         *      =========
         *       1) 사용자가 요청 ===> 주로 사용
         *       2) File읽기
         *       3) 오라클 연결 
         *       4) 웹에 있는 데이터 읽기
         *       
         *   2. 사용자 요청한 내용으로 ==> 데이터 가공 
         *   
         *   3. 사용자에게 가공된 데이터를 출력 
         */
        
	}

}




