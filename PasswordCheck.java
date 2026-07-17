import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // NOTE: variables 'i' and 'pass' were declared above this snippet
        // in the original screenshot but were not visible/captured.
        int i = 0;
        String pass = "yourpassword"; // placeholder - set actual password

        System.out.println("Enter the Password:");
        String password = sc.nextLine();
        if (password.equals(pass))
        {
            System.out.println("Login sucessfull");
            return;
        }
        else if (i == 3)
        {
            System.out.println("Account locked");
        }
        else {
            System.out.println("Incorrect password");
        }
    }
}
