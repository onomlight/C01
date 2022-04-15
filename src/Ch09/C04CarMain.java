package Ch09;


class C04Car{
	//속성
	String owner;
	int speed;
	float fuel;
	
	//기능
	public void Accel() {
		System.out.println(owner + "님의 차가 가속합니다");
	}
	public void Break() {
		System.out.println(owner + "님의 차가 감속합니다");
	}
}

public class C04CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C04Car hong = new C04Car();
		hong.owner = "홍길동";
		hong.speed = 0	;
		hong.fuel = 100;	

		hong.Accel();
		hong.Break();
	}

}
