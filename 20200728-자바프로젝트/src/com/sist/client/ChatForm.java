package com.sist.client;
import java.awt.Color;
// 1465, 200
import javax.swing.*;
import javax.swing.table.*;
public class ChatForm extends JPanel{
   JTextPane ta;
   JTextField tf;
   JComboBox box;
   JTable table;
   DefaultTableModel model;
   JButton b1,b2;
   public ChatForm()
   {
	   //setBackground(Color.yellow);
	   setLayout(null);
	   ta=new JTextPane();
	   ta.setEditable(false);
	   JScrollPane js=new JScrollPane(ta);
	   js.setBounds(10, 15, 850, 140);
	   add(js);
	   tf=new JTextField();
	   tf.setBounds(10, 160, 740, 30);
	   add(tf);
	   
	   box=new JComboBox();
	   box.addItem("black");
	   box.addItem("red");
	   box.addItem("blue");
	   box.addItem("green");
	   box.addItem("gray");
	   box.addItem("yellow");
	   box.addItem("cyan");
	   
	   box.setBounds(755, 160, 105, 30);
	   add(box);
	   
	   String[] col={"ID","대화명","성별"};
	   String[][] row=new String[0][3];
	   model=new DefaultTableModel(row,col);
	   table=new JTable(model);
	   JScrollPane js1=new JScrollPane(table);
	   js1.setBounds(865, 15, 500, 135);
	   add(js1);
	   
	   JPanel p=new JPanel();
	   b1=new JButton("정보보기");
	   b2=new JButton("쪽지보내기");
	   p.add(b1);
	   p.add(b2);
	   p.setBounds(865, 155, 500, 35);
	   add(p);
	   
   }
}







