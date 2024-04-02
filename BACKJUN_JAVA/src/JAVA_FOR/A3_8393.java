 // 백준 단계별로풀기[FOR문]  
 // 반복문 3번 [백준8393]
 // 문제
 // n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 // 
 // 입력
 // 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 // 
 // 출력
 // 1부터 N까지 합을 출력한다.
 // 
 // 예제    예제출력
 // 
 // 3 		6
 // 
 // 
 // 
 // 
 
package JAVA_FOR;

import java.util.Scanner;

public class A3_8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		int N = sc.nextInt() ; //입력 값
		int sum=0 ; // 1부터 N 까지 합을 담을 변수
		
		for(int i=1; N>i; i++) { // 
		}
		System.out.println(N * (N+1) /2); // 1 ~ n까지 합을 구하는 공식
		
	}
}
