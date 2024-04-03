 // 백준 단계별로풀기[FOR문]  
 // 반복문 5번 [백준25314]
 // 문제
 // 본문 내용이 길어 본문 참고 ,,
 // https://www.acmicpc.net/problem/25314
 // 

package JAVA_FOR;

import java.util.Scanner;

public class A5_25313 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		int N = sc.nextInt() ; // N바이트 입력 
		
		// 4를 입력했을때 Long 출력, 8입력시 Long Long 출력
		for(int i=0; i<N/4; i++) { 
			System.out.print("long "); //Long 뒤에 바로 int가 와야하므로 println이 아닌 print로 출력
		}
		System.out.println("int");
 
	}

}
