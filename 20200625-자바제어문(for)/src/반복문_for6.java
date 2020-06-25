// A-Z까지 출력 
public class 반복문_for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *   int i;
		 *   for(i=1;i<=5;i++)
		 *   {
		 *     i=1 , 2 3 4 5 i++=6
		 *   }
		 *   
		 *   i=?   6
		 */
		char ch;
        for(ch='A';ch<='Z';ch++)
        {
        	System.out.print(ch);
        }// ch는 메모리에서 사라진다 
        // ch=90 ==> 
        System.out.println((char)('Z'+1));//[
        System.out.println(ch);
        System.out.println();
        for(ch='a';ch<='z';ch++)
        {
        	System.out.print(ch);
        }
        System.out.println(ch);//{
        
        for(int i=10;i>=1;i--)
        {
        	System.out.println(i);
        }
        
        System.out.println("============");
        
        for(int i=1,j=10;i<=10;i++,j--)
        {
        	System.out.println("i="+i+",j="+j);
        }
	}

}





