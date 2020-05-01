package BOJ;

import java.io.*;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = br.readLine().toUpperCase().toCharArray();
        int[] alphaCount = new int[26];

        for(int i = 0; i < input.length; i++) {
            alphaCount[input[i] - 'A']++;
        }

        int max = -1;
        char result = '?';
        for(int i = 0; i < 26; i++) {
            if (alphaCount[i] > max) {
                max = alphaCount[i];
                result = (char)(i + 'A');
            } else if(alphaCount[i] == max) {
                result = '?';
            }
        }

        bw.write(result + "\n");
        bw.flush();

        bw.close();
        br.close();

    }
}
