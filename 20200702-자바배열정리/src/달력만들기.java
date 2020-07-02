/*
 *     ���α׷� 
 *     
 *     = ������ ����
 *       ���� ===> �迭,Ŭ���� 
 *     = ��ɹ� 
 *        ===> ��ɹ� ����  ==> �޼ҵ�
 *     ===========================
 *       ��ü ���� ���α׷� (Web)
 *      
 *    ============================================
 *     ������ ���� 
 *      �Ѱ�  ====> ����/���
 *      ������  ==>  �迭 
 *     ������ ó��(������� ��û) 
 *       ��� , ������ 
 *     ����� ���� ==> ���� , ������ , ������ , �ڵ���
 *                ====== �׽�Ʈ 
 *    ============================================ Ŭ����
 *    
 *    ==> �׽�Ʈ , ����ڰ� �Է°��� �߸��Ǹ� => ���� ����(�߰��� ���α׷�) 
 *           => 1) if 
 *              2) ����ó��
 */
// �� �� ==> �Է°�
import java.util.*;
public class �޷¸���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int year=0,month=0;
        Scanner scan=new Scanner(System.in);
        // �Է� 
        System.out.print("�⵵ �Է�:");
        year=scan.nextInt();
        
        System.out.print("�� �Է�:");
        month=scan.nextInt();
        
        // ��� 
        String[] strWeek={"��","��","ȭ","��","��","��","��"};
        
        System.out.println(year+"�⵵ "+month+"��");
        // if , switch ==> ��ü (�迭)
        for(String week:strWeek)
        {
        	System.out.print(week+"\t");
        }
        
        // ���� ���ϱ�
        /*
         *    2020 
         *    ���⵵������ �ѳ� ��  1��~2019.12.31
         *    7
         *    ���� ������ �� 2020.1.1 ~ 2020.6.30
         *    +1
         *    =============================== 
         */
        int total=(year-1)*365
        		 +(year-1)/4
        		 -(year-1)/100
        		 +(year-1)/400;
        // ���� 
        int[] lastDay={31,28,31,30,31,30,
        		       31,31,30,31,30,31};
        /*
         *    if(month==2)
         *       total+=31
         *     if(month==3)
         *       total+=31+28
         *     
         */
        if((year%4==0 && year%100!=0)||(year%400==0))// ���� => 2�� 29
        	lastDay[1]=29;
        else
        	lastDay[1]=28;
        
        for(int i=0;i<month-1;i++)
        {
        	total+=lastDay[i];
        }
        
        // 1������ ���� 
        total++;
        
        int week=total%7;
        // �޷� ��� 
        System.out.println();
        for(int i=1;i<=lastDay[month-1];i++)
        {
        	if(i==1)
        	{
        		for(int j=0;j<week;j++)
        		{
        		  System.out.print("\t");
        		}
        	}
        	System.out.printf("%2d\t",i);
        	week++;
        	if(week>6)
        	{
        		week=0;
        		System.out.println();
        	}
        }
	}

}





