// valueOf() => ��� ���������� ���ڿ��� ��ȯ 
/*
 *   valueOf(10) ==> "10"
 *   valueOf(true) => "true"
 *   char[] c={'H','e','l','l','o'};
 *   valueOf(c) ==> "Hello"
 */
public class ���ڿ�6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] c= {'H','e','l','l','o'};
        String msg=String.valueOf(c); // char[] ==> String
        System.out.println(msg);
        String ss="Hello Java!!";
        char[] cc=ss.toCharArray();// String ==> char[]
        
        int a=10;
        int b=20;
        System.out.println(String.valueOf(a)+String.valueOf(b));
        // 1020  =>  "10"+"20" ==> 1020
	}

}







