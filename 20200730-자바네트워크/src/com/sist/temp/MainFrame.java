package com.sist.temp;
import java.awt.*;
import javax.swing.*;
public class MainFrame extends JFrame{
	GameView gv=new GameView();
    public MainFrame()
    {
    	add("Center",gv);
    	setSize(1000, 950);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainFrame();
	}

}
