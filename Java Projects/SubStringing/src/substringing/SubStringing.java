package substringing;

/**
 *PROGRAM HEADER 
 *PROGRAM NAME:SubStringing
 *PROGRAM PURPOSE:learn how to SubString a string
 *DATE WRITTEN:09-01-15
 *PROGRAMMER:Nathan Nieuwenhuis
 */
//import a Java library
import java.io.*;
public class SubStringing 
{

    public static void main(String[] args) 
    {
        String str = new String ("Jay-Z luvs $$ and I love Paris");
        System.out.print ("Return value: ");
        System.out.println(str.substring(11, 13));
        String example = "/abd /def /hgfj.doc";
        System.out.println(example.substring(example.lastIndexOf(" ") + 1));
    }

}
