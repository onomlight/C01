package Ch15;

class C04Person{
	

//멤버변수
		String name;
		String addr;
		int age;
		C04Person(){
			this("없음","없음",0);
		}
		C04Person(String n, String a){
			this(n,a,0);
	
	}
		C04Person(String name, String addr, int age){
			this.name=name;
			this.addr=addr;
			this.age=age;
					
	
	}
}
public class C04ThisMain {

	public static void main(String[] args) {
		C04Person kim = new C04Person();
		C04Person Lee = new C04Person("이지성","서울특별시");
		C04Person Son = new C04Person("손민수","대구광역시",20);

	}

}
