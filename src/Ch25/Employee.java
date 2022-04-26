package Ch25;

public abstract class Employee {
// + 기호가 있으면 public 한정자 기호 - private 한정자 기호 , 외부접근할수없도록 
	public String name;
	public String addr;
	private String phone;

	//생성자
	public Employee(String name, String addr, String phone) {
		 
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	//기능
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// 추상메서드로 변경
	

	abstract void ShowInfo() ;
	
}
