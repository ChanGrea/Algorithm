package BOJ;

import java.io.*;

public class BOJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 1; i <= N; i++) {
            if( i < 10 ) {
                count++;
            } else {
                boolean isHansu = true;

                char[] number = String.valueOf(i).toCharArray();
                int difference = Character.getNumericValue(number[0]) - Character.getNumericValue(number[1]);
                for(int k = 1; k < number.length - 1; k++) {
                    if(difference != Character.getNumericValue(number[k]) - Character.getNumericValue(number[k+1])) {
                        isHansu = false;
                        break;
                    }
                }

                if(isHansu)
                    count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();

        bw.close();
        br.close();
    }
}
