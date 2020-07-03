import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainForm extends JFrame implements ActionListener{
    JMenuBar bar=new JMenuBar();
    JMenuItem open=new JMenuItem("열기");
    JMenuItem save=new JMenuItem("저장");
    JMenuItem copy=new JMenuItem("복사");
    JMenuItem close=new JMenuItem("종료");
    // 생성자 => 클래스 저장 
    public MainForm()
    {
    	JMenu file=new JMenu("파일");
    	file.add(open);
    	file.add(save);
    	file.add(copy);
    	file.add(close);
    	bar.add(file);
    	
    	// 윈도우 올리기
    	setJMenuBar(bar);
    	// 윈도우 크기 결정
    	setSize(1024, 768);
    	setVisible(true);// 윈도우 보여준다 
    	
    	open.addActionListener(this);
    	save.addActionListener(this);
    	copy.addActionListener(this);
    	close.addActionListener(this);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainForm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==open)
		{
			JOptionPane.showMessageDialog(this, "파일 열기 선택");
		}
		else if(e.getSource()==save)
		{
			JOptionPane.showMessageDialog(this, "파일 저장 선택");
		}
	}

}
