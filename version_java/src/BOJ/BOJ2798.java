package BOJ;

import java.io.*;

public class BOJ2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] cards = new int[N];
        input = br.readLine().split(" ");
        for(int i = 0; i < input.length; i++) {
            cards[i] = Integer.parseInt(input[i]);
        }

        int sum, max = -1;
        for(int i = 0; i < N - 2; i++) {
            for(int j = i + 1; j < N - 1; j++) {
                for(int k = j + 1; k < N; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if(sum <= M && max < sum)
                        max = sum;
                }
            }
        }

        bw.write(max + "\n");
        bw.flush();

        bw.close();
        br.close();
    }
}
