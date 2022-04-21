package Ch19;


class Client{
	String name;
	String phone;
	Client(String name,String phone){
		this.name=name;
		this.phone=phone;
	}
}
class Restorant{
	String Storename;
	int roomcnt; 				// 지점 room 개수 
	static int totalroomcnt; 	// 전체 room개수
	Client list[] ; 			// 룸에 개수를 정해야하기때문에 생성자를 정해 카운트를 받고 크기 결정
	int idx;					// list 배열에 저장될 객체 위치idx
	Restorant(String name,int roomcnt){
		Storename=name; 		// 지정명 저장
		this.roomcnt = roomcnt;	// 방개수 저장
		// 지점을 설정함과 동시에 지정할 카운터를 설정함
		totalroomcnt+= roomcnt;	// 전체 방개수 누적
		list=new Client[roomcnt];	// 예약손님정보 저장용배열
		idx=0;

	}
	
	
	void SetReserve(Client client) { 
		
		
		
		// 
		
		if(roomcnt!=0) {
			roomcnt--;// roomcnt --(0인경우도 고려) 예약하면할수록 감소
			totalroomcnt--;// totalroomcnt--
			// 
			list[idx]=client;//배열참조변수에 client 객체 연결
			idx++; 			//다음위치로 이동
		}
		else //잔여room 수 부족
		{
			System.out.println("예약이 꽉차서 예약이 불가능 합니다..");
		}
	}
	void Showinfo() {
		System.out.println("======================================");
		System.out.println("지점명 : " + Storename);
		System.out.println("지점 잔여 Room : " + roomcnt);
		System.out.println("전체 잔여 Room : " + totalroomcnt);
		System.out.println("======================================");
	
	}
}
//class Reservation{
//	static Client list[]=new Client[100]; // 총 100명 정도 받을 수 있다
//	static int idx=0;
//	
//	static void setReserve() {
//		
//	}
//	static void getReserve() {
//		
//	}
//	
//} 없앰 

public class C04StaticMain {

	public static void main(String[] args) {

		Restorant 서가앤쿡반월당 = new Restorant("반월당점",10); // 지점명,roomcnt
		Restorant 서가앤쿡감삼점 = new Restorant("감삼점",5);	 // 지점명,roomcnt 	
		
		서가앤쿡반월당.SetReserve(new Client("홍길동","010-222-3333")); // 객체는 해당되고 하는 부분
		서가앤쿡반월당.Showinfo();
		서가앤쿡감삼점.Showinfo();

	}

}
