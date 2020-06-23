/*
 *    변수 선언 
 *    ==> 연산처리
 *    ==> 처리 결과 출력 
 */
import java.util.*;
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언 => 메모리 기억공간 
		int a=0,b=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("두개의 정수:");
        
        // 사용자가 입력한 값을 변수에 대입
        a=scan.nextInt();
        b=scan.nextInt();
        
        // 출력 
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        
	}

}






