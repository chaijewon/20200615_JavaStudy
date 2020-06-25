/*
 *   for => 횟수가 지정된 반복문 
 *   => UPDWON 게임 
 *   => 컴퓨터가 1~100사이의 난수 발생 
 *   => 사용자가 난수 맞추는 게임 
 *      힌트 => 높다,낮다 
 *      => 난수 : 70
 *      => 사용자 : 60  
 *      => 사용자 : 75
 */
import java.util.*;// 사용자 입력 
/*
 *     1. 컴퓨터가 난수 발생 (1~100)
 *             Math.random()
 *              0.0~0.99 * 100  ==> 0.0~99.0 + 1 
 *                                  (int)1.0~100.0
 *     =================
 *     2. 사용자 입력 
 *     3. 입력하면 => 힌트 
 *     4. 종료여부 
 *     =================
 */
public class 반복문_for7 {
   public static void main(String[] args) {
	   int com=(int)(Math.random()*100)+1; // 1~100사이 난수
       // 난수 => 임의 수를 추출 
	   Scanner scan=new Scanner(System.in);
	   int count=0;
	   for(;;)// 무한루프 => while(true)
	   {
		   // 사용자 입력값을 받는다 
		   System.out.print("1~100사이의 정수 입력:");
		   int user=scan.nextInt();
		   if(user<1 || user>100)
		   {
			   System.out.println("잘못된 입력입니다!!");
			   continue;// 처음으로 다시 돌아간다 
			   // for ==> 증가식으로 이동 
		   }
		   
		   // 정상적으로 입력이 된 상태
		   count++;
		   // 비교
		   if(com>user)
		   {
			   System.out.println("입력된 값보다 높은 수를 입력하세요");
		   }
		   else if(com<user)
		   {
			   System.out.println("입력된 값보다 낮은 수를 입력하세요");
		   }
		   else
		   {
			   System.out.println("Game Over!!");
			   System.out.println("입력횟수:"+count);
			   // 종료 
			   break;// for종료 
		   }
		   
	   }
	   System.out.println("프로그램 종료");
   }
}





