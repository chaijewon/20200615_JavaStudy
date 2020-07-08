
public class 자바메소드3 {
	/*
	 * static int plus(int a,int b) { return a+b; }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=20;
        // 재사용성 
        int result=자바메소드2.plus(a, b);
        System.out.println(result);
	}

}
