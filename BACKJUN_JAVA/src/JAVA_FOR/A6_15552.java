 // 백준 단계별로풀기[FOR문]  
 // 반복문 6번 [백준15552]
 // 문제
 // Java를 사용하고 있다면, Scanner와 System.out.println 대신 
 // BufferedReader와 BufferedWriter를 사용할 수 있다.
 // BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 //
 // 입력
 // 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 
 // 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
 //
 // 출력
 // 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 // 
 // 예제입력    예제출력
 // 
 // 5 			2
 // 1 1			46
 // 12 34		505
 // 5 500		100
 // 40 60		2000
 // 1000 1000
 //

 

package JAVA_FOR;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A6_15552 {

	public static void main(String[] args) throws IOException { //Buffered를 사용하기 위해 예외처리.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; //BufferedReader 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) ; //BufferedWriter 선언
		int T = Integer.parseInt(br.readLine()) ; // 입력받은 String 형을 Int형으로 변환
		
		for(int i=0; i<T; i++) {
			String[] input = br.readLine().split(" ") ; //input배열에 입력받은 String형을 공백을 기준으로 split
			int A = Integer.parseInt(input[0]) ; //입력받은 첫번째 String형을 Integer로 변환하고 input 배열 index값 0에 저장
			int B = Integer.parseInt(input[1]) ; //입력받은 첫번째 String형을 Integer로 변환하고 input 배열 index값 1에 저장
			
			bw.write(A + B +"\n");// A와 B의 합을 출력하고 개행
		}
		bw.flush();// 버퍼 비우기
		bw.close();
		br.close();
	}

	
}


