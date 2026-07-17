import java.util.Scanner;

class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 500;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter credit amount " + i + ": ");
            int credit = sc.nextInt();
            balance = balance + credit;
        }

        System.out.println("Total amount after 5 credits: " + balance);
    }
}
