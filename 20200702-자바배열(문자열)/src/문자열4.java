/*
 *    indexOf , lastIndexOf => 문자의 위치 찾기 => 정수 
 *    // 문자 자르기 => substring()
 */
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg="fsfsaj.fassfssfjsjflsjfslfs.java";
        System.out.println(msg.indexOf("."));
        System.out.println(msg.lastIndexOf("."));
        System.out.println("확장자:"+msg.substring(msg.lastIndexOf(".")+1));
	}

}
