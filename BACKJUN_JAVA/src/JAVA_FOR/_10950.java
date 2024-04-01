 // 백준 단계별로풀기[FOR문] 
 // 반복문 2번 [백준10950]
 // 문제
 // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 // 
 // 입력
 // 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 // 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10) 
 // 
 // 출력
 // 각 테스트 케이스마다 A+B를 출력한다.
 // 
 // 예제    예제출력
 // 5	  2	
 // 1 1 	  5	
 // 2 3    7
 // 3 4    17
 // 9 8    7
 // 5 2
 


package JAVA_FOR;

import java.util.Scanner;

public class _10950 {
	 
	/**
	 * 메인 메서드
	 * @param args 명령행 인수
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		// 테스트 케이스의 개수를 입력 받음
		int t = sc.nextInt() ;
		
		// 각 테스트 케이스에 대해 반복문 실행
		for(int i=0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			// 두 정수의 합을 출력 
			System.out.println(a + b);
		}
		    
		sc.close();
	}
}