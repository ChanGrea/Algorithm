package BOJ;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1260 {
    private static BufferedReader br;
    private static BufferedWriter bw;
    private static int N, M, V;
    private static int[][] arr;
    private static boolean[] visit;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N+1][N+1];
        visit = new boolean[N+1];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
        }

        DFS(V);
        bw.write("\n");
        Arrays.fill(visit, false);
        BFS(V);
        bw.flush();

        bw.close();
        br.close();

    }

    private static void BFS(int v) throws IOException {
        visit[v] = true;
        bw.write(v + " ");
        
    }

    private static void DFS(int v) throws IOException {
        visit[v] = true;
        bw.write(v + " ");
        for(int i = 1; i <= N; i++) {
            if(arr[v][i] == 1 && !visit[i]) {
                DFS(i);
            }
        }
    }
}
