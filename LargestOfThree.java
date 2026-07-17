public class LargestOfThree {
    public static void main(String[] args) {
        int a = 12, b = 45, c = 30;
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        System.out.println("Largest = " + largest);
    }
}
