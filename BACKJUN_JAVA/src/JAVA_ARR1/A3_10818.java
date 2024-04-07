 // 백준 단계별로풀기[배열]  
 // 배열 3번 [백준10818]
 // 문제
 // 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 // 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 //
 // 입력
 // 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 // 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 //
 // 출력
 //첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 // 
 // 예제입력    			예제출력
 // 					7 35	
 // 5	
 // 20 10 35 37 7
 //


package JAVA_ARR1;

import java.util.Arrays;
import java.util.Scanner;

public class A3_10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		int N = sc.nextInt();
		int arr[] = new int[N];

		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt() ;
		}
		
		sc.close();
		Arrays.sort(arr); // arr 배열을 오름차순으로 정령
		System.out.println(arr[0] + " " + arr[arr.length -1]); 
		// 오름차순 상태이므로, index 0에는 최소값, 배열의 마지막 원소인 arr.length -1에는 최대값이 들어있다
	}
}	


