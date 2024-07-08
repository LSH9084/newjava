package algo.deep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.DoubleStream;

public class E08 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] title = new String [20];
		double [] point = new double [20];
		String [] grade = new String [20];
		
		for(int i=0; i<20; i++) {
			String [] str1 = br.readLine().split(" ");
			title[i] = str1[0];
			point[i] = (double)(Integer.parseInt(str1[1].substring(0, 1)));
			grade[i] = str1[2];
		}
		
		DoubleStream dstm = Arrays.stream(point);
		double sum = dstm.sum();
		double sum2 = 0.0;
		for(int i=0; i<20 ; i++) {
			if(grade[i].equals("P")) {
				sum -= point[i];
			}
		}
		for(int i=0; i< 20; i++) {
			if(grade[i].equals("A+")) {
				sum2 += 4.5*point[i];
			}
			if(grade[i].equals("A0")) {
				sum2 += 4.0*point[i];
			}
			if(grade[i].equals("B+")) {
				sum2 += 3.5*point[i];
			}
			if(grade[i].equals("B0")) {
				sum2 += 3.0*point[i];
			}
			if(grade[i].equals("C+")) {
				sum2+=2.5*point[i];
			}
			if(grade[i].equals("C0")) {
				sum2 += 2.0*point[i];
			}
			if(grade[i].equals("D+")) {
				sum2 += 1.5*point[i];
			}
			if(grade[i].equals("D0")) {
				sum2 += 1.0*point[i];
			}
			if(grade[i].equals("F")) {
				sum2 += 0*point[i];
			}
		}
		System.out.println(sum2/sum);
		
		
	}
}
