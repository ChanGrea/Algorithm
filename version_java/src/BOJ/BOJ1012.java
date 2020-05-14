package BOJ;

import java.io.*;

public class BOJ1012 {
    private static int M, N, K;
    private static int[][] map;
    private static boolean[][] visit;
    private static int[] dx = { -1, 0, 1, 0 };
    private static int[] dy = { 0, 1, 0, -1 };

    private static void dfs(int j, int i) {
        visit[j][i] = true;
        for(int a = 0; a < 4; a++) {
            if( i + dx[a] >= 0 && i + dx[a] < M && j + dy[a] >= 0 && j + dy[a] < N) {
                if(map[j+dy[a]][i+dx[a]] == 1 && !visit[j+dy[a]][i+dx[a]])
                    dfs(j + dy[a], i + dx[a]);
            }
        }
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
            visit = new boolean[N][M];
            for(int i = 0; i < K; i++) {
                String[] locations = br.readLine().split(" ");
                map[Integer.parseInt(locations[1])][Integer.parseInt(locations[0])] = 1;
            }

            int count = 0;
            for(int i = 0; i < M; i++) {
                for(int j = 0; j < N; j++) {
                    if(map[j][i] == 1 && !visit[j][i]) {
                        count++;
                        dfs(j, i);
                    }
                }
            }

            bw.write(count + "\n");
        }

        bw.flush();

        bw.close();
        br.close();
    }

}
