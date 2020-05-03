package BOJ;

import java.io.*;

public class BOJ2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int length = input.length();
        int N = Integer.parseInt(input);

        int result = 0;
        for(int i = N - 9 * length; i < N; i++) {
            int num = i;
            int sum = num;
            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if(sum == N) {
                result = i;
                break;
            }
        }

        bw.write(result + "\n");
        bw.flush();

        bw.close();
        br.close();

    }
}
