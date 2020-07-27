package com.sist.io;
// 파일에 쓰기 => 회원가입 , 댓글 , 게시판 
/*
 *     파일 => 저장 => ArrayList
 *     데이터 => ArrayList에 모아서 => 저장 
 */
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *    파일 입출력 
		 *    ========
		 *      r => read
		 *      w => write => create
		 *      a => append
		 *    FileOutputStream(1byte)
		 *    생성자 
		 *      new FileOutputStream("경로명")
		 *      new FileOutputStream("경로명",true/false) => false는 기본 Default
		 *    FileWriter(2byte)
		 */
		//FileOutputStream fos=null;
		FileWriter fos=null;
        try
        {
        	// 생성
        	//fos=new FileOutputStream("c:\\javaDev\\temp.txt",true);// append
        	fos=new FileWriter("c:\\javaDev\\temp.txt",true);
        	// 저장 
        	String str="ABCDEFGHEIJJJSNSNSSN";
        	//fos.write('L');
        	//fos.write('M');
        	//fos.write('N');
        	fos.write(str+"\r\n");
        	// getBytes() => 문자열을 바이트 배열로 변경할 때 사용 
        	System.out.println("저장 완료!!");
        }catch(Exception ex)
        {
        	// 에러 처리 
        	System.out.println(ex.getMessage());
        }
        finally
        {
            // 파일 닫기  
        	// finally ==> 파일 닫기 , 서버 닫기 , 오라클 연결 해제
        	try
        	{
        	  fos.close();
        	}catch(Exception ex) {}
        }
	}

}









