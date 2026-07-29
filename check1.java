import java.util.Scanner;
import java.util.InputMismatchException;

public class check1 {
    public static void main(String[] args) {
        
        try {
            int[] numbers = {10, 20, 30};
            
            System.out.println(numbers[5]);
            
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid string index");
        }
        catch (NullPointerException e) {
            System.out.println("Null value cannot be used");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
        
        System.out.println("Program completed");
    }
}