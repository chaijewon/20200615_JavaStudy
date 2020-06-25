/*
 *   �ݺ��� - for , while , do~while
 *     === ���α׷����� ���� 
 *     for : �ݺ� Ƚ���� �ִ� ��쿡 �ַ� ��� 
 *     while : �ݺ� Ƚ���� ���� ��쿡 �ַ� ���
 *       ===> for <=> while , �������ǹ� <=> ���ù�
 *     do~while : ������ ���߿� �˻� => �ѹ��̻��� �ݵ�� ���� 
 *     
 *     1) for 
 *        ����)
 *                    1.=>1���� ����  ==> i=1 
 *                    2.=>10�� �ɶ� ���� 
 *                    3.=>���� ==> i++
 *                  ======= ===== ===
 *              for(int i=1;i<=10;i++)
 *              {
 *                  �ݺ� ���๮�� : 10���� �����ϴ� ���� 
 *              }
 *              
 *              ==> �ʱⰪ , ���ǽ� , ���๮�� , ������
 *                         =====  =======  =====
 *                         = true => �ݺ�
 *                         = false => ���� 
 *                         
 *              ==> ���� ����
 *                  for(�ʱⰪ (����) ; ����(�񱳿�����,��������,����������);����(����))
 *                                   ====
 *                                   �ݵ�� (true/false)
 *                  => ��� ==> 1~10
 *                     for(int i=1;i<=10;i++)
 *                     ��� ==> 10~1
 *                     for(int i=10;i>=1;i--) ==> sort
 *                     
 *                  => for ������� 
 *                        
 *                      
 *                                false ==> for����
 *                          ��  ��    ��    ��    �� 
 *                     for(�ʱⰪ;  ���ǽ�;   ������)
 *                     {    (true) �� ��    ��
 *                            �ݺ� ���๮�� 
 *                     }
 *                         1 ==>  2  ==> 3  ==> 4
 *                                2  ==> 3  ==> 4
 *                                2  ==> 3  ==> 4
 *                               ===
 *                              false
 *                     ������ : ���ǽ��� false�� ������ ==> ���ѷ����� �ȴ� 
 *          
 */
public class �ݺ���_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1~10 ==> ��� 
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		// ����϶� ==> ��ɹ��� �ݺ� 
		
		System.out.println("=== �ݺ��� ===");
		for(int i=1;i<=100000;i++)
		{
			System.out.println(i);
		}
	}

}





