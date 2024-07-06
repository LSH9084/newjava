package algo.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E08 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().trim().split(" ");
		boolean blankCheck = false;
		if(str[0].equals("")== true) {
			blankCheck =true;
		}
		if(!blankCheck) {
			System.out.println(str.length);
		} else {
			System.out.println(str.length-1);
		}
	}
}
