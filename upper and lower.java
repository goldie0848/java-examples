public class Main {
    public static void main(String[] args) {
        String str = "ExAmPle";
        int upper = 0;
        int lower = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper++;
            } else if (Character.isLowerCase(c)) {
                lower++;
            }
        }
        System.out.println(upper + " " + lower);
    }
}
