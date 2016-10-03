package round2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yuriyf on 10/3/2016.
 */
public class ErrorHandling {

    public static void main(String[] args) throws IOException {

        formatStrArrToIntArr(createArray());

    }

    public static void formatStrArrToIntArr(String[] numbers)
    {
        try {
        for (int i = 0; i < numbers.length; i++) {
            Integer.parseInt(numbers[i]);
        }
    }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormatException caught");
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("IOException handled");
    }

    public static String[] createArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = 3;
        String[] strings = new String[size];
        for (int i = 0; i<strings.length; i++)
        {
            System.out.println("Please input string " + i);
            strings[i] = reader.readLine();
        }
        return strings;
    }

}
