
package reversestring;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
       String input;
     Scanner in = new Scanner(System.in);
     //Get input String
     System.out.println("Enter a string: ");
     input = in.nextLine();
        String reversed = reverseString(input);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    }
    

