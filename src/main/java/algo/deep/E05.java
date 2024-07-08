package algo.deep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class E05 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine().trim();
		int [] cnt = new int [str1.length()];
		boolean check = true;
		 for (char ch : str1.toCharArray()) {
	            if (!('a' <= ch && ch <= 'z') && ( !('A' <= ch && ch <= 'Z'))) {
	                check = false;
	                break;
	            }
	            
	      }
		 if(str1.isEmpty()) {
         	check = false;
         }
		if(check) {
			for(int i=0; i<str1.length(); i++) {
				cnt[i] = 0;
				for(int j=0; j<str1.length(); j++) {
					if(str1.charAt(i)==str1.charAt(j)) {
						cnt[i] ++;	
					}
				}
			}
			
			IntStream stm = Arrays.stream(cnt);
			int maxInt = stm.max().getAsInt();
			int count = 0;
			
			for(int i=0; i<cnt.length; i++) {
				if(maxInt == cnt[i]) {
					count ++;	
				}
			}
			int k =0;
			for(int i=0; i<str1.length(); i++) {
				if(maxInt == cnt[i]) {
					k = i;
				}
			}
			if(count == maxInt) {
				System.out.println(str1.toUpperCase().charAt(k));

			} else {
				System.out.println("?");
			}
		}
	}
	
}
