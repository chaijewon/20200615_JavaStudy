import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{
   Image back,air;
   int x=15,y=15;
   public GameView()
   {
	   // 이미지를 가지고 온다 
	   back=Toolkit.
			   getDefaultToolkit().
			   getImage("c:\\javaDev\\back.jpg");
	   air=Toolkit.
			   getDefaultToolkit().
			   getImage("c:\\javaDev\\air.png");
   }
   // 이미지 출력 
   public void paint(Graphics g)
   {
	   int k=0;
	   g.drawImage(back, 0,0,getWidth(),getHeight(),this);
	   g.drawImage(air, x,y,80,50,this);
   }
}



