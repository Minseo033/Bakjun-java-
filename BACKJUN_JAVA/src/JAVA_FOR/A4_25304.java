 // 백준 단계별로풀기[FOR문]  
 // 반복문 4번 [백준25304]
 // 문제
 // 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다.
 // 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 
 // 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
 //
 // 영수증에 적힌,
 // 구매한 각 물건의 가격과 개수, 구매한 물건들의 총 금액
 // 을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이
 // 영수증에 적힌 총 금액과 일치하는지 검사해보자.
 //
 // 입력
 // 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다
 // 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다
 // 이후 N개의 줄에는 각 물건의 a와 개수 b가 공백을 사이에 두고 주어진다.
 //
 // 출력
 // 구매한 물건의 가격과 개수로 계산한 총 금액이
 // 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다.
 // 일치하지 않는다면 No를 출력한다.
 //
 // 예제    		예제출력
 // 
 // 260000 	  	6
 // 4
 // 20000  5 
 // 30000  2
 // 10000  6	
 // 5000   8

package JAVA_FOR;

import java.util.Scanner;

public class A4_25304 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		long X = sc.nextLong() ; // 영수증에 적힌 총 금액
		int N = sc.nextInt() ; // 영수증에 적힌 구매한 물건 종류의 수 
	    int total=0 ; // 계산한 총 금액
		
		for(int i=0; i<N; i++) {
			int a = sc.nextInt() ; // 물건의 가격
			int b = sc.nextInt() ; // 물건의 가격
			total = total + a * b ; // 총 물건의 금액을 구하는 계산식
		}
		if(total == X) { //total과 영수증의 금액이 일치하면 Yes 출력.
			System.out.println("Yes");
		}else { //total과 영수증의 금액이 불일치하면 NO 출력.
			System.out.println("No");
		}
	}
}
