public class sumsubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                System.out.print("Subarray: ");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("= " + sum);
            }
        }
    }
}
