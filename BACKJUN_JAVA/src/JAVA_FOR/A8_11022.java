 // 백준 단계별로풀기[FOR문]  
 // 반복문 8번 [백준11022]
 // 문제
 // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 //
 // 입력
 // 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 // 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 //
 // 출력
 // 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
 // x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 // 예제입력    예제출력
 // 
 // 5 		  Case #1: 2
 // 1 1		  Case #2: 5	
 // 2 3		  Case #3: 7s
 // 3 4		  Case #4: 17
 // 9 8		  Case #5: 7
 // 5 2
 //

 

package JAVA_FOR;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A8_11022 {

	public static void main(String[] args) throws IOException { 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) ;
		
		int t = Integer.parseInt(br.readLine()) ;
		
		for(int i=1; i<=t; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]) ;
			int b = Integer.parseInt(input[1]) ;
			int sum = a+b ;
			
			bw.write("Case #"+i+": " + a + " + " + b + " = " + sum + "\n");
		}
		bw.flush();
		bw.close();
		
	}

}
