package BOJ;

import java.io.*;

public class BOJ11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        bw.write(String.valueOf(br.read()) + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
