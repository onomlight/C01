package Ch10;

class TV{
	String brand;
	int year;
	int inch;
	TV(String brand,int year,int inch){
		this.brand=brand;
		this.year=year;
		this.inch=inch;
	}
	public void show() {
		System.out.println(brand+"에서 만든 "+year+" 년형 "+inch+"인치 TV");
	}
}
public class test5 {

	public static void main(String[] args) {

		
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	
		
		
//		----------------------------
//		1
//		----------------------------
//		자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.
//
//		public static void main(String[] args) {
//		   TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
//		   myTV.show();
//		}
//		LG에서 만든 2017년형 32인치 TV
//
//		----------------------------
		

	}

}
