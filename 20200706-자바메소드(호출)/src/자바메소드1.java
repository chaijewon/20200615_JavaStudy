/*
 *   ���α׷� (����� ������ + ��ɹ�)
 *   ���� ==> �迭 ==> Ŭ���� ==> ���� ==> �����ͺ��̽� 
 *   ===========
 *   ��ɹ� ==> �޼ҵ� (�Ѱ��� ���) ==> Ŭ���� ==> ��Ű�� ==> .jar(���̺귯��)
 *   ========                     
 *   
 *   �޼ҵ� 
 *     = ����� ���� �޼ҵ� 
 *        = ����)
 *               ��ȯ�� �޼ҵ��(�Ű�����...)
 *               {
 *                   return ��;  => ��=��ȯ��
 *                   ��ȯ���� ���� ��쿡�� => void , return�� ������ ���� 
 *               }
 *               ==> �޼ҵ�ȿ��� ó�� => ���
 *                   ====> �Ϲ� ����
 *               ==> �޼ҵ�ȿ��� ó�� => ������� ���� �� �� �ִ� 
 *                   ====> �� , ������ 
 *                   
 *         = ȣ��)
 *             �޼ҵ带 ȣ���Ҷ��� 
 *               �޼ҵ��(��,��)
 *               
 *             => void method(int a,int b)
 *                => method(10,20) 
 *             �޼ҵ带 ȣ���ϰ� ==> �޼ҵ尡 ������ ����(return)
 *               => �ٽ� ȣ��� ��ġ�� ���� �´� 
 *               
 *             => int method()
 *                => ȣ�� 
 *                   int a=method()
 *                   
 *             => String method(int a)
 *                => ȣ�� 
 *                   String s=method(10)
 *                   
 *             => double method(int a)
 *                => ȣ�� 
 *                   double d=method(10)  => int a=10
 *                   
 *                   
 *             => double random()
 *             => String substring(int s,int e)
 *             => boolean equals(String s)
 *             => void println()
 *             
 *                 ��ȯ��(������)   �Ű�����
 *             ==========================
 *                     O            O    String substring(int s,int e)
 *             ==========================
 *                     O            X    int length()
 *                                       double random()
 *             ==========================
 *                     X(void)      O    System.out.println(String s)    
 *             ==========================
 *                     X(void)      X    System.out.println()
 *                                       => �����ٿ� ��� 
 *             ==========================
 *              
 *     = ���̺귯�� �޼ҵ� 
 *     ================ + 
 *   �޼ҵ� : Ư�� �۾��� �����ϱ� ���� ��ǻ���� ��ɹ��� ����
 *          *** �Ѱ��� �ϸ� ���� 
 *          *** ����ȭ �۾� 
 *              ======== ������ ���� ==> import
 *              ���� : ���뼺 , �ߺ��� �ڵ� ����
 *              ���� : ����ȭ (�ܶ�(���)) 
 *          
 *          ��) ���� �߱� ���� 
 *             = 3�ڸ� ������ ���� �߻�
 *             = ����ڿ��� �Է��� ��û 
 *             = ������ ����� �Է°��� ��
 *             = ��Ʈ 
 *             = ������ ��쿡 ����
 *             = �ٽ� ������ ���� ���� Ȯ�� 
 */
// ���� ����) => �޼ҵ尡 �����ؾ� => �ٸ� ������ �����Ѵ� 
/*
 *     1) ��� ��� 
 *     2) ã��(�˻�)
 *     3) ���� 
 *     4) ����
 *     5) �߰� 
 *     6) �󼼺���
 *     ==> �Ǹ�
 */
public class �ڹٸ޼ҵ�1 {
    static void aaa()
    {
    	System.out.println("aaa() ȣ�� ����...");//1
    	bbb();// bbb() �̵�
    	System.out.println("aaa() ȣ�� ����...");//8
    }
    static void bbb()
    {
    	System.out.println("bbb() ȣ�� ����...");//2
    	ccc();// ccc() �̵� 
    	System.out.println("bbb() ȣ�� ����...");//7
    }
    static void ccc()
    {
    	System.out.println("ccc() ȣ�� ����...");//3
    	ddd();// ddd() �̵�
    	System.out.println("ccc() ȣ�� ����...");//6
    }
    static void ddd()
    {
    	System.out.println("ddd() ȣ�� ����...");// 4
    	System.out.println("ddd() ȣ�� ����...");// 5
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        aaa();// �����ϴ� �޼ҵ带 ȣ�� (�������� ȣ��)
	}

}






