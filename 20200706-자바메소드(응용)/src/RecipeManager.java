import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *  <div class="col-xs-3">
        <a class="thumbnail" href="/recipe/6924266">
			            <span class="thumbnail_over"><img src="https://recipe1.ezmember.co.kr/img/thumb_over.png"></span>
            <img src="https://recipe1.ezmember.co.kr/cache/recipe/2019/12/30/77b62c185a190a93c86dac00fe51e0d81_m.jpg" style="width:275px; height:275px;">
          <div class="caption">
            <h4 class="ellipsis_title2">¹ä¼Ü ¿À¸®°í±â Â¥Àå¶ó¸é(¸ö¿¡ ...</h4>
            <p>by ¹ä¼Ü°³¹Ì</p>
          </div>
        </a>
                <div style="position:absolute;top:365px;width:100%;text-align:right;right:20px;"><span style="color:#74b243;font-size:10px;" class="glyphicon glyphicon-certificate"></span></div>
              </div>
 */
public class RecipeManager {
	public static void main(String[] args) {
		RecipeManager rm=new RecipeManager();
		rm.recipeListData();
	}
   public static RecipeVO[] recipeListData()
   {
	   RecipeVO[] data=new RecipeVO[40];
	   try
	   {
		   Document doc=Jsoup.connect("https://www.10000recipe.com/recipe/list.html").get();
		   Elements title=doc.select("div.caption h4.ellipsis_title2");
		   Elements poster=doc.select("a.thumbnail img[src*=/recipe/]");
		   Elements chef=doc.select("div.caption p");
		   for(int i=0;i<title.size();i++)
		   {
			   System.out.println(title.get(i).text());
			   System.out.println(poster.get(i).attr("src"));
			   System.out.println(chef.get(i).text());
			   System.out.println("==========================");
			   RecipeVO vo=new RecipeVO();
			   vo.setNo(i+1);
			   vo.setChef(chef.get(i).text());
			   vo.setTitle(title.get(i).text());
			   vo.setPoster(poster.get(i).attr("src"));
			   data[i]=vo;
		   }
	   }catch(Exception ex) {}
	   
	   return data;
   }
}
