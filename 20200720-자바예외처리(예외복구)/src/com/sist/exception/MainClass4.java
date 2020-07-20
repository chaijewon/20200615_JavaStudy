package com.sist.exception;
/*
 *   다중 처리 ==> 예상되는 에러가 여러개 있는 경우 
 *   try
 *   {
 *        정상적으로 실행되는 문장 
 *   }catch(예상되는 예외클래스)
 *   {
 *        에러처리 
 *   }
 *   catch(예상되는 예외클래스)
 *   {
 *        에러처리  
 *   }
 *   catch(예상되는 예외클래스)
 *   {
 *        에러처리
 *   }
 *   
 *   catch를 여러개 사용시에는 순서가 존재가 있다 
 *   예외처리 계층 구조 
 *   ==============
 *           최상위 클래스 => 모든 클래스의 상위 클래스 
 *             Object
 *                |
 *            Throwable
 *                |
 *        ------------------------
 *        |                      |
 *       Error               Exception 
 *                               |
 *                    ---------------------------
 *                    |                         |
 *                IOException
 *                SQLException
 *                ClassFoundException
 *                MalformedURLException
 *                InterruptedException
 *                ===
 *                ===
 *                =====================         |
 *                 CheckException          RuntimeException => 생략
 *                                              |
 *                                            NumberFormatException
 *                                            ArithmeticException
 *                                            NullPointerException
 *                                            ArrayIndexOutOfBoundsException
 *                                            ClassCastException
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr=new int[2];
			arr[0]=100;
			arr[2]=0;// error
			
			int a=arr[0]/arr[1];
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("정수변환이 안됨");
		}
		/*
		 * catch(ArrayIndexOutOfBoundsException e) { System.out.println("배열범위가 벗어난 경우");
		 * }
		 */catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 경우");
		}
		/*
		 * catch(RuntimeException e)// 예상 못했던 에러 => 처리 {
		 * System.out.println("실행시 모든 에러를 처리"); } catch(Exception e) // exception {
		 * System.out.println("수정이 가능한 모든 에러를 처리 "); } catch(Throwable e) // error,
		 * exception { System.out.println("예외와 에러를 동시 처리"); }
		 */
		System.out.println("프로그램 종료!!");
	}

}





