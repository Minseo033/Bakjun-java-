package JAVA_ARR1;

import java.util.Scanner;

public class A1_10807 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		int N = sc.nextInt() ;
		int arr[] = new int[N] ;
		int same = 0 ;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt() ;
		}
		int x = sc.nextInt() ;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x)
			same++;
		}
		System.out.println(same);
	}
}	
