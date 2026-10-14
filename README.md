# JobSheet (6) week 07. Basic Programming
### Name: Muhammad Talha
### NIM: 204107020089
### Class: TI - 1I 
---

### 1. Learning Objectives
1. Students are able to solve case studies using basic and nested selection structures
2. Students are able to save and submit their work using Git and GitHub through Visual Studio
Code
3. Students are able to collaborate with classmates using GitHub

---
#### 2.3. Experiment 2: Case Study 1 – Basic Selection
Kedai Kopi Senja (Senja Coffee Shop) sells Kopi Susu Gula Aren (Palm Sugar Milk Coffee) for
Rp18,000 per cup and gives a 10% discount on purchases of at least Rp100,000. The shop owner needs
a simple cashier program to calculate the total payment and the change. Write a Java program based
on the flowchart below.

``` java
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

```

##### Output :
  ---->    Wellcome to the Senja Coffe Shope <---

    Enter the Total numbers of Cups: 13
    Enter the total amount you gives on counter (Rp): 50000

---->The Discount you get is :  23400.0Rp

---->The total amount without discount is: 234000.0Rp

---->The Total Payable amount is: 210600.0Rp
        ---(You have to pay the more amount of : -160600.0Rp)---

----
 #### 2.4 Experiment 3: Case Study 2 – Nested Selection

 The Student Affairs Division of Politeknik Negeri Malang has issued a letter regarding the
verification of complete achievement documents for students in Activity Year 2026, Stage I. Based
on the requirements in that letter, the institution's award funds are given to students under the
following conditions:
a. For competitions organized by BELMAWA, BAKORMA, or independently (Mandiri), award
funds are given only to students who win 1st, 2nd, or 3rd place. Honorable Mention winners or
regular participants do not receive award funds.
b. For the Student Creativity Program (PKM), award funds are given to teams whose proposals
are approved for funding.
c. Activities outside the two conditions above (Other) do not receive award funds.
In addition, students who meet condition a or b are required to upload 4 complete documents
to SIAKAD: the Assignment Letter, Certificate, Activity Photo, and Activity Poster. If fewer than 4
documents are uploaded, the data is considered incomplete and no award funds are given.
Write a program to help the Student Affairs Admin check the status of a student's award funds.
The program should only ask for the data needed based on the type of activity, then display the award
fund status along with the reason. If the documents are incomplete, also display how many documents
are still missing. Solve this using nested selection (nested IF) with a maximum depth of 3 levels. Use

