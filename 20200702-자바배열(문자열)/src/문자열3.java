/*
 *   ���ڿ��� ������ �� �ִ� ���� : String
 *   String : �Ϲݺ����� ���� 
 *            Ŭ������ ���� => ���(�޼ҵ�)
 *            
 *            �ֿ� ��� 
 *             = ���ڿ� ��  : equals()
 *             = ���� ���� : contains()
 *             = ���ڿ��߿� �Ѱ� ���� : charAt()
 *             = ����� ������ ���� : length()
 *             = ���� �ڸ��� : substring()
 *             = ã�� ������ ��ġ : indexOf(),lastIndexOf()
 *             = ��� ���������� ���ڿ��� ��ȯ => valueOf(2) ==> "2"
 *             = ���鹮�� ���� : trim() => �¿츸 ���� 
 *               " Hello Java " => "Hello Java"
 *             = ���ڿ�=>char[] => toCharArray()
 *             = startsWith,endsWith => �˻��� 
 *             
 *             =========================================
 *             Wrapper Class
 *             =============
 *             �⺻�� ������ (����,�Ǽ�,����,��)
 *             int => Integer => "2"=>2 => parseInt("2") => 2
 *             "10" + "100" ==> 110
 *             ============ 10100
 *             double => Double Boolean, Float,Byte....
 */
// substring : �ʿ��� ���ڸ� ����  => ���¼� �м�(���,�λ�,�����)
/*
 *    "Hello Java"  ==> String => char[]
 *           ====
 *     0123456789
 *       ===
 *    substring(6)
 *    substring(int start,int end)
 */
public class ���ڿ�3 {
  public static void main(String[] args) {
	String msg="100-010";
	//          0123456
	System.out.println(msg.substring(0,3));
	System.out.println(msg.substring(4,7));
	System.out.println(msg.substring(4));
  } 
}







