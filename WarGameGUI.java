import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
Jack Steffens
CS 110
War Game Class

this class extends the game class and contains the main functionality
*/

public class WarGameGUI extends Game
{

   // declare variables
   private static String name;
   private JPanel panel;
   private JTextField nameField;
   private JLabel messageLabel;
   private JButton submitButton;
   private final int WINDOW_WIDTH = 300;
   private final int WINDOW_HEIGHT = 100;
   
   /**
   this constructor defaults to the superclass's and
   carries out the game
   */
   public WarGameGUI()
   {
     
   // set window title
   setTitle("War");
   
   // set window size
   setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
   
   // specify close operation
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   // build panel
   buildPanel();
   
   // add panel
   add(panel);
   
   // make sure window is displayed
   setVisible(true);
   
   
   }
   
   /**
   the buildPanel method adds the label and button
   */
   
   private void buildPanel()
   {
   
   // label for instructions
   messageLabel = new JLabel("Enter Name and Press OK");
   
   // name field
   nameField = new JTextField(10);
   
   // create submit button
   submitButton = new JButton("OK");
   
   // add action listener to submit button
   submitButton.addActionListener(new SubmitButtonListener());
   
   // create JPanel object
   panel = new JPanel();
   
   // add components to panel
   panel.add(messageLabel);
   panel.add(nameField);
   panel.add(submitButton);
   
   }

   /**
   SubmitButtonListener is an action listener class
   for the submit button
   */
   
   private class SubmitButtonListener implements ActionListener
   {
   
      /**
      the actionPerformed method executes when user
      clicks submit button
      @param e the event object
      */
   
      public void actionPerformed(ActionEvent e)
      {
      
      // store user input
      String input = nameField.getText();
      
      // exit
      setVisible(false);
      
      new MainGame();
      
      }
   
   }

   
   public static void main(String[] args)
   {
   
   new WarGameGUI();

   
   }

}