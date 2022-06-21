package hackerrank;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
https://www.hackerrank.com/challenges/three-month-preparation-kit-time-conversion/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one
 */
class TimeConversionResult {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        SimpleDateFormat simpleDateFormatInput = new SimpleDateFormat("hh:mm:ssaaa");
        SimpleDateFormat simpleDateFormatOutput = new SimpleDateFormat("HH:mm:ss");
        try {
            return simpleDateFormatOutput.format(simpleDateFormatInput.parse(s));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}

public class TimeConversion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = TimeConversionResult.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
