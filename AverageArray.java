/**
 * AverageArray
 */
public class AverageArray {

    
    
    public static String averageArray(int[] array)
    {

        int sum = 0;
        int average;
        String difference = "{";

        for(int element : array)
        {
            sum = sum + element;
        }

        average = sum / array.length;

        for(int i = 0; i < array.length - 1; i++)
        {
            difference = difference + (average - array[i]) + ", ";
        }

        difference = difference + (average - array[array.length - 1]) + "}";

        return difference;
    }

    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 4, 5,};
    
        System.out.println(averageArray(myIntArray));
    }
    
}


