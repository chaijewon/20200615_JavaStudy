/*
 *  => �迭 ���� 
 *     ��������[] �迭��;
 *  => �迭 �ʱ�ȭ (�޸𸮾ȿ� ���� ����)
 *     ��)
 *         int[] arr={10,20,30,40,50}; // ���� ���ÿ� �ʱⰪ 
 *         int[] arr=new int[5]; // �޸� ������ ���� => ���߿� ���� ä��� 
 *         int[] arr; // ����
 *         arr[0]=10;
 *         arr[1]=20;
 *         ....
 *         ....
 *         ===========================
 *         Ȱ�� => ��� (for,while)
 *         
 *         for => ���� 
 *         for-each => ��� ��� 
 */
public class �迭���ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ��� 
		String[] names={"ȫ�浿","�ڹ���","�̼���","������","��û��"};
		// ��� 
		// length => �迭�� ����� ���� 
		for(int i=0;i<names.length;i++)
		{
			//names[1]="";
			// �����Ͱ��� ������ ���� 
			System.out.println(names[i]);// names[0]~names[4]
		}
		System.out.println("===== for-each =====");
		for(String name:names)
		{
			// ������ �Ұ��� => ȭ�鿡 ��¸� ��� 
			System.out.println(name);
		}
	}

}






