// ���� 
public class �迭_�󵵼���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10]; // 1~9
        int[] count=new int[10];
        // �ʱⰪ
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*10);
        }
        
        // ��� => �󵵼� ����� ������ 
        for(int i:arr)
        {
        	System.out.print(i);
        }
        
        System.out.println("\n===== ��� =====");
        // 6786911263
        for(int i=0;i<arr.length;i++)
        {
        	count[arr[i]]++;
        	
        	// count[0]  ~  count[9] ==> 0
        	// count[6]=1 count[7]=1 count[8]=1
        	/*
        	 *  count[6]=1 => count[6]=2
        	 */
        }
        
        //���
        for(int i=0;i<arr.length;i++)
        {
        	if(count[i]!=0)
        	{
        	  System.out.println(i+"����:"+count[i]);
        	}
        }
	}

}




