package Ch04;

import java.util.Scanner;

// import >> 스캐너라는 자료형의 위치가 어디인지 알려줌 경로를 명시를해줘야 사용가능함


public class C02Scanner {

	public static void main(String[] args) {
		// 문제
		// 국(kor)영(eng)수(mat) 점수를 Scanner로 입력받아
		// 총합과 평균을 구해보세요
		// 평균값은 소수점을 포함하여 출력합니다
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" 국영수 점수 : ");
//		int kor = sc.nextInt();
//		int eng = sc.nextInt();
//		int mat = sc.nextInt();
//		int sum = kor + eng + mat;
//		double average = sum /3 ;
//
//		System.out.println("sum : " + sum);
//		System.out.println("average : " + average );
// 내가한것
		
		int kor; int eng; int mat;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국영수 입력 : " );

		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		sum = kor + eng + mat;
		System.out.println("총합 : " + sum);
		System.out.println("총합 : " + (double)(kor + eng + mat)/3);
		
		
	}

}
