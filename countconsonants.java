public class Main {
    public static void main(String[] args) {
        String str = "example";
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
