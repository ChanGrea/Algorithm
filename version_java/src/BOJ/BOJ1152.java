package BOJ;

import java.io.*;

public class BOJ1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        String[] input = br.readLine().trim().split(" ");

        for(String word : input) {
            if(!word.isEmpty())
                count++;
        }
        bw.write(count + "\n");
        bw.flush();

        bw.close();
        br.close();

    }
}
