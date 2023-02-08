

import java.util.Arrays;

public class MinAndMax {
    public static int Min(int[] array){
        Arrays.sort(array);
        return array[0];
    }
    public static int Max(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }
}
