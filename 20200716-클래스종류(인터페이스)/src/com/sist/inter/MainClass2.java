package com.sist.inter;
/*
 *    �ڹٿ��� ������ �������̽� 
 *    1. Window (javax.swing)
 *       ActionListener : ��ư,�޴� , text���� ���� 
 *         = actionPerformed()
 *       MouseListener : ���콺 ����, JTable , JTree , JLabel
 *         = mouseClicked()
 *         = mouseReleased()
 *         = mousePressed()
 *         = mouseEntered()
 *         = mouseExited()
 *       MouseMotionListener 
 *         = mouseMoveed()
 *         = mouseDrgged()
 *       KeyListener :  Ű���� 
 *         = keyPressed()
 *         = keyReleased()
 *         = keyTyped()
 *       FocusListener
 *         = focusLost()
 *         = focusGained()
 *       ItemListener 
 *         = ComboBox , JList
 *         = itemStateChanged()
 *    ===========================
 *    2. �����ͺ��̽� ���� 
 *       Connection 
 *       Statement
 *       ResultSet  
 *    ===========================
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass2 extends JFrame implements 
ActionListener,MouseListener,ItemListener{
    JButton b1;
    JTextField tf;
    JLabel la;
    JComboBox box;
    // �ʱ�ȭ => �޸𸮿� ���� (������)
    public MainClass2()
    {
    	b1=new JButton("Ŭ��");
    	tf=new JTextField();
    	la=new JLabel(new ImageIcon("c:\\javaDev\\air.png"));
    	box=new JComboBox();
    	box.addItem("ȫ�浿");
    	box.addItem("�ڹ���");
    	box.addItem("�̼���");
    	// JFrame => BorderLayout 
    	add("West",b1);
    	add("Center",la);
    	add("South",tf);
    	add("North",box);
    	// East,West
    	
    	// ȭ�� ũ��
    	setSize(450, 500);
    	setVisible(true);
    	
    	// �̺�Ʈ ��� 
    	// => b1�̶�� ��ư�� Ŭ���ϸ� => actionPerformed() ȣ�� 
    	b1.addActionListener(this);// this => �ڽ� (MainClass2) actionPerformed()
    	tf.addActionListener(this);// actionPerformed()
    	la.addMouseListener(this);//
    	box.addItemListener(this);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass2();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la)
		{
			if(e.getClickCount()==2)
			{
				JOptionPane.showMessageDialog(this, "�󼼺���� �̵�");
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(this, "��ư Ŭ��!!");
		}
		else if(e.getSource()==tf)//Enter
		{
			String msg=tf.getText();
			JOptionPane.showMessageDialog(this, msg);
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name=(String)box.getSelectedItem();
			JOptionPane.showMessageDialog(this, name);
		}
	}
	
}






