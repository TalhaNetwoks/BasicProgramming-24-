import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public class Case1Study24 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        // declear the valus
        int pricePerCup = 18000;
        int cupCount, amountPaid;
        double totalPrice, discount, totalPayabale;
        double change, shortfall;

        System.out.println("----> \t Wellcome to the Senja Coffe Shope <---");

        // take the order of cups coustomer want it.
        System.out.print(" \t Enter the Total numbers of Cups: ");
        cupCount = input.nextInt();
        System.out.print("\t Enter the total amount you gives on counter (Rp): ");
        amountPaid = input.nextInt();

        // total price 
         totalPrice = cupCount * pricePerCup;
         discount = 0;

         // use teronry oporator 

         discount = (totalPrice >= 100000) ? totalPrice * 0.1 : 0;
         System.out.println("\n---->The Discount you get is :  " + discount + "Rp");
         // total amount is 
         System.out.println("\n---->The total amount without discount is: "+ totalPrice + "Rp");
         // now the total payable amount
         totalPayabale  = totalPrice - discount;
         System.out.println("\n---->The Total Payable amount is: " + totalPayabale + "Rp");

         // now condition for the change and shortfall

         if(amountPaid >= totalPayabale){
            change = amountPaid - totalPayabale;
            System.out.println("\t---(Please Take your change back of : + " + change + "Rp )---");
         } else { 
            shortfall = totalPayabale - amountPaid;
            System.out.println("\t---(You have to pay the more amount of : -"+ shortfall + "Rp)---");
         }

         input.close();
    }
}
