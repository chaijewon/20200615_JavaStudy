import java.util.*;
public class ���ù�2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        int menu=0;
        Scanner scan=new Scanner(System.in);
        System.out.println(
           "===== �޴� =====\n"
          +"Ȩ(1)\n����󿵿�ȭ(2)\n����������ȭ(3)\n�ڽ����ǽ�(4)\n"
          +"��ȭ����(5)\n��ȭ����(6)\n"
          +"=============="
        );
        System.out.println("�޴� �����ϼ���?");
        menu=scan.nextInt();
        
        switch(menu)
        {
         case 1:
        	 Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/main/new#slide-2-0");
        	 //break;
         case 2:
        	 Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/main/new#slide-2-0");
        	 //break;
         case 3:
        	 Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/main/new#slide-2-0");
        	 //break;
         case 4:
        	 Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/main/new#slide-2-0");
        	 //break;
         case 5:
        	 Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/main/new#slide-2-0");
        	 //break;
         case 6:
        	 Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe https://movie.daum.net/main/new#slide-2-0");
        	 //break;
         default:
        	 System.out.println("�޴��� �������� �ʽ��ϴ�");
        }
	}

}
