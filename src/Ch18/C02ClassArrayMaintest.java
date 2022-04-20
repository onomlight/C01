package Ch18;

import java.util.Scanner;

class books
{
	String BookCode;
	String Bookname;
	String Publisher;
	String Amount;
	books(String bookCode, String bookname, String publisher, String amount) {
		
		BookCode = bookCode;
		Bookname = bookname;
		Publisher = publisher;
		Amount = amount;
	}
	
}

public class C02ClassArrayMaintest {

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
					case 1: // idx가
						//도서등록
						System.out.print("도서 번호 : ");
						String BookCode = sc.next();
						System.out.print("도서 제목 : ");
						String Bookname = sc.next();
						System.out.print("출판사 : ");
						String Publisher = sc.next();
						System.out.print("금액 : ");
						String Amount = sc.next();
						
						break;
					case 2:
						// 도서 검색 - 도서명을 받아서 검색 할 것 (String의 equals 함수 이용)
						System.out.print("검색할 도서명을 입력하세요 : ");
						String Bookcode = sc.next();
						
						break;
					case 3:
						// 전체 도서 출력 
						break;
					case 4:
						System.exit(-1);
						break;
					}
			}
	 
		
		

	}

}
