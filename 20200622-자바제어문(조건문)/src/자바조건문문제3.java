import java.util.Scanner;

/*
 *    사용자 입력 ==> 0,1,2
 *    
 *    => 0이면  => 가위
 *    => 1이면  => 바위
 *    => 2면     => 보 
 */
public class 자바조건문문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("가위(0),바위(1),보(2) 입력:");
        // 입력값 
        int user=scan.nextInt();
        // 같다 (==)
		
		 if(user==0) { 
			 System.out.println("Player:가위"); 
		
		 } 
		 if(user==1) {
		     System.out.println("Player:바위"); 
		 } 
		 if(user==2) {
		     System.out.println("Player:보"); 
		 }
		 
        
        // 컴퓨터 
        int com=(int)(Math.random()*3);
        //            =============
        //             0.0~0.99 * 3  ==> 0.0~2.9... ==> 0~2
		// == 정수,실수 ,문자일 경우에는 사용이 가능 
        // "" 문자열은 ==으로 비교가 불가능 => equals()
		 if(com==0) { 
			 System.out.println("컴퓨터:가위"); 
		 } 
		 if(com==1){
		     System.out.println("컴퓨터:바위"); 
		 } 
		 if(com==2) { 
			 System.out.println("컴퓨터:보"); 
		 }
		 
		 // 결과를 비교 
		 /*
		  *          com-user
		  *   컴퓨터 : com
		  *      가위 => 0
		  *           사용자 : user
		  *           가위 => 0 => 0
		  *           바위 => 1 => (-1)
		  *           보    => 2 => -2  
		  *           
		  *      바위 => 1
		  *          사용자 :user
		  *           가위 => 0   => 1  1
		  *           바위 => 1   => 0
		  *           보    => 2   => (-1)
		  *      보   => 2
		  *          사용자 : user   2,-1
		  *           가위 => 0   => (2)   -1,2
		  *           바위 => 1   => 1
		  *           보    => 2   => 0
		  */
		 if(com-user==-2 || com-user==1)
		 {
			 System.out.println("Computer Win!!");
		 }
		 if(com-user==-1 || com-user==2)
		 {
			 System.out.println("Player Win!!");
		 }
		 if(com-user==0)
		 {
			 System.out.println("비겼다!!");
		 }
		 // 컴퓨터가 가위일때
		 // 중복 조건문 
			/*
			 * if(com==0) { if(user==0) { System.out.println("비겼다!!"); } if(user==1) {
			 * System.out.println("Player Win!!"); } if(user==2) {
			 * System.out.println("Computer Win!!"); } } // 컴퓨터가 바위일때 if(com==1) {
			 * if(user==0) { System.out.println("Computer Win!!"); } if(user==1) {
			 * System.out.println("비겼다"); } if(user==2) {
			 * System.out.println("Player Win!!"); } } // 컴퓨터가 보일때 if(com==2) { if(user==0)
			 * { System.out.println("Player Win!!"); } if(user==1) {
			 * System.out.println("Computer Win!!"); } if(user==2) {
			 * System.out.println("비겼다"); } }
			 */
		 
		
	}

}





