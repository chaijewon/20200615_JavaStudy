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
public class ���������� extends JFrame{
    public ����������()
    {
    	setSize(800, 600);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ����������();
        char c='A';
        //char ccc=65;
        char cc=(char)(c+32);   // �ҹ��� ��ȯ => ����ȯ
        System.out.println(cc);
        
        System.out.println(c>='A' && c<='Z' ? "�빮��":"�ҹ���");
        /*
         *   cc>='A' && cc<='Z' ==> �빮��
         *   cc>='a' && cc<='z' ==> �ҹ��� 
         */
	} 

}






