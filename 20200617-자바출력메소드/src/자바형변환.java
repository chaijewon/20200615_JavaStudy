// 형변환 => 자신의 데이터형은 다른 형식의 데이터형으로 변환 
/*
 *   boolean : 제외
 *   byte < char < int < long < float < double
 *   
 *   정수 => 실수 , 문자 , 정수         int a=(int)10L  => long a=10
 *                             double d=10
 *   실수 => 정수, 문자 
 *   문자 => 정수 ,실수 
 *   
 *   int i='A'  ==> 'A'=>65  ==> (char)65   
 *    
 *      10.5 + 10
 *            ====
 *            10.0  
 *            
 *      'A'+1
 *      ===
 *      65
 */
public class 자바형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double d=5/2.0;
        System.out.println("d="+d);
	}

}





