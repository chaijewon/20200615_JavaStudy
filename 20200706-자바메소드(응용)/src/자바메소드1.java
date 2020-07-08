/*
 *   5���� ������ ������ 
 *   5�� ����=> SORT => ���� 
 *            ====
 *            select
 *            
 *   =========================
 *   1) �޼ҵ� : ���� ���� (����� ���ϰ� ����)
 *             �ݺ� ���� 
 *             
 *      select()
 *      {
 *          ����Ŭ ���� 
 *          select���� ����
 *          ����Ŭ �ݱ�
 *      }
 *      delete()
 *      {
 *          ����Ŭ ���� 
 *          delete���� ����
 *          ����Ŭ �ݱ�
 *      }
 *      update()
 *      {
 *          ����Ŭ ���� 
 *          update���� ����
 *          ����Ŭ �ݱ�
 *      }
 *      find()
 *      {
 *          ����Ŭ ���� 
 *          like���� ����
 *          ����Ŭ �ݱ�
 *      }
 *      insert()
 *      {
 *          ����Ŭ ���� 
 *          insert���� ����
 *          ����Ŭ �ݱ�
 *      }
 */
public class �ڹٸ޼ҵ�1 {
	/*
	 *     10 40 30 50 20
	 *     == ==
	 *     10 40
	 *     ==    ==
	 *     10    30
	 *     ==       ==
	 *     10       50
	 *     ==          ==
	 *     10          20
	 *     ================> for => i=0
	 *     10 40 30 50 20
	 *        == ==
	 *        30 40
	 *        ==    ==
	 *        30    50
	 *        ==       ==
	 *        20       30
	 *     ================> for => i=1
	 *     10 20 40 50 30
	 *           == ==
	 *           40 50
	 *           ==    ==
	 *           30    40
	 *     =================> for => i=2
	 *     10 20 30 50 40
	 *              == ==
	 *              40 50
	 *     =================> for => i=3
	 *     10 20 30 40 50
	 *     
	 *     
	 */
	// ���������� �޼ҵ� 
    static char[] sort(char[] arr,String type)
    {
    	// sort
    	for(int i=0;i<arr.length-1;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    		  if(type.equals("ASC"))
    		  {
    			if(arr[i]>arr[j])
    			{
	    			char temp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
    			}
    		  }
    		  if(type.equals("DESC"))
    		  {
    			if(arr[i]<arr[j])
    			{
	    			char temp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
    			}
    		  }
    		}
    	}
    	return arr;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ȣ�� 
		char[] arr={'A','B','D','E','C'}; // sort => 10,20,30,40,50
		System.out.println("���� ��:");
		for(char i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n���� ��:");
		/*
		 *   for(int i=0;i<arr.length-1;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    		  if(type.equals("ASC"))
    		  {
    			if(arr[i]>arr[j])
    			{
	    			char temp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
    			}
    		  }
    		 
    		}
    	}
		 */
		char[] result=sort(arr,"ASC");
		for(char i:result)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		/*
		 *   for(int i=0;i<arr.length-1;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    		  
    		  if(type.equals("DESC"))
    		  {
    			if(arr[i]<arr[j])
    			{
	    			char temp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
    			}
    		  }
    		}
    	}
    	
    	Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
        Image.SCALE_SMOOTH);
		 */
		result=sort(arr,"DESC");
		for(char i:result)
		{
			System.out.print(i+" ");
		}
	}

}



