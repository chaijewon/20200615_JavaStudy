package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import com.sist.data.*;
public class CardPrint extends JFrame{
    public CardPrint()
    {
    	//setLayout(null);
    	//FoodHouseVO[] food=MainClass3.categoryFoodData();
    	JPanel p=new JPanel();
    	p.setLayout(new GridLayout(10,1));
    	JScrollPane pp=new JScrollPane();
    	Dimension size = new Dimension();//����� �����ϱ� ���� ��ü ����
    	size.setSize(1000, 600);//��ü�� ����� ����
    	p.setPreferredSize(size);//������ ������ ������ �ִ� ��ü�� �̿��� �г��� ������ ����
    	pp.setViewportView(p);
    	add("Center",pp);
    	
		/*
		 * for(FoodHouseVO vo:food) { MovieListCard fc=new MovieListCard(vo); p.add(fc);
		 * }
		 */
    	
    	setSize(1300, 500);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new CardPrint();
	}

}
