package Ch23;

class A {int x;}
class B extends A{int b;}
class C extends A{int c;}
class D extends B{int d;}
class E extends D{int e;}
class F extends E{int f;}
class G extends D{int g;}
public class C03TEST {

	public static void FUNC (A obj) // A obj = new B();
	{
		obj.x=10;
//		B down=(b)obj;
//		down.b=20;
		// obj.b=20; 객체안에는 b가있지만 상위 클래스에서는 모름 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FUNC(new B());
		FUNC(new C());
		FUNC(new D());
		FUNC(new E());
		FUNC(new F());
	}

}

