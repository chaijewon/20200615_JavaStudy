/*
 *    1) ������ 10��(��ȭ����)�� ������ ���� �޼ҵ��� ������ �ۼ��Ͻÿ�
 *       String[] movieList();
 *    2) ����ڰ� ID,PWD�� �Է��ϸ� => �α��� (true) , ����(false)
 *       boolean login(String id,String pwd)
 *    3) ��ȭ ��ȣ�� �Ѱ��ָ� => �帣�� �Ѱ��ִ� �޼ҵ� 
 *       String getGenre(int no)
 *    4) �˻��� �ϸ� ã�� ��ȭ���� �Ѱ��ִ� �޼ҵ� ���� 
 *       String movieFind(String ss)
 *    5) ��ȭ ���� ���� 5���� �Ѱ��ִ� �޼ҵ� ���� 
 *       String[] pop5()
 *       
 *       ==> ������ ���� 
 *           ==> ���� 
 *               1) ��ȯ��
 *               2) ����ڰ� �����ִ� ������ 
 *               
 *               ��) ID �ߺ�üũ
 *                  ==========
 *                    boolean idCheck(String id)
 *                  �����ȣ ã�� 
 *                    String[] postFind(String dong)
 *                    
 *                  �˻� => �˻��� ������ ��� 
 *                    String[] find(String ss)
 *                    
 *                  ���� 
 *                    String[] review(String re)
 *                    
 *                    
 *                  �޼ҵ� : ����ڰ� ��û�� �� (����) 
 *                         ��û ó�� => ������� ?
 *                         ==> ����
 *                         
 *                         
 *    ====================================================
 */
import java.io.*;
import java.net.*;
public class �ڹٸ޼ҵ�4 {
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






