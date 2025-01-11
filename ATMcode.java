/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.*;
public class ATMmanagmentsystem{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to ATM");
        System.out.println("Enter PIN :");
        int pin= sc.nextInt();
        int balance=10000;
        int deposit=0;
        int withdrawl=0;
        if(pin==9981){
            System.out.println("Select any one option");
            System.out.println("Check your Balance --> Press 1");
            System.out.println("Deposit Money --> Press 2");
            System.out.println("Withdrawl Money --> Press 3");
            System.out.println("Press Valid oprion");
            int opt=sc.nextInt();
            if(opt==1){
                System.out.println("Balance is remaning is:"+balance);
            }
            else if(opt==2){
                System.out.println("Enter Amoumt:");
                int dep=sc.nextInt();
                balance=balance+dep;
                System.out.println("Balance is:");
            }
            else{
                System.out.println("Enter Amount:");
                int with=sc.nextInt();
                balance=balance-with;
                System.out.println("Remaning Balance is:"+(balance));
            }
        }
        else{
            System.out.println("Incorrect PIN!!!");
        }
    }
}
