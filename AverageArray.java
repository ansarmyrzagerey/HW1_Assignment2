/**
 * AverageArray
 */
public class AverageArray {

    
    
    public static String averageArray(int[] array)
    {

        int sum = 0;
        int average;
        String difference = "{ ";

        for(int element : array)
        {
            sum = sum + element;
        }

        average = sum / array.length;

        for(int element : array)
        {
            difference = difference + (average - element) + " ,";
        }

        difference = difference + " }";

        return difference;
    }

    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 6};
    
        System.out.println(averageArray(myIntArray));
    }
    
}


