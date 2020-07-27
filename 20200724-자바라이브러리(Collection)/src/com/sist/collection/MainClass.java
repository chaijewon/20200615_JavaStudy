package com.sist.collection;

import java.util.ArrayList;

/*
 *    Collection 
 *    =========== 자료구조 
 *    메모리 저장해서 사용시 편리하게 사용이 가능 
 *    => 사용되는 프로그램 : 입출력 => CURD => 단점 (메모리) <=> 파일
 *                                    => 모든 데이터 저장이 가능 
 *                                    10
 *                                    10.5
 *                                    "aaa"
 *                                    "ccc"
 *                                    'A'
 *                                    100
 *                                    "bbb"
 *                                    "ccc"
 *                                    10.5
 *                                    'K'
 *                              CURD => 읽기,저장 , 삭제 , 수정 
 *                                      저장 갯수
 *                             라이브러리 => 모든 개발자 동일 => 표준화
 *                             읽기 : get(0)
 *                             갯수 : size()
 *                             수정 : set()
 *                             삭제 : remove()
 *                             저장 : add()
 *    => 가변형 => 배열 
 *    => 종류 
 *    1) 순서가 존재 중복된 데이터 추가 
 *       List(인터페이스) ======> 데이터베이스 
 *         => 구현한 클래스 
 *         ***ArrayList : 비동기
 *         ***Vector  : 동기 
 *         LinkedList
 *         Queue
 *         Stack
 *    2) 순서가 없고 중복이 없는 데이터 추가 ====> 탐색기 
 *       Set
 *         HashSet
 *         TreeSet
 *    3) 키,데이터 ==> 두개를 동시에 저장  ===> 클래스 관리 (Spring)
 *       Map
 *         Hashtable
 *         ***HashMap
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
		/*
		 * // 추가 list.add(10);//0 list.add(10.5);//1 list.add("홍길동");//2
		 * list.add('A');//3 // 값 읽기 int a=(int)list.get(0); double
		 * d=(double)list.get(1); String s=(String)list.get(2); char
		 * c=(char)list.get(3);
		 * 
		 * System.out.println(a); System.out.println(d); System.out.println(s);
		 * System.out.println(c);
		 *  {"","","","",""}
		 */
        list.add("홍길동");//0
        // list.add("강감찬"); 1
        list.add("심청이");//2
        list.add("이순신");//2
        list.add("박문수");//3 2
        list.add("춘향이");//4 3
        
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
        
        list.remove(2);
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
        
        list.add(1, "강감찬");// 인덱스번호 = 1에 저장 
        /*       ==> 3 추가
         *    0      0
         *    1      1
         *    2      2
         *    3      => 3추가
         *    4      4
         *           5
         *           
         *       ==> 2삭제
         *    0       0
         *    1       1
         *    2      ==> 삭제
         *    3       2
         *    4       3
         */
        for(int i=0;i<list.size();i++)
        {
        	String name=(String)list.get(i);
        	System.out.println(name);
        }
	}

}








