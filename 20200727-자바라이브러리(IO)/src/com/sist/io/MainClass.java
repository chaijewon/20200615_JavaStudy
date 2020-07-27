package com.sist.io;
/*
 *    IO 
 *    ==
 *     => Input/Output
 *        저장 / 읽기 
 *        *** 1. 메모리 입출력
 *        2. 파일 입출력 
 *        3. 네트워크 입출력
 *        
 *     => IO 
 *        ==
 *         스트림 이용  => 데이터 통로 (정확한 전송)
 *         단방향 (입력 , 출력 통로가 다르다)
 *         
 *        = 1byte (일반 파일)
 *          바이트 스트림
 *             InputStream / OutputStream => 인터페이스  => read/write
 *              => 업로드 /다운로드 
 *        = 2byte (문자) => 한글
 *          문자 스트림 
 *             ***Reader  / Writer (O) => 인터페이스 
 *             
 *        = 객체자체를 저장  : 직렬화  
 *          ============ 
 *           = ObjectInputStream
 *           = ObjectOutputStream
 *           
 *        = 속도를 빠르게 => Buffer
 *          ***BufferedInputStream 
 *          ***BufferedOutputStream
 *          
 *          =====> XML,JSON,CSV(별도로 파싱하는 방법이 따로 있다) : Web(Spring)
 *          
 *          *** 주의점 
 *          1. 반드시 import java.io.*
 *          2. 반드시 예외처리 (CheckException)
 *          
 *          1. 파일 읽기 
 *             =======
 *              FileInputStream (1byte) => 한글이 있는 경우에는 한글이 깨진다 
 *              FileReader (2byte) 
 *              =======================
 *              1) 파일을 읽기 
 *                 FileInputStream fis=new FileInputStream("절대경로명");
 *                                              c:\\javaDev\\a.txt
 *                 while(파일끝까지) ==> -1(EOF)
 *                 {
 *                     출력 
 *                 }
 *                 =============
 *                 fis.close()
 *                 ============= finally => try/catch에 상관없이 수행 
 *                 
 *              *** 데이터 읽기 방법 
 *              1) 한글자 읽기
 *                 int read() => 글자번호 
 *                     A ==>  65 ==> (char)i
 *              2) 여러개를 동시에 읽는 경우 
 *                 int read() => 읽은 바이트 리턴 
 *                 
 *              *** 데이터 쓰기 (저장)
 *                 FileOutputStream 
 *                 =================
 *                   write() => 한글자씩 저장 
 *                   
 *                   
 *          IO 
 *           = FileInputStream , FileReader
 *           = FileOutputStream , FileWriter
 *           = BufferedReader , BufferedWriter
 *           = ObjectInputStream/ObjectOutputStream
 *           = BufferedInputStream,BufferedOutputStream
 *          ===========================================
 *          
 *             데이터 
 *            =======
 *              정형화된 데이터 : 오라클 (***)
 *              반정형화 데이터 : 구분이 된다 => 필요없는 데이터도 존재 
 *                            html,xml,json
 *              ====================================
 *              비정형화 데이터 : 구분도 없고 , 뉴스 , 트위터   => 빅데이터 => 지능형웹
 *                            => REGEX(패턴)
 *              ====================================
 *          
 */
import java.io.*; 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream fis=null;// 반드시 초기값을 부여 => png,jpg,zip...
		// 모든 클래스의 초기값 ==> null
		FileReader fis=null;// 한글이 포함된 파일을 읽어 올때 
		// 자바에서 저장=> Ansi로 저장이 된다 
        try
        {
        	// 파일 읽기 
        	//fis=new FileInputStream("c:\\javaDev\\news1.txt");
        	fis=new FileReader("c:\\javaDev\\news1.txt");
        	// 파일을 읽어서 도스창에 출력 
        	int i=0; // 한글자씩 읽는다 => 한글자씩 가지고 온다 , 문자번호 
        	while((i=fis.read())!=-1) // -1 파일의 끝(EOF)
        	{
        		System.out.print((char)i);
        	}
        	
        }catch(Exception ex)
        {
        	// 에러 처리
        	System.out.println(ex.getMessage());
        }
        finally
        {
        	// 파일 닫기 
        	try
        	{
        	   fis.close();
        	}catch(Exception ex){}
        }
	}

}







