package test3;

class Person{
	
	String name;
	String addr;
	int age;
	
	Person(){
		this("없음","없음",0);
		
		Person(String n, String a)
		{
//			System.out.println("C03Simple(int x) 호출!");
//			this.x=x;
//			y=0;
//			z=0;
			this(n,a,0);
		}
		Person(String n,String a, int n){
//			System.out.println("C03Simple(int x , int y) 호출!");
//			this.x=x;
//			this.y=y;
//			z=0;
			
			this(n,a,n);
	}
}



public class test2 {

}
