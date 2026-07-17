public class MaxArray {
    public static void main(String[] args) {
        int[] a = {10, 45, 23, 89, 67};
        int max = a[0];
        for(int x : a) if(x > max) max = x;
        System.out.println("Maximum = " + max);
    }
}
