package com.sist.lang;
class Change
{
	int x,y;
	/*
	 *    int => 0
	 *    String => null 
	 *    class => null
	 *    double => 0.0
	 *    boolean => false
	 */
}
// Chang => x=0,y=0
public class MainClass2 {
	/*
	 *     int x=10;
	 *     int y=20;   => x=20,y=10
	 *     
	 *     x=y;  x=20
	 *     y=x;  y=20
	 *     
	 *     int temp=x; temp=10
	 *     x=y; x=20
	 *     y=temp; y=10
	 *     
	 *     
	 *     int a=10;
	 *     
	 *     a=20;
	 *     
	 */
	public void swap2(Change c)
	{
		System.out.println("c="+c);
		int temp=c.x;
		c.x=c.y;
		c.y=temp;
	}
    public void swap(int a,int b)
    {
    	int temp=a;
    	a=b;
    	b=temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MainClass2 m=new MainClass2();
        int x=10;
        int y=20;
        System.out.println("변경전:x="+x+",y="+y);
        m.swap(x,y);
        System.out.println("변경후:x="+x+",y="+y);
        
        Change ccc=new Change();
        System.out.println("ccc="+ccc);
        ccc.x=10;
        ccc.y=20;
        System.out.println("변경전:c.x="+ccc.x+",c.y="+ccc.y);
        m.swap2(ccc);
        System.out.println("변경후:c.x="+ccc.x+",c.y="+ccc.y);
        
	}

}




