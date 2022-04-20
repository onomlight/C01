package Ch19;
// --------------------------
// 자바 메모리 구조
// --------------------------
//1) Stack
// -> {} 내에서 선언되어지는 변수, {} 벗어나면 소멸 // 지역 변수
//2) Heap
// -> 객체 저장용 공간 //  new 예약이 생성+참조변수 , 참조변수 연결 해제시 GC(쓰레기)에 의 소멸
//3) Class(==Method)
// -> 공유메모리 영역 // 생성자함수 / 일반함수 / static함수 / static 변수  >> 객체를 생성하기전에 생성자 함수가 먼저 생성되어야함
// 객체에 대해 저장을 할때 static 객체를 사용함


class Simple{
	static int x; // 공유 메모리 영역에 적재
	int y;
	
	void ShowXY() {
		System.out.println("x="+x+",Y="+y);
	}
}
public class C01StaticMain {

	public static void main(String[] args) {
		 //static 멤버는 클래스명으로 접근가능 
		Simple.x=123;
		
		Simple ob1 = new Simple();
//		ob1.x=10;
//		ob1.y=20;
		
		Simple ob2 = new Simple();
//		ob2.ShowXY();
//		ob2.x=100;
//		ob1.ShowXY();

		ob1.ShowXY();
		ob2.ShowXY();
	}

}
