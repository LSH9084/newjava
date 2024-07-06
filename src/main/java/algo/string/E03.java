package algo.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E03 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		String [] s = new String[T];
		for(int i=0; i<T; i++) {
			s[i]=br.readLine();
		}
		
		for(int i=0; i<T; i++) {
			int length = s[i].length()-1;
			if(s[i].length()==1) {
				System.out.println(s[i].charAt(0)+""+s[i].charAt(0));
			} else {
				System.out.println(s[i].charAt(0)+""+s[i].charAt(length));
			}
		}
	}
}
