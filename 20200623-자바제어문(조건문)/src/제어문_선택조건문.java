/*
 *    º±≈√ ¡∂∞«πÆ 
 *    if(¡∂∞«πÆ)
 *    {
 *       ¡∂∞«πÆ¿Ã true∏È ºˆ«‡«œ¥¬ πÆ¿Â ±∏«ˆ
 *    }
 *    else
 *    {
 *       ¡∂∞«πÆ¿Ã false¿œ∂ß ºˆ«‡«œ¥¬ πÆ¿Â ±∏«ˆ 
 *    }
 *    
 *    ¡∂∞«πÆ ==> «ŸΩ… (¡∂∞« ¡¶¿€)
 *    
 *    ===> 137page 
 *    ==  ¥‹¿œ 
 *    <
 *    >
 *    !=
 *    ====== ¡∂∞« ø©∑Ø∞≥ ¿œ ∞ÊøÏ 
 *    &&
 *    ||
 *    ======
 *    
 *    ch>='A' && ch<='Z'
 *    ch>='0' && ch<='9'
 *    ch>='∞°' && ch<='∆R'  ==> π¯»£∞° ¿œ∑¸¿˚¿∏∑Œ ...
 *    
 *    1,2,3,4,5,6,7,8,9
 *    1,2,5,7,9
 *    ch==1 || ch==2 || ch==5 || ch==7 || ch==9
 *    
 *    πÆ¿⁄ø≠ ==>  !=,== ªÁøÎ«œ¡ˆ æ ¥¬¥Ÿ 
 *    equals()
 *    !equals()
 *    
 */
import java.util.*;
public class ¡¶æÓπÆ_º±≈√¡∂∞«πÆ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // πÆ¿⁄«—∞≥∏¶ ¿‘∑¬¿ª πﬁæ∆º≠ => æÀ∆ƒ∫™¿Œ¡ˆ ø©∫Œ »Æ¿Œ 
		// ∫Øºˆº≥¡§ 
		char ch='A'; // ∫Øºˆ => √ ±‚»≠ 
		/*
		 *   int => 0
		 *   double => 0.0
		 *   long => 0L
		 *   boolean => false
		 */
		// πÆ¿⁄ «—∞≥ ¿‘∑¬ 
		Scanner scan=new Scanner(System.in);
		System.out.print("πÆ¿⁄ ¿‘∑¬:");
		//"ABC" ==> ¿⁄πŸ¥¬ ∏µÁ Ω√¿€ π¯»£ 0∫Œ≈Õ Ω√¿€«—¥Ÿ 
		ch=scan.next().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch+"¥¬(¿∫) º˝¿⁄¿‘¥œ¥Ÿ");
		}
		else
		{
			System.out.println(ch+"¥¬(¿∫) πÆ¿⁄¿‘¥œ¥Ÿ");
		}
		// ch>='0' && ch<='9'
		/*
		 * if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
		 * System.out.println(ch+"¥¬(¿∫) æÀ∆ƒ∫™¿‘¥œ¥Ÿ!!"); } else {
		 * System.out.println(ch+"¥¬(¿∫) æÀ∆ƒ∫™¿Ã æ∆¥’¥œ¥Ÿ!!"); }
		 */
	}
}








