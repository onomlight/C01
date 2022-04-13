package Ch05;

import java.util.Scanner;

public class C02Percent {

	public static void main(String[] args) {

//		1. 짝 홀수 (N%2)
	
		
//		System.out.println(10%2);      // 짝수는 나머지 0
//		System.out.println(11%2);      // 홀수는 나머지 1
//		System.out.println(12%2);      // 짝수 
//		System.out.println(13%2);      // 홀수
//		System.out.println(14%2);      // 짝수
//		
//		System.out.println(10%2==0);      // ==0 짝수냐 물음
//		System.out.println(11%2==0);      // 
//		System.out.println(12%2==0);      // 
//		System.out.println(13%2==0);      // 
//		System.out.println(14%2==0);      // 
		
		
//		2. 배수 (3의 배수 는 N%3==0 , 4의 배수는 N%4==0...)
		
//		System.out.println(10%3);      //  나머지 1  ==0 / 3의 배수인지 아닌지 t/f로 확인
//		System.out.println(11%3);      //  나머지 2
//		System.out.println(12%3);      //   3
//		System.out.println(13%3);      // 
//		System.out.println(14%3);      // 
//		System.out.println(15%3);      //  나머지 0
//		System.out.println(16%3);      //  나머지 1
//		System.out.println(17%3);      //  
		
//		미니문제
//		키보드로 부터 정수값 2를 입력받아 
//		두수의 합이 짝수이면 " 짝수입니다 " 
//		홀수이면 "홀수입니다" 를 출력하세요~
	 // 2)))) 짝수이면서(N%2==0 && N%3==0)인경우 3의 배수이면 --- 출력
//		Scanner sc = new Scanner(System.in);
//		
//		String x = 0;  
//		System.out.print("입력하세요 :");
//		Scanner scan;
//		x = scan.nextLine();
//		
//		if (x %2 == 0) {
//			System.out.print(x + "는 짝수입니다.");
//		} else {
//			System.out.print(x + " 홀수입니다");
//		}
//	int n1=0,n2=0;
//	Scanner sc = new Scanner(System.in);
//	System.out.print("정수 2개 값 입력 : ");
//	n1=sc.nextInt();
//	n2=sc.nextInt();
//	
//	int sum=n1+n2;
//	
//	// String result=(sum%2==0)? "짝수입니다":"홀수입니다";
//	String result=(sum%2==0&&sum%3==0)? "짝수&3입니다":"짝수x or 3의 배수x or 둘다 x";
//	System.out.println("결과 : " + result);
		
		
////		3. 범위제한
//		        N%2 => 0-1
//				N%3 => 0-2
//				N%4 -> 0-3
//				N%10 -> 0-9
//				N%100 -> 0-99
//		          Scanner sc = new Scanner(System.in); // 키보드에서 받는 함수
//		          int tmp = 0; // 임시로 저장하는 형태 
//		          while(true) // ~하는 동안에 while // {} 안이 참인동안에 
//		          
//				
//		          {
//		        	  System.out.print("갑입력 : ");
//		        	  tmp = sc.nextInt();
//		        	  System.out.println("값 확인 : " +(tmp%10)); // 0~9까지의 숫자만 출력됨 %5하면 0~4까지
// 		          }
		
		        
		
		
//		
//		4. 자리수 추출
		System.out.println(12345%10); // %10 끝 한자리 나옴
		System.out.println(12345%100);
		System.out.println(12345%1000);
		System.out.println(12345%10000);
		System.out.println(12345%100000);
		System.out.println();
		System.out.println(12345/10000); // '/' 왼쪽 첫번째 자리만나옴 
		System.out.println(12345/1000);
		System.out.println(12345/100);
		System.out.println(12345/10);
		
		// 반복문 12345 를 54321이라는 정수로 바꿔야함
	


	}

}
