//////////////////////////////////////
//Eric DelGizzo
// 09/18/15
// Poker Hand Table Program
//
// first compile the program
//      javac PokerHandCheck.java
//  then run the program
//      java PokerHandCheck


// define a class
public class PokerHandCheck{

//  add a main method
    public static void main(String[] args) {
      
    //picks a random number in between 1 and 52
    int randomNumber = (int)(Math.random()*52)+1;
    //declare string, which the swtich statements will use
    String cardAssign= "";
    
    //this assignes the random numbers of 1 to 52 to the appropriate card identity
    switch(randomNumber){
        
        //listed are the assinging of the numbers of cards to appropirate suit
        //suits are 1-13 Diamonds, 14-26 Clubs, 27-39 Hearts, 40-52 Spades
        
        //Diamonds Case 1 - Case 13
        case 1:
            cardAssign="Ace";
        break;
        case 2:
            cardAssign="2";
        break;
        case 3: 
            cardAssign="3";
        break;
        case 4: 
            cardAssign="4";
        break;
        case 5:
            cardAssign="5";
        break;
        case 6: 
            cardAssign="6";
        break;
        case 7: 
            cardAssign="7";
        break;
        case 8:
            cardAssign="8";
        break;
        case 9: 
            cardAssign="9";
        break;
        case 10:
            cardAssign="10";
        break;
        case 11:
            cardAssign="Jack";
        break;
        case 12: 
            cardAssign="Queen";
        break;
        case 13:
            cardAssign="King";
        break;
        
        //Clubs Case 14 - Case 26
        case 14:
            cardAssign="Ace";
        break;
        case 15:
            cardAssign="2";
        break;
        case 16:
            cardAssign="3";
        break;
        case 17:
            cardAssign="4";
        break;
        case 18:
            cardAssign="5";
        break;
        case 19:
            cardAssign="6";
        break;
        case 20:
            cardAssign="7";
        break;
        case 21:
            cardAssign="8";
        break;
        case 22:
            cardAssign="9";
        break;
        case 23:
            cardAssign="10";
        break;
        case 24:
            cardAssign="Jack";
        break;
        case 25: 
            cardAssign="Queen";
        break;
        case 26:
            cardAssign="King";
        break;
            
        //Hearts Case 27 - Case 39
        case 27:
            cardAssign="Ace";
        break;
        case 28:
            cardAssign="2";
        break;
        case 29:
            cardAssign="3";
        break;
        case 30:
            cardAssign="4";
        break;
        case 31:
            cardAssign="5";
        break;
        case 32:
            cardAssign="6";
        break;
        case 33:
            cardAssign="7";
        break;
        case 34:
            cardAssign="8";
        break;
        case 35:
            cardAssign="9";
        break;
        case 36:
            cardAssign="10";
        break;
        case 37:
            cardAssign="Jack";
        break;
        case 38: 
            cardAssign="Queen";
        break;
        case 39:
            cardAssign="King";
        break;
        
        //Spades Case 40 - Case 52
        case 40:
            cardAssign="Ace";
        break;
        case 41:
            cardAssign="2";
        break;
        case 42:
            cardAssign="3";
        break;
        case 43:
            cardAssign="4";
        break;
        case 44:
            cardAssign="5";
        break;
        case 45:
            cardAssign="6";
        break;
        case 46:
            cardAssign="7";
        break;
        case 47:
            cardAssign="8";
        break;
        case 48:
            cardAssign="9";
        break;
        case 49:
            cardAssign="10";
        break;
        case 50:
            cardAssign="Jack";
        break;
        case 51: 
            cardAssign="Queen";
        break;
        case 52:
            cardAssign="King";
        break;
        }
        
        System.out.println("Your random cards are:");
        
        //if statements that split the random numbers into respectful suits and prints out results
        if (randomNumber<=13){
            System.out.println("You picked the "+cardAssign+" of Diamonds.");
        }
        
        else if (randomNumber>=14 && randomNumber<=26){
            System.out.println("You picked the "+cardAssign+" of Clubs.");
        }

        else if (randomNumber>=27 && randomNumber<=39){
            System.out.println("You picked the "+cardAssign+" of Hearts.");    
        }
        
        else if (randomNumber>=40 && randomNumber<=52){
            System.out.println("You picked the "+cardAssign+" of Spades.");
        }
        
            //picks a random number in between 1 and 52
    int randomNumber1 = (int)(Math.random()*52)+1;
    //declare string, which the swtich statements will use
    String cardAssign1= "";
    
    //this assignes the random numbers of 1 to 52 to the appropriate card identity
    switch(randomNumber1){
        
        //listed are the assinging of the numbers of cards to appropirate suit
        //suits are 1-13 Diamonds, 14-26 Clubs, 27-39 Hearts, 40-52 Spades
        
        //Diamonds Case 1 - Case 13
        case 1:
            cardAssign1="Ace";
        break;
        case 2:
            cardAssign1="2";
        break;
        case 3: 
            cardAssign1="3";
        break;
        case 4: 
            cardAssign1="4";
        break;
        case 5:
            cardAssign1="5";
        break;
        case 6: 
            cardAssign1="6";
        break;
        case 7: 
            cardAssign1="7";
        break;
        case 8:
            cardAssign1="8";
        break;
        case 9: 
            cardAssign1="9";
        break;
        case 10:
            cardAssign1="10";
        break;
        case 11:
            cardAssign1="Jack";
        break;
        case 12: 
            cardAssign1="Queen";
        break;
        case 13:
            cardAssign1="King";
        break;
        
        //Clubs Case 14 - Case 26
        case 14:
            cardAssign1="Ace";
        break;
        case 15:
            cardAssign1="2";
        break;
        case 16:
            cardAssign1="3";
        break;
        case 17:
            cardAssign1="4";
        break;
        case 18:
            cardAssign1="5";
        break;
        case 19:
            cardAssign1="6";
        break;
        case 20:
            cardAssign1="7";
        break;
        case 21:
            cardAssign1="8";
        break;
        case 22:
            cardAssign1="9";
        break;
        case 23:
            cardAssign1="10";
        break;
        case 24:
            cardAssign1="Jack";
        break;
        case 25: 
            cardAssign1="Queen";
        break;
        case 26:
            cardAssign1="King";
        break;
            
        //Hearts Case 27 - Case 39
        case 27:
            cardAssign1="Ace";
        break;
        case 28:
            cardAssign1="2";
        break;
        case 29:
            cardAssign1="3";
        break;
        case 30:
            cardAssign1="4";
        break;
        case 31:
            cardAssign1="5";
        break;
        case 32:
            cardAssign1="6";
        break;
        case 33:
            cardAssign1="7";
        break;
        case 34:
            cardAssign1="8";
        break;
        case 35:
            cardAssign1="9";
        break;
        case 36:
            cardAssign1="10";
        break;
        case 37:
            cardAssign1="Jack";
        break;
        case 38: 
            cardAssign1="Queen";
        break;
        case 39:
            cardAssign1="King";
        break;
        
        //Spades Case 40 - Case 52
        case 40:
            cardAssign1="Ace";
        break;
        case 41:
            cardAssign1="2";
        break;
        case 42:
            cardAssign1="3";
        break;
        case 43:
            cardAssign1="4";
        break;
        case 44:
            cardAssign1="5";
        break;
        case 45:
            cardAssign1="6";
        break;
        case 46:
            cardAssign1="7";
        break;
        case 47:
            cardAssign1="8";
        break;
        case 48:
            cardAssign1="9";
        break;
        case 49:
            cardAssign1="10";
        break;
        case 50:
            cardAssign1="Jack";
        break;
        case 51: 
            cardAssign1="Queen";
        break;
        case 52:
            cardAssign1="King";
        break;
        }
        
        //if statements that split the random numbers into respectful suits and prints out results
        if (randomNumber1<=13){
            System.out.println("You picked the "+cardAssign1+" of Diamonds.");
        }
        
        else if (randomNumber1>=14 && randomNumber1<=26){
            System.out.println("You picked the "+cardAssign1+" of Clubs.");
        }

        else if (randomNumber1>=27 && randomNumber1<=39){
            System.out.println("You picked the "+cardAssign1+" of Hearts.");    
        }
        
        else if (randomNumber1>=40 && randomNumber1<=52){
            System.out.println("You picked the "+cardAssign1+" of Spades.");
        }
        //picks a random number in between 1 and 52
    int randomNumber2 = (int)(Math.random()*52)+1;
    //declare string, which the swtich statements will use
    String cardAssign2= "";
    
    //this assignes the random numbers of 1 to 52 to the appropriate card identity
    switch(randomNumber2){
        
        //listed are the assinging of the numbers of cards to appropirate suit
        //suits are 1-13 Diamonds, 14-26 Clubs, 27-39 Hearts, 40-52 Spades
        
        //Diamonds Case 1 - Case 13
        case 1:
            cardAssign2="Ace";
        break;
        case 2:
            cardAssign2="2";
        break;
        case 3: 
            cardAssign2="3";
        break;
        case 4: 
            cardAssign2="4";
        break;
        case 5:
            cardAssign2="5";
        break;
        case 6: 
            cardAssign2="6";
        break;
        case 7: 
            cardAssign2="7";
        break;
        case 8:
            cardAssign2="8";
        break;
        case 9: 
            cardAssign2="9";
        break;
        case 10:
            cardAssign2="10";
        break;
        case 11:
            cardAssign2="Jack";
        break;
        case 12: 
            cardAssign2="Queen";
        break;
        case 13:
            cardAssign2="King";
        break;
        
        //Clubs Case 14 - Case 26
        case 14:
            cardAssign2="Ace";
        break;
        case 15:
            cardAssign2="2";
        break;
        case 16:
            cardAssign2="3";
        break;
        case 17:
            cardAssign2="4";
        break;
        case 18:
            cardAssign2="5";
        break;
        case 19:
            cardAssign2="6";
        break;
        case 20:
            cardAssign2="7";
        break;
        case 21:
            cardAssign2="8";
        break;
        case 22:
            cardAssign2="9";
        break;
        case 23:
            cardAssign2="10";
        break;
        case 24:
            cardAssign2="Jack";
        break;
        case 25: 
            cardAssign2="Queen";
        break;
        case 26:
            cardAssign2="King";
        break;
            
        //Hearts Case 27 - Case 39
        case 27:
            cardAssign2="Ace";
        break;
        case 28:
            cardAssign2="2";
        break;
        case 29:
            cardAssign2="3";
        break;
        case 30:
            cardAssign2="4";
        break;
        case 31:
            cardAssign2="5";
        break;
        case 32:
            cardAssign2="6";
        break;
        case 33:
            cardAssign2="7";
        break;
        case 34:
            cardAssign2="8";
        break;
        case 35:
            cardAssign2="9";
        break;
        case 36:
            cardAssign2="10";
        break;
        case 37:
            cardAssign2="Jack";
        break;
        case 38: 
            cardAssign2="Queen";
        break;
        case 39:
            cardAssign2="King";
        break;
        
        //Spades Case 40 - Case 52
        case 40:
            cardAssign2="Ace";
        break;
        case 41:
            cardAssign2="2";
        break;
        case 42:
            cardAssign2="3";
        break;
        case 43:
            cardAssign2="4";
        break;
        case 44:
            cardAssign2="5";
        break;
        case 45:
            cardAssign2="6";
        break;
        case 46:
            cardAssign2="7";
        break;
        case 47:
            cardAssign2="8";
        break;
        case 48:
            cardAssign2="9";
        break;
        case 49:
            cardAssign2="10";
        break;
        case 50:
            cardAssign2="Jack";
        break;
        case 51: 
            cardAssign2="Queen";
        break;
        case 52:
            cardAssign2="King";
        break;
        }
        
        //if statements that split the random numbers into respectful suits and prints out results
        if (randomNumber2<=13){
            System.out.println("You picked the "+cardAssign2+" of Diamonds.");
        }
        
        else if (randomNumber2>=14 && randomNumber2<=26){
            System.out.println("You picked the "+cardAssign2+" of Clubs.");
        }

        else if (randomNumber2>=27 && randomNumber2<=39){
            System.out.println("You picked the "+cardAssign2+" of Hearts.");    
        }
        
        else if (randomNumber2>=40 && randomNumber2<=52){
            System.out.println("You picked the "+cardAssign2+" of Spades.");
        }
            //picks a random number in between 1 and 52
   
    int randomNumber3 = (int)(Math.random()*52)+1;
    //declare string, which the swtich statements will use
    String cardAssign3= "";
    
    //this assignes the random numbers of 1 to 52 to the appropriate card identity
    switch(randomNumber3){
        
        //listed are the assinging of the numbers of cards to appropirate suit
        //suits are 1-13 Diamonds, 14-26 Clubs, 27-39 Hearts, 40-52 Spades
        
        //Diamonds Case 1 - Case 13
        case 1:
            cardAssign3="Ace";
        break;
        case 2:
            cardAssign3="2";
        break;
        case 3: 
            cardAssign3="3";
        break;
        case 4: 
            cardAssign3="4";
        break;
        case 5:
            cardAssign3="5";
        break;
        case 6: 
            cardAssign3="6";
        break;
        case 7: 
            cardAssign3="7";
        break;
        case 8:
            cardAssign3="8";
        break;
        case 9: 
            cardAssign3="9";
        break;
        case 10:
            cardAssign3="10";
        break;
        case 11:
            cardAssign3="Jack";
        break;
        case 12: 
            cardAssign3="Queen";
        break;
        case 13:
            cardAssign3="King";
        break;
        
        //Clubs Case 14 - Case 26
        case 14:
            cardAssign3="Ace";
        break;
        case 15:
            cardAssign3="2";
        break;
        case 16:
            cardAssign3="3";
        break;
        case 17:
            cardAssign3="4";
        break;
        case 18:
            cardAssign3="5";
        break;
        case 19:
            cardAssign3="6";
        break;
        case 20:
            cardAssign3="7";
        break;
        case 21:
            cardAssign3="8";
        break;
        case 22:
            cardAssign3="9";
        break;
        case 23:
            cardAssign3="10";
        break;
        case 24:
            cardAssign3="Jack";
        break;
        case 25: 
            cardAssign3="Queen";
        break;
        case 26:
            cardAssign3="King";
        break;
            
        //Hearts Case 27 - Case 39
        case 27:
            cardAssign3="Ace";
        break;
        case 28:
            cardAssign3="2";
        break;
        case 29:
            cardAssign3="3";
        break;
        case 30:
            cardAssign3="4";
        break;
        case 31:
            cardAssign3="5";
        break;
        case 32:
            cardAssign3="6";
        break;
        case 33:
            cardAssign3="7";
        break;
        case 34:
            cardAssign3="8";
        break;
        case 35:
            cardAssign3="9";
        break;
        case 36:
            cardAssign3="10";
        break;
        case 37:
            cardAssign3="Jack";
        break;
        case 38: 
            cardAssign3="Queen";
        break;
        case 39:
            cardAssign3="King";
        break;
        
        //Spades Case 40 - Case 52
        case 40:
            cardAssign3="Ace";
        break;
        case 41:
            cardAssign3="2";
        break;
        case 42:
            cardAssign3="3";
        break;
        case 43:
            cardAssign3="4";
        break;
        case 44:
            cardAssign3="5";
        break;
        case 45:
            cardAssign3="6";
        break;
        case 46:
            cardAssign3="7";
        break;
        case 47:
            cardAssign3="8";
        break;
        case 48:
            cardAssign3="9";
        break;
        case 49:
            cardAssign3="10";
        break;
        case 50:
            cardAssign3="Jack";
        break;
        case 51: 
            cardAssign3="Queen";
        break;
        case 52:
            cardAssign3="King";
        break;
        }
        
        //if statements that split the random numbers into respectful suits and prints out results
        if (randomNumber3<=13){
            System.out.println("You picked the "+cardAssign3+" of Diamonds.");
        }
        
        else if (randomNumber3>=14 && randomNumber1<=26){
            System.out.println("You picked the "+cardAssign3+" of Clubs.");
        }

        else if (randomNumber3>=27 && randomNumber1<=39){
            System.out.println("You picked the "+cardAssign3+" of Hearts.");    
        }
        
        else if (randomNumber3>=40 && randomNumber3<=52){
            System.out.println("You picked the "+cardAssign3+" of Spades.");
        }
        //picks a random number in between 1 and 52
    int randomNumber4 = (int)(Math.random()*52)+1;
    //declare string, which the swtich statements will use
    String cardAssign4= "";
    
    //this assignes the random numbers of 1 to 52 to the appropriate card identity
    switch(randomNumber4){
        
        //listed are the assinging of the numbers of cards to appropirate suit
        //suits are 1-13 Diamonds, 14-26 Clubs, 27-39 Hearts, 40-52 Spades
        
        //Diamonds Case 1 - Case 13
        case 1:
            cardAssign4="Ace";
        break;
        case 2:
            cardAssign4="2";
        break;
        case 3: 
            cardAssign4="3";
        break;
        case 4: 
            cardAssign4="4";
        break;
        case 5:
            cardAssign4="5";
        break;
        case 6: 
            cardAssign4="6";
        break;
        case 7: 
            cardAssign4="7";
        break;
        case 8:
            cardAssign4="8";
        break;
        case 9: 
            cardAssign4="9";
        break;
        case 10:
            cardAssign4="10";
        break;
        case 11:
            cardAssign4="Jack";
        break;
        case 12: 
            cardAssign4="Queen";
        break;
        case 13:
            cardAssign4="King";
        break;
        
        //Clubs Case 14 - Case 26
        case 14:
            cardAssign4="Ace";
        break;
        case 15:
            cardAssign4="2";
        break;
        case 16:
            cardAssign4="3";
        break;
        case 17:
            cardAssign4="4";
        break;
        case 18:
            cardAssign4="5";
        break;
        case 19:
            cardAssign4="6";
        break;
        case 20:
            cardAssign4="7";
        break;
        case 21:
            cardAssign4="8";
        break;
        case 22:
            cardAssign4="9";
        break;
        case 23:
            cardAssign4="10";
        break;
        case 24:
            cardAssign4="Jack";
        break;
        case 25: 
            cardAssign4="Queen";
        break;
        case 26:
            cardAssign4="King";
        break;
            
        //Hearts Case 27 - Case 39
        case 27:
            cardAssign4="Ace";
        break;
        case 28:
            cardAssign4="2";
        break;
        case 29:
            cardAssign4="3";
        break;
        case 30:
            cardAssign4="4";
        break;
        case 31:
            cardAssign4="5";
        break;
        case 32:
            cardAssign4="6";
        break;
        case 33:
            cardAssign4="7";
        break;
        case 34:
            cardAssign4="8";
        break;
        case 35:
            cardAssign4="9";
        break;
        case 36:
            cardAssign4="10";
        break;
        case 37:
            cardAssign4="Jack";
        break;
        case 38: 
            cardAssign4="Queen";
        break;
        case 39:
            cardAssign4="King";
        break;
        
        //Spades Case 40 - Case 52
        case 40:
            cardAssign4="Ace";
        break;
        case 41:
            cardAssign4="2";
        break;
        case 42:
            cardAssign4="3";
        break;
        case 43:
            cardAssign4="4";
        break;
        case 44:
            cardAssign4="5";
        break;
        case 45:
            cardAssign4="6";
        break;
        case 46:
            cardAssign4="7";
        break;
        case 47:
            cardAssign4="8";
        break;
        case 48:
            cardAssign4="9";
        break;
        case 49:
            cardAssign4="10";
        break;
        case 50:
            cardAssign4="Jack";
        break;
        case 51: 
            cardAssign4="Queen";
        break;
        case 52:
            cardAssign4="King";
        break;
        }
        
        //if statements that split the random numbers into respectful suits and prints out results
        if (randomNumber4<=13){
            System.out.println("You picked the "+cardAssign4+" of Diamonds.");
        }
        
        else if (randomNumber4>=14 && randomNumber4<=26){
            System.out.println("You picked the "+cardAssign4+" of Clubs.");
        }

        else if (randomNumber4>=27 && randomNumber4<=39){
            System.out.println("You picked the "+cardAssign4+" of Hearts.");    
        }
        
        else if (randomNumber4>=40 && randomNumber4<=52){
            System.out.println("You picked the "+cardAssign4+" of Spades.");
        }

        //declare variable by placing all possible matches for one pair
        boolean unPair = (cardAssign==cardAssign1 || cardAssign==cardAssign2 || cardAssign==cardAssign3 || cardAssign==cardAssign4cardAssign1==cardAssign2 || cardAssign1==cardAssign3 || cardAssign1==cardAssign4 || cardAssign2==cardAssign3 || cardAssign2==cardAssign4 || cardAssign3==cardAssign4);
        
        //decalre variable by placing all possible matches for two pair
        boolean dosPair = ((cardAssign==cardAssign1 && cardAssign2==cardAssign3) || (cardAssign==cardAssign1 && cardAssign2==cardAssign4) || (cardAssign==cardAssign1 && cardAssign3==cardAssign4) || 
                           (cardAssign==cardAssign2 && cardAssign1==cardAssign3) || (cardAssign==cardAssign2 && cardAssign1==cardAssign4) || (cardAssign==cardAssign2 && cardAssign3==cardAssign4) ||
                           (cardAssign==cardAssign3 && cardAssign1==cardAssign4) || (cardAssign==cardAssign3 && cardAssign1==cardAssign2) || (cardAssign==cardAssign3 && cardAssign2==cardAssign4) ||
                           (cardAssign==cardAssign4 && cardAssign1==cardAssign2) || (cardAssign==cardAssign4 && cardAssign1==cardAssign3) || (cardAssign==cardAssign4 && cardAssign2==cardAssign3) ||
                           (cardAssign1==cardAssign2 && cardAssign3==cardAssign4) || (cardAssign1==cardAssign3 && cardAssign2==cardAssign4) || (cardAssign1==cardAssign4 && cardAssign2==cardAssign3));
        
        //declare variable by placing all possible matches for threepair
        boolean tresPair = ((cardAssign==cardAssign1 && cardAssign==cardAssign2) || (cardAssign==cardAssign1 && cardAssign==cardAssign3) || (cardAssign==cardAssign1 && cardAssign==cardAssign4) ||
                            (cardAssign==cardAssign2 && cardAssign==cardAssign3) || (cardAssign==cardAssign2 && cardAssign==cardAssign4) || 
                            (cardAssign==cardAssign3 && cardAssign==cardAssign4) || 
                            (cardAssign1==cardAssign2 && cardAssign1==cardAssign3) || (cardAssign1==cardAssign2 && cardAssign1==cardAssign4) || (cardAssign1==cardAssign3 && cardAssign1==cardAssign4) ||
                            (cardAssign2==cardAssign3 && cardAssign2==cardAssign4));
        
        //declare varibale for no match
        boolean nomatch = (cardAssign!=cardAssign1 || cardAssign!=cardAssign2 || cardAssign!=cardAssign3 || cardAssign!=cardAssign4 cardAssign1!=cardAssign2 || cardAssign1!=cardAssign3 || cardAssign1!=cardAssign4 || cardAssign2!=cardAssign3 || cardAssign2!=cardAssign4 || cardAssign3!=cardAssign4);
        
        //print for 3 kind
        if (tresPair==true) {
            System.out.println("You have three of a kind!");
        }
        //for 2 pair
        else if (dosPair==true) {
            System.out.println("You have two pairs!");
        }
        //for 1 pair
        else if (unPair==true) {
            System.out.println("You have one pair!");
        }
        //for no match
        else {
            System.out.println("You have a high card hand!");
        }
        
}
    }