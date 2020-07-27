package com.sist.lib;
/*
 *    ArrayList ���� , Vector���� , Map
 *    
 *         List
 *         ====
 *          |
 *      ----------------------------
 *      ���ټ� => ������ ã�Ƽ� ��� 
 *      ArrayList Vector LinkedList
 *      --------- ------
 *        ����ȭ/�񵿱�ȭ 
 */
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //ArrayList<String> names=new ArrayList<String>();
		//Vector<String> names=new Vector<String>();
		LinkedList<String> names=new LinkedList<String>();
        // => �޸𸮾ȿ���  => ���ڿ��� ���� 
        names.add("ȫ�浿"); // 0
        names.add("��û��"); // 1
        names.add("�̼���"); // 2
        names.add("������"); // 3
        names.add("������"); // 4
        
        System.out.println("����� ����:"+names.size());
        // ��� 
        for(int i=0;i<names.size();i++)
        {
        	// �����͸� ���� �� 
        	String name=names.get(i);
        	// ���ϴ� ��ġ�� ����� ������ �б� 
        	
        	System.out.println(name+":"+i);// �ε����� �ڵ� ���� => 0�� ���� ���� 
        }
        
        // ���ϴ� ��ġ�� ��� 
        // add() => 5
        // add(index,"��")
        names.add(3,"��������");
        /*
         *    names.add("ȫ�浿"); // 0
              names.add("��û��"); // 1
              
              names.add(3,"��������");//2
              names.add("������"); // 3
              names.add("������"); // 4
         */
        for(int i=0;i<names.size();i++)
        {
        	// �����͸� ���� �� 
        	String name=names.get(i);
        	// ���ϴ� ��ġ�� ����� ������ �б� 
        	
        	System.out.println(name+":"+i);// �ε����� �ڵ� ���� => 0�� ���� ���� 
        }
        
        // ���� 
        names.remove(2);
        for(int i=0;i<names.size();i++)
        {
        	// �����͸� ���� �� 
        	String name=names.get(i);
        	// ���ϴ� ��ġ�� ����� ������ �б� 
        	
        	System.out.println(name+":"+i);// �ε����� �ڵ� ���� => 0�� ���� ���� 
        }
        
        // ���� 
        names.set(2, "�ڹ���");
        for(int i=0;i<names.size();i++)
        {
        	// �����͸� ���� �� 
        	String name=names.get(i);
        	// ���ϴ� ��ġ�� ����� ������ �б� 
        	
        	System.out.println(name+":"+i);// �ε����� �ڵ� ���� => 0�� ���� ���� 
        }
        
        names.clear();// ��ü ���� 
        System.out.println("����� ����:"+names.size());
	}

}






