package Ch09;
// 다른 클래서 선언중
class C06Simple
{
	//속성
	int x;
	int y;
	//기능
	void ShowXY() {
		System.out.println(" X =" + x + ", y = " + y);
	}
	
	
}





public class C06SimpleMethod {
// 메인 클래스 선언
	
	public static void Addmember(C06Simple obj,int x, int y) { // obj라는 참조변수 
		obj.x = x;
		obj.y = y;
	}
	public static int SubMemberXY(C06Simple obj) {
		// 위에는 선언되어있
		// 다른지역으로부터 객체의 위치를 받아 Simple 객체 맴버의 차를
		// return 해보세요 , 두 수의 차를 리턴함 메인에 해야함 
		
		if(obj.x>obj.y) {
			return obj.x-obj.y;
		}else
			return obj.y-obj.x;
	}
	public static void main(String[] args) {


		C06Simple testobj = new C06Simple();
		Addmember(testobj,10,20); 
		testobj.ShowXY();
		
		int result = SubMemberXY(testobj);
		System.out.println("두 수의차 : " + result);
		
		   
	}

}
