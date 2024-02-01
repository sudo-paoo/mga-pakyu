/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class SodaVendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR BUDGET >> ");
        int budget = sc.nextInt();
        if (budget<=0) {
            System.out.println("NO BUDGET AVAILABLE - THANK YOU");
        } else {
            System.out.println("-----------------------------");
            System.out.println("| SODA COMPANY INCORPORATED |");
            System.out.println("-----------------------------");
            System.out.println("----- SELECT YOUR DRINKS -----");
            System.out.println("1 - SPRITE - P20\n2 - COKE - P25\n3 - PEPSI - P30\n4 - ROYAL - P35");
            System.out.print("ENTER HERE: ");
            int sodaChoice = sc.nextInt();
            int quantity, total, balance, sprite = 20, coke = 25, pepsi = 30, royal = 35; // soda prices
            switch (sodaChoice) {
                case 1:
                    System.out.println("--------------------");
                    System.out.println("YOU CHOSE SPRITE");
                    System.out.print("HOW MANY? ");
                    quantity = sc.nextInt();
                    System.out.println("-------RECEIPT-------");
                    System.out.println("PRICE OF DRINK: " + sprite);
                    System.out.println("QUANTITY: " + quantity);
                    System.out.println("--------------------");
                    total = sprite * quantity;
                    if (budget>total) { 
                        balance = budget - total;
                        System.out.println("TOTAL: " + total);
                        System.out.println("BALANCE: " + balance);
                        System.out.println("------THANK YOU------");
                    } else if (budget == total){ 
                        balance = budget - total;
                        System.out.println("TOTAL: " + total);
                        System.out.println("BALANCE: " + balance);
                        System.out.println("-----EXACT BUDGET-----");
                        System.out.println("------THANK YOU------");
                    }else { 
                        System.out.println("TOTAL: " + total);
                        System.out.println("INSUFFICIENT FUNDS\nPLEASE TRY AGAIN!!!");
                    }
                    break;
                case 2:
                    System.out.println("--------------------");
                    System.out.println("YOU CHOSE COKE");
                    System.out.print("HOW MANY? ");
                    quantity = sc.nextInt();
                    System.out.println("-------RECEIPT-------");
                    System.out.println("PRICE OF DRINK: " + coke);
                    System.out.println("QUANTITY: " + quantity);
                    System.out.println("--------------------");
                    total = coke * quantity;
                    if (budget>total) {
                        balance = budget - total;
                        System.out.println("TOTAL: " + total);
                        System.out.println("BALANCE: " + balance);
                        System.out.println("------THANK YOU------");
                    } else if (budget == total){
                        balance = budget - total;
                        System.out.println("TOTAL: " + total);
                        System.out.println("BALANCE: " + balance);
                        System.out.println("-----EXACT BUDGET-----");
                        System.out.println("------THANK YOU------");
                    } else{
                        System.out.println("TOTAL: " + total);
                        System.out.println("INSUFFICIENT FUNDS\nPLEASE TRY AGAIN!!!");
                    }
                    break;
                case 3:
                    System.out.println("--------------------");
                    System.out.println("YOU CHOSE PEPSI");
                    System.out.print("HOW MANY? ");
                    quantity = sc.nextInt();
                    System.out.println("-------RECEIPT-------");
                    System.out.println("PRICE OF DRINK: " + pepsi);
                    System.out.println("QUANTITY: " + quantity);
                    System.out.println("--------------------");
                    total = pepsi * quantity;
                    if (budget>total) {
                        balance = budget - total;
                        System.out.println("TOTAL: " + total);
                        System.out.println("BALANCE: " + balance);
                        System.out.println("------THANK YOU------");
                    } else if (budget == total){
                        balance = budget - total;
                        System.out.println("TOTAL: " + total);
                        System.out.println("BALANCE: " + balance);
                        System.out.println("-----EXACT BUDGET-----");
                        System.out.println("------THANK YOU------");
                    } else {
                        System.out.println("TOTAL: " + total);
                        System.out.println("INSUFFICIENT FUNDS\nPLEASE TRY AGAIN!!!");
                    }
                    break;
                case 4:
                    System.out.println("--------------------");
                    System.out.println("YOU CHOSE ROYAL");
                    System.out.print("HOW MANY? ");
                    quantity = sc.nextInt();
                    System.out.println("-------RECEIPT-------");
                    System.out.println("PRICE OF DRINK: " + royal);
                    System.out.println("QUANTITY: " + quantity);
                    System.out.println("--------------------");
                    total = royal * quantity;
                    if (budget>total) {
                        balance = budget - total;
                        System.out.println("TOTAL: " + total);
                        System.out.println("BALANCE: " + balance);
                        System.out.println("------THANK YOU------");
                    } else if (budget == total){
                        balance = budget - total;
                        System.out.println("TOTAL: " + total);
                        System.out.println("BALANCE: " + balance);
                        System.out.println("-----EXACT BUDGET-----");
                        System.out.println("------THANK YOU------");
                    }  else {
                        System.out.println("TOTAL: " + total);
                        System.out.println("INSUFFICIENT FUNDS\nPLEASE TRY AGAIN!!!");
                    }
                    break;
                default:
                    System.out.println("INVALID CHOICE PLEASE TRY AGAIN!!!");
            }
        }
    }
}
