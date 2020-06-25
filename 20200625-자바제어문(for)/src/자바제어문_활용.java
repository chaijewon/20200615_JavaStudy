import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *  <div class="info_tit">
		<em class="ico_movie ico_15rating">15세이상관람가</em>
		<a href="/moviedb/main?movieId=134684" 
		class="name_movie" data-tiara-layer="moviename" 
		data-tiara-ordnum="1" data-tiara-id="134684" 
		data-tiara-type="movie">#살아있다</a>
	</div>
 */
public class 자바제어문_활용 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Document doc=Jsoup.connect("https://movie.daum.net/premovie/released").get();
        System.out.println(doc);
        Elements title=doc.select("div.info_tit a.name_movie");
        Elements grade=doc.select("div.info_tit em");
        for(int i=0;i<title.size();i++)
        {
        	System.out.println("=============");
        	System.out.println(title.get(i).text());
        	System.out.println(grade.get(i).text());
        	System.out.println("=============");
        }
	}

}
