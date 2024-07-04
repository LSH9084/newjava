package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ForE02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=T; i++) {
			String [] number = br.readLine().split(" ");
			int A = Integer.parseInt(number[0]);
			int B = Integer.parseInt(number[1]);
			
			bw.write((A+B)+"\n");
			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
