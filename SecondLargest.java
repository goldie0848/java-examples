import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {20, 50, 10, 80, 60};

        Arrays.sort(arr);

        System.out.println("Second Largest = " + arr[arr.length - 2]);
    }
}
