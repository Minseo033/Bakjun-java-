 // 백준 단계별로풀기[IF문]  
 // 반복문 1번 [백준1330]
 // 문제
 // 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 // 
 // 입력
 // 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 // 
 // 출력
 // 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 // A가 B보다 큰 경우에는 '>'를 출력한다.
 // A가 B보다 작은 경우에는 '<'를 출력한다.
 // A와 B가 같은 경우에는 '=='를 출력한다.
 //
 //
 // 예제    예제출력
 // 5	  2	
 // 1 1 	  5	
 // 2 3    7
 // 3 4    17
 // 9 8    7
 // 5 2
 


package JAVA_IF;

import java.util.Scanner;

public class A1_1330 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 정수 입력
		int b = sc.nextInt(); // 정수 입력
			
		if(a>b) {
			System.out.println(">"); // A가 B보다 크면 > 출력
		}
		else if(a<b) {
			System.out.println("<"); // A가 B보다 작으면 < 출력
		}
		else {
			System.out.println("=="); // A와 B가 같으면 = 출력
		}
		
	}

}
