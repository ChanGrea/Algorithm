package BOJ;

import java.io.*;
import java.util.*;

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

        bw.write(sortByValue(soldBooks).get(0));
    }

    public static ArrayList<String> sortByValue(final Map map) {
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(map.keySet());

        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                Integer v1 = (Integer) map.get(o1);
                Integer v2 = (Integer) map.get(o2);
                if(v1.equals(v2))
                    o1.compareTo(o2);
                return v2.compareTo(v1);
            }
        });

        return list;
    }
}
