package algo.multipledivisor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class E01 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			
			String [] num1 = br.readLine().split(" ");
			int X = Integer.parseInt(num1[0]);
			int Y = Integer.parseInt(num1[1]);
			
			if(X ==0 && Y==0) {
				break;
			}
			if(Y%X==0) {
				bw.write("factor\n");	
			} else if(X%Y==0) {
				bw.write("multiple\n");
			} else {
				bw.write("neither\n");
			}
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
