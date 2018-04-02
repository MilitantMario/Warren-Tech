package dog;

/**
 *PROGRAM HEADER 
 *PROGRAM NAME:Dog
 *PROGRAM PURPOSE:Demonstrates instantiating objects from a superclass
 *DATE WRITTEN:8-2-15
 *PROGRAMMER: Nathan Nieuwenhuis
 */
public class Dog 
{
//class level variables
int weight;
String breed;
String name;
static int randNum =(int) (Math.random() * 10);
    public static void main(String[] args) 
    {
    //Instantiate a dog object by calling the Dogpm class constructor
    //data type, name, invoke class, constructor
    Dog dog1 = new Dog();
    //Give the dog1 object a name
    //assign the dog's properties
    dog1.name = "Snoopy";
    dog1.breed = "Poodle";
    dog1.weight = 12;  
    //call the dog1 object method
    dog1.bark(randNum);
    //display dog1's properties
    System.out.println("Dog1's name is:" + dog1.name);
    System.out.println("Dog1's size is:" + dog1.weight);
    System.out.println("Dog1's breed is:" + dog1.breed);
    //Declare an array of dogs
    Dog[] myDogs = new Dog[3];
    //build the dogs from array
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = new Dog();
    //instantiate some dog objects   
    myDogs[0].name = "Fido";
    myDogs[1].name = "Data";
    myDogs[2].name = "Gunner";
    myDogs[0].breed = "Lab";
    myDogs[1].breed = "Shepherd";
    myDogs[2].breed = "Poodle";
    myDogs[0].weight = 36;
    myDogs[1].weight = 30;
    myDogs[2].weight = 15;
    //use a while loop to iterate through the dogs
    //Declare a variable to act as a counter
    int x = 0; //starting value
        while(x < myDogs.length)
        {
        System.out.println("The dog's name is: " + myDogs[x].name);
        System.out.println("The dog's size is: " + myDogs[x].weight);
        System.out.println("The dog's breed is: " + myDogs[x].breed);
        //invoke the bark() method
       // myDogs[x].bark();
        //increment x
        x = x + 1;
        }//end of while(x < myDogs.length)
    }//End of public static void
    void bark(int numOfBarks)
    {
        if(weight > 60)
        {
            while(numOfBarks > 0)
            {
            System.out.println("Woof! Woof!");
            numOfBarks--;
            }
        }
        else if(weight >20 && weight <=59)
        {
            while(numOfBarks > 0)
            {
            System.out.println("Ruff! Ruff!");
            numOfBarks--;
            }
        }
        else
        {
            while(numOfBarks > 0)
            {
            System.out.println("Yip! Yip!");
            numOfBarks--;
            }
        }    
    }//void bark end   
}//End of public class
