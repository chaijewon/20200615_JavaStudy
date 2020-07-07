/*
 *    메소드 용도 
 *    ========
 *      = 기능 , 입력 , 출력  
 *      = 조립 
 *      = 시작점 => main()
 */
public class 자바메소드5 {
	static String[] title= {
			"#살아있다",
			"결백",
			"온워드: 단 하루의 기적",
			"소리꾼",
			"인베이젼 2020",
			"다크 나이트",
			"위대한 쇼맨",
			"트로이 디렉터스 컷",
			"야구소녀",
			"아무튼, 아담"
	};
    static void titleMax()
    {
    	
    	int max=0;
    	for(int i=0;i<title.length;i++)
    	{
    		if(max<title[i].length())
    			max=title[i].length();
    	}
    	
    	for(int i=0;i<title.length;i++)
    	{
    		if(max==title[i].length())
    			System.out.println(title[i]);
    	}
    }
    
    static void titleMin()
    {
    	
    	int max=100;
    	for(int i=0;i<title.length;i++)
    	{
    		if(max>title[i].length())
    			max=title[i].length();
    	}
    	
    	for(int i=0;i<title.length;i++)
    	{
    		if(max==title[i].length())
    			System.out.println(title[i]);
    	}
    }
    static void process()
    {
    	System.out.println("가장 긴 영화명:");
    	titleMax();
    	System.out.println("가장 짧은 영화명:");
    	titleMin();
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		process();
		/*
		 * FileReader fr=new FileReader("c:\\javaDev\\news.txt"); String news="";
		 * StringBuffer sb=new StringBuffer(); int i=0; while((i=fr.read())!=-1) {
		 * sb.append(String.valueOf((char)i)); } fr.close();
		 * System.out.println(sb.toString());
		 */
	}

}







