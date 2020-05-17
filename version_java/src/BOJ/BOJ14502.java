package BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ14502 {
    static int N, M, max;

    static int[][] d = new int[8][8];
    static boolean[][] check = new boolean[8][8];

    static int[] dr = { 0, 0, 1, -1 };
    static int[] dc = { 1, -1, 0, 0 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < M; c++) {
                d[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        int mul = N * M;
        for (int w1 = 0; w1 < mul - 2; w1++) {
            if (d[w1 / M][w1 % M] != 0)
                continue;
            d[w1 / M][w1 % M] = 1;
            for (int w2 = w1 + 1; w2 < mul - 1; w2++) {
                if (d[w2 / M][w2 % M] != 0)
                    continue;
                d[w2 / M][w2 % M] = 1;
                for (int w3 = w2 + 1; w3 < mul; w3++) {
                    if (d[w3 / M][w3 % M] != 0)
                        continue;
                    d[w3 / M][w3 % M] = 1;

                    ///////
                    sol();
                    ///////

                    d[w3 / M][w3 % M] = 0;
                }
                d[w2 / M][w2 % M] = 0;
            }
            d[w1 / M][w1 % M] = 0;
        }

        System.out.println(max);

    }

    public static void sol() {

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (d[r][c] == 2) {
                    dfs(r, c);
                }
            }
        }

        int cnt = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if(d[r][c] == 1) {
                    continue;
                }
                if(check[r][c] == true) {
                    check[r][c] = false;
                }else if(d[r][c] == 0) {
                    cnt++;
                }
            }
        }

        max = Math.max(max, cnt);

    }

    public static void dfs(int r, int c) {
        if (check[r][c] == true)
            return;
        check[r][c] = true;

        for (int i = 0; i < 4; i++) {
            int rr = r + dr[i];
            int cc = c + dc[i];
            if (fineRange(rr,cc) && d[rr][cc] == 0 && check[rr][cc] == false) {
                dfs(rr, cc);
            }
        }

    }

    public static boolean fineRange(int r, int c) {
        return 0 <= r && r < N && 0 <= c && c < M;
    }

}
