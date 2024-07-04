package algo.count;

import java.io.IOException;
import java.util.Scanner;

public class Array05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int [] A = new int[9];
		
		int index = 0;
		for(int i=0; i<9; i++) {
			int B = sc.nextInt();
			A[i] = B;
			
		}
		int result = A[0];
		for(int i=0; i<9; i++) {
			if(A[i]>=result) {
				result = A[i];
				index = i+1;
			}
		}
		
		System.out.println(result);
		System.out.println(index);
	}
}
