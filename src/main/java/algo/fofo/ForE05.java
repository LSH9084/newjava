package algo.fofo;

import java.util.Scanner;

public class ForE05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("N : ");
		
		int N = sc.nextInt();
		if(N%4 !=0 || N==0 || N<4 || N>1000)return;
		
		int Ndevide = (int)N/4;
		
		String sum = "";
		for(int i=1; i<=Ndevide; i++) {
			sum += "long ";
		}
		System.out.print(sum+"int");
	}
}
