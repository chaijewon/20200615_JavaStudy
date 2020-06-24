/*
 *   선택문 
 *    => switch(정수,문자,문자열)
 *       {
 *          // 정수
 *          case 정수값:  => :
 *             처리문장 
 *             ==> if(조건){처리}
 *          case 정수값:
 *             처리문장   ===> 중복된 값은 사용할 수 없다 
 *          
 *       }
 *       
 *       switch(a)
 *       {
 *          case 1:
 *               == 라벨 (중복이 없다)
 *          case 1:  ==> error 
 *          
 *          if(a==1){System.out.println(1);} 
 *          if(a==1){System.out.println("일");}
 *          
 *          if(a==1)
 *          {
 *             System.out.println(1);
 *             System.out.println("일");
 *          }
 *       }
 *       
 *       // 사용자 => 정수=1
 *       switch(정수)  ==> break가 없는 경우에는 모든 문장을 수행 
 *       {
 *          case 1:
 *             처리문장 1
 *          case 2:
 *             처리문장 2
 *             break;
 *          case 3:
 *             처리문장 3 
 *       }
 */
import java.util.*;
public class 선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int select=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("정수(1~5):");
        select=scan.nextInt();
        // if(select==1 || select==2)
        // 종료 시점 ==> break;
        switch(select)
        {
        case 1:
        	//System.out.println("1번~2번을 입력하였습니다");
        	//break;// switch문 종료한다 
        case 2:
        	System.out.println("1번~2번을 입력하였습니다");
        	break;
        case 3:
        	System.out.println("3번을 입력하였습니다");
        	break;
        case 4:
        	System.out.println("4번을 입력하였습니다");
        	break;
        case 5:
        	System.out.println("5번을 입력하였습니다");
        	break;
        default:
        	System.out.println("1~5번까지만 사용하세요");
        }
	}

}





