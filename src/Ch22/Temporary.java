package Ch22;

public class Temporary extends Employee {

	//속성
	private int PerPayment;
	private int WorkingHour;
	private int WorkingDay;

	
	
	
	
	//생성자
	public Temporary(String name, String addr, String phone, int perPayment, int workingHour, int workingDay) {
		super(name, addr, phone);
		PerPayment = perPayment;
		WorkingHour = workingHour;
		WorkingDay = workingDay;
	}
	//기능
	public int getPerPayment() {
		return PerPayment;
	}
	public void setPerPayment(int perPayment) {
		PerPayment = perPayment;
	}
	public int getWorkingHour() {
		return WorkingHour;
	}
	public void setWorkingHour(int workingHour) {
		WorkingHour = workingHour;
	}
	public int getWorkingDay() {
		return WorkingDay;
	}
	public void setWorkingDay(int workingDay) {
		WorkingDay = workingDay;
	}
	
	void ShowTempInfo() {
		ShowBasicInfo();
		System.out.println("근로 시간 : " + WorkingHour);
		System.out.println("근로 일수 : " + WorkingDay);
	}
	
}
