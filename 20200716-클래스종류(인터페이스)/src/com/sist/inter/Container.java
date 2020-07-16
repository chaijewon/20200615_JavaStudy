package com.sist.inter;
import java.util.*;
// �������̽� => ������ Ŭ������ ��� �������̽��� ����(���� �ٸ� Ŭ�����鿡�� ���踦 �ξ��ش�)
// Spring
interface Connection{
	public void connection();
	//default public void aaa() {}
}
class ����Ŭ implements Connection{
	public void connection()
	{
		System.out.println("����Ŭ ����");
	}
}
class DB2 implements Connection{
	public void connection()
	{
		System.out.println("DB2 ����");
	}
}
class MSSQL implements Connection{
	public void connection()
	{
		System.out.println("MSSQL ����");
	}
}
class MySQL implements Connection{
	public void connection()
	{
		System.out.println("MySQL ����");
	}
}
// ���丮 ���� => ������ 
public class Container {
   Map map=new HashMap();
   public Container()
   {
	   map.put("oracle",new ����Ŭ());
	   map.put("db2", new DB2());
	   map.put("mssql",new MSSQL());
	   map.put("mysql", new MySQL());
   }
   public Connection getBean(String key)
   {
	   return (Connection)map.get(key);
   }
}







