package Ch13;
// 셀러임
public class Store {
	
	int PayCash;
	int ManyCola;
	int part; // 사과한개당 가격
	//생성자
	public Store(int Cash, int Cola, int part) {
		
		PayCash=Cash;
		ManyCola = Cola;
		this.part=part;
	
	}
	
	int Re(int Cash) {
		// 내 보유금액에 저장
		PayCash+=Cash;			//내보여금엑에 저장
		
		int Cola=Cash/part; 	//사과개수 계산
		ManyCola-=Cola;			//사과개수차감
		return Cola; // 사과개수 리턴 
	}
	void ShowInfo() {
		System.out.println("보유금액 : " + PayCash);
		System.out.println("콜라개수 : " + ManyCola);

}
}
