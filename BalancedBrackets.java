import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
    	
            Stack<Character> stack = new Stack();
            String No = "NO";
            String Yes = "YES";
            
            for (int i = 0; i<s.length(); i++){
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                    stack.push(s.charAt(i));
                }else{
                    if (stack.isEmpty()){
                        return No;
                    }else{
                        char pop_val= stack.pop();
                        if (s.charAt(i) == ')' && pop_val != '(' ){
                            return No;
                        }else if (s.charAt(i) == '}' && pop_val != '{' ){
                            return No;
                        }else if (s.charAt(i) == ']' && pop_val != '[' ){
                            return No;
                        } 
                    }
                }
            }
            if (stack.isEmpty()){
                return Yes;
            }else{
                return No;
            }



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}