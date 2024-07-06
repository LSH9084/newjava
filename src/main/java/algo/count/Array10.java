package algo.count;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array10 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] num1 = br.readLine().split(" ");
		int N = Integer.parseInt(num1[0]);
		int M = Integer.parseInt(num1[1]);
		
		int [] num3 = new int[N];
		for(int i=1; i<=N; i++) {
			num3[(i-1)]=i;
		}
		
		for(int k=0; k<M; k++) {
			String [] num2 = br.readLine().split(" ");
			int i = Integer.parseInt(num2[0])-1;
			int j = Integer.parseInt(num2[1])-1;
			if(i!=j) {
				while (i < j) {
                    int temp = num3[i];
                    num3[i] = num3[j];
                    num3[j] = temp;
                    i++;
                    j--;
                }
			}
		}
		for (int num : num3) {
            System.out.print(num + " ");
        }
		
		
	}
}
