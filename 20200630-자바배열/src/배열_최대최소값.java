/*
 *   임의의 정수 => 5개를 저장한후에 
 *   최대값,최소값 구하는 프로그램 
 */
public class 배열_최대최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 정수 5개를 저장하는 공간을 만든다 ==> 배열 
		int[] arr=new int[5]; // 0 0 0 0 0
		// 5개의 값을 변경 
		
		for(int i=0;i<5;i++)
		{
			// 시작 = 0  ....  <
			arr[i]=(int)(Math.random()*100)+1;
			// (int)(Math.random()*10) ==> 0.0~9. ==> 0~9
			//       2           1          3
			//       0.0~99.0 ==> 정수변환 => 0~99 ==> 1~100
			//       0.0~0.99*51  ==> 0~49 +1 1~50
		}
		
		// 출력 
		// int i==> index가 아니라 => 실제 저장된 값을 대입
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n===== 결과 =====");
		// 최소값 저장 공간
		int min=100;// 가장 큰값으로 초기화
		/*
		 *    20 30 50 60 80   
		 */
		// 최대값을 저장 공간 
		int max=1; // 가장 작은 값으로 초기값
		
	    //최소값
		for(int i=0;i<5;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("최소값:"+min);
		System.out.println("최대값:"+max);
		
	}

}




