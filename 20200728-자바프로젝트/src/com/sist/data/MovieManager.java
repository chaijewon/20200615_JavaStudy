package com.sist.data;
// ������ ���� 
import java.util.*;
import java.io.*;
/*
 *    ���α׷� �ۼ� 
 *    = ���� : �и��� �� ���� => ��ü�� ������ ����  ======> AI
 *      = 1. ��ü ������ �о �и� => �޸𸮿� ���� 
 *                                ===== ArrayList
 *           FileReader
 *           StringTokenizer,split 
 *      = 2. �޸𸮿��� ���� 
 *    = ����Ŭ : �и��� �Ǿ� �ִ� ���� 
 *      = �ʿ��ø��� ����Ŭ�� ���� => �޼ҵ�ȿ��� ó�� 
 */
public class MovieManager {
    // ������ ���� 
	private static ArrayList<MovieVO> list=
			 new ArrayList<MovieVO>();
	// ��� �ڹ����Ͽ��� �������� ��� => �ݵ�� static
	// ���α׷� ���� => ������ ���� => ArrayList�� ������ ���� 
	static
	{
		try
		{
			/*
			 *   ���� �б� => 
			 *   1.�ѱ��ھ� �д� ��� => read()
			 *     FileInputStream
			 *     FileReader
			 *   2.���پ� �д� ���  => readLine()
			 *     ��ü �����͸� �ӽ���������� ������ ��� 
			 *     BufferedReader 
			 */
			// ����� ���� �б� 
			FileInputStream fr=new FileInputStream("c:\\javaDev\\daum_movie.txt");
			// �޸𸮿� ��ü�����͸� ��Ƽ� ���� 
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String movie=in.readLine(); // readLine() => \n
				if(movie==null) break; // ���� => ������ �� ���� ��� 
				/*
				 *   154|5|��Ʋ��(2020)|
				 *   https://img1.daumcdn.net/thumb/C155x225/?
				 *   fname=https%3A%2F%2Ft1.daumcdn.net%2Fmovie%
				 *   2Fmovie-private%2F24957778d17a376a087
				 *   65a121450bb5d9f53a496|���� 07 . 7|���� ��ġ|��Ʃ ��Ŀ����|
				 *   ����/�׼�|
				 *   2020.02.26 ����|
				 *   113��, û�ҳ�����Ұ�|
				 *   81482|���ۿ��� ��Ģ�� �ְ�, ���˿��� ǰ���� �ִ�! ������ ����� ������ ���밭�� '��Ű �Ǿ'(��Ʃ ��Ŀ����)�� �ڽ��� ���� ����ȭ�� ������ �ɰ� ���̶�� �����̵� ���̴� �̱��� �︸���ڿ��� ����� �����Ѵ�. �ҹ��� ��� ã�ƿ� ������ '����� ����'(� ���)�� �� ������ ���� �縳Ž�� '�÷�ó'(�� �׷�Ʈ)���� ���ӿ� ������ �Ǹ鼭 �������� ���ѿ� ������ ������ ���� �������� �����ϴµ��� 2�� 26��, ��ǰ�� ���� ������ �ż��谡 ��������!
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
					score=score.substring(score.indexOf("��")+1);
					vo.setScore(score.trim());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					String regdate=st.nextToken();
					regdate=regdate.substring(0,regdate.lastIndexOf("��"));
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
			// pagecnt => ���� ��ġ 
			if(i<10 && j>=pagecnt)
			{
				movies.add(vo);
				i++;// 10���� �����ִ� ���� 
			}
			j++;// for���ư��� Ƚ��
		}
		return movies;
	}
	public int movieTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
		// ceil�� �ø� �޼ҵ� 
	}
	// �󼼺��� 
	public MovieVO movieDetailData(int mno)
	{
		return list.get(mno-1);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("������:");
		int page=scan.nextInt();
		
		MovieManager m=new MovieManager();
		System.out.println(page+" page / "+m.movieTotalPage()+" pages");
		
		// ������ �б� 
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








