/*
 *    1~100까지 합 
 */
// => 1~100까지의 ==> 짝수의 합,홀수의 합 
public class 반복문_for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 변수 => 1~100까지 더한 값 => 누적 
		int sum=0;// 누적 변수 
		// i ==> 루프 변수 
		for(int i=1;i<=100;i++)
		{
			sum+=i;// sum=sum+i
			/*
			 *    sum=sum+i (sum=0,i=1) ==> sum=1
			 *    sum=sum+i (sum=1,i=2) ==> sum=3
			 *    sum=sum+i (sum=3,i=3) ==> sum=6
			 *    --
			 *    --
			 *    --
			 *    --
			 *    sum=sum+i (sum=4950,i=100) ==> sum=5050
			 */
			System.out.printf("1부터 %d까지의 합:%d\n",i,sum);
		}
	}

}




