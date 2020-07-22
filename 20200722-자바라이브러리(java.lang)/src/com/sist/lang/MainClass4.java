package com.sist.lang;
// totString() => 클래스 객체를 문자열로 변환  String toString()
// clone => Object clone()
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
/*
 *   인터페이스 
 *     = 변수 => 상수형변수 =====> public static final
 *              int a=10;
 *     = 메소드 => 추상메소드 ====> public abstract 
 *               ========
 *               void display();
 *               구현이 안된 메소드 ==> 메모리 할당이 불가능 
 *               
 *     = 다중상속이 가능 
 *     = 서로 다른 클래스를 연결이 가능 
 *     
 *                extends
 *     = 인터페이스 =======> 인터페이스 상속 
 *                implements
 *     = 인터페이스 =======> 클래스 상속
 */
public class MainClass4 extends JFrame implements MouseListener{
    JTable table;
    DefaultTableModel model;
    public MainClass4()
    {
    	String[] col= {"이름","나이","주소"};
    	String[][] row=new String[0][3];
    	
    	model=new DefaultTableModel(row,col) {
    		// 메소드 재정의 => 클릭시에 편집 방지 
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
    	  String[] data= {"홍길동"+(i+1),"30","서울"};
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
			if(e.getClickCount()==2)//더블 클릭
			{
				int row=table.getSelectedRow();
				String name=model.getValueAt(row, 0).toString();
				String age=model.getValueAt(row, 1).toString();
				String addr=model.getValueAt(row, 2).toString();
				String data="이름:"+name+"\n"
						   +"나이:"+age+"\n"
						   +"주소:"+addr;
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
