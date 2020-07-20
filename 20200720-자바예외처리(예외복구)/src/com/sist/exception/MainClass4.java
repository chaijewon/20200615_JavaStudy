package com.sist.exception;
/*
 *   ���� ó�� ==> ����Ǵ� ������ ������ �ִ� ��� 
 *   try
 *   {
 *        ���������� ����Ǵ� ���� 
 *   }catch(����Ǵ� ����Ŭ����)
 *   {
 *        ����ó�� 
 *   }
 *   catch(����Ǵ� ����Ŭ����)
 *   {
 *        ����ó��  
 *   }
 *   catch(����Ǵ� ����Ŭ����)
 *   {
 *        ����ó��
 *   }
 *   
 *   catch�� ������ ���ÿ��� ������ ���簡 �ִ� 
 *   ����ó�� ���� ���� 
 *   ==============
 *           �ֻ��� Ŭ���� => ��� Ŭ������ ���� Ŭ���� 
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
 *                 CheckException          RuntimeException => ����
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
			System.out.println("������ȯ�� �ȵ�");
		}
		/*
		 * catch(ArrayIndexOutOfBoundsException e) { System.out.println("�迭������ ��� ���");
		 * }
		 */catch(ArithmeticException e)
		{
			System.out.println("0���� ���� ���");
		}
		/*
		 * catch(RuntimeException e)// ���� ���ߴ� ���� => ó�� {
		 * System.out.println("����� ��� ������ ó��"); } catch(Exception e) // exception {
		 * System.out.println("������ ������ ��� ������ ó�� "); } catch(Throwable e) // error,
		 * exception { System.out.println("���ܿ� ������ ���� ó��"); }
		 */
		System.out.println("���α׷� ����!!");
	}

}





