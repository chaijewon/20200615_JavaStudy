/*
 *    **********
 *    **********
 *    **********
 *    **********
 *    **********
 *    
 *    
 */
public class 반복문_2차for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        
        System.out.println("===== for =====");
        for(int i=1;i<=5;i++)
        {
        	System.out.println("**********");
        }
        System.out.println("===============");
        System.out.println("**********");
        for(int i=1;i<=10;i++)
        {
        	System.out.print("*");
        }
        System.out.println("\n===== 2차 for ======");
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=10;j++)
        	{
        		System.out.print("*");
        	}
        	// 다음줄에 출력 
        	System.out.println();
        }
	}

}






