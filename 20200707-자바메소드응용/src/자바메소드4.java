/*
 *   ��ȭ�� ���� 
 *   ========
 *     ����󿵿�ȭ
 *     ����������ȭ
 *     �ڽ����ǽ�(�ְ�)
 *     �ڽ����ǽ�(����)
 *     �ڽ����ǽ�(����)
 */
/*
 *   <div class="wrap_movie">
				   <div class="info_tit">
								<em class="ico_movie ico_15rating">15���̻������</em>
					<a href="/moviedb/main?movieId=134684" class="name_movie" 
					data-tiara-layer="moviename" data-tiara-ordnum="1" 
					data-tiara-id="134684" data-tiara-type="movie">#����ִ�</a>
					</div>
								
								<span class="info_grade">
								
																		
									<a href="/moviedb/grade?movieId=134684&type=netizen" class="link_grade" data-tiara-layer="point" data-tiara-ordnum="1">
										<span class="txt_grade">��Ƽ��</span>
										<span class="wrap_grade grade_netizen">
											<span class="ico_star ico_14star">���</span>
											<span class="num_grade num_05">05</span>
											<span class="num_grade grade_dot">.</span>
											<span class="num_grade num_00">00</span>
										</span>
									</a>
																										</span>
								<span class="info_state">
																																																	
																														
										20.06.24 ����
																												<span class="txt_dot"></span>
																												������ 57.07%
																	</span>
 */
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class �ڹٸ޼ҵ�4 {
    static int menuSelect()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("�޴��� �����ϼ���(1~6):");
    	int no=scan.nextInt();
    	return no;
    }
    static void menu()
    {
    	System.out.println("===== Menu =====");
    	System.out.println("1.����󿵿�ȭ");
    	System.out.println("2.����������ȭ");
    	System.out.println("3.�ڽ����ǽ�(�ְ�)");
    	System.out.println("4.�ڽ����ǽ�(����)");
    	System.out.println("5.�ڽ����ǽ�(����)");
    	System.out.println("6.����");
    	System.out.println("================");
    }
    static void movieData(int no) throws Exception
    {
    	String[] site={
    		"https://movie.daum.net/premovie/released",
    		"https://movie.daum.net/premovie/scheduled",
    		"https://movie.daum.net/boxoffice/weekly",
    		"https://movie.daum.net/boxoffice/monthly",
    		"https://movie.daum.net/boxoffice/yearly"
    	};
    	String[] subject= {
    			"����󿵿�ȭ",
    			"����������ȭ",
    			"�ڽ����ǽ�(�ְ�)",
    			"�ڽ����ǽ�(����)",
    			"�ڽ����ǽ�(����)"
    	};
    	
    	// ��� 
    	System.out.println("�ڡڡڡڡ�  "+subject[no-1]+" �ڡڡڡڡ�");
    	
    	Document doc=Jsoup.connect(site[no-1]).get();
    	Elements title=doc.select("div.info_tit a.name_movie");
    	for(int i=0;i<title.size();i++)
    	{
    		System.out.println((i+1)+"."+title.get(i).text());
    	}
    	
    }
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
        while(true)
        {
        	menu();
        	int no=menuSelect();
        	
        	if(no==6)
        	{
        	    System.out.println("���α׷� ����");
        		break;
        	}
        	movieData(no);
        }
	}

}





