/*
 *   5개의 정수를 보낸다 
 *   5개 정수=> SORT => 전송 
 *            ====
 *            select
 *            
 *   =========================
 *   1) 메소드 : 재사용 목적 (사용이 편리하게 제작)
 *             반복 제거 
 *             
 *      select()
 *      {
 *          오라클 연결 
 *          select문장 수행
 *          오라클 닫기
 *      }
 *      delete()
 *      {
 *          오라클 연결 
 *          delete문장 수행
 *          오라클 닫기
 *      }
 *      update()
 *      {
 *          오라클 연결 
 *          update문장 수행
 *          오라클 닫기
 *      }
 *      find()
 *      {
 *          오라클 연결 
 *          like문장 수행
 *          오라클 닫기
 *      }
 *      insert()
 *      {
 *          오라클 연결 
 *          insert문장 수행
 *          오라클 닫기
 *      }
 */
public class 자바메소드1 {
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
	// 내림차순의 메소드 
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
        // 호출 
		char[] arr={'A','B','D','E','C'}; // sort => 10,20,30,40,50
		System.out.println("정렬 전:");
		for(char i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n정렬 후:");
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



