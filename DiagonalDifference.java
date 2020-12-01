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

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}




class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
/*
    public static int diagonalDifference(List<List<Integer>> arr) {
    	int left_right = 0;
    	int right_left = 0;
    	
    	int rows = arr.length();
    	int columns = arr[0].length;
    	
    	int i = 0;
    	int j = 0;
    	int k = 0;
    	int l = arr.length - 1;
    	
    	while (i < rows && j < columns && k < rows && l >= 0) {
    		left_right += arr[i][j];
    		right_left += arr[k][l];
    		i+=1;
    		j+=1;
    		k+=1;
    		l -=1;
    	}
    	return Math.abs(left_right - right_left);
    	

    }*/
    public static int diagonalDifference(List<List<Integer>> arr) {
    	int left_right = 0;
    	int right_left = 0;
    	
    	int rows = arr.size();
    	int columns = arr.get(0).size();
    	
    	int i = 0;
    	int j = 0;
    	int k = 0;
    	int l = arr.size() - 1;
    	
    	while (i < rows && j < columns && k < rows && l >= 0) {
    		left_right += arr.get(i).get(j);
    		right_left += arr.get(k).get(l);
    		i+=1;
    		j+=1;
    		k+=1;
    		l -=1;
    	}
    	return Math.abs(left_right - right_left);
    	

    }

}
