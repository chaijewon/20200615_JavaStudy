package com.sist.cgv;
import java.awt.*;
import javax.swing.*;
import java.net.*;
public class MovieListPanel extends JPanel{
    JLabel[] poster=new JLabel[7];
    public MovieListPanel()
    {
    	MovieVO[] movies=MovieManager.movies;
    	setLayout(null);
    	JPanel p=new JPanel();
    	p.setLayout(new GridLayout(1,7,5,5));
    	int i=0;
    	for(MovieVO vo:movies)
    	{
    		try
    		{
    			URL url=new URL(vo.getPoster());
    			poster[i]=new JLabel();
    			p.add(poster[i]);
    			Image ii=getImage(new ImageIcon(url), 
    					105, 200);
    			poster[i].setIcon(new ImageIcon(ii));
    			i++;
    		}catch(Exception ex){System.out.println(ex.getMessage());}
    	}
    	
    	setLayout(null);
    	p.setBounds(10, 15, 760, 300);
    	add(p);
    }
    public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
}
