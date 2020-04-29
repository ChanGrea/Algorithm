package BOJ;

import java.io.*;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        if(n == input.length) {
            int result = 0;
            for(int i = 0; i < n; i++) {
                result += Character.getNumericValue(input[i]);  // 또는 input[i] - '0'
            }

            bw.write(result + "\n");
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
