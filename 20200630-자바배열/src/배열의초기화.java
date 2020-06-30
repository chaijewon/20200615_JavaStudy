/*
 *  => 배열 선언 
 *     데이터형[] 배열명;
 *  => 배열 초기화 (메모리안에 값을 주입)
 *     예)
 *         int[] arr={10,20,30,40,50}; // 선언에 동시에 초기값 
 *         int[] arr=new int[5]; // 메모리 공간만 제작 => 나중에 값을 채운다 
 *         int[] arr; // 선언
 *         arr[0]=10;
 *         arr[1]=20;
 *         ....
 *         ....
 *         ===========================
 *         활용 => 제어문 (for,while)
 *         
 *         for => 제어 
 *         for-each => 출력 담당 
 */
public class 배열의초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 출력 
		String[] names={"홍길동","박문수","이순신","춘향이","심청이"};
		// 출력 
		// length => 배열에 저장된 갯수 
		for(int i=0;i<names.length;i++)
		{
			//names[1]="";
			// 데이터값을 변경이 가능 
			System.out.println(names[i]);// names[0]~names[4]
		}
		System.out.println("===== for-each =====");
		for(String name:names)
		{
			// 변경이 불가능 => 화면에 출력만 담당 
			System.out.println(name);
		}
	}

}






