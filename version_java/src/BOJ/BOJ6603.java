package BOJ;

import java.io.*;

public class BOJ6603 {
    private static int k;
    private static int[] arr, tmp;
    private static BufferedReader br;
    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String[] input = br.readLine().split(" ");

            if(input.length == 1 && 0 == Integer.parseInt(input[0]))
                break;

            k = Integer.parseInt(input[0]);
            arr = new int[k];
            tmp = new int[6];
            for(int i = 1; i <= k; i++) {
                arr[i-1] = Integer.parseInt(input[i]);
            }

            dfs(0, 0);
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int start, int cnt) throws IOException {
        if(cnt == 6){
            for(int i = 0; i < cnt; i++) {
                bw.write(tmp[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for(int i = start; i < k; i++) {
            tmp[cnt] = arr[i];
            dfs(i+1, cnt+1);
        }
    }
}
