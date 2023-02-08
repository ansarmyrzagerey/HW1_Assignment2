package HW1_Assignment2;

public class ArrayCreation{
    public static int[] createArray(int x) {
        int[] rndarr = new int[x];
        
        for (int i = 0; i < x; i++) {
            int n = (int) (Math.random() * 101);
            rndarr[i] = n;
        }

        return rndarr;
    }
}
