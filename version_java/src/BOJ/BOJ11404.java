package BOJ;

import java.io.*;
import java.util.Arrays;

public class BOJ11404 {
    private static int N, M;
    private static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        map = new int[N+1][N+1];

        for(int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int s = Integer.parseInt(input[0]);
            int d = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            if(map[s][d] == 0) {
                map[s][d] = c;
            } else {
                map[s][d] = Math.min(map[s][d], c);
            }
        }

        floydWarshall();

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                if(map[i][j] == 999999)
                    bw.write(0 + " ");
                else
                    bw.write(map[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();

        bw.close();
        br.close();
    }

    private static void floydWarshall() {
        for(int k = 1; k <= N; k++) {
            for(int i = 1; i <= N; i++) {
                if(map[i][k] == 0)
                    continue;

                for(int j = 1; j <= N; j++) {
                    if(map[k][j] == 0 || i == j)
                        continue;

                    if(map[i][j] == 0 || map[i][k] + map[k][j] < map[i][j])
                        map[i][j] = map [i][k] + map[k][j];
                }
            }
        }
    }
}

