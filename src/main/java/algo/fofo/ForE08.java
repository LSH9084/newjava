package algo.fofo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ForE08 {

	public static void main(String[] args) throws Exception{
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	     int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(i>N-j) {
					bw.write("*");
				} else {
					bw.write(" ");
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
