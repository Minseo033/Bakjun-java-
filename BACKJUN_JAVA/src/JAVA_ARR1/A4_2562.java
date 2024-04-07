package JAVA_ARR1;

import java.util.Scanner;

public class A4_2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		int arr[] = new int[9] ;
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt() ;			
		}
		int max = arr[0] ;
		int line = 1 ;
		
		for(int i=1; i<9; i++) {
			if(arr[i]>max) {
				max=arr[i] ;
				line = i+1 ;
			}
		}
		System.out.println(max);
		System.out.println(line);
	}

}
