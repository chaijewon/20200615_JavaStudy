/*
 *    Ŭ���� 
 *    =====
 *      = ���� => �������� ���� �Ҷ� (�ݵ�� �������� ���� ������)
 *                              =======================
 *                                 �߻�ȭ 
 *        ��)
 *            ��ȭ ���� 
 *            =======
 *            ��ȭ�� , ����, �⿬ , �帣 , ���� , �ٰŸ� 
 *        ������ ���� 
 *        ========= 246page
 *         
 *          ���α׷��� ���� 
 *          ========================================================
 *          = ������� => new�� ����� ������ ���� ����Ǵ� ���� 
 *            (�ν��Ͻ�����)
 *            *** �޸� ��������� ���� => new�̿��Ҷ� ��������� 
 *            *** heap : ���α׷��Ӱ� �����ϴ� ���� (�ڵ�ó���� �ȵȴ�) 
 *                       �޸𸮸� ������� ���� ��� (����ó��,GC)
 *          = �������� => �޸𸮰� �Ѱ� => �������� ���Ǵ� ���� 
 *            (��������) => static 
 *            *** �����Ϸ��� �������Ҷ� �ڵ����� ���� 
 *            *** �޼ҵ念�� (static,�޼ҵ�)
 *          =========================================================
 *          
 *          = �������� => �������� , �Ű����� 
 *            *** �޸𸮰� �����Ǵ� ���� => �޼ҵ� ȣ��ÿ� 
 *            *** �޸𸮰� ��ü ���� {}�� ����� �ڵ� ȸ�� ==> stack(LIFO)
 *            int a;
 *            int b;
 *            int c; => ����
 *      
 *      =   ������ 
 *            => ��������� �ʱⰪ �ο�   
 *            => ����� �̿��ϰų� ,���� �б� ....
 *               �����ϰ� �����Ͱ��� ������ �ö� , ���� 
 *               => ���� (�ڵ����� �����Ϸ��� �߰�=> default������ => �Ű������� ���� ������)
 *               => �����ڴ� �ݵ�� �ʿ��ϴ� 
 *               => �޸𸮿� ����(Ŭ����) ==> ȣ��Ǵ� �޼ҵ� 
 *                  ==========
 *                  new ������() ==> �ѹ��� ȣ���Ѵ� => this(�ڽ�)
 *      =   �޼ҵ� : ��� 
 *           �޼ҵ� : ����� , ������ 
 *           ������ �޼ҵ��(�Ű�����....) => �����
 *           {
 *                ������ 
 *           }
 *           =======> �����+������ = ���� 
 *            = �ν��Ͻ� �޼ҵ� : Ŭ�������� ���� ����ϴ� �޼ҵ�
 *            = ���� �޼ҵ� ===> static => ��� Ŭ���� �������� ���Ǵ� �޼ҵ�
 *            ***= �߻� �޼ҵ� ===> ����θ� ���� (377page)
 *                 ������ �ȵ� �޼ҵ� => ���α׷��Ӱ� ������ ��� 
 *      
 */
class Student{
	// �л� 1�� ���� ���� ==> �޸� ���� ������ ���� �� �ִ� (new)
	String name;
	String subject;
	int year;
	static String school;// �޸𸮿� ���� 
	/*
	==> 292 page
	Student(){
		
	}*/

}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // static���� ��� 
		Student.school="SIST";
		Student s=new Student(); // name,year,subject => ���� (s��� �ּҿ� ����)
		System.out.println(s);
		// Student@7852e922
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		
		s.name="ȫ�浿";
		s.subject="���߰�";
		s.year=3;
		/// �޼ҵ嵵 ���� 
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		System.out.println(Student.school);
		Student s1=new Student();
		System.out.println(s1);
		System.out.println(s1.name);//null
		System.out.println(s1.subject);//null
		System.out.println(s1.year);//0
		s1.name="��û��";
		s1.subject="�����";
		s1.year=2;
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		System.out.println(Student.school);
		
		String ss="Hello Java";
		ss.replace('H', 'K');
		String ss1="1234567890";
		String.valueOf(10);
	}

}



