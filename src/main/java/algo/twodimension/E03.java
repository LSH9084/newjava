package algo.twodimension;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E03 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char [][] ch1 = new char [5][15];
		int [] length = new int[5];
		for(int i=0; i<5; i++) {
			String str1 = br.readLine();
			length[i] = str1.length();
			for(int j=0; j<str1.length(); j++) {
				ch1[i][j] = str1.charAt(j);
			}
		}
		
		StringBuilder result = new StringBuilder();
		for(int j=0; j<15; j++) {
			for(int i=0; i<5; i++) {
				if(ch1[i][j] !=0 && j<length[i]) {
					result.append(ch1[i][j]);
				}
			}
		}
		
		System.out.println(result.toString());
	}
	
}
