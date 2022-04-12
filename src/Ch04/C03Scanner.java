package Ch04;

import java.util.Scanner;

// 정수값은 받았는데 실수 문자 받음 
public class C03Scanner {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		// SCanner 할때 주의점
//		System.out.print("정수 입력 : " );
//		int num1 = sc.nextInt();
//		System.out.println("정수 값 : " + num1);
//		
//		System.out.print("실수 입력 : " );
//		double num2 = sc.nextDouble();
//		System.out.println("실수 값 : " + num2);
//
		System.out.print("문자열 입력 : " );
		String str1 = sc.next();//띄어쓰기 미포함
		System.out.println("문자열(띄어쓰기x) : " + str1);
		
		// 띄어쓰기 기준으로 인식을함 next 띄어쓰기를 하면 인식을 못함 
		
//		
		sc.nextLine();
		
		System.out.print("문자열 입력 : " );
		String str2 = sc.nextLine();//띄어쓰기 포함
		System.out.println("문자열(띄어쓰기ㅇ) : " + str2);
// 띄어쓰기를 포함해서 받을수있음 nextLine

		
		/// 두개를 같이하면 str1에 인식정지가됨 // str2에서 입력이안됨 >>>> 문자를 인식하는 과정에서
		
		// 문자열과 문자열 사이에서 sc.nextLine(); 을 넣어주고 엔터키를 건너띄어서 하게끔해줌
		// 지정된 공간으로 넣어주기때문에 문제가 발생됨 , 자바에서는 넥스트 라인사이에 코드한번 넣어주는게 좋음
		System.out.print('\n');
		System.out.println("END");
	}

}
