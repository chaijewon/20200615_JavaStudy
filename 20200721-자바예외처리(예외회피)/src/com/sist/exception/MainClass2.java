package com.sist.exception;

public class MainClass2 {
    public void disp()
    {
    	
    }
    public void disp1()
    {
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *   int a=10;
		 *   
		 *   a
		 *   10
		 */
		MainClass2 m=new MainClass2();
		m.disp();
		m.disp1();
		
		new MainClass2().disp();
		new MainClass2().disp1();
        try
        {
        	int a=9;
        	if(a%2==0)
        	{
        		ArithmeticException aa=new ArithmeticException("�α���â���� �̵�");
        		throw aa;
        	}
        	else
        	{
        		throw new Exception("ȸ������â���� �̵�");
        	}
        }catch(ArithmeticException e)
        {
        	System.out.println(e.getMessage());
        }catch(NumberFormatException e)
        {
        	System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println(e.getMessage());
        }catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
	}

}
