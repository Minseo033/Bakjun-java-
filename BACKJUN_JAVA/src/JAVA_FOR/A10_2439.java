package JAVA_FOR;

import java.util.Scanner;

public class A10_2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = N - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}