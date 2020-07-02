import java.util.*;
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[]={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int jumsu[]={95, 88, 76, 62, 55};
		
		// 입력값 받기 
		Scanner scan=new Scanner(System.in);
		
		boolean bCheck=false;
		while(true)
		{
			bCheck=false;
			System.out.print("과목 입력:");
			String subject=scan.nextLine();
			if(subject.equals("그만"))
			{
				break;
			}
			for(int i=0;i<course.length;i++)
			{
				if(subject.equals(course[i]))
				{
					bCheck=true;
					System.out.println(jumsu[i]);
				}
				/*
				 * else { System.out.println("없는 과목입니다!!"); }
				 */
			}
			
			
			 if(bCheck==false) 
			 { 
				 System.out.println("없는 과목입니다!!"); 
		     }
		}
	}

}







