// switch ��ø 
/*
 *    if(���ǹ�)
 *    {
 *       if(���ǹ�)
 *       {
 *       }
 *       else
 *       {
 *       }
 *    }
 *    
 *    switch(����)
 *    {
 *       case 1:
 *         switch(����)
 *         {
 *           case 'A':
 *         }
 *    }
 *    
 *    => computer => ���� 
 *                      = ����
 *                      = ����
 *                      = ��
 */
import java.util.*;
public class ���ù�6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int user=0;
        int com=(int)(Math.random()*3); // 0,1,2
        //            =============
        /*                  1      =
         *                         2
         *      =====
         *        3
         *        
         *        1. Math.random() => 0.0~0.99 => 0~2
         *        0 : ����
         *        1 : ����
         *        2 : ��
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("����(0),����(1),��(2):");
        
        user=scan.nextInt();
        
        // ����� ��� 
        /*
        switch (com) {
		case 0:
			switch(user)
			{
			case 0:
				System.out.println("��ǻ��:����,�����:����");
				System.out.println("����!!");
				break;
			case 1:
				System.out.println("��ǻ��:����,�����:����");
				System.out.println("����� Win!!");
				break;
			case 2:
				System.out.println("��ǻ��:����,�����:��");
				System.out.println("��ǻ�� Win!!");
				break;
			}
			break;
        case 1:
        	switch(user)
			{
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			}
			break;
        case 2:
        	switch(user)
			{
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			}
	        break;
		}
		*/
        String[] str= {"����","����","��"};
        System.out.println("��ǻ��:"+str[com]
        		     +",�����:"+str[user]);
        switch(com-user)
        {
        case 2: case -1:
        	System.out.println("����� Win!!");
        	break;
        case 1: case -2:
        	System.out.println("��ǻ�� Win!!");
        	break;
        case 0:
        	System.out.println("����!!");
        }
        
	}

}




