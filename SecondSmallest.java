import java.util.Arrays;
public class SecondSmallest {
    public static void main(String[] args) {
        int[] a = {20,50,10,80,60};
        Arrays.sort(a);
        System.out.println("Second Smallest = " + a[1]);
    }
}
