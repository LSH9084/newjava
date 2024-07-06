package algo.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E05 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String [] num2 = br.readLine().split("");
		int [] num1 = new int [N];
		int sum =0;
		for(int i=0; i<N; i++) {
			num1[i] = Integer.parseInt(num2[i]);
			sum += num1[i];
		}	
		System.out.println(sum);
		
	}
}
