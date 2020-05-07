package BOJ;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
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
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        DFS(V);
        bw.write("\n");
        Arrays.fill(visit, false);
        BFS(V);
        bw.write("\n");
        bw.flush();

        bw.close();
        br.close();

    }

    private static void BFS(int v) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visit[v] = true;

        bw.write(v + " ");
        while(!queue.isEmpty()) {
            int item = queue.poll();

            for(int i = 1; i <= N; i++) {
                if(arr[item][i] == 1 && !visit[i]) {
                    bw.write(i + " ");
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
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
