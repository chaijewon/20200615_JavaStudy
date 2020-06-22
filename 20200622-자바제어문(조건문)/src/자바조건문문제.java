/*
 *    1. 정수를 입력받아서 
 *       짝수인지 홀수인지 확인  => 10은 짝수다,11은 홀수다 
 *                           ========= ========= if~else
 *    2. 정수 3개를 입력을 받아서 
 *       총점,평균
 *       학점 => 조건문 
 *         60이상 => D
 *         70    => C
 *         80    => B
 *         90    => A
 *         나머지는 F
 *         
 *         국어점수 : 80
 *         영어점수 : 80
 *         수학점수 : 80
 *         
 *         총점 : 240
 *         평균 : 80.0
 *         학점 : B
 */
import java.util.*;
public class 자바조건문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        // 키보드로 입력된 정수 받기
        int a=scan.nextInt();
        
        // 짝수 / 홀수 
        if(a%2==0) // true면 수행
        	System.out.println(a+"는(은) 짝수입니다");
        else // false일때 수행
        	System.out.println(a+"는(은) 홀수입니다");
	}

}




