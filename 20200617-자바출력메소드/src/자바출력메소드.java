/*
 *   ȭ�� ��� 
 *     = System.out.println() => ������ ��� 
 *       ��) 
 *           System.out.println("Hello");
 *           System.out.println("Java");
 *           Hello
 *           Java
 *           
 *     = System.out.print()
 *           System.out.print("Hello");
 *           System.out.print("Java");
 *           
 *           HelloJava
 *     = System.out.printf() : ������ �ִ� ��� 
 *     
 *       80 80 80 240  80.0  B
 *       
 *       System.out.println("80 80 80 240  80.0  B")
 *       
 *       System.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,'B')
 *       
 *       %5d   80
 *       00080
 *       %-5d
 *       80000
 *       
 *       %5.2f   80.0
 *       080.00
 */
public class �ڹ���¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.printf("%.1f",80); int a=2; int b=2;
		 * System.out.println(a+"*"+b+"="+a*b); System.out.printf("%d*%d=%d",a,b,a*b);//
		 * JDK 1.5
		 */        
        /*
         *  %d  => ����
         *  %f  => �Ǽ�
         *  %c  => ����
         *  %s  => ���ڿ�
         */
        //System.out.println(~100);
		System.out.println(Integer.toBinaryString(240));// ������
		System.out.println(Integer.toHexString(240));// 16����
		System.out.println(Integer.toOctalString(240));// 8���� 
		/*
		 *  11110000
             f0
             360

		 */
		System.out.println(0xf0);
		System.out.println(0360);
		System.out.println(0b11110000);
		System.out.println(~100);
	}

}









