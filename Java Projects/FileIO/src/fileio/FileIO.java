package fileio;
/**
 *PROGRAM HEADER 
 *PROGRAM NAME:File IO
 *PROGRAM PURPOSE:1st- Learn how to read a file,
 * 2nd - To win the CodeQuest competition!!
 *DATE WRITTEN:8/26/15
 * PROGRAMMER:Dylan Huyser
 *MY COMPUTER UISER NAME: @author huyserd
 */
import java.io.*;
public class FileIO 
{
    public static void main(String[] args) 
    {
        //get the file
        String fileName = "Prob02.in.txt";
        //reference file one line at a time
        String line = null;
        char[] cards; //array to hold cards
        try
        {
            //FileReader reads text files
            //instantiate a new FileReader object
            //data type variable name    creat new fr object
        FileReader fileReader = new FileReader(fileName);
            //Also need  bufferedReader
        BufferedReader bufferedReader = new BufferedReader (fileReader);
            //print out the contents of the file
            //use a while loop for this
            while((line = bufferedReader.readLine()) !=null )
            {
                //Codequest cod goes here
                System.out.println(line);
                //substringing action happens here
                //length() method
                System.out.println(line.length());
                //charAt () method
                //System.out.println(line.charAt(16));
                //basic for loop
                for(int i = 0; i < line.length(); i++)
                {
                    System.out.println("The value of charAt() " + i + " is: "
                            + line.charAt(i));
                    //cards[i] = line.charAt(i);
                }
            }
        }
        catch (IOException ex) // Can't find file
        {
            //tell the user there's a problem
        System.out.println("Error reading file '" + fileName + " '");
            //or we could just do this:
            //ex.printStackTrace();
        }       
    }
}

