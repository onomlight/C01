package Ch02;

public class C01정수 {

	public static void main(String[] args) {
		// %d : 10진 출력 서식문자
		System.out.printf("10진 서식 : %d\n", 0b10101101); //2진수
		System.out.printf("10진 서식 : %d\n", 173);  //10진수
		System.out.printf("10진 서식 : %d\n", 0255); // 8진수
		System.out.printf("10진 서식 : %d\n", 0xAD); // 16진수
		System.out.println("--------------");
		//%o : 8진 출력 서식문자
		System.out.printf("10진 서식 : %o\n", 173);
		System.out.printf("10진 서식 : %o\n", 0255);
		System.out.printf("10진 서식 : %o\n", 0xAD);
		System.out.println("--------------");
		//%x : 16진 출력 서식문자
		System.out.printf("10진 서식 : %x\n", 173);
		System.out.printf("10진 서식 : %x\n", 0255);
		System.out.printf("10진 서식 : %x\n", 0xAD);

	}

}
