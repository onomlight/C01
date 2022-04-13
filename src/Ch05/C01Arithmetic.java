package Ch05;

import java.util.Scanner;

public class C01Arithmetic {

	public static void main(String[] args) {
		// 기본 산술연산자 
//		int a = 10, b=3;
//		System.out.println("a + b = " +(a + b));
//		System.out.println("a - b = " +(a - b));
//		System.out.println("a * b = " +(a * b));
//		System.out.println("a / b = " +(a / b));
//		
		// >> %연산자를 제일 신경써야함
//		System.out.println("a % b = " +(a % b)); /// 짝홀수 / 배수구분 / 범위제한 / 자리수
		
		
		// 대입연산자
		// 공간 = 값 (먼저처리)
		
		// 복합대입연산자
		
//		int a = 10 , b=4;
//	//	System.out.println(a+b); >> a+b를 출력함
//		
//		System.out.println("a+=b ?" + (a+=b));  // a= a + b 14가 들어가있는 상태에서 출력
//		System.out.println("a-=b ?" + (a-=b));  // a= a - b 14에서 값이 되어있는게 10이 출력
//		System.out.println("a*=b ?" + (a*=b));  // a= a * b a 안에 있는 값이 나옴
//		System.out.println("a/=b ?" + (a/=b));  // a= a / b
		
		
		
		// 비교연산자 (대소관계 비교, true/false를 반환) / 조건식 .. 흐름처리나 제어할때 씀 
		// 참(ture) : 프로그래머가 원하는 결과값이 나오는 경우
		// 거짓(false):x 
		
//		int a = 10; int b = 20 ;
//		
//		System.out.println("a == b ? " + (a == b)); 
//		// a=b b를 a에게 넣겠다라는 의미 대입연산자, == (T/F비교함)동등비교연산자 헷갈리기없기
//		
//		System.out.println("a >  b ? " + (a >  b));
//		System.out.println("a >= b ? " + (a >= b));
//		System.out.println("a <  b ? " + (a <  b));
//		System.out.println("a <= b ? " + (a <= b));
//		System.out.println("a != b ? " + (a != b));

		
		
		// 논리연산자
//		int a = 10 ; int b = 20 ; int c = 15 ;
		
		// AND 연산자(&&) : 둘다 true 여야 true로 변환  
		//하나라도 참이아니면 false
//		System.out.println((a>=b)&&(b>=c)); // false       &&   true;
//		System.out.println((a<=b)&&(b<=c)); // true        &&   false
//		System.out.println((a<=b)&&(b>=c)); // true        &&   true;
//		System.out.println((a>=b)&&(b<=c)); // false       &&   false;
//		
//		System.out.println();
//		
//		//OR 연산자(||) : 둘중하나라도 true라도 true 로 변환
//		
//		System.out.println((a>=b)||(b>=c)); // false       &&   true;
//		System.out.println((a<=b)||(b<=c)); // true        &&   false
//		System.out.println((a<=b)||(b>=c)); // true        &&   true;
//		System.out.println((a>=b)||(b<=c)); // false       &&   false;
//		System.out.println();
//		// ! : 논리 부정 연산자
//		//>>  연산을 위해 넣기도함 
//		
//		boolean flag = false ;
//		System.out.println("!flag = " + !flag);
//		-----------------------------------------------------------------------------
		// 증감 연산자 (++,--)
		
		
		// 전치 연산자 : ++a,--a  : 변수안의 값을 1증가(or 1 감소)를 먼저 연산한다음 다른 연산 처리
		// 후치 연산자 : a++,a--; : 다른 연산처리를 다 완료한 다음 1증가(or 1 감소)
		
//		int a = 10 , b = 20 , c = 0 , d = 0;
//		
//		c = ++a + b--; // a = 11  b =19 c= 31 
//		// ++ 부터 먼저 연산함 
//		
//		d = b++ + ++a; // a = 12  b =22   d = 33 
//		System.out.println(a + " " + b + " " + c + " " + d);
		
//		int a = 10 , b = 20, c=15 , d=0;
//		boolean flag;
//		//flag =(++a>b) && (++b>c); // f 이기때문에 오른쪽 값은 처리하지않아 증가하지않음 / 11 20 15 0
//		flag =(++a<b) && (++b>c); // F 이기에 /  11 21 15 0
//		System.out.println(a + " " + b + " " + c + " " + d);
//		----------------------------------------------------------------------------------
		// 삼항 연산자 >> if 문으로 다 대체가 가능함 / 문법이 간단해서 별로 안씀 / if 문이라는 문법을 가장많이사용함
		
//		int score = 85;		
//		char grade = (score>90)? 'A': 'B' ;
//		
//		System.out.println("grade?" + grade);
		
		// 문제
		// 조건식 : 국어>=40&영어>=40&수학>=&평균>=70 -> 합격
		// 키보드로 국/영/수 점수를 입력 받아 각각의 부분점수가 40점 이상이고
		// 총 점수가 평균이 70점 이상이면 '합격'
		// 미만이면 '불합격'으로 출력합니다.
		
//		int kor=0,eng=0,mat=0;
//		double avg=0.0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("국영수 점수 입력 : ");
//		kor = sc.nextInt();
//		eng = sc.nextInt();
//		mat = sc.nextInt();
//		avg = (double)(kor+eng+mat)/3;
//		String result = (kor>=40&&eng>=40&&mat>=40&&avg>=70)
//				?"합격":"불합격";
//		
//		System.out.println(result);
//		
		// 비트 연산자 > 보고넘어감 조건으로 보고 넘어가나 '&' 보면 비트단위로봄 
		int num1 = 15; // 0000000 00000000 00000000 00001111
		int num2 = 20; // 0000000 00000000 00000000 00010100
		int num3 = num1&num2; //>>> 겹치는거
		int num4 = num1|num2; // 다있는거
		int num5 = num1^num2; //  xor 연산 , c 언어 ,. 이미지와 알고리즘할때 씀 // 00000000 000000 00000000000 00011011
		int num6 = ~num1; // 비트반전시키는 형 // 11111111 11111111 11111111 11110000
		
		
		int num7 =num1<<2; // 시프트 연산자 // 왼쪽으로 두칸을 비트 밀어버림 0000000 0000000 0000000 00001111 > 00111100
		int num8 =num1>>3;
		
		System.out.println(" AND 비트 연산 : "  + num3);
		System.out.println(" OR 비트 연산 : "  + num4);
		System.out.println(" XOR 비트 연산 : "  + num5);
		System.out.println(" NOT 비트 연산 : "  + num6);
		System.out.println(" << 시프트 연산 : "  + num7);
		System.out.println(" >> 비트 연산 : "  + num8);
//		
		 
		
		//시프트 연산자
		
		
	}

}
