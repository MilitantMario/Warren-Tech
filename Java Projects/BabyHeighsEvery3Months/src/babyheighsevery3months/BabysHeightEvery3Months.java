/*
 *PROGRAM NAME: Baby's Height Every 3 Months
 *PROGRAM PURPOSE: Demonstrate incremental growth
 *DATE WRITTEN: 8-20-15
 *PROGRAMMER: Nathan Nieuwenhuis
 */
package babyheighsevery3months;
public class BabysHeightEvery3Months 
{
    public static void main(String[] args) 
    {
      //Show a baby's growth from birth to when it reaches its max height
        int month = 0; // the month the baby was born
        double height = 18; //the hieght the baby started at in inches
        //float inches = 18;
        String word = "feet";
        while (month <= 216) // when the child will reach age 18
        {
        if(month == 0)
        {
            System.out.println("At month 0 the cild will be 18 inches tall");
        }
            month += 3; //add the months we are messuring
            height += (height * 0.02); //The rate of growth
            //inches += (int) (inches * 0.02);
            //inches = (int) (inches % 12);
            if (height > 12)
            {
                height = (height / 12);
            }
            if (height < 2)
            { 
                word = "foot";
            }
            else
            {
                word = "feet";
            }
            if(month < 217)
            {
                System.out.println("At month " + month + " the child will be " 
                        + height + " " + word + " tall.");
            }
            else
            {
               System.out.println("This is the child's maximum hieght at age 18");
            }
        } 
    }    
}