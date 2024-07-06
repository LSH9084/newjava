package algo.count;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array08 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] submitted = new boolean[31]; // 학생 번호 1~30을 인덱스로 사용하기 위해 크기 31로 설정
        for (int i = 0; i < 28; i++) {
            int studentNum = Integer.parseInt(br.readLine());
            submitted[studentNum] = true; // 과제를 제출한 학생은 true로 설정
        }
        
        // 과제를 제출하지 않은 학생 번호 출력
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                System.out.println(i);
            }
        }
    }
}
