// => ��ȭ 
// 1. ��ȭ�� , 2. �⿬ , 3.���� ,4.������ , 5. ���� ==> 5��
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] title={
        		"#����ִ�(2020)",
        		"�㽩: ������ �ٲ� ��ź����(2019)",
        		"��ũ ����Ʈ ������(2012)",
        		"�� ����(2011)",
        		"���(2019)"};
        String[] actor={
        		"������, �ڽ���",
        		"�������� �׷�, ���� Ű���, ���� �κ�",
        		"ũ������ ����, ����Ŭ ����, �Ը� �õ常, �� �ؼ�����, �� �ϵ�, ������ �����",
        		"�� �ؼ�����, �� ���ͰԽ�",
        		"������, ������, ����ȣ"
        };
        String[] director={
        		"������",
        		"���� ��ġ",
        		"ũ�������� ���",
        		"�� ������",
        		"�ڻ���"
        };
        double[] reserve={
        		17.3,12.6,7.8,1.3,1.0
        };
        int[] rank={1,2,3,4,5};
        // �迭 ==> index
        for(int i=0;i<5;i++)
        {
        	System.out.println("��ȭ��:"+title[i]);
        	System.out.println("����:"+director[i]);
        	System.out.println("�⿬:"+actor[i]);
        	System.out.println("������:"+reserve[i]);
        	System.out.println("��ȭ����:"+rank[i]);
        	System.out.println("=======================");
        }
	}

}




