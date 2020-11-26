

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SherlockArrayLeftEqualRight {
 // example 2 0 0 0 is actually 0002000;
 
    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {
        if (arr.size() == 1) return "YES";
        
        int size = arr.size();
        int totalSum= 0;
        for(int i = 0; i<size; i++){
            totalSum += arr.get(i);
        }
        
        int leftSum = 0;
        for (int i =0; i<size; i++){
            if (leftSum == (totalSum - arr.get(i))) return "YES";
        
        leftSum += arr.get(i);
        totalSum -=arr.get(i);
        }
        return "NO";

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = balancedSums(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
