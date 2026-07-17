public class FindMinInArray {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 33, 76};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum element = " + min);
    }
}
