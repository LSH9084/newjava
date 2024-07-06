package algo.deep;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E04 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str1 = br.readLine().split("");
		int N = str1.length;
		int J = N/2;
		boolean check = true;
		int cnt =0;
		for(int k=0; k<J; k++) {
			N--;
			if(str1[k].equals(str1[N])) {
				cnt++;
			}
			if((k+1) != cnt){
                check = false;
                break;
            }
		}
		if(check) {
			System.out.print("1");
		} else {
			System.out.println("0");
		}
		br.close();
	}
}

