/*
 *   1. 배열 
 *      => 같은 타입을 여러개 묶어서 관리
 *      => 배열생성 => 연속적인 메모리 구조 (인덱스)
 *      => 일차원 배열   [] , [][] , [][][]
 *                 =====
 *                 1) 문자열 배열
 *                    String[] arr   ====== String arr[]
 *                             === 배열명 
 *                 2) 정수 배열 
 *                    int[] arr   ====== int arr[]
 *                 3) 논리 배열 
 *                    boolean[] arr ===== boolean arr[]
 *      => 선언 방식 
 *          문자열 10개 
 *          =========
 *          String[] arr;
 *          정수 10개
 *          int[] arr;
 *      => 초기값 
 *          1) String[] arr;
 *             arr=new String[10];
 *             
 *          2) int[] arr     =====> 선언과 동시에 초기값 
 *             ***int[] arr=new int[10]
 *             arr=new int[10];
 *             
 *             int[] arr={10,20,30,40,50} ==> 등록된 갯수 (5개 배정)
 *             
 *             ==> 선언시에 메모리 저장 갯수를 등록 => 고정적이다 
 *      => 인덱스 사용 
 *         예)
 *             int[] arr={10,20,30,40,50} => String(4byte)
 *              arr
 *             =====
 *              배열의 첫번째 주소 
 *              100
 *             =====
 *                  ===================================
 *                    10      20     30      40      50
 *                 |=======|======|======|=======|=========
 *               100      104    108    112     116
 *                   arr[0]  arr[1] arr[2]  arr[3]  arr[4]
 *              index번호는 0부터 시작 
 *              
 *              arr[0] ==> 일반변수와 동일 역할 수행 
 *              arr[0]=100 => 값이 변경이 가능하다 
 *      => 출력  => 번호 (0~~~) => 연속적으로 인덱스번호 
 *         ===
 *          => for , while문을 이용해서 출력 
 *             === 횟수가 지정된 상태 
 *             
 *             = for 
 *               1) 일반 for문 =============> 인덱스를 이용한다(제어)
 *                     ==> 값을 변경,값을 삭제
 *                     ==> Back-End 
 *               2) 향상된 for문 (for-each) ===> 실제 저장된 값(출력용)
 *                     ==> 값 변경이 불가능 
 *                     ==> Front-End
 */
public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 정수 ==> 5개 저장 => 평균 
		// 1. 정수 5개 저장하는 메모리 공간을 설정 (연속적으로 사용)
		int[] arr={30 , 50 , 70 , 90 , 10};
		/*
		int total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		double avg=total/5.0;
		System.out.println("저장된 정수의 평균:"+avg);
		*/
		int total=0;
		for(int i=0;i<5;i++)
		{
			total+=arr[i];// arr[0]+arr[1]+arr[2]+arr[3]+arr[4]
		}// i라는 메모리는 자동 삭제
		// "7"+7+7+7   ==> "7777" 
		/*
		 *    "7"+7+7+7
		 *    =====
		 *    "77"+7
		 *    ======
		 *    "777"+7
		 *    =======
		 *    "7777"
		 *    
		 *    "7"+7*2
		 *        ===
		 *    "7"+14  ==> "714"
		 *    
		 *    ==> + , - ==> 왼쪽 ==> 오른쪽
		 *    ==> + , * ==> * 먼저 계산 나중에 +
		 *    ==> +,- ==> (*,/,%)
		 *    
		 *    7+2*5  ==> 17 
		 *    ===
		 *     9*5 ==> 45
		 *     
		 *     + : 산술 , 문자열결합 => ""
		 *              =========
		 *               붙인다 
		 */
		System.out.println("저장된 정수의 평균:"+total/5.0);
		
		// 향상된 for
		//for(실제 저장된 데이터형 : 배열명)
		/*
		 *   arr  => 30 , 50 , 70 , 90 , 10
		 *   for(int i:arr)
		 *   
		 *   ==> i=30
		 *   ==> i=50
		 *   ==> i=70
		 *   ==> i=90
		 *   ==> i=10 
		 *   ==> 값이 없을때 자동 종료
		 */
		int total1=0;
		for(int i:arr)
		{
			total1+=i;
		}
		
		System.out.println("저장된 정수의 평균:"+total1/5.0);
	}

}








