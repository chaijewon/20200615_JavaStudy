package com.sist.temp;
import java.awt.*;
import javax.swing.*;
public class ReserveForm extends JFrame{
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JPanel p3=new JPanel();
    JPanel p4=new JPanel();
    JPanel p5=new JPanel();
    JPanel p6=new JPanel();
    public ReserveForm()
    {
    	p1.setBackground(Color.black);
    	p2.setBackground(Color.cyan);
    	p3.setBackground(Color.blue);
    	p4.setBackground(Color.yellow);
    	p5.setBackground(Color.green);
    	p6.setBackground(Color.orange);
    	
    	setLayout(null);
    	p1.setBounds(10, 15, 350, 650);
    	p2.setBounds(365, 15, 350, 650);
    	p3.setBounds(720, 15, 450, 650);
    	p4.setBounds(1175, 15, 400, 900);
    	p5.setBounds(10, 670, 600, 250);
    	p6.setBounds(615, 670, 555, 250);
    	add(p1);
    	add(p2);
    	add(p3);
    	add(p4);
    	add(p5);
    	add(p6);
    	setSize(1600, 1000);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new ReserveForm();
	}

}
