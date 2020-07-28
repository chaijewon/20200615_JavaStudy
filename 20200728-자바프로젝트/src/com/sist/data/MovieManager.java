package com.sist.data;
// 데이터 관리 
import java.util.*;
import java.io.*;
/*
 *    프로그램 작성 
 *    = 파일 : 분리할 수 없다 => 전체를 통으로 저장  ======> AI
 *      = 1. 전체 파일을 읽어서 분리 => 메모리에 저장 
 *                                ===== ArrayList
 *           FileReader
 *           StringTokenizer,split 
 *      = 2. 메모리에서 제어 
 *    = 오라클 : 분리가 되어 있는 상태 
 *      = 필여시마다 오라클에 연결 => 메소드안에서 처리 
 */
public class MovieManager {
    // 데이터 저장 
	private static ArrayList<MovieVO> list=
			 new ArrayList<MovieVO>();
	// 모든 자바파일에서 공통으로 사용 => 반드시 static
	// 프로그램 시작 => 데이터 수집 => ArrayList에 저장후 시작 
	static
	{
		try
		{
			/*
			 *   파일 읽기 => 
			 *   1.한글자씩 읽는 방법 => read()
			 *     FileInputStream
			 *     FileReader
			 *   2.한줄씩 읽는 방법  => readLine()
			 *     전체 데이터를 임시저장공간에 저장후 사용 
			 *     BufferedReader 
			 */
			// 저장된 파일 읽기 
			FileInputStream fr=new FileInputStream("c:\\javaDev\\daum_movie.txt");
			// 메모리에 전체데이터를 모아서 관리 
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String movie=in.readLine(); // readLine() => \n
				if(movie==null) break; // 종료 => 파일을 다 읽은 경우 
				/*
				 *   154|5|젠틀맨(2020)|
				 *   https://img1.daumcdn.net/thumb/C155x225/?
				 *   fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%
				 *   2Fmovie-private%2F24957778d17a376a087
				 *   65a121450bb5d9f53a496|평점 07 . 7|가이 리치|매튜 맥커너히|
				 *   범죄/액션|
				 *   2020.02.26 개봉|
				 *   113분, 청소년관람불가|
				 *   81482|정글에는 법칙이 있고, 범죄에도 품격이 있다! 유럽을 장악한 업계의 절대강자 '믹키 피어슨'(매튜 맥커너히)은 자신이 세운 마리화나 제국을 걸고 돈이라면 무엇이든 벌이는 미국의 억만장자와의 빅딜을 시작한다. 소문을 듣고 찾아온 무법자 '드라이 아이'(헨리 골딩)와 돈 냄새를 맡은 사립탐정 '플레처'(휴 그랜트)까지 게임에 끼어들게 되면서 오랫동안 지켜온 정글의 질서는 점점 무너지기 시작하는데… 2월 26일, 고품격 범죄 오락의 신세계가 펼쳐진다!
				 */
				StringTokenizer st=new StringTokenizer(movie,"|");
				while(st.hasMoreTokens())
				{
					MovieVO vo=new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setPoster("https:"+st.nextToken());
					String score=st.nextToken();
					score=score.substring(score.indexOf("점")+1);
					vo.setScore(score.trim());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					String regdate=st.nextToken();
					regdate=regdate.substring(0,regdate.lastIndexOf("개"));
					vo.setRegdate(regdate);
					String grade=st.nextToken();
					grade=grade.substring(grade.indexOf(",")+1);
					vo.setGrade(grade.trim());
					// 90,000 ==> 90000
					vo.setShowUser(Integer.parseInt(st.nextToken().replace(",", "")));
					vo.setStory(st.nextToken());
					list.add(vo);
				}
			}
			
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public ArrayList<MovieVO> movieListData(int page)
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		/*
		 *    1page  => 0~9
		 *    2page  => 10~19
		 *    3page  => 20~29
		 */
		for(MovieVO vo:list)
		{
			// pagecnt => 저장 위치 
			if(i<10 && j>=pagecnt)
			{
				movies.add(vo);
				i++;// 10개씩 나눠주는 변수 
			}
			j++;// for돌아가는 횟수
		}
		return movies;
	}
	public int movieTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
		// ceil는 올림 메소드 
	}
	// 상세보기 
	public MovieVO movieDetailData(int mno)
	{
		return list.get(mno-1);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("페이지:");
		int page=scan.nextInt();
		
		MovieManager m=new MovieManager();
		System.out.println(page+" page / "+m.movieTotalPage()+" pages");
		
		// 데이터 읽기 
		ArrayList<MovieVO> list=m.movieListData(page);
		
		for(MovieVO vo:list)
		{
			System.out.println(vo.getTitle());
		}
		/*
		 * for(MovieVO vo:list) { if(vo.getTitle().contains(ss)) {
		 * System.out.println(vo.getTitle()); } }
		 */
	}
}








