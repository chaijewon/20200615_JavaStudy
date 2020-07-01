/*
 *   문자열 비교 : equals() 
 *   =================== (==)
 *   문자찾기 : contains() 
 *   시작문자열 : startsWith()
 *   끝나는 문자열 : endsWidth()
 *   문자열 자르기 : substring()
 *   유아인, 박신혜
 *   문자 추출 : charAt()
 *   문자의 갯수 : length()
 *   공백문자 제거 : trim()
 *   문자의 위치 찾기 : indexOf() , lastIndexOf()
 *      aaa.java
 *   형변환 : valueOf()
 */
// 로그인 처리 
import java.util.*;
public class 문자열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // id , pwd 
		final String ID="admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ID를 입력:");
		String id=scan.nextLine();
		System.out.print("비밀번호 입력:");
		String pwd=scan.nextLine();
		/*
		 *   equals : 대소문자 구분해서 비교
		 *   equalsIgnoreCase : 대소문자 구분없이 비교
		 */
		// 결과 
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD))
		{
			System.out.println("로그인되었습니다!!");
		}
		else
		{
			System.out.println("ID나 비밀번호가 틀립니다!!");
		}
	}

}







