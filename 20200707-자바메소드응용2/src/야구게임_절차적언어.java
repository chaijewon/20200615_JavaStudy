/*
 *    1. 3�� ������ �����߻� (�ߺ�����) => 1~9���� 
 *    2. ����� �Է� 
 *    3. �� 
 *    4. ��Ʈ 
 *    5. �����϶� ���� 
 *    ================ ���� process()
 */
import java.util.*;
public class �߱�����_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. �ߺ����� ���� ==> 3�� 
		int[] com=new int[3];
		// 1~9  => 111
		int su=0; // ������ �����ϴ� ���� 
		boolean bCheck=false;// �ߺ����� Ȯ��  (�ߺ� : true, �ߺ�(X): false)
		for(int i=0;i<3;i++)
		{
			bCheck=true;
			while(bCheck)
			{
				// ���� �߻� 
				su=(int)(Math.random()*9)+1;//1~9
				bCheck=false;
				// while ���� ���� 
				// üũ 
				// ==> 7 => 0
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
					
				}
			}
			com[i]=su;
			//System.out.print(com[i]+"\t");
		}
		
		// 2. ����� �Է� 
		int[] user=new int[3];
		
		// �Է�
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("���ڸ� ������ �Է�:");
			int input=scan.nextInt();
			
			// ���� ó�� => ���ڸ� ������ �Է��� �ȵ� ���
			if(input<100 || input>999)
			{
				System.out.println("�߸��� �Է��Դϴ�!!");
				// ó������ �̵� 
				continue;
			}
			// 369  ==> 369/100 ==> 3
			user[0]=input/100;
			user[1]=(input%100)/10; // 368%100 ==> 68/10 ==> 6
			user[2]=input%10; 
			
			// �ι�° ���� 
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("�ߺ��� ������ ��� �� �� �����ϴ�");
				continue;
			}
			// ����° ����
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0�� ����� �� �����ϴ�");
				continue;
			}
			// 369 ==> 936  3B  369 369 => 3S
			// ��
			int s=0,b=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			// ��Ʈ 
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",
					input,s,b);
			// ���Ῡ�� 
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}
		
	}

}






