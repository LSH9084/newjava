package algo.count;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count01 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String number = br.readLine();
		String [] part = new String [N];
		
		part = number.split(" ");
		int a = Integer.parseInt(br.readLine());
		
		int count =0;
		for(int i=0; i<part.length; i++) {
			int C = Integer.parseInt(part[i]);
			if(C==a) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
