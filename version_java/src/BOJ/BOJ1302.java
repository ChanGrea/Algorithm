package BOJ;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BOJ1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> soldBooks = new HashMap<>();
        while(N-- > 0) {
            String input = br.readLine();
            soldBooks.put(input, soldBooks.get(input) != null ? soldBooks.get(input) + 1 : 1);
        }

    }
}
