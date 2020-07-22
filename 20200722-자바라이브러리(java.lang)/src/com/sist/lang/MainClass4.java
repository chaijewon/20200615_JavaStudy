package com.sist.lang;
// totString() => Ŭ���� ��ü�� ���ڿ��� ��ȯ  String toString()
// clone => Object clone()
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
/*
 *   �������̽� 
 *     = ���� => ��������� =====> public static final
 *              int a=10;
 *     = �޼ҵ� => �߻�޼ҵ� ====> public abstract 
 *               ========
 *               void display();
 *               ������ �ȵ� �޼ҵ� ==> �޸� �Ҵ��� �Ұ��� 
 *               
 *     = ���߻���� ���� 
 *     = ���� �ٸ� Ŭ������ ������ ���� 
 *     
 *                extends
 *     = �������̽� =======> �������̽� ��� 
 *                implements
 *     = �������̽� =======> Ŭ���� ���
 */
public class MainClass4 extends JFrame implements MouseListener{
    JTable table;
    DefaultTableModel model;
    public MainClass4()
    {
    	String[] col= {"�̸�","����","�ּ�"};
    	String[][] row=new String[0][3];
    	
    	model=new DefaultTableModel(row,col) {
    		// �޼ҵ� ������ => Ŭ���ÿ� ���� ���� 
    		public boolean isCellEditable(int r,int c)
    		{
    			return false;
    		}
    	};
    	
    	table=new JTable(model);// MV
    	JScrollPane js=new JScrollPane(table);
    	/*
    	 *   <table>
    	 *     <tr>
    	 *       <td></td>
    	 *       <td></td>
    	 *       <td></td>
    	 *     </tr>
    	 *   </table>
    	 */
    	add("Center",js);
    	for(int i=0;i<10;i++)
    	{
    	  String[] data= {"ȫ�浿"+(i+1),"30","����"};
    	  model.addRow(data);
    	}
    	// toString() , (String)
    	setSize(350, 400);
    	setVisible(true);
    	
    	table.addMouseListener(this);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass4();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)//���� Ŭ��
			{
				int row=table.getSelectedRow();
				String name=model.getValueAt(row, 0).toString();
				String age=model.getValueAt(row, 1).toString();
				String addr=model.getValueAt(row, 2).toString();
				String data="�̸�:"+name+"\n"
						   +"����:"+age+"\n"
						   +"�ּ�:"+addr;
				JOptionPane.showMessageDialog(this, data);
				
				//Object obj=true;
				//boolean bCheck=(boolean)obj;
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
