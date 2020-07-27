package com.sist.collection;

import java.util.ArrayList;

/*
 *    Collection 
 *    =========== �ڷᱸ�� 
 *    �޸� �����ؼ� ���� ���ϰ� ����� ���� 
 *    => ���Ǵ� ���α׷� : ����� => CURD => ���� (�޸�) <=> ����
 *                                    => ��� ������ ������ ���� 
 *                                    10
 *                                    10.5
 *                                    "aaa"
 *                                    "ccc"
 *                                    'A'
 *                                    100
 *                                    "bbb"
 *                                    "ccc"
 *                                    10.5
 *                                    'K'
 *                              CURD => �б�,���� , ���� , ���� 
 *                                      ���� ����
 *                             ���̺귯�� => ��� ������ ���� => ǥ��ȭ
 *                             �б� : get(0)
 *                             ���� : size()
 *                             ���� : set()
 *                             ���� : remove()
 *                             ���� : add()
 *    => ������ => �迭 
 *    => ���� 
 *    1) ������ ���� �ߺ��� ������ �߰� 
 *       List(�������̽�) ======> �����ͺ��̽� 
 *         => ������ Ŭ���� 
 *         ***ArrayList : �񵿱�
 *         ***Vector  : ���� 
 *         LinkedList
 *         Queue
 *         Stack
 *    2) ������ ���� �ߺ��� ���� ������ �߰� ====> Ž���� 
 *       Set
 *         HashSet
 *         TreeSet
 *    3) Ű,������ ==> �ΰ��� ���ÿ� ����  ===> Ŭ���� ���� (Spring)
 *       Map
 *         Hashtable
 *         ***HashMap
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
		/*
		 * // �߰� list.add(10);//0 list.add(10.5);//1 list.add("ȫ�浿");//2
		 * list.add('A');//3 // �� �б� int a=(int)list.get(0); double
		 * d=(double)list.get(1); String s=(String)list.get(2); char
		 * c=(char)list.get(3);
		 * 
		 * System.out.println(a); System.out.println(d); System.out.println(s);
		 * System.out.println(c);
		 *  {"","","","",""}
		 */
        list.add("ȫ�浿");//0
        // list.add("������"); 1
        list.add("��û��");//2
        list.add("�̼���");//2
        list.add("�ڹ���");//3 2
        list.add("������");//4 3
        
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
        
        list.remove(2);
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
        
        list.add(1, "������");// �ε�����ȣ = 1�� ���� 
        /*       ==> 3 �߰�
         *    0      0
         *    1      1
         *    2      2
         *    3      => 3�߰�
         *    4      4
         *           5
         *           
         *       ==> 2����
         *    0       0
         *    1       1
         *    2      ==> ����
         *    3       2
         *    4       3
         */
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
	}

}








