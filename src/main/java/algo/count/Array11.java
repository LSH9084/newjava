package algo.count;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Array11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		int [] num = new int [N];
		String [] num2 = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(num2[i]);
		}
		IntStream sum = IntStream.of(num);
		double M = sum.max().getAsInt();
		double [] num3 = new double[N];
		for(int i=0; i< N; i++) {
			num3[i] = (num[i]/M*100);
		}
		DoubleStream sum2 = DoubleStream.of(num3);
		double a = sum2.sum();
		System.out.println(a/N);
	}
}
