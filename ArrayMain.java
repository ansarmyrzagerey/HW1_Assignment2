
import java.util.Scanner;
import java.util.Arrays;

public class ArrayMain {
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        boolean isLooping = true; 
        
        System.out.println("Hello and welcome to our array creation program!");
        System.out.print("How many elements would you like your array to have? ");
        int arraySize = in.nextInt();
        int[] array = ArrayCreation.createArray(arraySize);
        System.out.println(Arrays.toString(array)+ "\n");

        while (isLooping) {
            System.out.println("Please choose one of the following options using the integers 1 through 3, 4 to exit:");
            System.out.println("1 - Get the minimum and maximum values present within the array.");
            System.out.println("2 - Recieve a form of the array where every value has been decreased by the mean value.");
            System.out.println("3 - Get the sums of the odd-indexed and even-indexed integer values in the array.");
            System.out.println("4 - Exit");
            int userInput = in.nextInt();
            if (userInput == 1) 
            {
                
            }
            else if (userInput == 2) 
            {
            String differences = AverageArray.averageArray(array);
            System.out.println(differences);                
            }
            else if (userInput == 3) 
            {

            }
            else if (userInput == 4) 
            {
                isLooping = false;
            }
        }

    }
}
