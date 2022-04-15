package Ch08;

import java.util.Iterator;
import java.util.Scanner;

public class C01For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i=1; //1) 탈출용 변수
//		while(i<=10) //2) 탈출 조건식
//		{
//			System.out.println("Hello World");
//			i++; //3) 탈출 연산식
//		}
		// ~하는동안 /{
//		 for(int i=1;i<=10;i++) {
//			 System.out.println("HELLO WORLD");
//			 
//			 
//		 }
			 
		
		
		//02 1부터 10까지의 합을 구하기
		//sum+=i;
//		int sum=0;
//		for(int i=1;i<=10;  i++) {
//			sum+=i;
//			
//		}
//		System.out.println("1~10까지 합은 " + sum + "입니다.");

		//문제
		//1부터 n(키보드로 입력받습니다)까지의 합을 구합니다	
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int sum = 0 ;
//		
//		for (int i =0; i<=n;i++) {
//			sum +=i;		
//			
//		}
//		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다");
		//n부터 m까지수의 합을 구합니다(n,m은 키보드로 입력받습니다)
//		int sum = 0,n,m,i ;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("n,m 입력: "); // 3, 10
//		n = sc.nextInt();
//		m = sc.nextInt();
//		
//		
//		
//		for (i=n;i<=m;i++ ) { 
//			sum =sum + i;		
//			
//		}
//		System.out.println(+n+"부터" +m + "까지의 합은" + sum + "입니다");
		//구구단 2단 출력합니다
//		for(int i=2; i<10;i++) {
//			for(int j=1;j<10;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//			System.out.println();
//				
//		}
//		
		//단수를 하나 입력받아서 해당 단수를 출력합니다
//		Scanner sc = new Scanner(System.in);
//		System.out.print("구구단을 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		for(int j= 1;j<10;j++) {
//			System.out.println(num + "*" + j + "="+ (num*j));
//		}
//		
		//1부터 10까지 수 중의 3의배수의 합만 출력

//		int sum=0;
//		for(int i=1; i<=10;i++) {
//			if(i%3==0) 
//
//				sum+=i;
//		}
//			
//			System.out.println("1~10까지의 3의 배수의 합은"+"="+sum);
		
		//1부터 10까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력
//		int even = 0 ; // 짝 
//		int odd = 0; // g홀
//		for (int i = 1 ; i <=10; i++) {
//			if(i%2==0) {
//				even +=i;
//			}else { 
//				odd+=i;
//			}
//		}
//		System.out.println("짝수 합 : " + even);
//		System.out.println("홀수 합 : " + odd);
		//1부터 n까지 수 중의 3의배수의 합만 출력
//		Scanner sc= new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int a = 0;
//		for(int i = 1; i <=n;i++) {
//			if(i % 3 ==0)
//				a = a+i;
//			
//		}
//				System.out.println(+n+"까지의 3의배수의 합은 :"+a+"입니다.");
	
	
		
		//1부터 n까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력
		
		
//     Scanner sc= new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int a = 0;
//		int b = 0;
//		for(int i = 0; i <=n;i++) {
//			if((i+1)%2 !=0)
//				a = a+i;
//			
//		}
//		for(int i = 0; i <=n;i++) {
//			if((i+1)%2 ==0)
//				b = b+i;
//				
//		}
//			
//				System.out.println(+n+"까지의 홀수 합은 :"+a+"입니다.");
//				System.out.println(+n+"까지의 짝수 합은 :"+b+"입니다.");
		//n부터 m까지 수 중의 3의배수의 합만 출력
		
		
		//n부터 m까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력	

		
		

		
		//전체 구구단을 역순출력합니다 
		//9 x 1 = 9
		//9 x 2 = 18
		//..
		//2 x 1 = 2
		//..
		//2 x 9 = 18

		
		//전체 구구단을 역순출력합니다 
		//9 x 9 = 81
		//9 x 8 = 72
		//9 x 7 = 63
		//..
		//2 x 1 = 2
		

		//단수를 입력받아(dan) dan-9단까지 출력합니다
		//조건 : dan안의 숫자는 9미만이어야 합니다
		
		// 전체구구단(가로)
		// 2 x 1 = 2 	3 x 1 = 3		... 	9 x 1 = 9
		// 2 x 2 = 4	3 x 2 = 6		...		9 x 2 = 18
		// ..
		// 2 x 9 = 18	3 x 9 = 27				9 x 9 = 81
		
//	
		
		// *****
		// *****
		// *****
		// *****
//		i(행)		j(별)
//		0			0-4
//		1			0-4
//		2			0-4
//		3			0-4
//		----------------------
//		i=0			j=0,j++,j<5
//		i++
//		i<4
		

		
		// *
		// **
		// ***
		// ****

		
		// 높이 : 3
		// *
		// **
		// ***
		
	
		
		
		// ****
		// ***
		// **
		// *
	
		
		// 높이 : 3
		// ***
		// **
		// *
		

		
		//   *
		//  ***
		// *****
		//*******

		
		// 높이 : 3
		//   *
		//  ***
		// *****	
		
	
		
		
		//*******
		// *****
		//  ***
		//   *
	
		
		// 높이 : 3
		// *****
		//  ***
		//   *

		
		
		//   *
		//  ***
		// *****
		//******* 
		// *****
		//  ***
		//   *

		// 높이(홀수값) : 3
		//  *
		// ***
		//  *
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
