package Ch04;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// SCanner 이용해서 이름, 주민번호 앞 6자리, 전화번호를 키보드에서 입력받고 출력하는 코드를 작성해보세요
		// 이름 : _________ ENTER
		// 주민번호 6자리 : _______ENTER
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 이름 : ");
		String name = sc.nextLine();
		System.out.print("2. 주민번호 6자리 : ");
		String id = sc.nextLine();
		System.out.print("3. 전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.println("결과");
		System.out.println("1. 이름 : " + name);
		System.out.println("2. 주민번호 6자리 : " + id);
		System.out.println("3. 전화번호 : " + phone);
	}

}
