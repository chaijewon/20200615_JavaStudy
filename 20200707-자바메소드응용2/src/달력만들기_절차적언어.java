/*
 *     �������� �ڵ� => ����ȭ��  �ڵ�(�޼ҵ�)
 *     ==========   ��ɺ��� ��� ����� ���� (����,�ڵ��� �ߺ��� ����)
 *                                       ===== ����,�߰� ���ϰ� ����� ���α׷�
 *                                       
 *     1. ����ڷκ��� �⵵,���� �޴´� 
 *     2. ������ ���Ѵ� ==> ����ȭ 
 *     3. �ش���Ϻ��� �޷��� ����Ѵ� 
 */
import java.util.*;
public class �޷¸����_��������� {
    static void process(int year,int month)
    {
    	//System.out.println(year+"�⵵ "+month+"��");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. ����� �Է°� �ޱ�
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		// �Էµ� �����͸� �޸𸮿� ���� 
		int year=scan.nextInt();
		
		System.out.print("�� �Է�:");
		// �Էµ� �����͸� �޸𸮿� ���� 
		int month=scan.nextInt();
		// ����� year,month => main�� ���������� ����� ����
		// ���������� �ٸ� �޼ҵ忡�� ����Ҷ��� ==> �Ű������� �̿��ؼ� ���� 
		
		//2. ���� ���ϱ�
		// 1) ���⵵������ �ѳ� �� (year-1) 2020 => 1.1.1~2019.12.31
		int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400;
		// 2) ���ޱ����� �� ���� 
		// 3 ==> total+31+28
		// 4 ==> total+31+28+31
		int[] lastDay={
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
		
		// ��û ��¥ �����̸� => lastDay[1]=29
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		
		// ��û�� ���� 1������ ���� ���ϱ�
		total++;
		
		// ���� ���ϱ� 
		int week=total%7;
		// 1�⵵ 1�� 1�� => ��
		
		// ��� (�޷�)
		System.out.println(year+"�⵵ "+month+"��");
		
		/*System.out.print("��\t");
		System.out.print("��\t");
		System.out.print("ȭ\t");
		System.out.print("��\t");
		System.out.print("��\t");
		System.out.print("��\t");
		System.out.print("��\t");
		*/
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		for(int i=0;i<7;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		
		System.out.println("\n\n");
		
		// �޷� ���
		for(int i=1;i<=lastDay[month-1];i++)
		{
			// ���� 
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			// 1���� ��� 
			System.out.printf("%2d\t",i);
			// ���� ����
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
		
		
	}

}






