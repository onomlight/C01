package Ch30;

import java.util.Scanner;

public class C02ArthMethicExceptionMain {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			try {
			System.out.print("정수 입력 : " );
			int num=sc.nextInt();
			System.out.print("나눌 수 입력 : ");
			int div=sc.nextInt();
			System.out.println("결과 : " + (num/div));
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
			
			
		}

	}

}
