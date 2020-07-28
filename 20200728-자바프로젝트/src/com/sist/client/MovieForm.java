package com.sist.client;
import java.awt.*;
import javax.swing.*;
import com.sist.data.*;
import java.util.*;//ArrayList
public class MovieForm extends JPanel{
   JButton b1,b2;
   JPanel p=new JPanel();
   public MovieForm()
   {
	   setLayout(new BorderLayout());
	   b1=new JButton("¢¸");
	   b2=new JButton("¢º");
	   
	   
	   p.setLayout(new GridLayout(2,5,5,5));
	   
	   moviePrint(1);
	   add("West",b1);add("Center",p);add("East",b2);
   }
   public void moviePrint(int page)
   {
	   MovieManager m=new MovieManager();
	   ArrayList<MovieVO> list=m.movieListData(page);
	   for(MovieVO vo:list)
	   {
		   MovieCard fc=new MovieCard(vo.getTitle(),vo.getPoster());
		   p.add(fc);
	   }
   }
}




