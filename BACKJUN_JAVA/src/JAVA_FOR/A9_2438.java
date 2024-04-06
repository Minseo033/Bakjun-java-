 // 백준 단계별로풀기[FOR문]  
 // 반복문 8번 [백준2438]
 // 문제
 // 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 //
 // 입력
 // 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 // 
 // 출력
 // 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 // 
 // 예제입력    예제출력
 // 
 // 5 		  *
 // 	      **
 // 		  ***
 // 		  ****
 // 		  *****
 // 
 //

package JAVA_FOR;

import java.util.Scanner;

public class A9_2438 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.printf("*");
			}
				System.out.println("");
		}
			
	}
		
}


