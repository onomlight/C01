package Ch23;

//오버라이딩이랑 오버로딩 차이점
// 함수재정의(Overriding)
//상속관계에서 상위클래스의 함수의 본체부분을 하위클래스에서 고쳐 사용하는 문법

//  오버라이딩(Overriding) vs 오버로딩(Overloading)
// 오버로딩 	: 함수의 매개변수를 다양하게 둘 수 있도록 허용한 문법(헤더변경)
//오버라이딩	: 상속관계에서 하위클래스가 물려받은 함수의 본체 로직을 수정할 수 있도록 허용한 문법
// 				(본체 변경)
class Animal{
	void Sound() {System.out.println("소리를 냅니다~");}
}
class Dog extends Animal{
	void Sound() {System.out.println("강아지가 소리를 냅니다~");}
}
class Cat extends Animal{
	void Sound() {
		System.out.println("고양이가 소리를 냅니다");
	}
	
	
	//
	
}
public class C01OverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog poppi = new Dog();
		Cat yummi = new Cat();
		
		poppi.Sound();
		yummi.Sound();

	}

}
