package algo.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E01 {

	public static void main(String[] args) throws Exception{
		new E01().solution();
		
	}
	
	public void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s1 = br.readLine();
		int n1 = Integer.parseInt(br.readLine());
		
		
		System.out.println(s1.trim().charAt(n1-1));
	}
}
