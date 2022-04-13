package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
	
		
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
		

		
		// 01 반복문 탈출 조건
		// 1) 탈출용 변ㅅ누
		// 2) 탈출 조건식
		// 3) 탈출 연산식
//		int i = 1 ; // 1)탈출용 변수
//		while(i<=10) //while:~하는동안 2) 탈출조건식
//			
//		{
//			System.out.println("Hello World");
//			i++; // 3)탈출 연산식
//		}
			
			
		
		// 02 1~10까지의 합을 구하기
		
//		int i=1; // 탈출용 변수
//		int sum=0; // 누적용 변수
//		while(i<=10)
//		{
//			System.out.println("i= " + i);
//
//			sum+=i; //sum = sum +i;
//			i++;
//		}
//		System.out.println("1부터 10까지의 합 : " + sum );
		
		
		
		
		// 문제
		// 1부터 N(키보드로 입력받습니다) 까지의 합을 구합니다
		// >> [출형 변수]   초기값 / 조건식 / 증감연산
//		
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//						
//		int i =1; // 탈출용
//		int sum=0; // 누적용
//		
//		while(i<=n)
//		{
//			
//			//i=1,2,3...n
//			sum+=i; //sum=sum+1
//			i++;
//			
//		}
//		 System.out.printf("%d 부터 %d까지의 합은 : %d\n",1,n,sum);
//		System.out.println("sum : " + sum );
	
	
		//N부터 M 까지의 수의 합을 구합니다(n,m은 키보드로 입력받습니다)
		
		
//		Scanner sc = new Scanner(System.in);
//		int n =0,m=0, sum=0;
//		System.out.println("n,m 입력: "); // 3, 10
//		n=sc.nextInt();
//		m=sc.nextInt();
//		
////		n 값이 m 값보다 더 클경우 작동안됨 >> 스왑이라는 기능 tmp
//		// n>m인 경우 n,m 값을 교체
//		if(n>m)
//		{
//			int tmp=n;
//			n=m;
//					m=tmp;
//		}
////		int i=??; 
////		while(i<=??) 증가 해야하는걸 확인, 거짓되게 연산처리
//		int i=n;
//		while(i<=m) 
//		
//		{
//			sum+=i; // 증가하는 i값을 sum에 누적 
//			i++;
//		}
//		System.out.printf("%d 부터 %d까지의 합은 : %d\n",n,m,sum);
		
		
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		
//		while(n + m)
		
		
		// 구구단 2단 출력합니다.
		// 2*1 2*2 2*3 2*4... 2*9 
		// i= 1 1++ i<=9
//		int i = 1;
//		while(i<=9) {
//			
//			System.out.printf("%d x %d =%d\n",2,i,(2*i));
//			i++;
//		}
//			
			
		// 단수를 하나 입력 받아서 해당 단수를 출력합니다
		
		
		
		// 1부터 10까지 수 중의 3배수의 합만 출력
		
//		int i =1; int sum=0;
//		
//		while(i<=10) 
//		{
//			if(i%3==0) {
//			System.out.println("i = " + i);
//			sum+=i;
//			}
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지중 3의 배수합 : %d\n" , 1,10,sum);
		// 1부터 10까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력
		
		

		int i =1; int oddsum=0,evensum=0;
		
		while(i<=10) 
		{
			if(i%2==0) {
			System.out.println("짝수 i = " + i);
			evensum+=i;
			}else {
				System.out.println("홀수 i = " + i);
				oddsum+=i;
			}
			i++;
		}
		System.out.printf("짝수 합=%d, 홀수합  = %d\n" , evensum,oddsum);
		
		// 1부터 N까지 수 중의 3배수의 합만 출력
		// 1부터 N까지 수 중의 짝수의 합 / 홀수의 합만 따로 구해서 출력
		// n 부터 m까지 수 중의 3배수의 합만 출력
		// n 부터 m까지 수 중의 짝수의 합/ 홀수의 합만 따로 구해서 출력
			
			
			
			
			
			
	}

}
