package com.sist.abs;
/*
 *    �Խ��� 
 *      => �亯���Խ��� => �亯�ϱ�
 *      => ������Խ��� => ��۴ޱ�
 *      => �������Խ��� => ���ε�
 *      => �ڷ��          => ���ε� , �ٿ�ε� 
 *    ================= �߻�Ŭ���� , �������̽�  
 *    �۾���   ===================> ����
 *    ���뺸�� 
 *    ==================
 *    ���� 
 *    ����     ===================> ���� (����)
 *    ã��
 *    =================
 */
abstract class Board
{
	public abstract void write();
	public abstract void content();
	public void update() {
		System.out.println("�Խù� ����");
	}
	public void delete() {
		System.out.println("�Խù� ����");
	}
	public void find() {
		System.out.println("�Խù� ã��");
	}
	
}
// ��� 
class ReplyBoard extends Board{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("�亯�� �Խ��� �۾���");
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("���뺸��");
	}
	// �ٸ� ��� �߰��� �����ϴ�
    // Board�� ������ �ִ� ����� �����ǰ� ����
}
class DataBoard extends Board{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("�۾���+���ε�");
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("���뺸��+�ٿ�ε�");
	}
	
}
class GalleryBoard extends Board
{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("�۾���+�̹������ε�");
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("���뺸��+�̹������=>�ı�Խ���");
	}
	
}
class ReplyBoard2 extends Board{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("�۾���");
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("���뺸�� + ���");
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== �亯�� �Խ��� =====");
		// Board b=new Board()
        Board b=new ReplyBoard();
        b.write();
        b.content();
        
        System.out.println("===== ������ �Խ��� =====");
        b=new GalleryBoard();
        b.write();
        b.content();
        
        System.out.println("===== �ڷ�� =====");
        b=new DataBoard();
        b.write();
        b.content();
        
        System.out.println("===== ��� �Խ��� =====");
        b=new ReplyBoard2();
        b.write();
        b.content();
	}

}
