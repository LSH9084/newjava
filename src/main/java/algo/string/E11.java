package algo.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E11 {
	public static void main(String[] args) throws Exception {
		int sum = 0;
		String [] str1 = {
				"ADGJMPTWO",
				"BEHKNQUXO",
				"CFILORVYO",
				"SZ"
		};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str3 = br.readLine().split("");
		String rr = "";
		if (str3 == null || str3.length==0) {
			return;
		}
		for(int i=0; i<4; i++) {
			if(i<3) {
				for(int j=0; j<str3.length; j++) {
					if(str1[i].indexOf(str3[j])!=-1) {
						rr += (str1[i].indexOf(str3[j])+2);
					}
				}
			} else if(i==3){
				for(int j=0; j<str3.length; j++) {
					if(str1[3].charAt(j)=='S') {
						sum += (int)8;
					} else if(str1[3].charAt(j)=='Z'){
						sum += (int)10;
					}
				}
			}
			
		}
		int [] nString = new int [rr.length()];
		String [] sNum = rr.split("");
		for(int i=0; i<rr.length(); i++) {
			nString[i] = Integer.parseInt(sNum[i])+1;
		}
		
		for (int i=0; i<rr.length(); i++) {
			sum += nString[i];
		}
		System.out.println(sum);
		
	}
}
