// �α��� ó�� 
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
public class ���ڿ�3 extends JFrame implements ActionListener{
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	JLabel poster=new JLabel();
	final String ID="Admin";
	final String PWD="1234";
    public ���ڿ�3()
    {
    	la1=new JLabel("ID");
    	la2=new JLabel("PW");
    	tf=new JTextField();
    	pf=new JPasswordField();
    	b1=new JButton("�α���");
    	b2=new JButton("���");
    	
    	String s="https://movie-phinf.pstatic.net/20200610_45/1591752004615kLWYv_JPEG/movie_image.jpg";
    	try
    	{
    		poster.setIcon(new ImageIcon(new URL(s)));
    	}catch(Exception ex) {}
    	
    	setLayout(null);
    	
    	la1.setBounds(10,15,30,30);
    	tf.setBounds(45,15,150,30);
    	la2.setBounds(10,50,30,30);
    	pf.setBounds(45,50,150,30);
    	
    	
    	
    	JPanel p=new JPanel();
    	p.add(b1);p.add(b2);
    	p.setBounds(10, 90, 195, 35);
    	add(la1);add(tf);
    	add(la2);add(pf);
    	add(p);
    	
    	poster.setBounds(10,135, 300, 300);
    	add(poster);
    	setSize(800, 600);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	//Integer.MAX_VALUE;
    	b1.addActionListener(this);// �α���
    	b2.addActionListener(this);// ���
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ���ڿ�3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)// �α��� ��ư Ŭ��
		{
			String id=tf.getText();
			if(id.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID�� �Է��ϼ���!!");
				tf.requestFocus();
				return;
			}
			
			String pwd=String.valueOf(pf.getPassword());
			if(pwd.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, "Password�� �Է��ϼ���!!");
				pf.requestFocus();
				return;
			}
			
			// �Է��� �Ϸ�
			// ó�� 
			if(id.equalsIgnoreCase(ID))
			{
				if(pwd.equals(PWD))
				{
					JOptionPane.showMessageDialog(this, id+"�� �α��εǾ����ϴ�");
				}
				else
				{
					JOptionPane.showMessageDialog(this, "Password�� Ʋ���ϴ�");
					pf.setText("");
					pf.requestFocus();
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this, "ID�� �������� �ʽ��ϴ�");
				tf.setText("");
				pf.setText("");
				tf.requestFocus();
			}
			
		}
		else if(e.getSource()==b2)//���
		{
			System.exit(0);// ��������
		}
	}

}



