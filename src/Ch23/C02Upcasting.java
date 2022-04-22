package Ch23;

class C02Super{
	
	int x;
}

class C02Sub extends C02Super{
	int y;
}

public class C02Upcasting {

	public static void main(String[] args) {
		//No Casting : 클래스 자료형변환
		C02Super ob1 =new C02Super(); // 추상케이스와 인터페이스 문제 생김 개념확실히
		//                           
		ob1.x=10;
		C02Sub ob2 = new C02Sub();
		ob2.x=10;ob2.y=20;
		//Up Casting : 상위클래스 참조변수 = 하위 클래스 객체  //
		// ㄴ 상위클래스를 참조변수로 하위클래스를 연결하는 객체 
		C02Super ob3 = new C02Sub();
		//ㄴ 자료형은 다 다름  / 수퍼에 맞춰져서 움직임
		// 자료형이 자동으로 형변환되는 과정
		// 상위클래스형의 맴버까지만 사용할 수 있다
		ob3.x=10;
		//ob3.y=20; // 접속불가능함 // 맴버는 존재하나 접근할 수 없다..
	}

}
