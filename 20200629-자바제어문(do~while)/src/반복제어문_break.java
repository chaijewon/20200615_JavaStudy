/*
 *    반복제어문 
 *      = break  ==> 반복문을 종료할때 
 *      = continue ==> 특정부분을 제외하고 싶은 경우 
 *      = 조건문과 같이 사용한다 (if)
 *      = * break,continue는 한개의 반복문만 제어 할 수 있다 
 *        * break => 반복문 전체(for,do~while,while),switch
 *        * continue => 반복문에서만 사용이 가능 
 *        * return => 보류 (메소드 종료)
 */
public class 반복제어문_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1~10까지 출력 ==> 5일때 종료 ==> break;
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			// 5일때 
			if(i==5)
				// 종료 
				break; // i==5면 종료 => 반복문 중단 
			
		}
		System.out.println("===== continue =====");
		// 1~10까지 홀수만 출력 
		// 조건문 
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0) // i%2==0(짝수) i%2!=0(홀수)
				       // i%2==1  !(i%2==0)
				System.out.print(i+" ");
		}
		// 증가 => 2
		System.out.println("\n===== 2씩 증가 =====");
		for(int i=1;i<=10;i+=2)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n===== continue =====");
		// continue 사용 
		/*
		 *   break => while,for,do~while이 동일 
		 *   continue => while(조건식으로 이동) ,
		 *               for(증가식으로 이동)
		 *               
		 *   for(int i=1;i<=10;i++)
		 *   {
		 *       if(i==6)
		 *         continue;  ====> i++ 
		 *   }
		 *   
		 *   int i=1;
		 *   while (i<=10)
		 *   {
		 *       if(i==6)
		 *          continue; ==> i<=10
		 *       i++;
		 *   }
		 *   
		 *   while(true)
		 *   {
		 *      ==> 처음부터 다시 수행할 경우 (잘못된 입력)
		 *   }
		 */
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				continue;// 짝수만 제외 ==> i++로 이동 
			// 증가식으로 이동 
			System.out.print(i+" ");
		}
		
		System.out.println("\n==== while ====");
		/*
		 * int i=1; while(i<=10) { if(i%2==0) continue; System.out.println(i+" "); i++;
		 * }
		 */
		
	}

}




