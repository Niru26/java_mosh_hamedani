import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] startArray = {1, 9};
        int[] endArray = new int[5];
        System.arraycopy(startArray, 0, endArray, 2, startArray.length);
        for(int i : startArray) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        for (int i : endArray) {
            System.out.printf("%d ", i);
        }
    }
}