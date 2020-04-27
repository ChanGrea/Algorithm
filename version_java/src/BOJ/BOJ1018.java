package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]), N = Integer.parseInt(input[1]);
        char[][] board = new char[M][N];

        for (int i = 0 ; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int result = 0;
        for(int i = 0; i < M-7; i++) {
            for(int j = 0; j < N-7; j++) {
                for(int a = i; a < i + 8; a++) {
                    for(int b = j; b < j +8; b++) {
                        
                    }
                }
            }
        }

    }
}
