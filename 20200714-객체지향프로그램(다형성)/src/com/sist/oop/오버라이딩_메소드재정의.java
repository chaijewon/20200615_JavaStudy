package com.sist.oop;
/*
 *   �������̵� 
 *   ========
 *   1. �ݵ�� ��Ӱ��� 
 *   2. �޼ҵ���� ���� 
 *   3. �Ű������� ���� (����,��������)
 *   4. �������� ����
 *   5. ����������� Ȯ�� , ����� �� ����
 *      ========
 *      public > protected > default > private 
 *      ================================================
 *                ���� Ŭ����  ���� ��Ű��   �ٸ� ��Ű��  ��� Ŭ����
 *                                    ���
 *      ================================================
 *      private      O        X         X
 *      ================================================
 *      default      O        O         X
 *      ================================================
 *      protected    O        O         O
 *      ================================================
 *      public       O        O         O         O
 *      ================================================
 *      
 *      => class A
 *         {
 *            private void display(){}
 *         }
 *         class B extends A
 *         {
 *            1. private void display(){}
 *            2. void display(){}
 *            3. protected void display(){}
 *            4. public void display(){}
 *         }
 *         
 *         class A
 *         {
 *             private int a;
 *             // setter/getter
 *         }
 *         class B
 *         {
 *             
 *         }
 */
public class �������̵�_�޼ҵ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
