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
    	p.setLayout(new GridLayout(10,1));
    	JScrollPane pp=new JScrollPane();
    	Dimension size = new Dimension();//����� �����ϱ� ���� ��ü ����
    	size.setSize(1000, 600);//��ü�� ����� ����
    	p.setPreferredSize(size);//������ ������ ������ �ִ� ��ü�� �̿��� �г��� ������ ����
    	pp.setViewportView(p);
    	add("Center",pp);
    	
		
		 for(MovieVO vo:movies) 
		 { 
			 MovieListCard fc=new MovieListCard(vo); 
			 p.add(fc);
		 }
		 
    	
    	setSize(1300, 500);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new CardPrint();
	}

}
