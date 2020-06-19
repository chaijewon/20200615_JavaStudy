import java.util.*;

import javax.swing.JOptionPane;

public class 자바출력메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \n은 newLine => 새로운 줄에 출력 
		// \t는 탭 => 일정 간격 
		/*
		 * System.out.printf("%d*%d=%d\t",2,2,4); System.out.printf("%d*%d=%d",3,2,6);
		 */
		
		Scanner scan=new Scanner(System.in);
		/*
		 *  Scanner : 데이터형 
		 *  scan : 변수
		 *  new : 메모리에 저장 
		 *  Scanner(System.in) : 초기화
		 */
		System.out.print("1' 정수 입력:");
		int a=scan.nextInt();// 입력된 정수를 읽어와서 a라는 메모리에 저장 
		//System.out.print("2' 정수 입력:");
		int b=scan.nextInt();
		// 출력
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//JOptionPane.showInputDialog("정수");
		// Scanner => 도스에서만 사용 
	}

}











