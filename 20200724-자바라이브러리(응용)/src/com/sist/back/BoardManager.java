package com.sist.back;
import java.util.*;
public class BoardManager {
   private static ArrayList<BoardVO> list=
		     new ArrayList<BoardVO>();
   public int sequence()// �ڵ� ���� ��ȣ ���� 
   {
	   int max=0;
	   for(BoardVO vo:list)
	   {
		   if(max<vo.getNo())
			   max=vo.getNo();
	   }
	   return max+1;
   }
   // �߰� 
   public void insert(BoardVO vo)
   {
	   vo.setRegdate(new Date());
	   vo.setNo(sequence());
	   list.add(vo);
   }
   // ��� ��� 
   public ArrayList<BoardVO> select()
   {
	   return list;
   }
}



