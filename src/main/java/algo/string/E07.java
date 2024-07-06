package algo.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class E07 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String [] str1 = br.readLine().split(" ");
			int R = Integer.parseInt(str1[0]);
			String str2 = str1[1];
			String [] str3 = str2.split("");
			
			for(int j=0; j<str3.length; j++ ) {
				
				for(int jj=0; jj<R; jj++) {
					bw.write(str3[j]);
				}
				
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
