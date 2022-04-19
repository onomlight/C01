package Ch13;

/// 접근한정자>> 정보를 숨기기 위한 한정자
//public		: 모든 패키지에서 사용가능하다
//default(기본)	: 현재 패키지에서만 사용가능
//protected		: 상속관계 전제하에서 하위클래스에서 사용가능
//private		: 해당클래스 내에서만 사용가능하다


// 사람의 대한 정보를 넣을때  , Person
// 이름 , 나이 , 성별 , 취미 , 연봉 , 주소 ..
class C01Person{
	

public String name;
private int age;
private float weight;
private double height;

 C01Person(String name, int age, float weight, double height){
	
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
 }
	// getter private 속성에 값을 반환 함수
// int getAge() {
//	 return this.age;
// }
// 
// // setter(private 속성에 값 변경함수)
// void setAge(int age) {
//	 this.age=age;
// }

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public float getWeight() {
	return weight;
}

public void setWeight(float weight) {
	this.weight = weight;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}
	}

public class C01infoHide {
	public static void main(String[] args) {
		
		C01Person hong = new C01Person("홍길동", 30,70.8F,177.5);
		
		System.out.println("나이 : " + hong.getAge());

			hong.setAge(31);
			System.out.println("나이 : " + hong.getAge());
			
			hong.setWeight(88.5F);
			hong.setHeight(179.5);

			// hong.age=100; 접근불가 
	}

}
