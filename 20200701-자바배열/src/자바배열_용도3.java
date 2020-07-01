// 사용자가 입력 (정수) ==> 2진법 출력 
// bit => 16bit ==> 32767
// 17의 변수  ==> 01(16)
// 0000 0000 0000 1010  10  ==> 배열 
/*
 *    노래제목,가수명,앨범,포스터,순위
 *    
 *    => 50곡 ==> 250개
 *    
 */
/*
 *   사용법 
 *     제어문 
 *      조건 
 *      반복  = for (횟수가 지정 => 자동 종료)
 *          = while ( 종료시점을 반드시 입력) ==> break;
 *      연산자 => 산술연산자 , 대입
 *      조건문 => 비교,부정,논리  (if,for조건,while조건)
 */
import java.util.*;
public class 자바배열_용도3 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] binary=new int[16];
        // 0,1만 저장 
        // 사용자가 요청한 정수 
        int user=0;
        int index=15;// 뒤에서부터 출력 ==> 배열 제어 
        
        Scanner scan=new Scanner(System.in);
        System.out.print("정수 입력(0~32767):");
        user=scan.nextInt();
        System.out.println("===== Lib이용 =====");
        System.out.println(Integer.toBinaryString(user));
        while(true)// 종료시점 => break
        {
        	binary[index]=user%2;
        	user=user/2; // 1/2 = 0
        	if(user==0)break;
        	index--; 
        }
        
        // 결과 출력 
        for(int i=0;i<16;i++)
        {
        	if(i%4==0 && i!=0) // 0%4=0
        		System.out.print(" ");
        		System.out.print(binary[i]);
        }
        
        //System.out.println();
        
	}

}










