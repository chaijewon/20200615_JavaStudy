package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.net.*;
public class FoodCategoryCard extends JPanel{
   String title,subject,poster;
   Image img;
   public FoodCategoryCard(String title,String subject,String poster)
   {
	    this.title=title;
	    this.subject=subject;
	    this.poster=poster;
	    try
	    {
	    	img=Toolkit.getDefaultToolkit().getImage(new URL(poster));
	    }catch(Exception ex) {}
   }
   public void paint(Graphics g)
   {
	   g.drawImage(img,0,0,getWidth(),getHeight(),this);
	   g.setColor(Color.white);
	   g.setFont(new Font("±Ã¼­Ã¼",Font.BOLD,15));
	   g.drawString(title, 10, 100);
	   g.drawString(subject, 50, 150);
   }
}





