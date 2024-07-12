package algo.multipledivisor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class E03E1 {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            
            if (n == -1) {
                break;
            }
            int sum = 0;
            List<Integer> divisors = new ArrayList<>();
            
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                bw.write(n + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    bw.write(divisors.get(i) + (i < divisors.size() - 1 ? " + " : ""));
                }
                bw.write("\n");
            } else {
                bw.write(n + " is NOT perfect.\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
