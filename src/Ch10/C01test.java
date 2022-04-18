package Ch10;


//1.
//----------------------------
//자바 클래스를 작성하는 연습을 해보자. 
//1) 
//public static void main(String[] args) {
//   Person Jung = new Person("홍길동", 44, "대구"); 
//이름(name),나이(age),주소(addr)
//   Jung.showinfo();
//}
//[출력]
//이름 : 홍길동
//나이 : 44
//주소 : 대구

class Person{
	
	public String name;
	public String addr;
	public int age;
	
	Person(String n, int a, String ad){
		this.name=n; this.addr=ad; this.age=a;
		System.out.println(" 이름 : " + name);
		System.out.println(" 나이 : " + age);
		System.out.println(" 주소 : " + addr);
	}

	public void ShowInfo() {
		
	}
	
}

public class C01test {

	public static void main(String[] args) {
		
		Person Jung = new Person("홍길동", 44, "대구"); 
		
		Jung.ShowInfo();
		
		 
		// TODO Auto-generated method stub

		

	}

}
