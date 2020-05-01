package BOJ;

import java.io.*;

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        String reversedInput = sb.toString();

        String[] numbers = reversedInput.split(" ");
        if(Integer.parseInt(numbers[0]) > Integer.parseInt(numbers[1])) {
            bw.write(numbers[0] + "\n");
        } else {
            bw.write(numbers[1] + "\n");
        }
        bw.flush();

        bw.close();
        br.close();

    }
}
