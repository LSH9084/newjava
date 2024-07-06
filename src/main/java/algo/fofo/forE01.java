package algo.fofo;

import java.util.Scanner;

public class forE01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력해주세요 : ");
		int N = sc.nextInt();
		
		System.out.println(N+"단을 출력합니다.");
		
		
		for(int i=1; i<10; i++) {
			System.out.println(N+"*"+i+"="+(N*i));
		}
	}
}
