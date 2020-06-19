import javax.swing.JFrame;

/*
 *    int a;
 *    int b;
 *    
 *       int a,b;
 *       int a=10;
 *       int b=20;
 *       
 *       int a=10,b=10;
 *       
 *       x++;
 *       y++;
 *       
 *       x++,y++;
 */
public class 연산자정리 extends JFrame{
    public 연산자정리()
    {
    	setSize(800, 600);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 연산자정리();
        char c='A';
        //char ccc=65;
        char cc=(char)(c+32);   // 소문자 변환 => 형변환
        System.out.println(cc);
        
        System.out.println(c>='A' && c<='Z' ? "대문자":"소문자");
        /*
         *   cc>='A' && cc<='Z' ==> 대문자
         *   cc>='a' && cc<='z' ==> 소문자 
         */
	} 

}






