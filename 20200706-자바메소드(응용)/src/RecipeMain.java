import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
public class RecipeMain extends JFrame{
	JPanel pan=new JPanel();
	
    public RecipeMain()
    {
    	try
    	{
	    	pan.setLayout(new GridLayout(5,4,5,5));
	    	
	    	RecipeVO[] r=RecipeManager.recipeListData();
	    	int k=0;
	    	for(RecipeVO rv:r)
	    	{
	    		if(k>19) break;
	    		System.out.println(rv.getChef());
	    		pan.add(new JLabel(new ImageIcon(getImage(new ImageIcon(new URL(rv.getPoster())),250,200))));
	    	    k++;
	    	}
	    	add("Center",pan);
	    	setSize(1024, 800);
	    	setVisible(true);
    	}catch(Exception ex) {ex.printStackTrace();}
    }
    public Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        }catch(Exception ex) {ex.printStackTrace();}
        new RecipeMain();
	}

}
