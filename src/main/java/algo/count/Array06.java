package algo.count;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array06 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] num1 = br.readLine().split(" ");
		int N = Integer.parseInt(num1[0]);
		int M = Integer.parseInt(num1[1]);
		
		int i=0;
		int j=0;
		int k=0;
		int [] num3 = new int [N];
		
		for(int l=1; l<=M; l++) {
			String [] num2 = br.readLine().split(" ");
			i = Integer.parseInt(num2[0]);
			j = Integer.parseInt(num2[1]);
			k = Integer.parseInt(num2[2]);
			
			for(int y=(i-1); y<j; y++) {
				num3[y] = k;
			}
			
		}
		for(int w=0; w<num3.length;w++ ) {
			System.out.print(num3[w]+" ");
		}
	}
}
