package algo.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E06 {
	public static void main(String[] args) throws Exception {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		for(int i=97; i<123; i++) {
			System.out.print(S.indexOf((char)i)+" ");
		}
	}
}
