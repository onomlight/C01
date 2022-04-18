package Ch09;

public class C11ComputerMain {
//속성
	String SN;
	String CPUpec;
	String RAMpec;
	String DISKpec;
	
	int app(String app1) {
		System.out.println(app1 + "을 실행합니다");
		return 1;
	}
	
	int app(String app1, String app2) {
		System.out.println(app1+","+app2+"실행합니다.");
		return 2;
	}
	void ShowInfo() {
		System.out.println(SN);
		System.out.println(CPUpec);
		System.out.println(RAMpec);
		System.out.println(DISKpec);
	}
	
	//기능
//	StartApp(String app1)int  -> 실행 app 개수 리턴,  app1+"을 싱행합니다 출력"
//	StartApp(String app1.STring app2) int -> 실행 app 개수 리턴, app1+",app2 +"을 실행합니다 출력"
//	StartApp(String app1):int -> 실행 app 개수 리턴, app1+"을 실행합니다 출력"
//	ShowInfo():void -> " 각 멤버변수의 값 출력 "
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C11ComputerMain Lggram123 = new C11ComputerMain();
		Lggram123.SN = "1-2-3-4";
		Lggram123.CPUpec="I7";
		Lggram123.RAMpec="16G";
		Lggram123.DISKpec="1Tb";
		
		Lggram123.app("Chrome URL:www.naver.com");
		Lggram123.app("Excel 1.xls", "NotePad");
		Lggram123.ShowInfo();
	}

}
