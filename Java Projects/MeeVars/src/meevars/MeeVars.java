package meevars;

/**
 *PROGRAM HEADER 
 *PROGRAM NAME: NemVars
 *PROGRAM PURPOSE: Demonstrate use of memory variables
 *DATE WRITTEN: 8/24/15
 *PROGRAMMER: Nathan Nieuwenhuis
 */
public class MeeVars 
{

    public static void main(String[] args) 
    {
        // START OF CODE HERE
        double numOne; //OK to declasre without initialization
        int numTwo = 17;
        //initialixe numOne
        numOne = 10;
        //String concatenation
        System.out.println("The addition of " + numOne + " and " + numTwo + " is:"
                + (numOne + numTwo));
        //Increasing numOne by 20%
        numOne += (numOne * 0.20);
        System.out.println("I've increased numOne by 20% $" + numOne);
        System.out.println("The addition of " + numOne + " and " + numTwo + " is:"
                + (numOne + numTwo));
        //true or false operator
        //C++ and C# keyword: bool
        boolean yezNo = false;
        if(yezNo == true)
        {
            System.out.println("yezno is true!!");    
        }
        else
        {
            System.out.println("yezno is false!!");
        } 
        String myWord = "Surprise!";
        System.out.println("Todays is my birthday! " + myWord);
        //use meaningful names
        //multiwords use camecase 
        //think about correct data type
    }
    

}
