package test;

public class Seller {
	
	int PayCash;
	int ManyTicket ;
	int seat; // 좌석 하나
	
	public Seller(int Cash, int Ticket, int seat) {
		
		PayCash = Cash;
		ManyTicket = Ticket;
		this.seat = seat;
	}
	int Receive(int Cash) {
		// 내 보유금액에 저장
		PayCash+=Cash;			//내보여금엑에 저장
		
		int cnt=Cash/seat; 	//사과개수 계산
		ManyTicket-=cnt;			//사과개수차감
		return cnt; // 사과개수 리턴 
	}
	void ShowInfo() {
		System.out.println("보유금액 : " + PayCash);
		System.out.println("티켓개수 : " + ManyTicket);
	}

}
