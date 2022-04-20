package Ch18;

import java.util.Scanner;

class Book
{
	String BookCode;
	String Bookname;
	String Publisher;
	String Amount;
}

public class C02ClassArrayMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num=0;
			while(true) {
				System.out.println("--------BOOKStore-------");
				System.out.println("1.도서 등록");
				System.out.println("2.도서 검색");
				System.out.println("3.전체 도서 확인");
				System.out.println("4.종료");
				System.out.println("--------BOOKStore-------");
				System.out.println("번호 : ");
				num=sc.nextInt();
					switch(num) {
					case 1:
						//도서등록
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						System.exit(-1);
						break;
					}
			}
	 
		
		

	}

}
