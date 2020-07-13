/*
 *   윈도우
 *    = Container : Component를 여러개 묶어서 화면 출력 
 *      = JFrame 
 *      = JWindow
 *      = JDialog
 *      =========== 단독으로 실행이 가능 
 *      = JPanel => 단독으로 실행이 불가능 => JFrame,JWindow,JDialog 
 *    = Component : 한개의 기능만 가지고 있다
 *          JLabel => 일반 문자열 출력 , 이미지 출력 
 *          버튼 종류
 *            = 일반버튼 
 *                JButton 
 *            = 토글버튼 
 *                JRadioButton
 *                JCheckBox
 *            = 메뉴 
 *          입력창 
 *            = 한줄입력 : JTextField
 *            = 비밀번호 : JPasswordField
 *            = 여러줄 입력 : JTextArea => 소개,내용출력 
 *            = 여러줄 입력 : JTextPane => 채팅 
 *          목록창 
 *            = 선택창 : JComboBox
 *            = 전체 내용 => JList
 *            = JTree
 *            = JTable
 *          화면분할 
 *            = JTabbedPane
 *            = JSpiltPane  ==> <div>
 *            = JInteralFrame
 *    =========================================== interface  
 *    
 *    ===> 배치 (Layout) , 사용자 정의 배치 
 *         1. BorderLayout => 5군데
 *               위,아래,가운데 , 왼쪽,오른쪽 
 *         2. FlowLayout
 *         3. GridLayout
 *         4. CardLayout
 *         5. *****사용자 정의 =====> setBounds(10,20 ,800,900)
 *         
 *    ===> 프로젝트 : 네트워크의 흐름파악 
 *                  오라클 
 *                  JSP
 *                  Spring
 *                  Kotlin
 *         1. 로그인 ======> 서버에서 저장 
 *         2. 회원가입
 *         ============================
 *         3. 목록 출력 
 *         4. 상세보기 
 *         5. 예매,장바구니 
 *         6. 마이페이지,관리자페이지
 *         7. 채팅 
 *         ============================
 *          
 */
import javax.swing.*;
import java.awt.*;
/*
 *    변수 ==============> 데이터를 감춘다 (은닉화 : private)
 *      일반변수 => 기본형
 *      ======
 *      배열
 *      클래스 
 *      ====== 참조변수 
 *    =========
 *    메소드
 *    생성자 
 *    ========= 다른 클래스와 연결하는 역할 ==> public
 */
public class MainFrom extends JFrame{
    private CardLayout card=new CardLayout();// 포함 클래스
    // 화면 UI => 생성자 => 시작하면 바로 보여준다 
    // 생성자 => 한번만 호출이 가능하고 시작과 동시에 호출이 되는 메소드 
    // 생성자는 모든 클래스에서 호출이 가능해야 한다 ==> public 
    Login login=new Login();
    public MainFrom()
    {
    	// Layout 설정 
    	setLayout(card);
    	add("LOGIN",login);
    	/*
    	 *   JFrame,JWindow,JDialog ==> BorderLayout
    	 *   JPanel ==> FlowLayout 
    	 *   
    	 *   ==> 사용자 정의 사용 ==> setLayout(null)
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








