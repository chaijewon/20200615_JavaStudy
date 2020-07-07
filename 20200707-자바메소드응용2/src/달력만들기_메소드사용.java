/*
 *     1. 사용자로부터 년도,월을 받는다 
 *     2. 요일을 구한다 ==> 세분화 
 *     3. 해당요일부터 달력을 출력한다 
 */
import java.util.*;
public class 달력만들기_메소드사용 {
	
    static int userInput(String msg)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print(msg+" 입력:");
    	int num=scan.nextInt();
    	return num;
    }
    // 2. 요일 구하기 
    static int getWeek(int year,int month)
    {
    	// 1) 전년도까지의 총날 수 (year-1) 2020 => 1.1.1~2019.12.31
    			int total=(year-1)*365
    					 +(year-1)/4
    					 -(year-1)/100
    					 +(year-1)/400;
    			// 2) 전달까지의 총 날수 
    			// 3 ==> total+31+28
    			// 4 ==> total+31+28+31
    			
    			
    			for(int i=1;i<=month-1;i++)
    			{
    				total+=lastDay(year, i);
    			}
    			
    			// 요청한 달의 1일자의 요일 구하기
    			total++;
    			
    			// 요일 구하기 
    			int week=total%7;
    			
    			return week;
    }
    // 각달의 마지막날짜 알려주는 기능 
    static int lastDay(int year,int month)
    {
    	int[] lastDay={
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
    	if(isYear(year))
    			lastDay[1]=29;
    	else
    		    lastDay[1]=28;
    	
    	return lastDay[month-1];
    }
    
    // 반복(X) => 재사용성 
    static boolean isYear(int year)
    {
    	boolean bCheck=false;
    	
    	if((year%4==0 && year%100!=0)||(year%400==0))
    		 bCheck=true;
    	
    	return bCheck;
    }
    // 달력 출력 
    static void datePrint(int year,int month,int week)
    {
    	
    	int last=lastDay(year, month);
    	
    	String[] strWeek= {"일","월","화","수","목","금","토"};
		for(int i=0;i<7;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
    	System.out.println();
    	for(int i=1;i<=last;i++)
		{
			// 공백 
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			// 1부터 출력 
			System.out.printf("%2d\t",i);
			// 요일 증가
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
    	
    	
    }
    // 메소드 여러개 조립하는 메소드
    static void process()
    {
    	int year=userInput("년도");
    	int month=userInput("월");
    	
    	// 요일 
    	int week=getWeek(year, month);
    	// 출력 
    	datePrint(year, month, week);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}
