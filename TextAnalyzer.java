import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String s = sc.nextLine();
        
        int spaces = 0;
        int specialChars = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == '.') {
                spaces++;                    
            } else if (Character.isLetter(ch) || Character.isDigit(ch)) {
                
                continue;
            } else {
                
                specialChars++;
            }
        }
        
        System.out.println(spaces);
        System.out.println(specialChars);
        
        sc.close();
    }
}