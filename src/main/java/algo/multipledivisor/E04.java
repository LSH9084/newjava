package algo.multipledivisor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E04 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String [] num = br.readLine().split(" ");
		int [] numInt = new int [num.length];
		for(int i=0; i<N; i++) {
			numInt[i]= Integer.parseInt(num[i]);
		}
		int [] cnt = new int [N];
		for(int i=0; i<N; i++) {
			for(int j=1; j<=numInt[i]; j++) {
				if(numInt[i]%j==0) {
					cnt[i]++;
				}
			}
		}
		int cnt2 =0;
		for(int i=0; i<cnt.length; i++) {
			if(cnt[i]==2) {
				cnt2++;
			}
		}
		
		System.out.println(cnt2);
	}
}
