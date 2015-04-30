import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
Jack Steffens
CS 110
*/

public class MainGame extends JFrame
{

   // declare variables
   private JPanel panel;
   private JLabel messageLabel;
   private JButton button;
   private final int WINDOW_WIDTH = 500;
   private final int WINDOW_HEIGHT = 250;
   
   // create war game object
   public static WarGame game = new WarGame();
   
   /**
   constructor that displays window
   */
   public MainGame()
   {
   
      
      // set title
      setTitle("WAR");
      
      // set size
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      // set close operation
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // build panel method
      buildPanel();
      
      // add panel
      add(panel);
      
      // make window visible
      setVisible(true);
   
   }
   
   private void buildPanel()
   {
   
   messageLabel = new JLabel("Click button to battle oponent");
   button = new JButton("WAR");
   button.addActionListener(new ButtonListener());
   panel = new JPanel();
   panel.add(messageLabel);
   panel.add(button);
   
   }
   
   private class ButtonListener implements ActionListener
   {
   
      public void actionPerformed(ActionEvent e)
      {
      
         MainGame.game.Method();
      
      }
   
   }

}