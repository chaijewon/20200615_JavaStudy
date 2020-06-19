import java.util.Scanner;// Scanner ==> 이전에 만들어진 자바파일을 읽어 온다 
/*
 *    class Scanner{
 *    }
 *    
 *    정수입력:
 *      100
 */
public class 자바입출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 입력값 받기 
		/*
		 *    System.out.println("정수 입력:");
		 *    System.out.print("정수 입력:\n");
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("실수 입력:"); // \n , \t
		double a=scan.nextDouble();
		// double a=100  a=100.0
		// char a=97  ==> a='a'
		
		
		System.out.println("a="+a);
	}

}





