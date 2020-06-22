/*
 *    두개의 정수를 받아서 
 *    최대값,최소값 
 *    
 *    int a,b
 *    int max,min
 */
import java.util.*;
public class 자바조건문문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
		/*
		 * System.out.print("두개의 정수 입력:(100 80)"); int a=scan.nextInt(); int
		 * b=scan.nextInt(); //System.out.println("Max="+Math.max(a, b));
		 * //System.out.println("Min="+Math.min(a, b)); int max,min; if(a>b) { max=a;
		 * min=b; } else { max=b; min=a; }
		 * 
		 * System.out.println("max="+max); System.out.println("min="+min);
		 */
        
        // 정수를 입력을 받아서 절대값을 출력하는 프로그램 
        // 1, -1 ==> 1
        System.out.print("정수 입력:");
        int a=scan.nextInt();
        System.out.println("절대값:"+Math.abs(a));
        if(a<0)
        {
        	System.out.println(-1*a);
        }
        else
        {
        	System.out.println(a);
        }
        
        
	}

}
