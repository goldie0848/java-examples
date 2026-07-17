public class CountEven {
    public static void main(String[] args) {
        int[] a = {10,23,45,68,72,91,34};
        int c=0;
        for(int x:a) if(x%2==0) c++;
        System.out.println("Even = "+c);
    }
}
