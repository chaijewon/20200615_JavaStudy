package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class TestMain extends JFrame{
    JEditorPane ep=new JEditorPane();
    public TestMain()
    {
    	//ep.setText("<body>Hello</body>");
    	try
    	{
    	 ep.setPage("https://www.daum.net");
    	 add("Center",ep);
    	 setSize(500, 500);
    	 setVisible(true);
    	}catch(Exception ex) {}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new TestMain();
	}

}
