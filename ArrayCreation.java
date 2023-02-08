package HW1_Assignment2;
import java.util.Scanner;

public class ArrayCreation{
    public static int[] createArray(int x) {
        int[] rndarr = new int[x];
        
        for (int i = 0; i < x; i++) {
            int n = (int) (Math.random() * 101);
            rndarr[i] = n;
        }

        return rndarr;
    }



    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        boolean isLooping = true; 
        System.out.println("Hello and welcome to our array creation program!");
        System.out.println("How many elements would you like your array to have? ");
        int arraySize = in.nextInt();
        int[] array = createArray(arraySize);

        while (isLooping) {
            System.out.println("Please choose one of the following options using the integers 1 through 3, 4 to exit:");
            System.out.println("1 - Get the minimum and maximum values present within the array.");
            System.out.println("2 - Recieve a form of the array where every value has been decreased by the mean value.");
            System.out.println("3 - Get the sums of the odd-indexed and even-indexed integer values in the array.");
            System.out.println("4 - Exit");
            int userInput = 
            if ()
        }

    }
}
