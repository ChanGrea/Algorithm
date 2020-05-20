package BOJ;

import java.io.*;

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
            map[Integer.parseInt(input[0])][Integer.parseInt(input[1])] = Integer.parseInt(input[2]);
        }

        floydWarshall();

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
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
                for(int j = 1; j <= N; j++) {
                    if(i != j && map[i][k] != 0 && map[k][j] != 0) {
                        if(map[i][j] == 0)
                            map[i][j] = map[i][k] + map[k][j];
                        if(map[i][k] + map[k][j] < map[i][j])
                            map[i][j] = map [i][k] + map[k][j];
                    }
                }
            }
        }
    }
}
