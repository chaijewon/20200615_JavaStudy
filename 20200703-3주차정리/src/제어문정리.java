/*
 *   제어문 
 *   =====
 *     1) 조건문 
 *         = 단일 조건문  ==> 단독 수행 
 *           => if(조건문) => 조건문 (true/false) 비교연산자,논리연산자,부정연산자
 *              {
 *                 조건문이 true만 수행하는 문장 : 산술연산자,대입연산자
 *              }
 *         = 선택 조건문  ==> true/false 나눠서 처리
 *           => if(조건문)
 *              {
 *                   조건문 => true 처리문장 
 *              }
 *              else
 *              {
 *                   조건문 => false 처리문장 
 *              }
 *              ==> ID중복체크 => 경우수
 *         = 다중 조건문 ==> 한개의 조건만 수행 
 *           if(조건문)
 *           {
 *              
 *           }
 *           else if(조건문)
 *           {
 *              
 *           }
 *           else if(조건문)
 *           {
 *           }
 *           else if(조건문)
 *           {
 *           }
 *           else
 *           {
 *              조건이 없는 경우에 처리 => 생략이 가능
 *           }
 *     2) 선택문
 *           => 조건이 많이 있는 경우에 주로 사용 (web=> 조건=> if)
 *           => 게임 
 *           => 한개의 값을 선택시에 처리 
 *              => 네트워크 
 *           switch(정수,문자,문자열)
 *           {
 *             case 정수:
 *               처리 
 *               break;
 *             case 정수:
 *               처리 
 *               break;
 *             case 정수:
 *               처리 
 *               break;
 *             default:
 *                해당 정수가 없는 경우 
 *           }
 *     3) 반복문
 *           ***= for : 횟수가 지정 ....
 *                = 제어 => 값 변경,수정 , 다른 기능 : 일반 for
 *                  for(초기값;조건식;증가식)
 *                  {
 *                       처리 문장 
 *                       처리 문장
 *                  } 
 *                = 출력
 *                  for(실제 데이터를 받을 변수:저장된 데이터) => web,mobile
 *                  
 *                  서버 : JSP,Spring,Oracle
 *                  클라이언트 : HTML,CSS,JavaScript
 *           ***= while : => 종료조건 ...
 *           (X)= do~while
 *     4) 반복제어문 
 *           break; 종료
 */
import java.io.*;
public class 제어문정리 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        String data="";
        FileReader fr=new FileReader("c:\\javaDev\\a.txt");
        int i=0;
        while((i=fr.read())!=-1)
        {
        	data+=String.valueOf((char)i);
        }
        
        System.out.println(data);
	}

}






