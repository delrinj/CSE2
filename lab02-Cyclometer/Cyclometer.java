/////////////////////////////////////////////////
//Eric DelGizzo
// 09/04/15
//Cyclometer Java Program
//
// first compile program
//     javac Cyclometer.java
// run the program
//     java Cyclometer//

// define the class
public class Cyclometer{
    
//      add main method
    public static void main (String[] args){
        
//      our input data
        int secsTrip1=480;     //the amount of seconds for trip 1
        int secsTrip2=3220;    //the amount of seconds for trip 2
        int countsTrip1=1561;  //the amount of rotations for trip 1
        int countsTrip2=9037;  //the amount of rotations for trip 2
        
//      our intermediate variables and output data
        double wheelDiameter=27.0,  //the diameter of the wheel of the bicycle 
        PI=3.14159,                 //the value of pi 
        feetPerMile=5280,           //the amount of feet in 1 mile
        inchesPerFoot=12,           //the amount of inches in 1 foot
        secondsPerMinute=60;        //the amount of seconds in 1 min
        double distanceTrip1, distanceTrip2, totalDistance;     //the conversion/proclomation of Trip 1, Trip 2 and the total Distance being doubles
        
        
//      print out the numbers that have been stored in the variables that store secs and counts
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took"+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            
//      run the calculations; store the values. Document the calculation.

        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above gives the distance in inches
        //(for each count, a rotation in the wheel travels the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;
        //Converts distance to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //print the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
            
    
    }
        
}
