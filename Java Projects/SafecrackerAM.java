package safecrackeram;

/**                  PROGRAM HEADER
 * PROGRAM NAME: Safecracker
 * PROGRAM PURPOSE: Demonstrates using Java
 * AWT and Java Swing libraries to create GUI code
 * DATE WRITTEN: 9-1-15
 * PROGRAMMER: Nathan Nieuwenhuis
 */
//import Java libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

//Class declaration
public class SafecrackerAM extends JFrame
{
    //Class-level variables
    ImagePanel safePanel = new ImagePanel(
        new ImageIcon("bank.gif").getImage());
    
    JPanel comboPanel = new JPanel();
    JPanel keyPanel = new JPanel();
    
    //Array to hold four combo textfields
    JTextField[] comboTextField = new JTextField[4];
    //Array to hold nine keypad buttons
    JButton[] keyButton = new JButton[9];
    
    //Variables for optionsPanel
    JPanel optionsPanel = new JPanel();
    //Button group to hold radio buttons for level selection
    ButtonGroup digitsButtonGroup = new ButtonGroup();
    //Populate button group with radio buttons
    JRadioButton twoDigitsRadioButton = new JRadioButton();
    JRadioButton threeDigitsRadioButton = new JRadioButton();
    JRadioButton fourDigitsRadioButton = new JRadioButton();
    
    //Add stop and start buttons
    JPanel buttonsPanel = new JPanel();
    JButton startStopButton = new JButton();
    JButton exitButton = new JButton();
    
    //Create the feedback panel ("resultsPanel")
    JPanel resultsPanel = new JPanel();
    //Scroll down to show user new information
    JScrollPane resultsPane = new JScrollPane();
    JTextArea resultsTextArea = new JTextArea();
    
    int numberDigits;
    
    //For random number generation
    String secretCombo;
    Random myRandom = new Random();
    
    //Accepting user input
    int digitsEntered; //Integer to hold the converted string
    String enteredCombo; //The combo that Ma Kettle guesses
    
    //Variables used to show game progress
    int numberRight;
    int positionRight;

    public static void main(String[] args) 
    {
        // Create the main frame
        // Call the Safecracker constructor
        new SafecrackerAM().show();
    } // end of main() method
    
    //Class constructor
    public SafecrackerAM()
    {
        //construct the main frame
        //Set title of the main frame
        setTitle("Safecracker");
        //keep Ma Kettle from resizing the window
        setResizable(false);
        
        //Add a listener to listen for window
        //opening
        addWindowListener(new WindowAdapter()
        {
            //Listen for window closing
            public void windowClosing(WindowEvent evt)
            {
                exitForm(evt);
            }
        });
        
        //Set up the gridbag
        getContentPane().setLayout(new GridBagLayout());
        //Set up gridbag constraints - limitation
        GridBagConstraints gridConstraints;
        
        //Game code goes here
        //Sets size of safePanel
        safePanel.setPreferredSize(new Dimension(330, 420));
        safePanel.setLayout(new GridBagLayout());
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.gridheight = 3;
        getContentPane().add(safePanel, gridConstraints);
        
        //comboPanel
        comboPanel.setPreferredSize(new Dimension(160, 110));
        safePanel.setLayout(new GridBagLayout());
        comboPanel.setBackground(Color.YELLOW);
        gridConstraints = new GridBagConstraints();
        //Set the constraints
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.insets = new Insets(110, 0, 0, 0);
        safePanel.add(comboPanel, gridConstraints);
        
        //keyPanel
        keyPanel.setPreferredSize(new Dimension(160, 100));
        keyPanel.setLayout(new GridBagLayout());
        keyPanel.setBackground(Color.YELLOW);
        gridConstraints = new GridBagConstraints();
        //Set the constraints
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        safePanel.add(keyPanel, gridConstraints);
        
        //for loop to populate four individual combo boxes
        for(int i = 0; i < 4; i++)
        {
            //talk to comboTextField
            comboTextField[i] = new JTextField();
            comboTextField[i].setPreferredSize(new Dimension(32, 48)); //x,y
            //Force player to not be able to edit the TextField
            comboTextField[i].setEditable(false);
            //Set color of TF
            comboTextField[i].setText("0");
            //Use SWING library to center the text in the TF
            comboTextField[i].setHorizontalAlignment(SwingConstants.CENTER);
            //set the TF font
            comboTextField[i].setFont(new Font("Arial", Font.BOLD, 18));
            gridConstraints = new GridBagConstraints();
            //Set the constraints
            gridConstraints.gridx = i;
            gridConstraints.gridy = 0;
            comboPanel.add(comboTextField[i], gridConstraints);
        }
        
        //Populate the keyButton array using a for loop
        for(int i = 0; i < 9; i++)
        {
            //Start talking to keyButton
            keyButton[i] = new JButton();
            keyButton[i].setText(String.valueOf(i + 1));
            gridConstraints = new GridBagConstraints();
            //Set the constraints
            gridConstraints.gridx = i % 3;
            gridConstraints.gridy = i / 3;
            keyPanel.add(keyButton[i], gridConstraints);
            //Create a listener to listen for button push
            keyButton[i].addActionListener(new ActionListener()
            {
                //method that runs if the listener fires
                public void actionPerformed(ActionEvent e)
                {
                    keyButtonActionPerformed(e);
                }
                
            });
            
            
        }
        
        //put optionsPanel on screen
        optionsPanel.setPreferredSize(new Dimension(200, 100));
        optionsPanel.setBorder(BorderFactory.createTitledBorder("Options:"));
        optionsPanel.setLayout(new GridBagLayout());
        gridConstraints = new GridBagConstraints();
        //Set the constraints
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        getContentPane().add(optionsPanel, gridConstraints);
        
        //put radio buttons on the screen
        twoDigitsRadioButton.setText("Two Digits In Combination    ");
        twoDigitsRadioButton.setSelected(true);
        //Add this button to the radio button group
        digitsButtonGroup.add(twoDigitsRadioButton);
        gridConstraints = new GridBagConstraints();
        //Set the constraints
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        optionsPanel.add(twoDigitsRadioButton, gridConstraints);
        
        threeDigitsRadioButton.setText("Three Digits In Combination");
        threeDigitsRadioButton.setSelected(true);
        //Add this button to the radio button group
        digitsButtonGroup.add(threeDigitsRadioButton);
        gridConstraints = new GridBagConstraints();
        //Set the constraints
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        optionsPanel.add(threeDigitsRadioButton, gridConstraints);
        
        fourDigitsRadioButton.setText("Four Digits In Combination   ");
        fourDigitsRadioButton.setSelected(true);
        //Add this button to the radio button group
        digitsButtonGroup.add(fourDigitsRadioButton);
        gridConstraints = new GridBagConstraints();
        //Set the constraints
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        optionsPanel.add(fourDigitsRadioButton, gridConstraints);
        
        //Set up the buttonsPanel
        buttonsPanel.setPreferredSize(new Dimension(200, 70));
        buttonsPanel.setLayout(new GridBagLayout());
        gridConstraints = new GridBagConstraints();
        //Set the constraints
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        getContentPane().add(buttonsPanel, gridConstraints);
        
        //Add buttons to buttonsPanel
        startStopButton.setText("Start Game");
        gridConstraints = new GridBagConstraints();
        //Set the constraints
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        buttonsPanel.add(startStopButton, gridConstraints);
        startStopButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                startStopButtonActionPerformed(e);
            }
        });
        
        
        
        
        exitButton.setText("Exit Game");
        gridConstraints = new GridBagConstraints();
        //Set the constraints
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        buttonsPanel.add(exitButton, gridConstraints);
        exitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                exitButtonActionPerformed(e);
            }
        });
        
        //Place the resultsPanel
        resultsPanel.setPreferredSize(new Dimension(200, 250));
        resultsPanel.setBorder(BorderFactory.createTitledBorder("Results"));
        resultsPanel.setLayout(new GridBagLayout());
        gridConstraints = new GridBagConstraints();
        //Set the constraints
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        getContentPane().add(resultsPanel, gridConstraints);
        
        //Set up text area for writing game feedback for player
        resultsTextArea.setEditable(false); //Ma Kettle CANNOT edit!
        resultsTextArea.setBackground(Color.WHITE);
        resultsPane.setPreferredSize(new Dimension(180, 220));
        resultsPane.setViewportView(resultsTextArea);
        gridConstraints = new GridBagConstraints();
        //Set the constraints
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        resultsPanel.add(resultsPane, gridConstraints);
        
        //Game logic //
        //Gray out keypad before user hits Start button
        setKeyButtons(false);
        
        //Build the window
        pack();
        
        //Constrain the game to 1/2 the size of the
        //user's screen - big command!
        Dimension screenSize = 
                Toolkit.getDefaultToolkit().getScreenSize();
        //set boundaries for game
        setBounds(
                (int) (0.5 * (screenSize.width - 
                        getWidth())),
                (int) (0.5 * (screenSize.height - 
                        getHeight())),
                getWidth(),
                getHeight());
    } // end of Safecracker() constructor
    
    private void setKeyButtons(boolean a)
    {
        for(int i = 0; i < 9; i++)
        {
            //Grays out the keypad
            keyButton[i].setEnabled(a);
        }
    }
        
    //exitForm() method
    private void exitForm(WindowEvent evt)
    {
        System.exit(0);
    }
    
    //keyButtonActionPerformed() method
    private void keyButtonActionPerformed(ActionEvent e)
    {
       //This function is used for player's keypad guess
        String n;
        //Determine which button was clicked
        //ActionCommand represents the text on the button
        n = e.getActionCommand();
        //Disable button since digits can't repeat
        keyButton[Integer.valueOf(n).intValue() - 1].setEnabled(false);
        //if first button is in combo, clear out label boxes
        if(digitsEntered == 0)
        {
            comboTextField[0].setText("");
            comboTextField[1].setText("");
            comboTextField[2].setText("");
            comboTextField[3].setText("");
        }
        //Modify tracking variables to show correct entry
        enteredCombo += n; //Adds the "correct" button Ma Kettle enter to enteredCombo
        digitsEntered++; //Increments number of digits entered
        comboTextField[digitsEntered - 1].setText(n);
        //if all digits are entered, check combo
        if(digitsEntered == numberDigits)
        {
            //reset combo buttons
            for(int i = 0; i < 9; i++)
            {
                keyButton[i].setEnabled(true);
                //check combination
                System.out.println(enteredCombo);
            }
                
            resultsTextArea.append("Entered: " + enteredCombo + "\n");
                
            //test to see if our combo matches the secret combo
            if(enteredCombo.equals(secretCombo))
            {
                startStopButton.doClick();
            }
            else
            {
                numberRight = 0;
                for(int i = 0; i < numberDigits; i++)
                {
                    n = String.valueOf(enteredCombo.charAt(i));
                    
                    for(int j = 0; j < numberDigits; j++)
                    {
                        if(n.equals(String.valueOf(secretCombo.charAt(j))))
                            numberRight++;
                    }
                }
                //how many are in correct position
                positionRight = 0;
                for(int i = 0; i < numberDigits; i++)
                {
                    if(secretCombo.charAt(i) == enteredCombo.charAt(i))
                    {
                        //increment positionRight counter
                        positionRight++;
                        //Tell Ma Kettle that she got one right
                        resultsTextArea.append(String.valueOf(numberRight) + 
                                " digits correct\n");
                        
                        resultsTextArea.append(String.valueOf(positionRight) + 
                                " in correct position\n");
                        
                        //Tell Ma Kettle to try, try again
                        resultsTextArea.append("Try Again...\n\n");
                        
                        //clear the combo to try again
                        enteredCombo = "";
                        digitsEntered = 0;
                    }
                }
                
                
                
            }
        }
        
        
        
    }
    
    //startStopButtonActionPerformed() method
    private void startStopButtonActionPerformed(ActionEvent e)
    {
        //If the start button says "Start Game" do this stuff
        if (startStopButton.getText().equals("Start Game"))
        {
            startStopButton.setText("Stop Game");
            
            //turn off the radio buttons
            twoDigitsRadioButton.setEnabled(false);
            threeDigitsRadioButton.setEnabled(false);
            fourDigitsRadioButton.setEnabled(false);

            //Disable exit button
            exitButton.setEnabled(false);

            //Turn keyPanel on so user can select combo numbers
            setKeyButtons(true);

            //Make resultsTextArea active so we can write results to it
            resultsTextArea.setText("");

            //Decide what level of game the user is playing
            if(twoDigitsRadioButton.isSelected())
            {
                numberDigits = 2;
            }
            else if(threeDigitsRadioButton.isSelected())
            {
                numberDigits = 3;
            }
            else
            {
                numberDigits = 4;
            }

            //For loop to create the number of combo digits the user selected
            for(int i = 0; i < numberDigits; i++)
            {
                //Shows the combo text field to the user
                comboTextField[i].setVisible(true);
                //Set the combo text field to blank
                comboTextField[i].setText("");
            }

            //Trap if numberDigits is != 4
            if(numberDigits != 4)
            {
                //set the appropriate number of text fields to visible
                for(int i = numberDigits; i < 4; i++)
                {
                    comboTextField[i].setVisible(false);
                }
            }
         
            //Determine the combinations for the safe
            secretCombo = ""; //Set secret combo to blank
            int j;
            boolean uniqueDigit;
            for(int i = 0; i < numberDigits; i++)
            {
                //select a unique digit using a do while loop
                do
                {
                    j = myRandom.nextInt(9) + 1;
                    uniqueDigit = true;
                    if(i != 0)
                    {
                        for(int k = 0; k < i; k++)
                        {
                            if (String.valueOf(secretCombo.charAt(k)).equals(String.valueOf(j)))
                            {
                                uniqueDigit = false;
                            }
                        }
                    }
                    
                } 
                while(!uniqueDigit);
                secretCombo += String.valueOf(j);
                System.out.println("The secret combo is: " + secretCombo);
            }
            
            enteredCombo = "";
            digitsEntered = 0;
            
        } //End of if start button says "Start Game"
        else //If start button says "Stop Game"
        {
            startStopButton.setText("Start Game");
            twoDigitsRadioButton.setEnabled(true);
            threeDigitsRadioButton.setEnabled(true);
            fourDigitsRadioButton.setEnabled(true);
            exitButton.setEnabled(true);
            setKeyButtons(false);
        }
    }  //End of startStopButtonActionPerformed() method
    
    //exitButtonActionPerformed() method
    private void exitButtonActionPerformed(ActionEvent e)
    {
        System.exit(0); //Return code 0 means OK
        
    }
    

} //end of class SafecrackerAM

//ImagePanel class
class ImagePanel extends JPanel
{
    private Image img;
    //Give the system an image (picture)
    public ImagePanel(Image img)
    {
        this.img = img;
    }
    //Pass the image to the graphics adapter to put on the screen
    public void paintComponent(Graphics g)
    {
        g.drawImage(img, 0, 0, null);
    }
}


