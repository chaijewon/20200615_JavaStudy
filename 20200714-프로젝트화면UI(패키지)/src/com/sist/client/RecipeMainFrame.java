package com.sist.client;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
/*
 *   �ڹ� ��Ű�� ==> java(JDK1.0~)=> Java,javax(JDK1.2~)=>Java2(SUN) , JDK1.8(Oracle)
 *         1.8 => JavaScript��ü ���� , ���ٽ�(�Լ�������) ->
 *                ===========
 *                 WEB������ ����� ���� ==> ES5 => ES6 => ES8
 *                                            ====== ���ٽ� 
 *                 JavaScript => �Լ�����           
 *                 function aaa(){
 *                 }
 *                 
 *                 const a=()=>{}
 *                 
 *       Java 
 *       Oracle 
 *       ===========
 *       HTML , CSS => ����
 *       JavaScript
 *       ===========
 *       JSP       => ����
 *       Spring    => ����  Annotation,XML,MyBatis,Hadoop,Spark,deep
 *       ===========
 *       ��Ʋ�� , �������� �˰��� (�̻����)
 *       
 *       
 *       ������ Ŭ���� ����ϴ� ��� 
 *         => ���� ==> �ִ� �״��(�������)
 *         => ��� ==> �ʿ��� �κ��� �����ؼ� ����� ���� (�������̵�)
 */
import com.sist.common.*;
public class RecipeMainFrame extends JFrame implements ActionListener{
    //JFrame f=new JFrame();
	//��ġ 
	CardLayout card=new CardLayout();
	Login login=new Login();
	JoinForm join=new JoinForm();
	RecipeManager rm=new RecipeManager();
	public RecipeMainFrame()
	{
		// GUI�� ȭ�� ������ , ���� �ʱ�ȭ ,�����ͺ��̽� ���� , �������� , ������ ����
		// Layout => ȭ�� ��ġ 
		setLayout(card);
		// ȭ�� �߰�
		add("RM",rm);
		add("LOGIN",login);
		add("JOIN",join);
		
		setSize(1024, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		login.b2.addActionListener(this);
		join.b3.addActionListener(this);
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        new RecipeMainFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2)
		{
			card.show(getContentPane(), "JOIN");
		}
		else if(e.getSource()==join.b3)
		{
			card.show(getContentPane(), "LOGIN");
		}
	}

}






