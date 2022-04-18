package Ch09;

class C09Simple{
	
	
	int sum(int x, int y) {
		return x+y;
		
	}
	// 메서드 오버로딩
	int sum(int x, int y , int z) {
		return x+y+z;
	}
	// 메서드 오버로딩
	double sum( double x, double y) {
		return x + y ;
	}
	
	double sum (int x,  double y, float z) {
		return x + y + z;
	}// 동일한 값을 가질수있음  / 함수의 오버로딩
	
	String sum(String str1, String str2) {
		return str1 + str2;
	}
}

public class C09MethodOverloading {

	public static void main(String[] args) {

		C09Simple ob = new C09Simple();
		System.out.println("sum(int x, int y) : " +ob.sum(10,20));
		System.out.println("sum(int x, int y, int z) : " +ob.sum(10,20));
		System.out.println("sum(double x, double y) : " +ob.sum(10,20));

		

	}

}
