package com.sist.string;
// join,format,valueOf => static
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr={"ȫ�浿","��û��","�ڹ���","�̼���","������"};
        System.out.println(String.join("-", arr));
        
        String str=String.format("%d - %d = %d", 10,2,10-2);
        System.out.println(str);
	}

}
