/*
 *   ��� 
 *   =====
 *     1) ���ǹ� 
 *         = ���� ���ǹ�  ==> �ܵ� ���� 
 *           => if(���ǹ�) => ���ǹ� (true/false) �񱳿�����,��������,����������
 *              {
 *                 ���ǹ��� true�� �����ϴ� ���� : ���������,���Կ�����
 *              }
 *         = ���� ���ǹ�  ==> true/false ������ ó��
 *           => if(���ǹ�)
 *              {
 *                   ���ǹ� => true ó������ 
 *              }
 *              else
 *              {
 *                   ���ǹ� => false ó������ 
 *              }
 *              ==> ID�ߺ�üũ => ����
 *         = ���� ���ǹ� ==> �Ѱ��� ���Ǹ� ���� 
 *           if(���ǹ�)
 *           {
 *              
 *           }
 *           else if(���ǹ�)
 *           {
 *              
 *           }
 *           else if(���ǹ�)
 *           {
 *           }
 *           else if(���ǹ�)
 *           {
 *           }
 *           else
 *           {
 *              ������ ���� ��쿡 ó�� => ������ ����
 *           }
 *     2) ���ù�
 *           => ������ ���� �ִ� ��쿡 �ַ� ��� (web=> ����=> if)
 *           => ���� 
 *           => �Ѱ��� ���� ���ýÿ� ó�� 
 *              => ��Ʈ��ũ 
 *           switch(����,����,���ڿ�)
 *           {
 *             case ����:
 *               ó�� 
 *               break;
 *             case ����:
 *               ó�� 
 *               break;
 *             case ����:
 *               ó�� 
 *               break;
 *             default:
 *                �ش� ������ ���� ��� 
 *           }
 *     3) �ݺ���
 *           ***= for : Ƚ���� ���� ....
 *                = ���� => �� ����,���� , �ٸ� ��� : �Ϲ� for
 *                  for(�ʱⰪ;���ǽ�;������)
 *                  {
 *                       ó�� ���� 
 *                       ó�� ����
 *                  } 
 *                = ���
 *                  for(���� �����͸� ���� ����:����� ������) => web,mobile
 *                  
 *                  ���� : JSP,Spring,Oracle
 *                  Ŭ���̾�Ʈ : HTML,CSS,JavaScript
 *           ***= while : => �������� ...
 *           (X)= do~while
 *     4) �ݺ���� 
 *           break; ����
 */
import java.io.*;
public class ������� {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        String data="";
        FileReader fr=new FileReader("c:\\javaDev\\a.txt");
        int i=0;
        while((i=fr.read())!=-1)
        {
        	data+=String.valueOf((char)i);
        }
        
        System.out.println(data);
	}

}






