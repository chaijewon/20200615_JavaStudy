// ����ڰ� ���� ���������� ����� 
class MovieInfo{
	// ������� , �ν��Ͻ� ���� => �޸� ������ ���� ==> new 
	String title;
	String director;
	String actor;
	double reserve;
	int rank;
	static String site_name;
	// �޼ҵ� => title => ��
}
// MovieInfo m1=new MovieInfo()
// 
class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MovieInfo m1=new MovieInfo();
        // int m1=10
        // m1=> �޸𸮿� ����Ǿ� �ִ� ������ �ʱⰪ  MovieInfo[] m=new MovieInfo[50];
        m1.title="#����ִ�(2020)";
        m1.director="������";
        m1.actor="������, �ڽ���";
        m1.reserve=17.3;
        m1.rank=1;
        m1.site_name="CGV";
        
        MovieInfo m2=new MovieInfo();
        // m1=> �޸𸮿� ����Ǿ� �ִ� ������ �ʱⰪ
        m2.title="�㽩: ������ �ٲ� ��ź����(2019)";
        m2.director="���� ��ġ";
        m2.actor="�������� �׷�, ���� Ű���, ���� �κ�";
        m2.reserve=12.6;
        m2.rank=2;
        m2.site_name="�Ե��ó׸�";
        
        MovieInfo m3=new MovieInfo();
        // m1=> �޸𸮿� ����Ǿ� �ִ� ������ �ʱⰪ
        m3.title="��ũ ����Ʈ ������(2012)";
        m3.director="ũ�������� ���";
        m3.actor="ũ������ ����, ����Ŭ ����, �Ը� �õ常, �� �ؼ�����, �� �ϵ�, ������ �����";
        m3.reserve=7.8;
        m3.rank=3;
        m3.site_name="�ް��ڽ�";
        
        MovieInfo.site_name="�������";
        
        System.out.println("��ȭ��:"+m1.site_name);
        m3.title="�� ����(2011)";
        System.out.println("��ȭ����:"+m1.title);
        System.out.println("��ȭ����:"+m3.title);
        
	}

}


