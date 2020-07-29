package com.sist.client;
import java.awt.*;
import java.util.*;
import com.sist.data.*;
import javax.swing.*;
import javax.swing.table.*;
import java.net.*;
public class ListForm extends JPanel{
   JButton b1,b2,b3,b4,b5,b6;
   JTextField tf;
   JTable table;
   DefaultTableModel model;
   /*
    *    기능 => 메소드 ==> 리턴형 , 매개변수 
    */
   public ListForm()
   {
	   setLayout(null);// FlowLayout => null 사용자 정의 배치
	   b1=new JButton("현재상영영화");
	   b2=new JButton("개봉예정영화");
	   b3=new JButton("박스오피스(주간)");
	   b4=new JButton("박스오피스(월간)");
	   b5=new JButton("박스오피스(연간)");
	   b6=new JButton("검색");
	   tf=new JTextField(20);
	   JPanel p=new JPanel();
	   p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);p.add(b6);
	   p.setBounds(10, 25, 900, 35);
	   add(p);
	   String[] col={"번호","","제목","감독","장르","등급"};
	   Object[][] row=new Object[0][5];
	   
	   // DefaultTableModel=> 오버라이딩할 메소드가 있다 (익명의 클래스 => 내부클래스)
	   /*
	    *     내부 클래스 => 쓰레드 , 네트워크 
	    *     =========
	    *      class A
	    *      {
	    *          O P C V B
	    *          class B{  ===> 멤버클래스 
	    *          }
	    *      }
	    */
	   
	   model=new DefaultTableModel(row,col) {
        // 편집이 불가능 
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
	        // 이미지 첨부 
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
	   movieAllData(1);
	   
   }
   public void movieAllData(int cno)
   {
	   // 데이터 가지고 오기 
	   MovieManager m=new MovieManager();
	   ArrayList<MovieVO> list=m.movieAllData(cno);
	   
	   // 테이블 한번 지우기 
	   // 마지막부터 지운다 
	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }
	   
	   // 데이터 출력 
	   /*
	    *    java.io,java.net ==> CheckException => 반드시 예외처리
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
	   // 데이터 가지고 오기 
	   MovieManager m=new MovieManager();
	   ArrayList<MovieVO> list=m.movieFindData(ss);
	   
	   // 테이블 한번 지우기 
	   // 마지막부터 지운다 
	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }
	   
	   // 데이터 출력 
	   /*
	    *    java.io,java.net ==> CheckException => 반드시 예외처리
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
}









