// 사용자가 알파벳을 입력하면  B ==> AB
//  D => ABCD
//  char ===> scan.next().charAt(0) 
/*
 *    "ABCDE"  ==> scan.next()
 *     =====
 *     01234
 *     'A' => charAt(0)
 *     'B' => charAt(1) 
 *     
 *     111121111311111111141111111115
 *     112111311114111115
 *     일정 패턴 ==> 반복문 사용이 가능 
 *     ======= 수열 
 */
import java.util.*;
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char user=' ';
        // while ==> 조건이 false될때까지 변경하는 변수 : 루프변수
        char c='A';
        // 변수 설정하는 방법 
        Scanner scan=new Scanner(System.in);
        System.out.print("알파벳 입력(대문자):");
        user=scan.next().charAt(0);
        
        while(c<=user)
        {
        	System.out.print(c);
        	c++;
        }
        
	}

}




