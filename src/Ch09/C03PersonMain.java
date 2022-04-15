package Ch09;

//주의! 메인클래스가 아닌 다른 클래스에는 접근한정자를 붙이지 않는다
class C03Person{
	String name;
	int age;
	float height;
	double weight;
}

public class C03PersonMain {
// 파일명과 클래스명은 같아야함
	public static void main(String[] args) {
		
		
		C03Person obj = new C03Person();
		obj.name="홍길동";obj.age=35;//ok
		
		
		
		// 주의! main메서드를 포함한 java파일명과 class 명은 일치해야한다
	}

}
