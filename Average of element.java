public class Avg {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int s = 0;
        for(int x : a) s += x;
        System.out.print("Average = " + (double)s/a.length);
    }
}
