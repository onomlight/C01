package Ch04;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class C04Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//// 문제 
//		이름을 입력하세요? 홍길동 <-- 이름은 키보드로 입력받습니다
//				홍길동님의 나이를 입력하세요. 33세 < 나이는 키보드로 입력받습니다,args 이름은 서식문자로 출력 < 덧셈연산자로 해도됨
//				홍길동님의 나이는 33살입니다 < 서식문자로 이름과 나이를 출력합니다.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름을 입력하세요? : " );
//		
//		String str1 = sc.next();//띄어쓰기 미포함
//		System.out.println( str1 +" 님의 나이를 입력하세요 :"  );
//		
//		
//		
////		
////		sc.nextLine();
////		
//		System.out.print("문자열 입력 : " );
//		String str2 = sc.nextLine();//띄어쓰기 포함
//		System.out.println (str1 "\n님의 나이는" + str2 "\n살입니다");
//	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요?");
		String name = sc.nextLine();
		System.out.println(name + "님의 나이를 입력하세요?");
		int age = sc.nextInt();
		System.out.println(name + "님의 나이는 "+age+" 살입니다");
		
	
	}

}
