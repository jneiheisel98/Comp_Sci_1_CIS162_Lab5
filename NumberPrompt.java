
import java.util.Scanner;

public class NumberPrompt {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int userInput;
      userInput = scnr.nextInt();
      do{
         System.out.println("Enter a number (<100):");
         
         } while ((userInput>=100));

      System.out.println("Your number < 100 is: " + userInput);
   }
}