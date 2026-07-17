public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 33, 76};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum element = " + max);
    }
}
