/*
 *    forEach : ���� for�� ==> ��¿� => web,mobile
 *                            =================== front-end 
 *    ========= 1) �迭 , 2) �÷��� ==> �����Ͱ� ���� �ִ� ����
 *    for(�������� ����:�迭,�÷���)
 */
public class �ݺ���_forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1,2,3,4,5};  // ==> arr  ==> arr[0],arr[1]
        
        for(int i=0;i<5;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        // ����� �Ҷ� ==> JDK 1.5�̻󿡼� 
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
	}

}
