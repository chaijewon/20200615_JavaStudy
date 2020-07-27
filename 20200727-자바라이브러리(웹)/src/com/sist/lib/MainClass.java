package com.sist.lib;
/*
 *    라이브러리 => import
 *    ========
 *      1. java.lang
 *         = Object :최상위 클래스 
 *            = clone() : 복제 
 *            = finalize() : 소멸자 
 *            = toString() : 객체를 문자열로 변환 
 *         = String (StringBuffer)
 *            = substring() : 문자를 추출 
 *            = indexOf(),lastIndexOf() => 문자를 찾는 경우 (MVC) 
 *            = trim() : 로그인 처리 , 사용자 입력값 
 *            = equals() : 실제 저장된 문자열을 비교 => 로그인처리 , 우편번호...
 *            = length() : 문자 갯수
 *            = valueOf() : 유일하게 => static => 모든 데이터형을 문자열 변환 
 *            = join() :변환 
 *            *** StringBuffer : append() :문자열 
 *         = Wrapper : 클래스 형변환 , 문자열을 다른 데이터형으로 변경 
 *            = Integer : parseInt() : 정수형변환 
 *            = Double  : parseDouble() : 실수형변환 
 *            = Boolean : parseBoolean() : "true" => true, "false"=>false
 *         = Math
 *            = random(), ceil():올림 (총페이지)
 *         = System
 *            = gc(): 메모리 회수,exit():프로그램 종료 
 *            = web => 자동 메모리회수 (톰캣)
 *      2. java.util
 *         = StringTokenizer : 문자를 분해  => split() => 정규식 
 *           ===============
 *             = nextToken() : 한개의 구분 문자를 자른다 
 *             = hasMoreTokens() : 자르 갯수만큼 루프
 *         = Date , Calendar
 *           Date : 시스템의 시간 , 날짜 읽기 
 *                  Date date=new Date() => date.toString()
 *           Calendar : 요일 구하기 , 달의 마지막 날짜 읽기 
 *                      날짜 등록 => 월  (1....) month-1
 *                                요일 => week-1
 *         = Collection 
 *           ==========
 *             = ArrayList : 비동기화 => 데이터베이스 
 *             = Vector :  동기화  => 네트워크에서 사용자 관리 (네트워크)
 *             = HashMap : 키,값 ==> 키(일반문자열) , 값(클래스 주소) ==> 클래스 관리 
 *               ========
 *                 = MyBatis : Mapper(데이터베이스 연결)
 *                 = Spring : Web
 *             = 장점 : 모든 클래스,데이터를 한번에 저장 => Object => 형변환 
 *                     ========================
 *                      배열(고정),가변 
 *             = 단점을 변경 => 제네릭스 프로그램 
 *               <원하는 데이터형> : 데이터형의 통일 
 *          ============================================================
 */
import java.util.*;
import java.text.*;// 변환 (시간,날짜) => SimpleDateFormat()
// yyyy 년도 => yy , 월 => M(MM) , 일 => dd(d) , 시간 (h)hh , 분(mm),초 (s)
//                  ==========                =========
//                        h(1~12) , H(0~23)
public class MainClass {
    /*
     *   cal.set(Calendar.YEAR,year);
		 cal.set(Calendar.MONTH,month-1); //0-1
		 cal.set(Calendar.DATE, 1);
		
		 System.out.println(cal.get(Calendar.YEAR));
		 System.out.println(cal.get(Calendar.MONTH)+1);
		 System.out.println(cal.get(Calendar.DATE));
		 System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1); 
		 int week=cal.get(Calendar.DAY_OF_WEEK)-1;
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date date=new Date();
        System.out.println(date.toString());// 표준 시간을 읽어 온다 
        //변환  => 544page
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println(sdf.format(date));
        // 자바 = 오라클  => java.util.Date 
        
	}

}







