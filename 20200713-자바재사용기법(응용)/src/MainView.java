import javax.swing.*;
import java.awt.*;
public class MainView extends JPanel{
    Image back;
    // Image�� ���� �ʱ�ȭ 
    public MainView()
    {
    	// �̹��� ���� �б�
    	back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
    }
    // �޼ҵ� ���� ���� 
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
	}
    
}
