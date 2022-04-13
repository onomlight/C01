package Ch06;

import java.util.Scanner;

public class C02if {

	public static void main(String[] args) {
		// Else IF 문
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		
//		if(age>=20)
//		{
//			System.out.println("성인입니다.");
//		
//		}
//		else if (age>=8) {
//			System.out.println("취학아동입니다.. 힙");
//			
//		}
//		else
//		{
//			System.out.println("미취학아동입니다.");
//		}

		
		
		// Score를 입력받아서
		// 90점 이상이면 A
		// 90미만 80점 이상이면 b
		// 80미만7060 c
		// 70미만60이상 d
		// 60점 미만 f
		//>> 쌤이한것
		
		
		
//		int Score=0;
//		Scanner sc =new Scanner(System.in);
//		System.out.print("점수 입력 : ");
//		Score = sc.nextInt();
//		
//		if(Score >= 90)
//		{
//			System.out.println("A");
//		}
//		else if(Score >=80)
//		{
//			System.out.println("B");			
//		}
//		else if(Score >=70)
//		{
//			System.out.println("C");
//		}
//		else
//		{
//			System.out.println("F");
//		}
//		
		
		

//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요 : ");
//		
//		int Score = sc.nextInt();
//	
//		if(Score>=90)
//		{
//			System.out.println("A");
//		
//		}
//		else if (Score<90 && Score>=80) {
//			System.out.println("B");
//			
//		}
//		else if (Score<80 && Score>=70) {
//			System.out.println("C");
//		}
//		else if (Score>70 && Score>=60) {
//			System.out.println("D");
//			
//		}
//		
//		else
//		{
//			System.out.println("F");
//		}
		
		
		
		
		
		
		// 문제
		// 나이별로 요금을 부과하는 else if 만드세요
		// 8 세 미만 : 1000원
		// 14세 미만 : 2000원
		// 20세 미만 : 2500원
		// 20세 이상 : 3000원
		
		// 쌤이한것
		
//		int age=0;
//		Scanner sc =new Scanner(System.in);
//		System.out.print("점수 입력 : ");
//		age = sc.nextInt();
//		
//		if(age<8)
//		{
//			
//		}
//		else if(age<14)
//		{
//			
//		}
//		else if(age<20)
//		{
//			
//		}
//		else 
//		{
//			
//		}
		
		
		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 : ");
//		
//		int age = sc.nextInt();
//	
//		if(age>=20)
//		{
//			System.out.println("3000원");
//		
//		}
//		else if (age>=14) {
//			System.out.println("2500원");
//		}
//		else if (age>=8) {
//			System.out.println("2000원");
//		}	
//	
//		else
//		{
//			System.out.println("1000원");
//		}
//		
		
		
		
		int n1=0,n2=0,n3=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		// n1이 제일 큰경우 n1>n2&n1>n3
		// n2이 제일 큰경우 n2>n1&n2>n3
		// n3이 제일 큰경우 n3>n1&n3>n2
		// 같은 부분은 다른 if 문때 공부
		if(n1>=n2&&n1>=n3) 
		{
			System.out.println("큰 수 : " + n1);
		}
		else if(n2>=n1&&n2>=n3) 
		{
			System.out.println("큰 수 : " + n2);
		}
		else if(n3>=n1&&n3>=n2) 
		{
			System.out.println("큰 수 : " + n3);
		}
		
		
	}

}
