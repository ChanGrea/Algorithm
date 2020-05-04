package BOJ;

import java.io.*;

public class BOJ1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int result = 0;
        for(int i = 1; i < 10000000; i++) {
            if(isShomeNumber(i)){
                count++;
                if(count == N){
                    result = i;
                    break;
                }
            }
        }

        bw.write(result + "\n");
        bw.flush();

        bw.close();
        br.close();
    }

    // !!! String 연산은 메모리와 시간을 많이 잡아 먹으므로 사용 자제(메모리 10배 차이, 시간 3배)
    private static boolean isShomeNumber(int number) {
        int count = 0;
        while (number > 0) {
            if (number % 10 == 6) {
                count ++;
            } else {
                count = 0;
            }
            if (count == 3) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
