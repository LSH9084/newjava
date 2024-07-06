package algo.count;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Array09 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt =0;
		int [] num = new int [10];
		for(int i=0; i<10; i++) {
			num[i] = (Integer.parseInt(br.readLine())%42);
		}
		
		Set set1 = new HashSet();
		for(int i=0; i<10; i++) {
			set1.add(num[i]);
		}
		System.out.println(set1.size());
	}
}
