//=> 1~100������ ==> ¦���� ��,Ȧ���� �� 
//=> 1~100���� ==> 3�� ����� �� , 5�� ����� �� , 7����� ���� ��� 
//=> 100~999���� ==> 7�� ����� ����
//=> 1-2+3-4+5-6+7-8+9-10
public class �ݺ���_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int odd=0,even=0;
        for(int i=1;i<=100;i++)
        {
        	if(i%2==0)
        		even+=i;
        	else
        		odd+=i;
        }
        System.out.println("1~100���� ¦�� ��:"+even);
        System.out.println("1~100���� Ȧ�� ��:"+odd);
        
        int a3=0,a5=0,a7=0;
        for(int i=1;i<=100;i++)
        {
        	if(i%3==0)
        		a3+=i;
        	if(i%5==0)
        		a5+=i;
        	if(i%7==0)
        		a7+=i;
        }
        System.out.println("1~100���� 3�� ��� ��:"+a3);
        System.out.println("1~100���� 5�� ��� ��:"+a5);
        System.out.println("1~100���� 7�� ��� ��:"+a7);
        
        int count=0;
        for(int i=100;i<=999;i++)
        {
        	if(i%7==0)
        		count++;
        }
        System.out.println("100~999���� 7�� ��� ����:"+count);
	    System.out.println(1-2+3-4+5+6+7+8+9-10);
	    // 2+7+8+9+1+10+11+100
	    // �� �� �� �� �� ��
	    /*
	     *   �ڡ�  �� �� ����
	     *   �� �� �� �� �� �� �� �� �� �� �� ���� �� �� �� �� ���� �� �� �� �� ���� �� �� �� �� ��
	     *   
	     *   for(int i=1;i<=6;i++)
	     *   {
	     *      if(i==1)
	     *        System.out.print("��")
	     *      if(i==2)
	     *        System.out.print("��")
	     *      if(i==3)
	     *        System.out.print("��")
	     *      if(i==4)
	     *        System.out.print("��")
	     *      if(i==5)
	     *        System.out.print("��")
	     *      if(i==6)
	     *        System.out.print("��")
	     *   }
	     *   
	     *   System.out.print("��")
	     *   System.out.print("��")
	     *   System.out.print("��")
	     *   System.out.print("��")
	     *   System.out.print("��")
	     *   System.out.print("��")
	     *   
	     *   �ڡڡ١ڡڡ١ڡڡ١ڡڡ�
	     *   �ڡڡڡ١١ڡڡ١ڡڡڡڡ�
	     *   
	     */
	    // ���� 
	    int sum=0;
	    for(int i=1;i<=10;i++)
	    {
	    	if(i%2==0)
	    		sum-=i;
	    	else
	    		sum+=i;
	    }
	    System.out.println("1-2+3-4+5-6+7-8+9-10:"+sum);
	    // �ڡڡ١ڡڡ١ڡڡ١ڡڡ�
	    for(int i=1;i<=12;i++)
	    {
	    	if(i%3==0)
	    		System.out.print("��");
	    	else
	    		System.out.print("��");
	    }
	}

}




