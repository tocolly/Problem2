import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nina Videtska on 15.10.2015.
 */

public class Dividers {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello. Input your number here: ");

        int n = 0;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try{
            n = Integer.parseInt(buf.readLine());
        } catch (NumberFormatException notanum) {
            System.err.println("This is not a number!");
        }

        System.out.print("All the dividers of " + n + " are: ");
        for (int i = n; i > 0; i--) {
            int j = n % i;
            if (j == 0){
                System.out.print(i + " ");
            }
        }
    }
}
