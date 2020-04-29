package BOJ;

import java.io.*;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabets = new int[26];
        for(int i = 0; i < alphabets.length; i++) {
            alphabets[i] = -1;
        }

        char[] input = br.readLine().toCharArray();

        for(int i = 0; i < input.length; i++) {
            int alphabetOfInput = input[i] - 'a';
            if(alphabets[alphabetOfInput] == -1)
                alphabets[alphabetOfInput] = i;
        }

        for(int i = 0; i < 26; i++) {
            bw.write(alphabets[i] + " ");
        }
        bw.write("\n");
        bw.flush();

        bw.close();
        br.close();
    }
}
