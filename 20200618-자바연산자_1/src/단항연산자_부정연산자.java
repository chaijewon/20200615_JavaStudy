/*
 *    ���� ������ :  !
 *      => true=>false , false=>true
 *      => ����� : boolean
 *      
 *         ���� : ���� => int
 *               ���� => boolean
 *         ���� :
 *            ��� => ?
 *               int + int = int
 *               double + int =double
 *            �� , �� => boolean
 *            
 *            ���׿����� 
 *              ����?��1:��2
 *              sex==1?"����":"����"
 *              sex==1?'M':'W'
 */
public class ���׿�����_���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean bCheck=true;
        bCheck=!bCheck;// true�� �ݴ밪�� �����Ѵ�
        for(int i=0;i<10;i++)
        {
          bCheck=!bCheck;
			/*
			 * if(bCheck==true) { System.out.println("����"); } else {
			 * System.out.println("��ǻ��"); }
			 */
          //System.out.println("bCheck="+bCheck);
        }
	}

}






