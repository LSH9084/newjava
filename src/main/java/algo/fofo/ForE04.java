package algo.fofo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.poi.hpsf.Array;

public class ForE04 {
	static int X; // 총 가격
	static int N; // 목록 줄
	static boolean C = false;
	public ForE04(int N, int X) {
		this.N = N;
		this.X = X;
		if(X<1 || X > 1000000000) return;
		if(N<1 || N>100) return;
		makeNumber(); 
	}
	
	public boolean makeNumber () {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("지불한 금액 X : "+X + "\n"+ "영수증의 물품 개수 N : " + N);
		for(int i=1; i<=N; i++ ) {
			System.out.println(i+"번째 줄...");
			System.out.print("물품 가격 : ");
			int a = sc.nextInt();
			System.out.println("물품 개수 : ");
			int b = sc.nextInt();
			
			int sum = a*b;
			result += sum;
			System.out.println(a+" "+b);
		}
		System.out.println("구매한 물품 총 가격 : "+result);
		if(result == this.X) {
			this.C = true;
		}
		return this.C;
	}
	 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("품목 개수를 적어주세요 : ");
		N = sc.nextInt();
		System.out.println("물품 총 가격을 적어주세요 : ");
		X = sc.nextInt();
		ForE04 e04 = new ForE04(N, X);
		
		if(C == false) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		
		
		
		
		
	}
}
