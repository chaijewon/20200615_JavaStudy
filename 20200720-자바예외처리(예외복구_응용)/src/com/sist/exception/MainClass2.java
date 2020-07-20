package com.sist.exception;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	
        }catch(ArithmeticException e)
        {
        	
        }catch(ArrayIndexOutOfBoundsException e)
        {
        	
        }catch(NumberFormatException e)// web에서 주로 출력하는 error
        {
        	
        }
        
        try
        {
        	
        }catch(RuntimeException e) {}
        
        try
        {
        	
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException | 
        		NumberFormatException e)
        {
        	
        }
	}

}
