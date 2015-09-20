//////////////////////////////////////
//Eric DelGizzo
// 09/18/15
// Card Generator Program
//
// first compile the program
//      javac CardGenerator.java
//  then run the program
//      java CardGenerator


// define a class
public class CardGenerator{

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
        
}
    }