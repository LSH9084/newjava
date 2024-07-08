package algo.deep;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E06 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str1 = br.readLine().split("");
		int cnt =0;
		boolean check = false;
		for(int i=0; i<str1.length; i++) {
			if(str1[i].equals("c")) {
				if(i>=str1.length-1) return;
				if(str1[i+1].equals("=")||str1[i].equals("-")) {
					cnt++;
					check = true;
				}
			}
			if(str1[i].equals("d")) {
				if(i>=str1.length-1) return;
				if(str1[i+1].equals("-")) {
					cnt++;
					check = true;
				} else if(str1[i+1].equals("z")) {
					if(i>=str1.length-2) return;
					if(str1[i+2].equals("=")) {
						cnt++;
						check = true;
					}
				}
			}
			if(str1[i].equals("l")) {
				if(i>=str1.length-1)return;
				if(str1[i+1].equals("j")) {
					cnt++;
					check = true;
				}
			}
			if(str1[i].equals("n")) {
				if(i>=str1.length-1)return;
				if(str1[i+1].equals("j")) {
					cnt++;
					check = true;
				}
			}
			if(str1[i].equals("s")) {
				if(i>=str1.length-1)return;
				if(str1[i+1].equals("=")) {
					cnt++;
					check = true;

				}
			}
			if(str1[i].equals("z")) {
				if(i>=str1.length-1)return;
				if(str1[i+1].equals("=")) {
					cnt++;
					check = true;
				}
			}
		}
		if(check) {
			System.out.println(str1.length-cnt);
		}
		
	}
}
