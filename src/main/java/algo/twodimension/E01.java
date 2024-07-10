package algo.twodimension;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E01 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str1 = br.readLine().split(" ");
		int N = Integer.parseInt(str1[0]);
		int M = Integer.parseInt(str1[1]);
		int [][] number1 = new int [N][M];
		
		for(int i=0; i<N; i++) {
			String [] str2 = br.readLine().split(" ");
			for(int j=0; j<M; j++) {
				number1[i][j] = Integer.parseInt(str2[j]);
			}

		}
		
		
		
		int [][] number2 = new int [N][M];
		
		for(int i=0; i<N; i++) {
			String [] str2 = br.readLine().split(" ");
			for(int j=0; j<M; j++) {
				number2[i][j] = Integer.parseInt(str2[j]);
			}

		}
		
		int [][] number3 = new int[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				number3[i][j] = number1[i][j]+number2[i][j];
			}
		}	
		for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					System.out.print(number3[i][j]+" ");
				}
				System.out.println();
			}

		}
		
}
