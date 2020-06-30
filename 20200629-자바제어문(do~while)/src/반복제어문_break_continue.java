// updown 게임 ==> 잘못된 입력 => 성적 계산 
// 게임 => 입력 관련 => continue , 종료 => break;
// 숫자를 맞출때까지 게임을 계속 => while
import java.util.*;
public class 반복제어문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 임의의 숫자를 저장 => 난수(com)
		int com=(int)(Math.random()*100)+1;
		//   1~100사이의 임의 수를 추출
		//            0.0~0.99 ==> 0.0~99.0 => 0~99 +1 => 1~100
		// => i=1 ~~ i=10 ==> i++
		// => break,continue
		// main=> 재사용이 불가능하다 
		// 프로그램은 프로그래머가 명령을 한 순서로 진행 
		// 한줄씩 수행한다 
		// 무한루프 => 횟수가 지정이 없는 경우 
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			// 사용자의 입력값을 받아 본다 
			System.out.print("1~100까지 사이의 정수 입력:");
			int user=scan.nextInt();
			
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력값입니다");
				// 처음부터 다시 수행
				continue;
			}
			
			// 정상 수행 
			// 비교 
			if(user>com)
			{
				System.out.println("입력값보다 낮은 정수를 입력하세요");
			}
			else if(user<com)
			{
				System.out.println("입력값보다 높은 정수를 입력하세요");
			}
			else
			{
				System.out.println("Game Over!!");
				break; // System.exit(0)
				// 반복문 종료 
			}
		}
	}

}






