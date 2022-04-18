package Ch10;


class Rectangle {
	
//	- int 타입의 x, y, width, height 필드: 사각형을 구성하는 점과 크기 정보
//	- x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
//	- int square() : 사각형 넓이 리턴
//	- void show() : 사각형의 좌표와 넓이를 화면에 출력
//	- boolean contatins(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
//	- main() 메소드의 코드와 실행 결과는 다음과 같다
	
	int x;
	int y;
	int width;
	int height;
	
	Rectangle(int x , int y , int width,int height ){
		this.x = x; this.y = y; this.width =width; this.height = height;
		
	}
	int square() {
		return width*height;
	}
	void show() {
		System.out.printf("좌표 = (%d,%d),넓이=%d\n",x,y,width*height);
		
	}
	boolean contatins(Rectangle r) {
		if(this.x< r.x && this.y<r.y) { // 이 객체의 x 가 비교객체 x 보다 작아야하고 
										// 이 객체의 y 가 비교객체 y 보다 작아야한다 
			
			if((this.x+width)>(r.x+r.width) && (this.y+this.width)>(r.y+r.height))
				// 이 객체의 끝 x 값이 비교객체의 끝x값보다 크고 이객체의 끝 y값이 비교객체의 끝 y값보다 크냐?
			{
				return true;
			}
			
		}
		return false;
	}
}

public class C04RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Rectangle r = new Rectangle(2, 2, 8, 7);
		   Rectangle s = new Rectangle(5, 5, 6, 6);
		   Rectangle t = new Rectangle(1, 1, 10, 10);
		   
		   r.show();
		   System.out.println("s의 면적은 "+s.square());
		   if(t.contatins(r)) 
		   {
			   System.out.println("t는 r을 포함합니다.");}
		   if(t.contatins(s)) 
		   {
			   System.out.println("t는 s를 포함합니다.");}

	}

}
