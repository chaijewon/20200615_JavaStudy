/*
 *   ������ 
 *   1) while�� ������ ���� ��� error  => for(;;)
 *      while() => ���ǽ��� ���� 
 *      {
 *      }  =====> �����߻�
 *   2) while���� ���ѷ��� 
 *      => for(;;) => while(true):���� ���� ���� 
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
public class �ݺ���_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int user=0;// ����� ��û�� ���� 
        int i=1; // ����� ��û�� �������� ���� (��������)
        int sum=0; // ����(��)
        
        Scanner scan=new Scanner(System.in);
        System.out.print("���� �Է�:");
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
        
        i=1;// �ʱⰪ ==> 1~5
        System.out.println("i="+i);
        /*
         *   i=1  i<=5  i++
         *   i=2  i<=5  i++
         *   i=3  i<=5  i++
         *   i=4  i<=5  i++
         *   i=5  i<=5  i++
         *   i=6  i<=5  ==> ����
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
        	
        }// j �� �޸𸮿��� ������� 
        //System.out.println(j);
        
        
	}

}




