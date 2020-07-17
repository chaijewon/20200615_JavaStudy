package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class FoodHouseMain extends JFrame{
    FoodHouseForm fh=new FoodHouseForm();
    public FoodHouseMain()
    {
    	fh.setData("https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/et6u4ckepb79lat-.png?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80", 
    			   "ªÔ∞Ë≈¡ ∏¿¡˝ ∫£Ω∫∆Æ 20∞˜", "ªÔ∞Ë≈¡ øœ≈¡«œ∏È ø√ ø©∏ß¥ı¿ß¥¬ ≥°!");
    	add("Center",fh);
    	setSize(500, 400);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new FoodHouseMain();
	}

}
