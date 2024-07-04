package algo.count;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array07 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] num = br.readLine().split(" ");
		int N = Integer.parseInt(num[0]);
		int M = Integer.parseInt(num[1]);
		int [] num1 = new int [N];
		for(int y=1; y<=N; y++) {
			num1[(y-1)] = y;
		}
		
		int i=0;
		int j=0;
		int replace1 = 0;
		for(int w =0; w<M; w++) {
			String [] num2 = br.readLine().split(" ");
			i = Integer.parseInt(num2[0]);
			j = Integer.parseInt(num2[1]);
			if(i!=j) {
				replace1 = num1[i-1];
				num1[i-1] = num1[j-1];
				num1[j-1] = replace1;	
			}
		}
		
		for(int e=0; e<N; e++) {
			System.out.print(num1[e]+" ");
		}
		
	}
}
