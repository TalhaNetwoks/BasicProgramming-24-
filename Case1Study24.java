import java.util.Scanner;
public class Case1Study24 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        // declear the valus
        int pricePerCup = 18000;
        int cupCount, amountPaid;
        int totalPrice, discount, totalPayabale;
        int change, shortfall;

        // take the order of cups coustomer want it.
        System.out.print(" ENter the Total numbers of Cups: ");
        cupCount = input.nextInt();
        System.out.print("ENter the total amount you gives on counter (Rp): ");
        amountPaid = input.nextInt();

        // total price 
         totalPrice = cupCount * pricePerCup;
         discount = 0;

         


        
    }
}
