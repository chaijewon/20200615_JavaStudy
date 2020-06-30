/*
 *      A
 *      AB
 *      ABC
 *      ABCD
 *      ABCDE
 *      
 *      �ټ�(i)   ���ĺ�(j)   i=j  ==> j<=i
 *      1          1
 *      2          2
 *      3          3
 *      4          4
 *      5          5
 *     ============= ���� �ʱⰪ�� ��ġ 
 *      ABCDE
 *      ABCD
 *      ABC
 *      AB
 *      A
 *      
 *      ���� 
 *      �ټ�(i)    ���ĺ�(j)
 *      1           5   =====> i+j=6  ==> j=6-i
 *      2           4
 *      3           3
 *      4           2
 *      5           1
 *      
 *      1####
 *      #2###
 *      ##3##
 *      ###4#
 *      ####5
 *      
 *      25 24 23 22 21
 *      20 19 18 17 16
 *      15 14 13 12 11
 *      10  9  8 7   6
 *      5   4  3 2   1
 */
public class �ݺ���_2��for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='A';
        for(int i=1;i<=5;i++)
        {
        	c='A';
        	// i=1   => j=1,j=5 (6-i)  ==> 5 ABCDE
        	// i=2   => j=1,j=4        ==> 4 ABCD
        	// i=3   => j=1,j=3        ==> 3 ABC
        	// i=4   => j=1,j=2        ==> 2 AB
        	// i=5   => j=1,j=1        ==> 1 A
        	for(int j=1;j<=6-i;j++)
        	{
        		System.out.print(c);
        		c++;
        	}
        	System.out.println();
        }
        
        System.out.println();
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		// ���
        		if(i==j)
        			System.out.print(i);
        		else
        			System.out.print("#");
        	}
        	// ���� ���
        	System.out.println();
        }
        int k=25;// 25~1�����ϴ� ���� 
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		System.out.printf("%2d\t",k);
        		k--;
        	}
        	System.out.println();
        }
        // ������ �ʱⰪ
        k=1;// 25~1�����ϴ� ���� 
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        	{
        		System.out.printf("%2d\t",k);
        		k++;
        	}
        	System.out.println();
        }
        
        System.out.println("\n");
        /*
         *    *****
         *     ****
         *      ***
         *       **
         *        *
         *   ======================
         *        �ټ�(i)    ����(j)   ��ǥ(k)
         *         1          0        5
         *         2          1        4
         *         3          2        3
         *         4          3        2
         *         5          4        1
         *        =======================
         *             i�� j�� ����
         *             j+1=i  => j=i-1
         *             i�� k�� ����
         *             i+k=6  => k=6-i
         *        *
         *       **
         *      ***
         *     ****
         *    *****
         *    ======================
         *      �ټ�(i)����(j)��ǥ(k)
         *      1     4    1        ==> i=k k<=i
         *      2     3    2
         *      3     2    3
         *      4     1    4
         *      5     0    5
         *      =======
         *      i+j=5 ==> j=5-i
         */
        
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5-i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(k=1;k<=i;k++)
        	{
        		System.out.print(i);
        	}
        	System.out.println();
        }
         
	}

}




