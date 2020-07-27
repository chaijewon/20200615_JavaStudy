package com.sist.front;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import com.sist.back.*;
import java.util.*;
// 날짜
import java.text.*;//SimpleDateFormat
public class BoardMainFrame extends JFrame implements ActionListener{
    
    BoardListPanel bp=new BoardListPanel();
    BoardInsertPanel bi=new BoardInsertPanel();
    JTabbedPane tp=new JTabbedPane();
    // 프로그램 연결 => ArrayList => BoardManager
    BoardManager bm=new BoardManager();
    public BoardMainFrame()
    {
    	tp.addTab("게시판 목록", bp);
    	tp.addTab("글쓰기", bi);
    	tp.setTabPlacement(tp.BOTTOM);
    	//tp.setSelectedIndex(1);
    	add("Center",tp);
    	setSize(640, 480);
    	setVisible(true);
    	
    	bp.b.addActionListener(this);// 새글
    	bi.b1.addActionListener(this);// 글쓰기
    	bi.b2.addActionListener(this);// 취소
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new BoardMainFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bp.b)// 새글 버튼 클릭 
		{
			// 글쓰기 화면 이동 
			tp.setSelectedIndex(1);
		}
		else if(e.getSource()==bi.b1)//글쓰기 버튼
		{
			// ArrayList에 저장 
			// 입력한 데이터 읽기 
			String name=bi.tf1.getText();
			String subject=bi.tf2.getText();
			String content=bi.ta.getText();
			String pwd=String.valueOf(bi.pf.getPassword());
			// password는 char[]로 
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			bm.insert(vo);//ArrayList에 추가 
			// 목록 추가 => 메소드
			listPrint();
			// 목록 이동 
			tp.setSelectedIndex(0);
		}
		else if(e.getSource()==bi.b2)//취소
		{
			// 목록으로 이동 
			tp.setSelectedIndex(0);
		}
	}
	public void listPrint()
	{
		// ArrayList받기 
		ArrayList<BoardVO> list=bm.select();
		// 테이블에 출력 
		// 테이블 지우기 
		for(int i=bp.model.getRowCount()-1;i>=0;i--)
		{
			bp.model.removeRow(i);
		}
		// 출력 
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		// MM (월)  mm (분)
		for(BoardVO vo:list)
		{
			String[] data= {
				String.valueOf(vo.getNo()),
				vo.getSubject(),
				vo.getName(),
				sdf.format(vo.getRegdate()),
				String.valueOf(vo.getHit())
			};
			
			bp.model.addRow(data);
		}
	}

}





