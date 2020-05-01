package BOJ;

import java.io.*;

public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String[] input = br.readLine().split(" ");
            for(char alpha : input[1].toCharArray()) {
                for(int i = 0; i < Integer.parseInt(input[0]); i++) {
                    bw.write(alpha);
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
