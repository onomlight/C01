package Ch19;


class Rectangle
{
	//기준좌표 설정
	static int x;
	static int y;
	int width;
	int height;
	
	Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	//끝점확인 기능
	void ShowEndPoint() {
		
	}
	// 시작점,너비,높이,끝점확인
	void ShowInfo() {
		System.out.printf("X의 시작점 = %d Y의 시작점 = %d\n",x, y);
		System.out.print("너비 :" + width);
		System.out.print("높이 :" + height);
	}
}
public class C02StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기준점
		Rectangle.x=10;
		Rectangle.y=20;
		
		Rectangle rec1 = new Rectangle(10,10);
		Rectangle rec2 = new Rectangle(5,7);
		Rectangle rec3 = new Rectangle(6,5);
		
		rec1.ShowInfo();
		rec2.ShowInfo();
		rec3.ShowInfo();
	}

}
