package algo.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E10 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] num1 = new int [3];
		int [] num2 = new int [3];
		
		String [] str1 = br.readLine().split(" ");
		String s1 = str1[0];
		String s2 = str1[1];
		
		String [] str2 = s1.split("");
		String [] str3 = s2.split("");
		
		for(int i=0; i<3; i++) {
			num1[i] = Integer.parseInt(str2[i]);
			num2[i] = Integer.parseInt(str3[i]);
		}
		int replace = num1[0];
		num1[0] = num1[2];
		num1[2] = replace;

		int replace2 = num2[0];
		num2[0] = num2[2];
		num2[2] = replace2;

		int j =0;
		int [] pow = new int[3];
		for(int i=2; i>=0; i--) {
			pow[j] = (int)Math.pow(10, i);
			j++;
		}
		
		int rn1 = 0;
		int rn2 = 0;
		for(int i=0; i<3; i++) {
			rn1 += num1[i]*pow[i];
			rn2 += num2[i]*pow[i];
		}
		if(rn1>rn2) {
			System.out.println(rn1);
		} else {
			System.out.println(rn2);
		}	
	}
}
