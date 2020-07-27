package com.sist.lib;
/*
 *    ArrayList 사용법 , Vector사용법 , Map
 *    
 *         List
 *         ====
 *          |
 *      ----------------------------
 *      접근성 => 데이터 찾아서 출력 
 *      ArrayList Vector LinkedList
 *      --------- ------
 *        동기화/비동기화 
 */
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //ArrayList<String> names=new ArrayList<String>();
		//Vector<String> names=new Vector<String>();
		LinkedList<String> names=new LinkedList<String>();
        // => 메모리안에는  => 문자열만 저장 
        names.add("홍길동"); // 0
        names.add("심청이"); // 1
        names.add("이순신"); // 2
        names.add("강감찬"); // 3
        names.add("춘향이"); // 4
        
        System.out.println("저장된 갯수:"+names.size());
        // 출력 
        for(int i=0;i<names.size();i++)
        {
        	// 데이터를 받을 때 
        	String name=names.get(i);
        	// 원하는 위치에 저장된 데이터 읽기 
        	
        	System.out.println(name+":"+i);// 인덱스는 자동 생성 => 0번 부터 시작 
        }
        
        // 원하는 위치에 출력 
        // add() => 5
        // add(index,"값")
        names.add(3,"을지문덕");
        /*
         *    names.add("홍길동"); // 0
              names.add("심청이"); // 1
              
              names.add(3,"을지문덕");//2
              names.add("강감찬"); // 3
              names.add("춘향이"); // 4
         */
        for(int i=0;i<names.size();i++)
        {
        	// 데이터를 받을 때 
        	String name=names.get(i);
        	// 원하는 위치에 저장된 데이터 읽기 
        	
        	System.out.println(name+":"+i);// 인덱스는 자동 생성 => 0번 부터 시작 
        }
        
        // 삭제 
        names.remove(2);
        for(int i=0;i<names.size();i++)
        {
        	// 데이터를 받을 때 
        	String name=names.get(i);
        	// 원하는 위치에 저장된 데이터 읽기 
        	
        	System.out.println(name+":"+i);// 인덱스는 자동 생성 => 0번 부터 시작 
        }
        
        // 수정 
        names.set(2, "박문수");
        for(int i=0;i<names.size();i++)
        {
        	// 데이터를 받을 때 
        	String name=names.get(i);
        	// 원하는 위치에 저장된 데이터 읽기 
        	
        	System.out.println(name+":"+i);// 인덱스는 자동 생성 => 0번 부터 시작 
        }
        
        names.clear();// 전체 삭제 
        System.out.println("저장된 갯수:"+names.size());
	}

}






