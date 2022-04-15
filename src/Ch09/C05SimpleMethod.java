package Ch09;

import java.util.Scanner;

class C05Simple{
	// 속성 을 추가해야함
	Scanner sc= new Scanner(System.in);
	
	
	// 가능
	// 반완 O , 매개변수O
	
	int sum1 (int x , int y ) {
		return x+y;
	}

	// 반환o, 매개변수x
	int sum2( ) {
		System.out.println(" 정수 2개 입력 : " );
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
	}
	
	// 반환x ,매개변수o
	
	void sum3(int x , int y) {
		System.out.printf("sum3(%d , %d)=%d\n",x,y,x+y);
	}
	
	void sum4() {
		System.out.print("1값 입력 : ");
		int x = sc.nextInt();
		System.out.print("2값 입력 : ");
		int y = sc.nextInt();
		System.out.printf("%d + %d = %d\n",x,y,x+y);
		
	}
}
// subclass 를 선언하고
// sub1,sub2,sub3,sub4 맴버 메서드를 만들어서 실행해봅니다 ( 두수의 차 계산함수)
// sub1(int x , int y) : int
// sub2() : void
// sub(int x, int y) : void
// sub4() : int
public class C05SimpleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C05Simple obj = new C05Simple();
		 int result1 =  obj.sum1(10,20); // 10,20 인지
		 System.out.println("result1 = " + result1);
		 

		 int result2 =obj.sum2();
		 System.out.println("result2 = " + result2);
		 
		 obj.sum3(111,222);
		 
		 obj.sum4();
	}

}
