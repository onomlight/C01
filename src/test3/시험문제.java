package test3;

class Cal{
	
		// 멤버 변수 (arr[] -> ArrayList로 변경! , idx는 삭제 )
	int arr[] = new int[10];
	int idx=0;
	//싱글톤 패턴 코드 삽입!
	
	public int InsertVal(int tmp) {
		try {
			arr[idx] = tmp;
			idx++;
			
		}catch(Exception e) {
			return -1;
		}
		return 0;
	}
	// 저장된 값 확인(ArrayList 에 맞게 변경하기)
	public void ShowVal() {
		System.out.println("-------조회 ------");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
public class 시험문제 {

	public static void main(String[] args) {

		Cal cal = Cal.getlnstamce();
		
		for(int i=1;i<=100;1++) {
			cal.InsertVal(i);
		}
		cal.ShowVal();

	}

}
