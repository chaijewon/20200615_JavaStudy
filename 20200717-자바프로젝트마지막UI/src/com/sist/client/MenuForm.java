package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class MenuForm extends JPanel {
    JButton b1,b2,b3,b4,b5,b6,b7;
    // 초기화 (버튼) ==> 배치 (생성자)
    public MenuForm()
    {
    	//setBackground(Color.orange);
    	b1=new JButton("홈");
    	b2=new JButton("레시피");
    	b3=new JButton("랭킹");
    	b4=new JButton("추천");
    	b5=new JButton("세프");
    	b6=new JButton("맛집");
    	b7=new JButton("종료");
    	
    	setLayout(new GridLayout(7, 1,5,5));
    	add(b1);
    	add(b2);
    	add(b3);
    	add(b4);
    	add(b5);
    	add(b6);
    	add(b7);
    }
}








