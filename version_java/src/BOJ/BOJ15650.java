package BOJ;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15650 {
    private static BufferedReader br;
    private static BufferedWriter bw;
    private static int N, M;
    private static int[] arr;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        visited = new boolean[N+1];

        func(1, 0);

        bw.flush();

        bw.close();
        br.close();
    }

    private static void func(int index, int cnt) throws IOException {
        if(cnt == M) {
            for(int i = 0; i <M; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
        }

        for(int i = index; i <= N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[cnt] = i;
                func(i + 1, cnt+1);
                visited[i] = false;
            }
        }
    }
}
