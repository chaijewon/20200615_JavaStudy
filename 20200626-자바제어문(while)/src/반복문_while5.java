/*
 *   주의점 
 *   1) while은 조건이 없는 경우 error  => for(;;)
 *      while() => 조건식이 없다 
 *      {
 *      }  =====> 오류발생
 *   2) while에서 무한루프 
 *      => for(;;) => while(true):가장 많이 등장 
 *      
 *      for(int i=0;i<10;i++) 
 *      
 *      int i=0;
 *      while(i<10)
 *      {
 *         i++;
 *      }
 *      
 *      int i=5;
 *      while(--i!=0) ==> i>=0
 *      {
 *         System.out.println(i);  ==> 
 *         i--;
 *      }
 *      
 */
// 5  ~ 1~5 
import java.util.*;
public class 반복문_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int user=0;// 사용자 요청한 변수 
        int i=1; // 사용자 요청한 변수까지 증가 (루프변수)
        int sum=0; // 누적(합)
        
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력:");
        user=scan.nextInt();
        // user = 5
        while(i<=user)
        {
        	sum+=i;
        	i++;
        }
        // i=11
        System.out.println("i="+i);
        System.out.println("sum="+sum);
        
        i=1;// 초기값 ==> 1~5
        System.out.println("i="+i);
        /*
         *   i=1  i<=5  i++
         *   i=2  i<=5  i++
         *   i=3  i<=5  i++
         *   i=4  i<=5  i++
         *   i=5  i<=5  i++
         *   i=6  i<=5  ==> 종료
         */
        while(i<=10)
        {
        	System.out.print(i);
        	i+=5;
        }
        // i=11
        System.out.println();
        i=5;
        while(i>=1)
        {
        	System.out.print(i);
        	i--;// i+=2 i-=2
        }
        // i=0
        //int j=1;
        for(int j=1;j<=10;j++)
        {
        	
        }// j 는 메모리에서 사라진다 
        //System.out.println(j);
        
        
	}

}




