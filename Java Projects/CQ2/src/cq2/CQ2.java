package cq2;

/**                  PROGRAM HEADER
 * PROGRAM NAME: CQ
 * PROGRAM PURPOSE: second 2014 CodeQuest problem
 * 2nd - to win the CodeQuest competition!!
 * DATE WRITTEN: 8-26-15
 * PROGRAMMER: Dylan Huyser
 */
import java.io.*;
public class CQ2 
{
    public static void main(String[] args) 
    {
        //Get the file
        String fileName = "Prob02.in.txt";        
        //Reference fille one line at a time
        String line = null;               
        try
        {
        //FileReader reads text files          
        //Instantiate a new FileReader object
        //data type  variable name    create new fr object
        FileReader fileReader = new FileReader(fileName);           
        //Also need BufferedReader
        BufferedReader bufferedReader = new BufferedReader(fileReader); 
        //declare an array to hold cards
        
        //Print out the contents of the file
        //Use a while loop for this
            while((line = bufferedReader.readLine()) != null)
            {
            //Codequest code goes here
            System.out.println(line);
            System.out.println("The length of the line is: " + line.length());
            //System.out.println("the first card is:" + line.substring(11,14));
            //for loop
            //nested for loop
            //outer loop
            for(int i = 0; i < line.length(); i++)
            {
                if(line.charAt(i) == ' ')
                {
                    System.out.println("Space found at index " + i);
                }
            System.out.println("Current i is : " + i);
            }//end of for
            }//end of while inside try
        //Always close file
        bufferedReader.close();           
        }//end of if
        catch (IOException ex) //can't find file
        {
        //Tell user there's a problem
        System.out.println("Error reading file '" + fileName + " '");
        //Or, we could just do this:
        //ex.printStackTrace();                    
        }//end of catch
    }//end of main
}//end of class