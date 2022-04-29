package test0429;

import java.util.ArrayList;



// Cal 클래스를 Singleton 패턴코드를 삽입하세요
// 맴버변수 arr배열을 ArrayList로 변경처리해보세요
// 조변수명은 밍의로 지정합니다
// ShowVal() 멤버 함수의 코드를 ArrayList에 맞게 변경해보세요
class Cal
{
	ArrayList<Integer> arr = new ArrayList<>();

	
	
	
	
	public int InsertVal(int tmp) {
		try {
			arr.add(tmp);
		}catch(Exception e) {
			return -1;
		}
		return 0;
	}
	
	
	private static Cal instance = new Cal();
	private Cal() {}
	public static Cal getInstance() {
		if(instance==null)
			instance=new Cal();
		return instance;
	}
	
	public void ShowVal() {
		System.out.println("------조회------");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cal cal = Cal.getInstance();
			
			
			for(int i=1; i<=100;i++) {
				cal.InsertVal(i);
			}
		
		cal.ShowVal();
		
	}

}
