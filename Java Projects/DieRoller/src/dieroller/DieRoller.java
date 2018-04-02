package dieroller;

/**
 *PROGRAM HEADER 
 *PROGRAM NAME:Die Roller
 *PROGRAM PURPOSE:Demonstrate the modulus operator
 *DATE WRITTEN:8/26/15
 * PROGRAMMER:Nathan Nieuwenhuis
 */
public class DieRoller 
{

    public static void main(String[] args) 
    {
        double randomNumber = (Math.random() * 100);
        int die = (int) (randomNumber % 6) + 1;
        System.out.println("the random number is: " + randomNumber);
        System.out.println("the dice number is: " + die);
        int evenOdd = (int) (randomNumber % 2); // decide if even or odd
        System.out.println("the number is: " + evenOdd);
        //Clock work  - use %12
    }

}
