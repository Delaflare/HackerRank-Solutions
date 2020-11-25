
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStringUsingHashMap {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        /*int min_size = 0;
        if(s1.length() > s2.length()){
            min_size = s2.length();
        }else{
            min_size = s1.length();
        }
        
        for (int i =0; i<min_size; i++){
                for (int j =0; j<min_size; j++){
                    if(s1.charAt(i) == s2.charAt(j))
                    {
                        return "YES";
                    } 
                
            }
            
        }return "NO"; */
        
        HashSet<Character> string1_chars = new HashSet();
        HashSet<Character> string2_chars = new HashSet();
        
        for (int i =0; i<s1.length(); i++){
            string1_chars.add(s1.charAt(i));
        }
        
        for (int i =0; i<s2.length(); i++){
            string2_chars.add(s2.charAt(i));
        }
        
        string1_chars.retainAll(string2_chars); // see if any values intersect ( two circles the centre)
        
        if(!string1_chars.isEmpty()){
            return "YES";
        }else{
            return "NO";
        }
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
