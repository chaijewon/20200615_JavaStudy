/*
 *   for => Ƚ���� ������ �ݺ��� 
 *   => UPDWON ���� 
 *   => ��ǻ�Ͱ� 1~100������ ���� �߻� 
 *   => ����ڰ� ���� ���ߴ� ���� 
 *      ��Ʈ => ����,���� 
 *      => ���� : 70
 *      => ����� : 60  
 *      => ����� : 75
 */
import java.util.*;// ����� �Է� 
/*
 *     1. ��ǻ�Ͱ� ���� �߻� (1~100)
 *             Math.random()
 *              0.0~0.99 * 100  ==> 0.0~99.0 + 1 
 *                                  (int)1.0~100.0
 *     =================
 *     2. ����� �Է� 
 *     3. �Է��ϸ� => ��Ʈ 
 *     4. ���Ῡ�� 
 *     =================
 */
public class �ݺ���_for7 {
   public static void main(String[] args) {
	   int com=(int)(Math.random()*100)+1; // 1~100���� ����
       // ���� => ���� ���� ���� 
	   Scanner scan=new Scanner(System.in);
	   int count=0;
	   for(;;)// ���ѷ��� => while(true)
	   {
		   // ����� �Է°��� �޴´� 
		   System.out.print("1~100������ ���� �Է�:");
		   int user=scan.nextInt();
		   if(user<1 || user>100)
		   {
			   System.out.println("�߸��� �Է��Դϴ�!!");
			   continue;// ó������ �ٽ� ���ư��� 
			   // for ==> ���������� �̵� 
		   }
		   
		   // ���������� �Է��� �� ����
		   count++;
		   // ��
		   if(com>user)
		   {
			   System.out.println("�Էµ� ������ ���� ���� �Է��ϼ���");
		   }
		   else if(com<user)
		   {
			   System.out.println("�Էµ� ������ ���� ���� �Է��ϼ���");
		   }
		   else
		   {
			   System.out.println("Game Over!!");
			   System.out.println("�Է�Ƚ��:"+count);
			   // ���� 
			   break;// for���� 
		   }
		   
	   }
	   System.out.println("���α׷� ����");
   }
}





