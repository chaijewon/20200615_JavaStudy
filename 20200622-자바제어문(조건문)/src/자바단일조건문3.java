// Á¶°Ç¹® Á¦ÀÛÇÏ´Â ¹æ¹ý 
/*
 *    if(Á¶°Ç¹®) : Á¶°Ç¹®Àº ¹«Á¶°Ç °á°ú°ª ==> true/false
 *      ==> ÇÊ¿äÇÑ °æ¿ì(Á¶°Ç : true)¿¡¸¸ ¹®ÀåÀ» ¼öÇà
 *          falseÀÏ °æ¿ì¿¡´Â °Ç³Ê¶Ú´Ù (¹®ÀåÀ» ¼öÇàÇÏÁö ¸øÇÑ´Ù) 
 */
public class ÀÚ¹Ù´ÜÀÏÁ¶°Ç¹®3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=11; System.out.println("1"); System.out.println("2"); // a°ªÀÌ Â¦¼öÀÏ °æ¿ì¿¡ Ãâ·Â
		 * if(a%2==0) System.out.println("3");
		 * 
		 * System.out.println("4"); System.out.println("5");
		 */
		
		// ¾ËÆÄºªÀ» ÀúÀå => ´ë¹®ÀÚ , ¼Ò¹®ÀÚ 
		char alpha='È«';
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"´Â(Àº) ´ë¹®ÀÚÀÔ´Ï´Ù");
		if(alpha>='a' && alpha<='z')
			System.out.println(alpha+"´Â(Àº) ¼Ò¹®ÀÚÀÔ´Ï´Ù");
		if(alpha>='0' && alpha<='9')
			System.out.println(alpha+"´Â(Àº) ¼ýÀÚÀÔ´Ï´Ù");
		if(alpha>='°¡' && alpha<='ÆR')
			System.out.println(alpha+"´Â(Àº) ÇÑ±ÛÀÔ´Ï´Ù");
		//Æ¯¼ö¹®ÀÚ 
		if(alpha=='\t' || alpha=='\n')
			System.out.println("Æ¯¼ö¹®ÀÚ ÀÔ´Ï´Ù");
		
	}

}





