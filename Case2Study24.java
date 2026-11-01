import java.util.Scanner;

public class Case2Study24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        // verification of complete achievement documents for students in Activity Year 2026, Stage I
        System.out.println("----> \t Welcome to the Student Document Verification System <---");System.out.print("Enter the Name of the Student: ");
        String studentName = input.nextLine();
        
        // take the activity type
        System.out.print("Enter the Activity Type (e.g., BELMAWA/ BAKORMA/MANDARI/PKM/LAINNYA): ");
        String activityType = input.nextLine();

        String activityTypeUpper = activityType.toLowerCase();
        String status = "";
        String reason = "";
        int documents = 0;
        boolean checkDocuments = false;

        // for this case we will use the Nasted if else statement.
             if (activityType.equalsIgnoreCase("BELMAWA") || activityType.equalsIgnoreCase("BAKORMA") 
            || activityType.equalsIgnoreCase("MANDIRI")){
                 System.out.print("Enter the compitaion rink (1,2,3) and 0 for not a winner: ");
                int rank = input.nextInt();
                       if (rank == 1 || rank == 2 || rank   == 3) {
                     checkDocuments = true;
                      } else { 
                      status = "Not eligible";
                       reason = "The student did not achieve a winning rank in the competition.";}
             }else if (activityType.equalsIgnoreCase("PKM")) {
                System.out.print("Enter PKM funding status (1 for funded, 0 for not funded): ");
                int fundingStatus = input.nextInt();
                              if (fundingStatus == 1) {
                                 checkDocuments = true;
                             } else {
                              status = "Not eligible";
                              reason = "The PKM project was not funded.";
                            }
             }else  if (activityType.equalsIgnoreCase("LAINNYA")) {
                status = "Not eligible";
                reason = "The activity type is not recognized for eligibility.";
             } 
                     if (checkDocuments) {
                     System.out.print("Enter the number of documents submitted: ");
                       documents = input.nextInt();
                        if (documents <= 4) {
                              status = "Eligible";
                             reason = "The student has submitted sufficient documents.";
                        } else {
                            status = "Not eligible";
                            reason = "The student has not submitted enough documents.";
                }
             } else if (status.equals("Eligible")) {
                reason = " ELigible for the award funds (winner of competion with complete documents).";
             } else {
                status = "Not eligible";
                int missing = 4 - documents;
                reason = "The student is missing " + missing + " documents for eligibility.";
             }
             System.out.println("\n----> Verification Result <---");

             System.out.println("Stduent name  : " + studentName);
             System.out.println("Activity Type : " + activityType); 
             System.out.println("Eligibility Status: " + status);
             System.out.println("Reason: " + reason);


             input.close();




            }

}
