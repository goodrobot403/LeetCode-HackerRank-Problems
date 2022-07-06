package hackerrank;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class LonelyIntegerResult {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        /*Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i : a) {
            integerMap.put(i, integerMap.containsKey(i) ? integerMap.get(i) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }
        return 0;*/
        int r = 0;
        for (int v : a) {
            r ^= v;
        }
        System.out.println(r);
        return r;
    }

}

public class LonelyInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = LonelyIntegerResult.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
