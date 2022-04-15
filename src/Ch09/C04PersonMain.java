package Ch09;

//주의! 메인클래스가 아닌 다른 클래스에는 접근한정자를 붙이지 않는다
class C04Person{
	String name;
	int age;
	float height;
	double weight;
	
	// 기능(= 맴버메서드,맴버함수)
	void talk() { // 전달하는 값 없이 실행한다
		System.out.println(name + "님이 말합니다");
		
		 
	}
	void walk() {
		System.out.println(name + "님이 걷습니다");
	}
	
}

public class C04PersonMain {
// 파일명과 클래스명은 같아야함
	public static void main(String[] args) {
		
		
		C04Person obj = new C04Person();
		obj.name="홍길동";obj.age=35;//ok
		obj.talk();
		obj.walk();
		
		
		// 주의! main메서드를 포함한 java파일명과 class 명은 일치해야한다
	}

}
