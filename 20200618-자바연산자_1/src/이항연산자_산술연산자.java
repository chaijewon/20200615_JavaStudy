/*
 *    이항연산자 
 *      산술연산자 ( + , - , *  , /  , % )
 *      => 자바에서 제공하는 모든 연산자는 산술로 변환 할 수 있다
 *      => 자바프로그램에서 가장 많이 사용되는 연산자 
 *      => 주의점 
 *          1) 형변환 ==> 가장 큰 데이터형으로 변경
 *          2) / 
 *             = 0으로 나누면 오류가 발생 
 *             = 정수/정수=정수
 *          3) %
 *             = 나누고 나머지 => 부호는 왼쪽편 부호가 남는다 
 *               (-5) % (-2) => -1
 *               ==
 *               (5) % (-2)  => 1
 *               
 *          4) 산술 연산자의 우선순위는 
 *             *,/,%가 +,-보다 우선순위가 높다
 *             => 우선순위를 잘 모르면 => ()를 이용해서 우선순위 결정
 *             (3+4)*7
 *               ===
 *             =
 *      
 */
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=3;
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int m=a/b;
		int n=a%b;
		
		System.out.printf("%d+%d=%d%n",a,b,c);//\n
		System.out.printf("%d-%d=%d%n",a,b,d);
		System.out.printf("%d*%d=%d%n",a,b,e);
		System.out.printf("%d/%d=%d%n",a,b,m);
		System.out.printf("%d%%%d=%d%n",a,b,n);
	}

}







