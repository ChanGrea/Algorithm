package BOJ;

import java.io.*;

public class BOJ1012 {
    private static int M, N, K;
    private static int[][] map;
    private int[] dx = { -1, 0, 1, 0 };
    private int[] dy = { 0, 1, 0, -1 };

    private static void dfs(int j, int i) {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            String[] input = br.readLine().split(" ");
            M = Integer.parseInt(input[0]);
            N = Integer.parseInt(input[1]);
            K = Integer.parseInt(input[2]);

            map = new int[N][M];
            for(int i = 0; i < K; i++) {
                String[] locations = br.readLine().split(" ");
                map[Integer.parseInt(locations[1])][Integer.parseInt(locations[0])] = 1;
            }

            int count = 0;
            for(int i = 0; i < M; i++) {
                for(int j = 0; j < M; j++) {
                    if(map[j][i] == 1) {
                        count++;
                        dfs(j, i);
                    }
                }
            }
        }
    }

}
