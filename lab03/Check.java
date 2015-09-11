/////////////////////////////////
//Eric DelGizzo
//09/11/15
//Lab 03
//
// first compile the program
//      javac Check.java
// then run the program
//      java Check

// obtain the cost of the check
// obtain percentage for tip
// obtain number of ways to split the check

// import the scanner
import java.util.Scanner;

// define a class
public class Check{

//  add a main method
    public static void main(String[] args){
        
//      declare the instance of the Scanner object
        Scanner myScanner = new Scanner ( System.in );
//      promt for the cost of original check
        System.out.print("Enter the orignal cost of the check in the form xx.xx: ");
//      accept user input 
        double checkCost = myScanner.nextDouble();
       
//      promt for the tip percentage
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
//      accept use input
        double tipPercent = myScanner.nextDouble();
//      make sure convert the percentage to a decimal
        tipPercent /= 100;

//      promt for number of people who went to dinner
        System.out.print("Enter the number of people who went out to dinner: ");
//      accept user input   
        int numPeople = myScanner.nextInt();
        
//      output the amount that each member of the group needs to spend in order for the check
        double totalCost;
        double costPerPerson;
        int dollars, //whole dollar amount of cost
        dimes, pennies; //for storing digits
                //to the right of the decimal point
                //for the cost$
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        //get the whole amount dropping the decimal fraction
        dollars = (int)costPerPerson;
        //get dimes amoun, e.g,
        //(int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the remainder
        //after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies+" ");
        
        

    
        
    }
}