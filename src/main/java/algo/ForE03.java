package algo;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ForE03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int n = sc.nextInt();
		System.out.println(n);
		
		IntStream nList = IntStream.rangeClosed(1, n);
		int sum = nList.sum();
		System.out.println(sum);
		
		
		
	}
}
