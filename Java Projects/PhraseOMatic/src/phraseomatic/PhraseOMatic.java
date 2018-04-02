package phraseomatic;

/**
 *PROGRAM HEADER 
 *PROGRAM NAME:Phrase-O-Matic
 *PROGRAM PURPOSE:Demonstrates arrays and random numbers
 *DATE WRITTEN:8/25/2015
 *PROGRAMMER:Nathan Nieuwenhuis
 */
public class PhraseOMatic 
{

    public static void main(String[] args) 
    {
        // Create three sets of words  
        //Declare an array for each of the three sets
        String[] wordListOne = 
        {
          //Initialize the arrary
            "nice try",
            "well play"
        };
        String[] wordListTwo = 
        {
          //Initialize the arrary
            "against",
            "with"
        };
        String[] wordListThree = 
        {
          //Initialize the arrary
            "Ryze",
            "Gnar",
            "Thresh",
            "Lulu"
        };
        String[] nameList = 
        {
          //Initialize the arrary
            "Bob",
            "Kathryn",
            "Brooke",
            "Bill",
        };
        
        //Find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int fourLength = nameList.length;
        //Generate three random numbers
        //Because we have demicamls and DON'T want them, we have to
        //CAST our random number as an int
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        int rand4 = (int) (Math.random() * fourLength);
        //Test to make sure that it's working
        //System.out.println("rand1 is: " + rand1);
        //System.out.println("rand2 is: " + rand2);
        //System.out.println("rand3 is: " + rand3);
        //build the phrase
        String phrase = 
                wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " +
                wordListThree[rand3];
        String Phrase2 = nameList[rand4];
        //print out the phrase
        System.out.println("Geez " + Phrase2 + "!" + " That's a " + phrase + "!");
    }

}
