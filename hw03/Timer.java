//////////////////////////////////////////
//Eric DelGizzo
//09/14/2015
//Timer Hw 03
//
//  first compile program
//      javac Timer.java
//  then run the program
//      java Timer

// import a scanner
import java.util.Scanner;

// define a class
public class Timer{
    
//  add a main method
    public static void main(String[] args){

//      declare the instance of the Scanner object
        Scanner myScanner = new Scanner ( System.in );
        
//      promt for the input of the current time
        System.out.print("Enter the current time (HHMM): ");
//      accept user input
        double currentTime = myScanner.nextDouble();

//      promt for the input of the time dinner is
        System.out.print("Enter the time you will be eating dinner (HHMM): ");
//      accept user input   
        double dinnerTime = myScanner.nextDouble();
        
//      insert the output        
        double totalTime = dinnerTime - currentTime;
        
//      set up hours and minutes
        int Hours = (int)totalTime/100;
        int Minutes = (int)totalTime%100;
//      promt for time you have till dinner
        System.out.print("There is "+Hours+" Hours and "+Minutes+" Minutes until dinner.");
        
        
        
        }
}