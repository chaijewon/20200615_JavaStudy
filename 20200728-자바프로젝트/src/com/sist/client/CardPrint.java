package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import com.sist.data.*;
public class CardPrint extends JFrame{
    public CardPrint()
    {
    	//setLayout(null);
    	MovieManager m=new MovieManager();
    	ArrayList<MovieVO> movies=m.movieListData(1);
    	JPanel p=new JPanel();
    	p.setLayout(null);
    	JScrollPane pp=new JScrollPane();
    	Dimension size = new Dimension();//����� �����ϱ� ���� ��ü ����
    	size.setSize(1000, 1000);//��ü�� ����� ����
    	p.setPreferredSize(size);//������ ������ ������ �ִ� ��ü�� �̿��� �г��� ������ ����
    	pp.setViewportView(p);
    	add("Center",pp);
    	
		 int i=0;
		 for(MovieVO vo:movies) 
		 { 
			 MovieListCard fc=new MovieListCard(vo); 
			 fc.setBounds(10, 15+(i*190), 700, 200);
			 p.add(fc);
			 i++;
		 }
		 
    	
    	setSize(1300, 500);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new CardPrint();
	}

}
