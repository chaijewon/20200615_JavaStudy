/*
 *    자바 =>기본형 
 *          자바에 지원하는 데이터형 
 *          논리형 ==> boolean ==> 값 : true/false : if(조건문)을 사용할때 주로 사용하는
 *                                                데이터형 
 *              
 *                                                
 *                                                턴
 */
//   ======> upcasting (자동형변환)
//     byte < short(char) < int < long < float < double
//    <======= downcasting (강제형변환)
/*
 *     double d='a';  ==> d=97.0
 *     char c='a'
 *     int i='A'    ==> i=65
 *     
 *     byte b1=10;
 *     byte b2=20;
 *     byte b3=b1+b2
 *     
 *     byte a=10;
 *     byte b=30;
 *     byte c=(byte)(a*b)
 *     
 *       =>   (int)10.5+(int)10.5 ==>20
 *            (int)(10.5+10.5) ==> 21
 */
public class 자바기본형데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 사용 방법 
		/*
		 * boolean b1=false;//False(X) ==> 1byte System.out.println("b="+b1); b1=true;
		 * System.out.println("b="+b1); System.out.println(Integer.toBinaryString(300));
		 * byte a=10; byte b=30; int c=(a*b); System.out.println("c="+c);
		 */
		
		System.out.println('A');
		System.out.println((int)'ㅋ');
		// 126191261912619 ㅋㅋㅋ
		System.out.println((char)12619);
		// 각문자는 숫자번호를 가지고 있다  (char는 정수형으로 인식한다)
				
	}

}




