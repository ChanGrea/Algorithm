package BOJ;

import java.io.*;

public class BOJ2583 {
    private static BufferedReader br;
    private static BufferedWriter bw;
    private static int[][] map;
    private static int[] dx = { 1, -1, 0, 0 };
    private static int[] dy = { 0, 0, -1, 1 };
    private static int M, N, K;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        M = Integer.parseInt(input[0]);
        N = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]);

        map = new int[N][M];
        for(int i = 0; i < K; i++) {
            input = br.readLine().split(" ");

        }

    }
}
