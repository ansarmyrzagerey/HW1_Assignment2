

public class SumsFinder {
        
        public int EvenSum(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i = i + 2) {

            sum += array[i];
        }
        return sum;
    }

    public int OddSum(int[] array) {

        int sum = 0;

        for (int i = 1; i < array.length; i = i + 2) {

            sum += array[i];
        }
        return sum;
    }

}