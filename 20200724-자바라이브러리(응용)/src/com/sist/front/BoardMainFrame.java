package com.sist.front;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BoardMainFrame extends JFrame{
    
    BoardListPanel bp=new BoardListPanel();
    BoardInsertPanel bi=new BoardInsertPanel();
    JTabbedPane tp=new JTabbedPane();
    public BoardMainFrame()
    {
    	tp.addTab("�Խ��� ���", bp);
    	tp.addTab("�۾���", bi);
    	tp.setTabPlacement(tp.BOTTOM);
    	//tp.setSelectedIndex(1);
    	add("Center",tp);
    	setSize(640, 480);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new BoardMainFrame();
	}

}
