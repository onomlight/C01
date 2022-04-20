package Ch18;


// 클래스 자료형을 요소로 하는 배열객체를 생성하는 경우
// 각 요소는 객체의 위치값을 담는 참조변수로 사용된다
// 각 요소마다 객체생성이후 위치값을 저장을 해야 데이터를 저장하거나 기능을 사용 할 수 가 있다.

class C01Person
{
	String name;
	String addr;
	C01Person(String name, String addr){
		this.name=name;
		this.addr=addr;
		
	}
}
public class C01ClassArrayMain {

	public static void main(String[] args) {
		
		
		C01Person[] list = new C01Person[3];
		System.out.println("길이 : " + list.length);
		
		
		list[0] = new C01Person("홍길동","대구"); // 객체를 만들어줘야 list 가 적용이 가능함
//		list[0].name="홍길동";
//		list[0].addr="대구";
		
		list[1] = new C01Person("정유균","마산");
//		list[1].name="정유균";
//		list[1].addr="마산";
		
		list[2] = new C01Person("이태수","울산");
//		list[2].name="이태수";
//		list[2].addr="울산";
				
	}

}
