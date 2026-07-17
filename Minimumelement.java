public class MinArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int min = a[0];
        for(int x : a) if(x < min) min = x;
        System.out.println("Minimum = " + min);
    }
}
