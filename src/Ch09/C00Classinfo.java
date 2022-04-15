package Ch09;

public class C00Classinfo {

	public static void main(String[] args) {

		// 객체 : 존재(공간을 사용하는 ) 사물
		// 자바의 객체(인스턴트)
		// 현실 객체의 대한 정보( 속성/기능)의 일부를 메모리 공간에 담아 놓은 상태
		
		
		// 객체 지향 
		//--> 객체 구현에 필요한 일부 정보만 추출(추상화)하여 인스턴스화 
		
		
		// 홍길동
		// 이름, 나이, 주소,성별,몸무게 신장 머리카락유무 학력 경력 재력
		// 걷는다 먹는다 움직인다 
		
		

		// 확인
		// 에어컨
		// 속성 : 파워코드,디스플레이 , 버튼 /
		// 기능 : 제습 , 냉방 
		
		//나무
		// 속성 : 잎, 줄기, 뿌리, 열매
	    // 기능 : 광합성을 한다, 열매를 맺는다, 물을 흡수한다..
		
		//자동차
		// 속성 : 유리 , 손잡이 , 핸들 , 시트 , 문
	    // 기능 : 시동, 운행 , 이동
		
		
		//컴퓨터
		// 속성 : 모니터 , 본체 , 로고 제조사
	    // 기능 : 작동 , 움직임  / power on /off
		
		
		// class
		// 객체를 생성하기 위해 미리 선언된 자료형 :  [미리 선언된 형태에서 필요한 공간이 그때 그때 생김]
		// ex ) 사람 , 강아지는 존재하지않음 , 우리 뇌에서 구분하고 식별하는것
		// 객체는 존재하는것이고 클래스는 존재하지않음 ?? 공간을 차지하는것
		// 사람은 없으나 이름은 있음 / 정보 , 공간을 차지하고있음 , 이름이 사람이면 존재함 
		
		// 클래스 자체로는 공간을 차지 않는다.
		

		//Scanner sc = new Scanner(System.in)
		// new 				: Heap 공간에 객체 생성(Heap : 객체전용 저장공간)
		// Scanner()		: 생성자메서드(기능)를 통한 초기값 설정
		// Scanner SC 		: Scanner 클래스 자료형으로 sc라는 참조변수 생성
		
		
		
		//JAVA 메모리영역 // 용도별로 4가지 나눠짐 
		// 코드 영역 			: 
		// 클래스 영역 			: 공유 메모리(stiatic변수, static메서드,생성자)
		// 스택 영역			: 일반변수,참조변수
		// 힙 영역			: 객체
	}

}