public class CountNegative {
    public static void main(String[] args) {
        int[] a = {10,-23,45,-68,72,-91,34};
        int c=0;
        for(int x:a) if(x<0) c++;
        System.out.println("Negative = "+c);
    }
}
