/*
 *    1) 데이터 10개(영화제목)를 가지고 오는 메소드의 원형을 작성하시오
 *       String[] movieList();
 *    2) 사용자가 ID,PWD를 입력하면 => 로그인 (true) , 실패(false)
 *       boolean login(String id,String pwd)
 *    3) 영화 번호를 넘겨주면 => 장르를 넘겨주는 메소드 
 *       String getGenre(int no)
 *    4) 검색을 하면 찾은 영화명을 넘겨주는 메소드 제작 
 *       String movieFind(String ss)
 *    5) 영화 예매 상위 5개를 넘겨주는 메소드 제작 
 *       String[] pop5()
 *       
 *       ==> 구현은 나중 
 *           ==> 원형 
 *               1) 반환값
 *               2) 사용자가 보내주는 데이터 
 *               
 *               예) ID 중복체크
 *                  ==========
 *                    boolean idCheck(String id)
 *                  우편번호 찾기 
 *                    String[] postFind(String dong)
 *                    
 *                  검색 => 검색된 내용을 출력 
 *                    String[] find(String ss)
 *                    
 *                  리뷰 
 *                    String[] review(String re)
 *                    
 *                    
 *                  메소드 : 사용자가 요청한 값 (갯수) 
 *                         요청 처리 => 결과값은 ?
 *                         ==> 구현
 *                         
 *                         
 *    ====================================================
 */
import java.io.*;
import java.net.*;
public class 자바메소드4 {
    static void getData() throws Exception
    {
    	URL url=new URL("https://www.daum.net");
    	HttpURLConnection conn=(HttpURLConnection)url.openConnection();
    	if(conn!=null)
    	{
    		BufferedReader in=
    			new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
    		while(true)
    		{
    			String str=in.readLine();
    			if(str==null)break;
    			System.out.println(str);
    		}
    	}
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
         getData();
	}

}






