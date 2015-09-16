///////////////////////////////////
//Eric DelGizzo
//09/15/15
//Block HW03
//
//  first compile the program
//      javac Block.java
//  then run the program
//      java Block 

//  import a scanner
import java.util.Scanner;

//define a class
public class Block{
    
//  add a main method
    public static void main(String[] args){

//  declare the instance of the Scanner object
    Scanner myScanner = new Scanner ( System.in );

//  prompt for the input of the block length
    System.out.print("Enter the length of the block (x.x): ");
//  accept user input   
    double blockLength = myScanner.nextDouble();
    
//  prompt for the input of the block width
    System.out.print("Enter the width of the block (x.x): ");
//  accept user input
    double blockWidth = myScanner.nextDouble();
    
//  prompt for the input of the block height
    System.out.print("Enter the height of the block (x.x): ");
//  accept user input
    double blockHeight = myScanner.nextDouble();
    
//  formulate the volume of the block
    double blockVolume = blockHeight * blockWidth * blockLength;
//  formulate the surface area of the block
    double blockSurfaceArea= 2*(blockLength*blockHeight) + 2*(blockHeight*blockWidth) + 2*(blockWidth*blockLength);

//  print the volume of the block
    System.out.println("The volume of the block of dimensions "+blockWidth+" x "+blockLength+" x "+blockHeight+" is "+blockVolume+". ");

// print the surface area of the block
    System.out.println("The surface area of the block is "+blockSurfaceArea+". ");
    
    }
}