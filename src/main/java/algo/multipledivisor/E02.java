package algo.multipledivisor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class E02 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] num1 = br.readLine().split(" ");
		int N = Integer.parseInt(num1[0]);
		int K = Integer.parseInt(num1[1]);
		int cnt =0;
		int result = 0;
		for(int i=1; i<=N; i++) {
			if(N%i==0) {
				cnt++;
			}
			if(cnt==K) {
				result=i;
				break;
			} 
		}
		if (cnt < K) {
            result = 0;
        }
		bw.write(result+"");
		bw.flush();
		bw.close();
		br.close();
	}
}
