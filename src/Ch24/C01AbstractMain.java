package Ch24;
// 완성된 클래스
class Super1{
	void Func1() {
		
	}
	//일반메서드(함수선언+함수정의)
}
class Sub1 extends Super1{
	void Func1() {System.out.println("sub1에서 재정의한 Func1");}
}

//  추상 클래스

abstract class Super2{
	abstract void Func1(); // 추상메서드 함수선언
}
class Sub2 extends Super2{
	void Func1(){System.out.println("Sub2에서 재정의한 Func1");}
}
public class C01AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 일반클래스 상속관계
		//부모클래서
		Super1 ob1 = new Super1(); // ok
		Sub1 ob2  = new Sub1(); //ok
		
		
		//추상클래스 상속관계
		// Super2 ob3 = new Super2(); // X (미완성된 함수를 포함하고 있기 대문에)
		Sub2 ob4 = new Sub2(); // Ok (단, 물려받은 추상메서드를 정의했을때만 가능)
	
		
		//
		Super2 up = new Sub2(); // Upcasting
		up.Func1();
	}

}
