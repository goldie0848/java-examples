public class Main {
    public static void main(String[] args) {
        char[] arr = {'m', 'a', 'd', 'a', 'm'};
        boolean isPalindrome = true;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);
    }
}
