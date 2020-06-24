// 3개의 정수를 입력받아서 => 학점 계산 
import java.util.*;
public class 선택문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor=0,eng=0,math=0;
        char score='A';
        //  ====> 프로그램에 필요한 메모리 저장 공간 확보
        // 입력
        Scanner scan=new Scanner(System.in);
        System.out.print("점수 3개를 입력하세요(90 90 90)?");
        kor=scan.nextInt();
        eng=scan.nextInt();
        math=scan.nextInt();
        
        // 결과값을 출력 => 가공 (연산자+제어문)
        // 메소드 ==> 데이터를 가공해서 결과값을 넘겨준다
        switch((kor+eng+math)/30)
        {
        case 10:
        case 9:
        	 score='A';
        	 break;
        case 8:
        	score='B';
        	break;
        case 7:
        	score='C';
        	break;
        case 6:
        	score='D';
        	break;
        //case 5:
        //case 4:
        //case 3:
        //case 2:
        //case 1:
        default:
        	score='F';
        	break;
        }
        
        System.out.println("===== 결과 =====");
        System.out.println("학점 :"+score);
        
	}

}




