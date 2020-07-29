package com.sist.client;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import com.sist.data.*;
import javax.swing.*;
import javax.swing.table.*;
import java.net.*;
public class ListForm extends JPanel implements MouseListener{
   JButton b1,b2,b3,b4,b5,b6;
   JTextField tf;
   JTable table;
   DefaultTableModel model;
   MovieDetailForm mdf=new MovieDetailForm();
   /*
    *    ��� => �޼ҵ� ==> ������ , �Ű����� 
    */
   public ListForm()
   {
	   setLayout(null);// FlowLayout => null ����� ���� ��ġ
	   b1=new JButton("����󿵿�ȭ");
	   b2=new JButton("����������ȭ");
	   b3=new JButton("�ڽ����ǽ�(�ְ�)");
	   b4=new JButton("�ڽ����ǽ�(����)");
	   b5=new JButton("�ڽ����ǽ�(����)");
	   b6=new JButton("�˻�");
	   tf=new JTextField(20);
	   JPanel p=new JPanel();
	   p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);p.add(b6);
	   p.setBounds(10, 25, 900, 35);
	   add(p);
	   String[] col={"��ȣ","","����","����","�帣","���"};
	   Object[][] row=new Object[0][5];
	   
	   // DefaultTableModel=> �������̵��� �޼ҵ尡 �ִ� (�͸��� Ŭ���� => ����Ŭ����)
	   /*
	    *     ���� Ŭ���� => ������ , ��Ʈ��ũ 
	    *     =========
	    *      class A
	    *      {
	    *          O P C V B
	    *          class B{  ===> ���Ŭ���� 
	    *          }
	    *      }
	    */
	   
	   model=new DefaultTableModel(row,col) {
        // ������ �Ұ��� 
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
	        // �̹��� ÷�� 
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
		   
	   };
	   
	   table=new JTable(model);
	   table.setRowHeight(50);
	   JScrollPane js=new JScrollPane(table);
	   
	   js.setBounds(10, 70, 700, 550);
	   add(js);
	   
	   mdf.setBounds(715,70 , 800, 650);
	   add(mdf);
	   movieAllData(1);
	   mdf.detailPrint(1);
	   
	   table.addMouseListener(this);
   }
   public void movieAllData(int cno)
   {
	   // ������ ������ ���� 
	   MovieManager m=new MovieManager();
	   ArrayList<MovieVO> list=m.movieAllData(cno);
	   
	   // ���̺� �ѹ� ����� 
	   // ���������� ����� 
	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }
	   
	   // ������ ��� 
	   /*
	    *    java.io,java.net ==> CheckException => �ݵ�� ����ó��
	    */
	   for(MovieVO vo:list)
	   {
		  try
		  {
			   URL url=new URL(vo.getPoster());//http:,c:\\image
			   Image img=ClientMainFrame.getImage(new ImageIcon(url),
					   50, 50);
			   Object[] data={
					 vo.getMno(),
					 new ImageIcon(img),
					 vo.getTitle(),
					 vo.getDirector(),
					 vo.getGenre(),
					 vo.getGrade()
			   };
			   model.addRow(data);
		  }catch(Exception ex){ex.printStackTrace();}
	   }
   }
   
   public void movieFindData(String ss)
   {
	   // ������ ������ ���� 
	   MovieManager m=new MovieManager();
	   ArrayList<MovieVO> list=m.movieFindData(ss);
	   
	   // ���̺� �ѹ� ����� 
	   // ���������� ����� 
	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }
	   
	   // ������ ��� 
	   /*
	    *    java.io,java.net ==> CheckException => �ݵ�� ����ó��
	    */
	   for(MovieVO vo:list)
	   {
		  try
		  {
			   URL url=new URL(vo.getPoster());//http:,c:\\image
			   Image img=ClientMainFrame.getImage(new ImageIcon(url),
					   50, 50);
			   Object[] data={
					 vo.getMno(),
					 new ImageIcon(img),
					 vo.getTitle(),
					 vo.getDirector(),
					 vo.getGenre(),
					 vo.getGrade()
			   };
			   model.addRow(data);
		  }catch(Exception ex){ex.printStackTrace();}
	   }
   }
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==table)
	{
		if(e.getClickCount()==2)
		{
			int row=table.getSelectedRow();
			String mno=model.getValueAt(row, 0).toString();
			mdf.detailPrint(Integer.parseInt(mno));
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
}









