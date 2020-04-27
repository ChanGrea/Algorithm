package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]);
        char[][] board = new char[N][M];

        for (int i = 0 ; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int result = 9999999;
        for(int i = 0; i < N-7; i++) {
            for(int j = 0; j < M-7; j++) {

                int cnt = 0;
                for(int a = 0; a < 8; a++) {
                    for(int b = 0; b < 8; b++) {
                        if (a % 2 == 1) { // i가 홀수일 때
                            // j가 홀수이면서 'B'일 때
                            if (b % 2 == 1 && board[a + i][b + j] == 'B')
                                cnt++;
                                // j가 짝수이면서 'W'일 때
                            else if (b % 2 == 0 && board[a + i][b + j] == 'W')
                                cnt++;
                        } else { // i가 짝수일 때
                            // j가 짝수이면서 'B'일 때
                            if (b % 2 == 0 && board[a + i][b + j] == 'B')
                                cnt++;
                                // j가 홀수이면서 'W'일 때
                            else if (b % 2 == 1 && board[a + i][b + j] == 'W')
                                cnt++;
                        }
                    }
                }

                cnt = Math.min(cnt, 64 - cnt);
                result = Math.min(cnt, result);

            }
        }

        System.out.println(result);

    }
}
