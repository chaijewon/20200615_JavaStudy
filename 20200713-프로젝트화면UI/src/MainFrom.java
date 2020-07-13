/*
 *   ������
 *    = Container : Component�� ������ ��� ȭ�� ��� 
 *      = JFrame 
 *      = JWindow
 *      = JDialog
 *      =========== �ܵ����� ������ ���� 
 *      = JPanel => �ܵ����� ������ �Ұ��� => JFrame,JWindow,JDialog 
 *    = Component : �Ѱ��� ��ɸ� ������ �ִ�
 *          JLabel => �Ϲ� ���ڿ� ��� , �̹��� ��� 
 *          ��ư ����
 *            = �Ϲݹ�ư 
 *                JButton 
 *            = ��۹�ư 
 *                JRadioButton
 *                JCheckBox
 *            = �޴� 
 *          �Է�â 
 *            = �����Է� : JTextField
 *            = ��й�ȣ : JPasswordField
 *            = ������ �Է� : JTextArea => �Ұ�,������� 
 *            = ������ �Է� : JTextPane => ä�� 
 *          ���â 
 *            = ����â : JComboBox
 *            = ��ü ���� => JList
 *            = JTree
 *            = JTable
 *          ȭ����� 
 *            = JTabbedPane
 *            = JSpiltPane  ==> <div>
 *            = JInteralFrame
 *    =========================================== interface  
 *    
 *    ===> ��ġ (Layout) , ����� ���� ��ġ 
 *         1. BorderLayout => 5����
 *               ��,�Ʒ�,��� , ����,������ 
 *         2. FlowLayout
 *         3. GridLayout
 *         4. CardLayout
 *         5. *****����� ���� =====> setBounds(10,20 ,800,900)
 *         
 *    ===> ������Ʈ : ��Ʈ��ũ�� �帧�ľ� 
 *                  ����Ŭ 
 *                  JSP
 *                  Spring
 *                  Kotlin
 *         1. �α��� ======> �������� ���� 
 *         2. ȸ������
 *         ============================
 *         3. ��� ��� 
 *         4. �󼼺��� 
 *         5. ����,��ٱ��� 
 *         6. ����������,������������
 *         7. ä�� 
 *         ============================
 *          
 */
import javax.swing.*;
import java.awt.*;
/*
 *    ���� ==============> �����͸� ����� (����ȭ : private)
 *      �Ϲݺ��� => �⺻��
 *      ======
 *      �迭
 *      Ŭ���� 
 *      ====== �������� 
 *    =========
 *    �޼ҵ�
 *    ������ 
 *    ========= �ٸ� Ŭ������ �����ϴ� ���� ==> public
 */
public class MainFrom extends JFrame{
    private CardLayout card=new CardLayout();// ���� Ŭ����
    // ȭ�� UI => ������ => �����ϸ� �ٷ� �����ش� 
    // ������ => �ѹ��� ȣ���� �����ϰ� ���۰� ���ÿ� ȣ���� �Ǵ� �޼ҵ� 
    // �����ڴ� ��� Ŭ�������� ȣ���� �����ؾ� �Ѵ� ==> public 
    Login login=new Login();
    public MainFrom()
    {
    	// Layout ���� 
    	setLayout(card);
    	add("LOGIN",login);
    	/*
    	 *   JFrame,JWindow,JDialog ==> BorderLayout
    	 *   JPanel ==> FlowLayout 
    	 *   
    	 *   ==> ����� ���� ��� ==> setLayout(null)
    	 */
    	setBounds(400,60,1024,950);
    	//setSize(1000, 900);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainFrom();
	}

}








