/*
 *     'A'+'B' 
 *     ===  == 66
 *     ������ȯ => 65
 *     65+66 => 131 (int)  char,short,byte => ���� => ����� int
 *     
 *     'ȫ'+'ȫ' 
 *     
 *     *** ������ : ���������� �ʰ��ϸ� error�� �ƴ϶� �����÷ο��� �߻� 
 *     
 *     ��)  int ==> 1~10    11 => 1
 *     
 *         -128~127  ==> 128 ==> 
 *          ====================
 *           0 1 1 1 1 1 1 1  ===> 127�� ��ǻ�Ϳ� ����  
 *          ====================
 *           1 0 0 0 0 0 0 0  ===> 
 *           
 *           128 64 32 16 8 4  2 1
 *            1   0  0  0 0 0  0 0
 *            
 *            
 *          10+10.5  ==> double
 *          ==
 *          10.0  ==> ���� ���������� ������ ���� 
 *          
 *          'A'+1 ==> int
 *          ===
 *           65
 *           
 *          ��������ȯ 
 *            (int)(10.5+10.5)
 *                 ============
 *                    1=> 21.0 ==> 21
 *            (int)10.5+(int)10.5 ==> 20
 *            ========= ==========
 *               10        10
 *                     +
 */
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // %  ==> double+int+char ==> double
		int a=5;
		int b=2;
		
		System.out.println(a%b);// 5%2 ==> 1+4/2
		System.out.println(-a%b);// -5%2 ==> -1-4/2
		System.out.println(a%-b);// 5%-2 ==> 1
		System.out.println(-a%-b);// -5%-2 ==> -1
		
		System.out.println((int)(10.5+10.5));
		System.out.println((int)10.5+(int)10.5);
	}

}
