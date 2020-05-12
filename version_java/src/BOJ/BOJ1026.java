package BOJ;

import java.io.*;
import java.util.Arrays;

public class BOJ1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        input = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(A);
        Arrays.sort(B);

        int result = 0;
        for(int i = 0; i < N; i++) {
            result += A[i] * B[N-i-1];
        }

        bw.write(result + "\n");
        bw.flush();

        bw.close();
        br.close();

    }
}
