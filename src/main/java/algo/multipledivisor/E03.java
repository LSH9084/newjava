package algo.multipledivisor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class E03 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			
			if(n==-1) {
				break;
			}
			int sum = 0;
			int cnt = 0;
			int last = 0;
			int [] k = new int [n];
			for(int i=0; i<n; i++) {
				if(i!=0&&n%i==0) {
					k[i]=i;
					cnt++;
					last=i;
				}
			}

			for(int i=0; i<k.length; i++) {
				sum += k[i];	
			}
			
			if(sum==n) {
				bw.write(sum+" = ");
				for(int i=0; i<k.length; i++) {
					if(k[i]!=0&&i!=last) {
						bw.write(k[i]+" + ");
					} else if(i==last) {
						bw.write(k[i]+"");
					}
					
				}
				bw.write("\n");
			} else {
				bw.write(sum+" is NOT perfect.");
				bw.write("\n");
			}
			
			
			
		}
		bw.flush();
		bw.close();
		br.close();
	}
}

