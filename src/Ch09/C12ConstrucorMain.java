package Ch09;
//생성자 함수(메서드)
// 객체 생성시 필요한 공간 + 초기값을 설정하기 위해 선언된 함수
// 객체 생성시 한번만 호출된다
// 클래스 내에 생성자 함수를 명시하지 않았을때 컴파일러에 의해 삽입되는 
// 기본 생성자 함수가 있다(디폴트생성자:모든 멤버변수의 값을 0(Null로 초기화)
// 생성자 함수는 반환자료형이 없다
// 생성자 함수명는 클래스명과 동일하다
class C12Simple{
	//맴버변수
	// 속성
	int x; 
	int y;
	// 디폴트 생성자의 형태
	C12Simple(){
		System.out.println("디폴트 생성자 호출!");
		x=5;y=5;}
	// 기능
	void ShowXY() {System.out.printf("x=%d,y=%d\n",x,y);
}



public class C12ConstrucorMain {

	public static void main(String[] args) {
		
		
		C12Simple ob = new C12Simple();// C12Simple() - 디폴트 생성자함수
		ob.ShowXY();

	}

}
}
