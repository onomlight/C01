package test3;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
		System.out.print("높이 출력 : ");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for (int i=0; i<n; i++) {
		    for (int j=1; j<n-i; j++) {
		    	System.out.print(" ");
		    }
		    for (int j=0; j<i*2+1; j++) {
		    	System.out.print("*");
		    }
		    System.out.println();
		}
	}

}
