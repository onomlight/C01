package Ch10;

public class test4 {

	public static void main(String[] args) {
		   Employee emp1 = new Employee("홍길동","인사부","사원","3000");//name,dept,role,salary
		   emp1.showInfo();
		   System.out.println();
		   emp1.setRole("대리");
		   emp1.setDept("총무부");
		   emp1.setSalary(4000);
		   emp1.showInfo();
	}

}
