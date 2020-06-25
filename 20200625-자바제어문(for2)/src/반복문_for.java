/*
 *    변수 명칭법  => 식별자 
 *    1) 알파벳(대소문자),한글로 시작한다
 *    2) 숫자는 사용 가능(앞에 사용금지)
 *    3) 키워드는 사용 할 수 없다 
 *    4) _ , $ 사용이 가능 
 *    ================== 적용 (클래스명,메소드명)
 *    
 *    for 형식)
 *    
 *        for(초기화 ; 조건식 ; 증감식)
 *        {
 *             반복수행 문장 
 *             실행문장 
 *        }
 *        
 *        for(초기화 ; 조건식 ; 증감식)
 *             반복수행 문장 
 *             실행문장 
 *        
 *        출력 ==> 
 *          AaBbCcDd....Zz
 */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	System.out.println("Hello!!");
        	System.out.println("Java=>For");
        }
        System.out.println("============");
        for(int i=1;i<=5;i++)
        {
        	System.out.println("Hello!!");
        }
    	System.out.println("Java=>For");
    	
    	char c='a';
    	for(char ch='A';ch<='Z';ch++)
    	{
    		//System.out.print(ch+""+(char)(ch+32));
    		System.out.print(ch+""+c);
    		c++;
    	}
    	System.out.println();
    	// 조건이 없이  1~10 ==> 홀수만 출력 => 일정간격을 
    	// 1  3  5  7  9
    	for(int i=2;i<=10;i+=2)
    		System.out.print(i+"\t");
    	
    	// 초기화 , 증가 , 어디까지(조건식) 
    	// 영문 => char
    	// 1~5 ==> 1,2,3,4,5
    	System.out.println();
    	for(int i=1;i<=5;i++)
    	{
    		System.out.print(i);
    		if(i<5)
    			System.out.print(",");
    		
    	}
    	
    	// 10 ==> 1010  15 ==> 1111
    	
    	System.out.println();
    	int su=10;
    	String s="";
    	for(;;)
    	{
    		int a=su%2;
    		//System.out.print(a);
    		s+=a+"";
    		su=su/2;
    		if(su==0)
    			break;
    		//System.out.print();
    	}
    	for(int i=s.length()-1;i>=0;i--)
    	{
    		System.out.print(s.charAt(i));
    	}
    	
	}

}



