package BOJ;

import java.io.*;

public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            char[] input = br.readLine().toCharArray();
            boolean[] check = new boolean[26];

            if(input.length == 1) {
                count++;
            } else {
                for(int j = 0; j < input.length - 1; j++) {
                    char first = input[j];
                    char second = input[j+1];

                    check[first-'a'] = true;

                    if(first != second && check[second-'a']) {
                        break;
                    }

                    if(j == input.length - 2)
                        count++;
                }
            }
        }

        bw.write(count + "\n");
        bw.flush();

        bw.close();
        br.close();
    }
}
