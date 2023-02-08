

public class SumsFinder {
        
        public static int EvenSum(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i = i + 2) {

            sum += array[i];
        }
        return sum;
    }

    public static int OddSum(int[] array) {

        int sum = 0;

        for (int i = 1; i < array.length; i = i + 2) {

            sum += array[i];
        }
        return sum;
    }

//if there are problems with calculation, change i < array.length to i <= array.length
}