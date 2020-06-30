/*
 *    1
 *    2 2
 *    3 3 3
 *    4 4 4 4
 *    5 5 5 5 5
 *    
 *    1차 for  ==> 5  ==> 1~5
 *    2차 for  ==> 1-1 , 2-2 , 3-3 , 4-4 , 5-5
 *    1  1    ==> i=j ==> j<=i
 *    2  2
 *    3  3
 *    4  4
 *    5  5
 *    
 *    1
 *    12
 *    123
 *    1234
 *    12345
 *    
 *    11111
 *    2222
 *    333
 *    44
 *    5
 *    
 *    i   j
 *    1   5
 *    2   4
 *    3   3
 *    4   2
 *    5   1   i+j=6   ==> j=6-i
 *    
 *    제어문 (반복문) ==> 수학 (초등학교 6학년) ==> 이산수학 (AI)
 *    
 */
public class 반복문_2차for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)// 줄수 
        {
        	for(int j=1;j<=6-i;j++)
        	{
        		// 정수 출력 
        		System.out.print(i);
        	}
        	System.out.println();
        }
	}

}
