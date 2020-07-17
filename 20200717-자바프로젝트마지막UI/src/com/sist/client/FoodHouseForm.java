package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.net.*;
public class FoodHouseForm extends JPanel{
    Image img;
    String title;
    String subject;
    public void setData(String url,String title,String subject)
    {
    	try
    	{
    	   img=Toolkit.getDefaultToolkit().getImage(new URL(url));
    	   this.title=title;
    	   this.subject=subject;
    	}catch(Exception ex){}
    }
    public void paint(Graphics g)
    {
    	g.drawImage(img,0,0,getWidth(),getHeight(),this);
    	g.setColor(Color.white);
    	g.setFont(new Font("±Ã¼­Ã¼",Font.BOLD,20));
    	g.drawString(title, 80, 150);
    	g.drawString(subject, 90, 190);
    }
    
}
