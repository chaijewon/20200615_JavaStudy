/*
 *    1~100���� �� 
 */
// => 1~100������ ==> ¦���� ��,Ȧ���� �� 
public class �ݺ���_for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� => 1~100���� ���� �� => ���� 
		int sum=0;// ���� ���� 
		// i ==> ���� ���� 
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
			System.out.printf("1���� %d������ ��:%d\n",i,sum);
		}
	}

}




