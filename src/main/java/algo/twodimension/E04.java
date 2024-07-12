package algo.twodimension;

import java.util.Scanner;

public class E04 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] num = new int [100][100];
		for(int t=0; t<N; t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int i=x; i<x+10; i++) {
				for(int j=y; j<y+10; j++) {
					num[i][j] = 1;
				}
			}
		}
		
		int result = 0;
		for(int i=0;i<100; i++) {
			for(int j=0; j<100; j++) {
				if(num[i][j]==1) {
					result++;
				}
			}
		}
		System.out.println(result);
		
		sc.close();
		
		
	}
}

