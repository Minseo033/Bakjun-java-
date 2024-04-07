 // 백준 단계별로풀기[FOR문]  
 // 반복문 12번 [백준10951]
 // 문제
 // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 //
 // 입력
 // 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 // 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 //
 // 출력
 // 각 테스트 케이스마다 A+B를 출력한다.
 // 
 // 예제입력    예제출력
 // 
 // 1 1 	  2	
 // 2 3	      5
 // 3 4		  7
 // 9 8		  17
 // 5 2		  7
 //
 // 해당 문제는 EOF(End Of File)에 대한 문제이다.
 // 더 이상의 입력이 없을때에는 프로그램이 종료되어야 한다.
 //

package JAVA_FOR;

import java.util.Scanner;

public class A12_10951 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int Sum = A + B;
			
			
			System.out.println(Sum);
		}
		
	}

}
