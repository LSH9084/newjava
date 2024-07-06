package algo.deep;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E02 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str1 = br.readLine().split(" ");
		int [] num1 = new int [6];
		
		for(int i=0; i<6; i++) {
			num1[i] = Integer.parseInt(str1[i]);
		}
		int [] num2 = new int [6];
		for(int i=0; i<6; i++) {
			if(i==0 || i==1) {
				num2[i] = 1 - num1[i];
			} else if(i>=2 && i<5) {
				num2[i] = 2 - num1[i];
			} 
			num2[5] = 8 - num1[5];
		}
		for(int num : num2) {
			System.out.print(num+" ");
		}
	}
}