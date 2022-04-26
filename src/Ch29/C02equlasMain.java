package Ch29;



class C03Simple{
	int x;
	C03Simple(int x){this.x=x;}
	
}

public class C02equlasMain {

	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple(10);
		C03Simple ob2 = new C03Simple(10);
		
		System.out.println("ob1.equals(ob2) ? " + ob1.equals(ob2));
	

	}

}
