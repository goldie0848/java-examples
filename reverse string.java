public class Main {
    public static void main(String[] args) {
        char[] arr = {'j', 'a', 'v', 'a'};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(arr));
    }
}
