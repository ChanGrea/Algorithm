package BOJ;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ2583 {
    private static BufferedReader br;
    private static BufferedWriter bw;
    private static int[][] map;
    private static boolean[][] visited;
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
        visited = new boolean[N][M];
        for(int i = 0; i < K; i++) {
            input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int x2 = Integer.parseInt(input[2]);
            int y2 = Integer.parseInt(input[3]);
            for(int x = x1; x < x2; x++) {
                for(int y = y1; y < y2; y++) {
                    map[x][y] = 1;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int j = 0; j < M; j++) {
            for(int i = 0; i < N; i++) {
                if(!visited[i][j] && map[i][j] == 0) {
                    visited[i][j] = true;
                    int cnt = dfs(i, j);
                    result.add(cnt);
                }
            }
        }

        bw.write(result.size() + "\n");
        Collections.sort(result);
        for(int i = 0; i < result.size(); i++) {
            bw.write(result.get(i) + " ");
        }

        bw.flush();

        bw.close();
        br.close();

    }

    private static int dfs(int a, int b) {
        int cnt = 1;

        for(int i = 0; i < 4; i++) {
            int x = a + dx[i];
            int y = b + dy[i];
            if(x >= 0 && x < N && y >= 0 && y < M && !visited[x][y] && map[x][y] == 0) {
                visited[x][y] = true;
                cnt += dfs(x, y);
            }
        }

        return cnt;
    }
}
