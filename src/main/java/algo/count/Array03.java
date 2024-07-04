package algo.count;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Array03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String [] numbers = br.readLine().split(" ");
		int [] intNumbers = new int [N];
		int [] intNumbers2 = new int [N];
		
		for(int i=0; i<N; i++) {
			intNumbers[i] = Integer.parseInt(numbers[i]);
		}
		

		IntStream intStm = IntStream.of(intNumbers).sorted();
		int [] newIntNumbers = intStm.toArray();
		int A = newIntNumbers[0];
		int B = newIntNumbers[N-1];
		System.out.print(A+" "+B);

	}
}
