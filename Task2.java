import java.util.Scanner;

class ATM{
    
    double Balance = 25000;
    int PIN = 234;
    
    Scanner sc = new Scanner(System.in);

    public void Menu(){
       
        int n;
        do{
            System.out.println("Select the required option-\n1. Transactions History\n2. Withdraw money\n3. Deposit Money\n4. Transfer Money\n5. Quit");
            int option = sc.nextInt();
            if(option==1){
                transactionHistory();
            }
            else if(option==2){
                withdraw();
            }
            else if(option ==3){
                deposit();
            }
            else if(option==4){
                transfer();
            }
            else{
                System.out.println("Thank you for your valuable time...");
            }
            System.out.println("Do you want to perform more options?\n press 1 if yes;press 0 if no");
            n = sc.nextInt();
        }
        while(n==1);
        if(n==0){
            System.out.println("Thank you for your valuable time...");
        }
    }
   
    public void transactionHistory(){
        System.out.println("Amazon India -R480\nTraxxMat -Rs75\nPriya Gupta +Rs2000\nShadowFaxTech -Rs880");
    }
    
    public void withdraw(){
        System.out.println("Your current balance is - Rs"+Balance);
        System.out.println("Enter the amount you want to withdraw - ");
        int withdraw = sc.nextInt();
        if(withdraw <= Balance){
            Balance = Balance - withdraw;
            System.out.println("Transaction successful");
            System.out.println("Current balance updated to "+Balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    
    public void deposit(){
        System.out.println("Your current balance is - Rs"+ Balance);
        System.out.println("Enter the amount you want to deposit - ");
        int deposit = sc.nextInt();
        Balance = Balance + deposit;
        System.out.println("Transaction successful");
        System.out.println("Current balance updated to "+Balance);
    }
    
    public void transfer(){
        System.out.println("Your current balance is - Rs"+Balance);
        System.out.println("Enter the amount you want to transfer-");
        int transfer = sc.nextInt();
        if(transfer <= Balance){
            Balance = Balance - transfer;
            System.out.println("Transaction successful.");
            System.out.println("Current balance updated to Rs"+Balance); 
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}

public class Task2{
    public static void main(String[] args) {
       
        int pin;
        
        ATM Mitaly = new ATM();       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter user pin:");
        pin= scan.nextInt();
        if(pin == Mitaly.PIN){         
            Mitaly.Menu();
        }
        else{
            System.out.println("Incorrect pin. Try again.");
        }
    }
}
