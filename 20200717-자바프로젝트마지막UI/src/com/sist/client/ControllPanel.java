package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ControllPanel extends JPanel{
   CardLayout card=new CardLayout();
   ListForm lf=new ListForm();
   DetailForm df=new DetailForm();
   FoodCategoryForm ff=new FoodCategoryForm();
   public ControllPanel()
   {
	   setLayout(card);
	   add("FF",ff);
	   add("LF",lf);
	   add("DF",df);
   }
}
