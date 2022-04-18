package Ch09;


class C08Car{
	//속성
	public String owner;
	public int speed;
	public int fuel;
	//기능
	public void Accel() {
		//현재속도에서 +10 증가
		//연료량은 -5 감소
		//연료량이 0 순간 가속X("연료량 0 .. 가속불가합니다.")
		//최대속도 :200Km/h 를 넘지 않게 설정
		
		//정상가속이 되면 (name+" 님 차량 가속합니다. 연료량=? 현재속도=?) 
	}
	public void Break() {
		//현재속도에서 -10 감소
		//현재속도가 0이라면 차량이 정지했습니다. 를 출력
		
	}
	
}
public class C08CarMain {

	public static void main(String[] args) {
		C08Car hong = new C08Car();
		hong.owner = "홍길동";
		hong.speed =  0;
		hong.fuel = 100;
		hong.Accel();
		hong.Break();

	}

}
