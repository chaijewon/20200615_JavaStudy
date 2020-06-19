/*
 *   화면 출력 
 *     = System.out.println() => 다음에 출력 
 *       예) 
 *           System.out.println("Hello");
 *           System.out.println("Java");
 *           Hello
 *           Java
 *           
 *     = System.out.print()
 *           System.out.print("Hello");
 *           System.out.print("Java");
 *           
 *           HelloJava
 *     = System.out.printf() : 서식이 있는 출력 
 *     
 *       80 80 80 240  80.0  B
 *       
 *       System.out.println("80 80 80 240  80.0  B")
 *       
 *       System.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,'B')
 *       
 *       %5d   80
 *       00080
 *       %-5d
 *       80000
 *       
 *       %5.2f   80.0
 *       080.00
 */
public class 자바출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.printf("%.1f",80); int a=2; int b=2;
		 * System.out.println(a+"*"+b+"="+a*b); System.out.printf("%d*%d=%d",a,b,a*b);//
		 * JDK 1.5
		 */        
        /*
         *  %d  => 정수
         *  %f  => 실수
         *  %c  => 문자
         *  %s  => 문자열
         */
        //System.out.println(~100);
		System.out.println(Integer.toBinaryString(240));// 이진법
		System.out.println(Integer.toHexString(240));// 16진법
		System.out.println(Integer.toOctalString(240));// 8진법 
		/*
		 *  11110000
             f0
             360

		 */
		System.out.println(0xf0);
		System.out.println(0360);
		System.out.println(0b11110000);
		System.out.println(~100);
	}

}









