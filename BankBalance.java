import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance, deposit;

        System.out.print("Enter current bank balance: ");
        balance = sc.nextDouble();

        System.out.print("Enter deposit amount: ");
        deposit = sc.nextDouble();

        for (int i = 1; i <= 5; i++) {
            balance = balance + deposit;
        }

        System.out.println("Final Bank Balance = " + balance);

        sc.close();
    }
}
