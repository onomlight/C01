package Ch10;

class Employee{

	public Employee(String name, String dept, String role, String salary) {
		// TODO Auto-generated constructor stub
	}
	public String name;
	public String dept;
	public String role;
	public String salary;


	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept );
		System.out.println("직책 : " + role);
		System.out.println("급여 : " + salary);
}
public class test4 {

	public void main(String[] args) {
		   Employee emp1 = new Employee("홍길동","인사부","사원","3000");//name,dept,role,salary
		   emp1.showInfo();
		   System.out.println();
		   emp1.setRole("대리");
		   emp1.setDept("총무부");
		   emp1.setSalary(4000);
		   emp1.showInfo();
	}

}
public void setSalary(int i) {
	// TODO Auto-generated method stub
	
}
public void setRole(String string) {
	// TODO Auto-generated method stub
	
}
public void setDept(String string) {
	// TODO Auto-generated method stub
	
}

}