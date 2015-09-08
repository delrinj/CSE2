/////////////////////////
//Eric DelGizzo
//09/07/15
//Arithmetic Java Program
//
// first compile program
//      javac Arithmetic.java
// run the program
//      java Arithmetic

// define the class
public class Arithmetic{
    
//      add a main method
        public static void main (String[] args){

//          our input data
            // Number of pairs of socks
            int nSocks=3;
            // Cost per pair of socks
            // ('$' is part of the variable name)
            double sockCost$=2.58;
            
            // Number of drinking glasses
            int nGlasses=6;
            //Cost per glass
            double glassCost$=2.29;
            
            // Number of boxes of envelopes
            int nEnvelopes=1;
            //Cost per box of envelopes
            double envelopeCost$=3.25;
            
            double taxPercent=0.06;
            
            //declare total of items
            
            //total cost of socks
            double totalSockCost$=sockCost$*nSocks;
            
            //change sock cost from double-->int-->double
            double sockCost1=totalSockCost$*100;
            int sockCost2=(int)sockCost1;
            double sockCostFinal$=(double)sockCost2/100.0;
            
            
            //total cost of glasses
            double totalGlassCost$=glassCost$*nGlasses;
            
            //change glasses cost from double-->int-->double
            double glassCost1=totalGlassCost$*100;
            int glassCost2=(int)glassCost1;
            double glassCostFinal$=(double)glassCost2/100.0;
            
            
            //total cost of boxes of envelopes
            double totalEnvelopeCost$=envelopeCost$*nEnvelopes;
            
            //change envelopes cost from double-->int-->double
            double envelopeCost1=totalEnvelopeCost$*100;
            int envelopeCost2=(int)envelopeCost1;
            double envelopeCostFinal$=(double)envelopeCost2/100.0;
            
            //total cost of all items without tax
            double totalCost$=envelopeCostFinal$+glassCostFinal$+sockCostFinal$;
            
            //convert to float and round
            float totalCost1$=(float)Math.round(totalCost$*100)/100;
        
           
           
            //declare tax per item
            
            //total tax for socks
            double sockTax$=totalSockCost$*taxPercent;
            
            //change sock tax from double-->int-->double
            double sockTax1=sockTax$*100;
            int sockTax2=(int)sockTax1;
            double sockTaxFinal$=(double)sockTax2/100.0;
            
            //total tax for glasses
            double glassTax$=totalGlassCost$*taxPercent;
            
            //change glass tax from double-->int-->double
            double glassTax1=glassTax$*100;
            int glassTax2=(int)glassTax1;
            double glassTaxFinal$=(double)glassTax2/100.0;
            
            //total tax for envelope
            double envelopeTax$=totalEnvelopeCost$*taxPercent;
            
            //change envelope tax from doubkle-->int-->double
            double envelopeTax1=envelopeTax$*100;
            int envelopeTax2=(int)envelopeTax1;
            double envelopeTaxFinal$=(double)envelopeTax2/100.0;
            
            //total sales tax that will be added on 
            double totalTax$=sockTaxFinal$+glassTaxFinal$+envelopeTaxFinal$;
            
            //convert to float and round
            float totalTax1$=(float)Math.round(totalTax$*100)/100;
            
            
            //total cost with sales tax
            double allCost$=totalTax1$+totalCost1$;
            
            //convert to float and round
            float allCost1$=(float)Math.round(allCost$*100)/100;
            
            
            
            //print what is being bought, how much, and the cost for each item, total cost (no tax), total sales tax
            
            //socks
            System.out.println("I am buying socks.");
            System.out.println("I am buying "+nSocks+" pairs of socks.");
            System.out.println("Each pair costs $"+sockCost$+".");
            System.out.println("The total cost of socks not including sales tax is $"+sockCostFinal$+".");
            System.out.println("The sales tax for the socks is $"+sockTaxFinal$+".");
            
            //glasses
            System.out.println("I am buying glasses.");
            System.out.println("I am buying "+nGlasses+" glasses.");
            System.out.println("Each glass cost $"+glassCost$+".");
            System.out.println("The total cost of glasses not including sales tax is $"+glassCostFinal$+".");
            System.out.println("The sales tax for the glasses is $"+glassTaxFinal$+".");
            
            //boxes of envelopes
            System.out.println("I am buying boxes of envelopes.");
            System.out.println("I am buying "+nEnvelopes+" boxes of envelopes.");
            System.out.println("Each box of envelopes cost $"+envelopeCost$+".");
            System.out.println("The total cost of boxes of envelopes not including sales tax is $"+envelopeCostFinal$+".");
            System.out.println("The sales tax for the glasses is $"+envelopeTaxFinal$+".");
            
            //print total cost of all purchases (no tax), total sales tax, and total cost including sales tax
            System.out.println("The total cost of all purchases not including sales tax is $"+totalCost1$+".");
            System.out.println("The total sales tax for all the purchses is $"+totalTax1$+".");
            System.out.println("The total cost of all purchases with tax is $"+allCost1$+".");
        
            
            
            
        } //end of method
}//end of the class 
