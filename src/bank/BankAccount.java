package bank;

import java.util.ArrayList;
import java.util.Scanner;
    public class BankAccount{
        static ArrayList<Account2>accounts = new ArrayList<>();
        static Scanner input = new Scanner (System.in);
        private static int number =0;


        public static Account2 createAccount(){
            System.out.print("Enter your first name: ");
            String firstName = input.next();

            System.out.print("Enter your last name: ");
            String lastName = input.next();

            String name = fullName(firstName,lastName);

            System.out.print("Enter your 4 digit pin: ");
            String pin = input.next();

            String number = accountNumberGenerator();

            Account2 account = new Account2(name,pin,number);
            accounts.add(account);

            System.out.printf("""

 Congratulations!!! %s : %n
Account created successfully.....  %n 
check your details below %n %n """, name);
            return account;
        }

        public static ArrayList<Account2> viewAllAccount(){
            return accounts;
        }

        public static String deposit(){
            System.out.print("Enter your Account Number: ");
            String number = input.next();

            Account2 foundAccount = validAccount(number);
            System.out.print(" \n Account  " +foundAccount.getNumber() + " found ");

            System.out.print("Enter Amount: ");
            int amount = input.nextInt();
            foundAccount.deposit(amount);

            return "deposit successful........ \n ";
        }

        private static Account2 validAccount(String accountNumber){
            Account2 status = null;
            for(Account2 account: viewAllAccount()){
                if(account.getNumber().equals(accountNumber)){
                    status = account;
                }else status = null;

            }
            return status;
        }

        private static String fullName(String firstName, String lastName){
            return firstName + "  "+ lastName;
        }

        private static String accountNumberGenerator(){
            String generator = "222333444";
            number++;
            return generator+number;
        }


        public static void display(){
            System.out.println(""" 
	1. create account
	2. deposit
	3. view all Accounts
	4. exit
""");
            String options = input.next();

            switch(options){
                case "1": System.out.println(createAccount());
                    display();
                case "2": System.out.print(deposit());
                    display();
                case "3" : System.out.println(viewAllAccount());
                    display();
                case "4": System.out.print("Bye! Bye!!");
                    System.exit(1);
                default: System.out.println(" Don't be stupid sfollow the option: "); display();

            }

        }


        public static void main(String[] args){
            System.out.println(" WELCOME TO MY BANKING APP");
            display();
        }

    }

