/*
 *   ������ ���� => 5���� �������Ŀ� 
 *   �ִ밪,�ּҰ� ���ϴ� ���α׷� 
 */
public class �迭_�ִ��ּҰ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� 5���� �����ϴ� ������ ����� ==> �迭 
		int[] arr=new int[5]; // 0 0 0 0 0
		// 5���� ���� ���� 
		
		for(int i=0;i<5;i++)
		{
			// ���� = 0  ....  <
			arr[i]=(int)(Math.random()*100)+1;
			// (int)(Math.random()*10) ==> 0.0~9. ==> 0~9
			//       2           1          3
			//       0.0~99.0 ==> ������ȯ => 0~99 ==> 1~100
			//       0.0~0.99*51  ==> 0~49 +1 1~50
		}
		
		// ��� 
		// int i==> index�� �ƴ϶� => ���� ����� ���� ����
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n===== ��� =====");
		// �ּҰ� ���� ����
		int min=100;// ���� ū������ �ʱ�ȭ
		/*
		 *    20 30 50 60 80   
		 */
		// �ִ밪�� ���� ���� 
		int max=1; // ���� ���� ������ �ʱⰪ
		
	    //�ּҰ�
		for(int i=0;i<5;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("�ּҰ�:"+min);
		System.out.println("�ִ밪:"+max);
		
	}

}




