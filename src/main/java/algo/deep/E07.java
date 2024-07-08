package algo.deep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E07 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int groupSum = 0;
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String [] str = br.readLine().split("");
			int [] cnt = new int [str.length];
			for(int j=0; j<str.length-1; j++) {
				if(str[j].equals(str[j+1])) {
					cnt[j] += 1;
				}	
			}
			IntStream intstm = Arrays.stream(cnt);
			int sum = intstm.sum();
			Stream stm1 = Arrays.stream(str);
			Set stm2 = (Set) stm1.collect(Collectors.toSet());
			if(stm2.size()==str.length) {
				groupSum += 1;
			} else if((stm2.size()+sum)==str.length) {
					groupSum += 1;
				}
			
			
		}
		bw.write(groupSum+"");
		bw.flush();
		bw.close();
		br.close();
		
	}
}
