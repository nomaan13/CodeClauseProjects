package ATM_Project;

import java.util.Scanner;


    public class atminterface {
        public static void main(String[] args) {
            int choice;
            int PIN = 0, UserID = 0;

            int balance = 1500,withdraw,deposit;

            Scanner S = new Scanner(System.in);

            System.out.println("!!!WELCOME TO ATM MACHINE!!!");
            System.out.print("Enter Your UserID please : ");
            UserID = S.nextInt();
            if(UserID == 1999) {
                System.out.print("Enter YOUR UNIQUE PIN : ");
                PIN = S.nextInt();
            }if(PIN == 2999) {
                System.out.println("Choose option from the below menu");
            }
            else if(UserID!=1999){
                System.out.println("Entered UserId is Incorrect"+"Please enter a valid UserID");
            }
            else {
                System.out.println("Entered PIN is Incorrect"+"Please enter the correct PIN");
            }
            while(UserID==1999 && PIN==2999) {

                System.out.println("Press 1 for Withdraw");
                System.out.println("Press 2 for Deposit");
                System.out.println("Press 3 for Check Balance");
                System.out.println("Press 4 for Transfer");
                System.out.println("Press 5 for Exit");

                choice = S.nextInt();
                switch(choice) {
                    case 1: System.out.println("Enter money to be withdrawn:");
                        withdraw = S.nextInt();
                        if(balance >= withdraw) {
                            System.out.println("Please collect your money.");
                            balance = balance - withdraw;
                            System.out.println("Balance = "+balance);
                        }else {
                            System.out.println("Insufficient Balance.");
                        }

                        break;

                    case 2: System.out.println("Enter money to be deposited:");
                        deposit = S.nextInt();
                        balance = balance+deposit;
                        System.out.println("Balance = "+balance);
                        break;

                    case 3: System.out.println("Balance = "+balance);
                        break;

                    case 4:System.out.println("Transer to the account\n Enter account number:");
                        int accountNum = S.nextInt();
                        System.out.println("Enter receipient name:");
                        String receipientName = S.next();
                        System.out.println("Enter amount to be transferred:");
                        int amount = S.nextInt();
                        if(balance > amount) {
                            System.out.println(amount+ " Rs transferred to "+receipientName+" Successfully.");
                        }
                        else {
                            System.out.println("Insufficient Balance.");
                        }
                        break;

                    case 5:System.exit(0);
                        break;

                    default: System.out.println("Invalid Option");
                }
                System.out.println("\nTHANK YOU");
            }
        }
    }

