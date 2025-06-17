package bank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter account number: ");
                        bank.createAccount(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Account number: ");
                        String accNum1 = sc.nextLine();
                        System.out.print("Amount: ");
                        double deposit = sc.nextDouble();
                        bank.getAccount(accNum1).deposit(deposit);
                        break;
                    case 3:
                        System.out.print("Account number: ");
                        String accNum2 = sc.nextLine();
                        System.out.print("Amount: ");
                        double withdraw = sc.nextDouble();
                        bank.getAccount(accNum2).withdraw(withdraw);
                        break;
                    case 4:
                        System.out.print("Account number: ");
                        String accNum3 = sc.nextLine();
                        System.out.println("Balance: " + bank.getAccount(accNum3).getBalance());
                        break;
                    case 5:
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
