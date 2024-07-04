package algo.count;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Array02 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] number = br.readLine().split(" ");
		int N = Integer.parseInt(number[0]);
		int X = Integer.parseInt(number[1]);
		
		String [] A = br.readLine().split(" ");
		int [] ANum = new int [N];
		for(int j=0; j<N; j++) {
			ANum[j] = Integer.parseInt(A[j]);
		}
		
		IntStream stm = IntStream.of(ANum);
		stm.forEach(v-> {
			if(v<X) {
				System.out.print(v+" ");
			}
		});	
	}
}
