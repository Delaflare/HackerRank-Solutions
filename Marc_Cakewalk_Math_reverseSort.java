import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Marc_Cakewalk_Math_reverseSort {
    // Complete the marcsCakewalk function below.
    static long marcsCakewalk(int[] calorie) {
        long total = 0;
        
        Arrays.sort(calorie);
        int[] calorie1 = new int[calorie.length];
        int a_counter =0;
        //Arrays.sort(calorie, Collections.reverseOrder());
        //calorie = -Arrays.sort(-calorie);
        //Arrays.sort(calorie, comparator.reversed());
        // for ( int s = 0; s < calorie.length; s++ ){
            
        //     System.out.println(calorie[s]);
        // }
       // Arrays.sort(calorie, Collections.reverseOrder());
        
        
        for ( int ii = calorie.length-1; ii >= 0; ii-- ){
            calorie1[a_counter] = calorie[ii];
            a_counter++;
            System.out.println(calorie[ii]);
        }
        
        
        for (int i = 0; i<calorie1.length; i++){
            
            double p = (Math.pow(2, i)) ;
            double q = p*calorie1[i];
            //long r = Long.parseLong(q);
            long r = (new Double(q)).longValue();
            total = r + total;
            
            System.out.println(p+ " "+ q+ " " + total);
        }
        
        return total;
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] calorie = new int[n];

        String[] calorieItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieItems[i]);
            calorie[i] = calorieItem;
        }

        long result = marcsCakewalk(calorie);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
