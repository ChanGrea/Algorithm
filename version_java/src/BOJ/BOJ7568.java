package BOJ;

import java.io.*;

public class BOJ7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] pysical = new int[N][2];
        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            pysical[i][0] = Integer.parseInt(input[0]);
            pysical[i][1] = Integer.parseInt(input[1]);
        }

        for(int i = 0; i < N; i++) {
            int rank = 1;
            for(int j = 0; j < N; j++) {
                if(i != j) {
                    if(pysical[i][0] < pysical[j][0] && pysical[i][1] < pysical[j][1])
                        rank++;
                }
            }
            bw.write(rank + " ");
        }

        bw.write("\n");
        bw.flush();

        bw.close();
        br.close();
    }
}
