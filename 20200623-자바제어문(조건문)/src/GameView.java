import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{
   Image back,air;
   int x=15,y=15;
   public GameView()
   {
	   // �̹����� ������ �´� 
	   back=Toolkit.
			   getDefaultToolkit().
			   getImage("c:\\javaDev\\back.jpg");
	   air=Toolkit.
			   getDefaultToolkit().
			   getImage("c:\\javaDev\\air.png");
   }
   // �̹��� ��� 
   public void paint(Graphics g)
   {
	   int k=0;
	   g.drawImage(back, 0,0,getWidth(),getHeight(),this);
	   g.drawImage(air, x,y,80,50,this);
   }
}



