/*
 *   while => ���ѷ��� (�����ͺ��̽� (����Ŭ) , ���� �б�,��������,����)
 *                   =================          =======
 *                   ���� : XML , JSON
 *                   => break(����)
 *   ����)
 *         �ʱⰪ       ========  1
 *         while(���ǽ�) ====  2 ==> true=> {�ȿ� �ִ� ���� ����}/false(����)
 *         {
 *             �ݺ����๮�� ===  3
 *             ������          ===  4 ===> ���ǽ� ��
 *         }
 *         
 *         1~10 ������ ��� 
 *         1) 1~10���� ����Ǵ� ���� => ��������
 *            int i=1; ���� => 1
 *            while(i<=10) => 10
 *            {
 *               System.out.println(i);
 *               i++; // i=2 ==> i<=10 .... i=11 i<=10 => ����
 *            }
 *            
 *            �ʱⰪ ����   i=1
 *            ������ ���� ==> ���ǽ� i<=10 
 *            i�� ��� ���� i++ , i+=2 , i+=3.....
 */
// �������� �޾Ƽ� ==> ���� ���� ���� ��ŭ ���� ��� 
import java.util.*;
public class �ݺ���_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int user=0;
        int i=1;
        // ����� ��û�� ������ ������ ���� => while���� ����ϴ� ���� 
        
        // �������� �޴´� 
        Scanner scan=new Scanner(System.in);
        System.out.print("���� �Է�:");
        user=scan.nextInt();
        /*
         *   System.out.print()
         *   System.out.println()
         *   
         *   ABC System.out.print()
         *   A
         *   B
         *   C
         */
        while(i<=user)
        {
        	System.out.print("��");
        	i++; // user�� ������ �ɶ����� �������� 
        }
	}

}





