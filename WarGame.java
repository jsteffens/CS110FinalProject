import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
Jack Steffens
CS 110
Final Project
*/

public class WarGame extends Game
{

   private JPanel panel;
   private JLabel messageLabel;
   private JButton button;
   private final int WINDOW_WIDTH = 500;
   private final int WINDOW_HEIGHT = 250;
   
   public WarGame()
   {
   
      
   
   }
   public void Method() 
   {
   
   // set window title
   setTitle("Om nom nom");
   
   // set window size
   setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
   
   // set  close operation
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   // build the panel
   buildPanel();
   
   // add panel
   add(panel);
   
   // display window
   setVisible(true);
   
   // variable for num cards in each pile
   int playerPile = 26;
   int compPile = 26;
   
   // create a queue object for player and computer card piles
   QueueReferenceBased playerQ = new QueueReferenceBased();
   QueueReferenceBased compQ = new QueueReferenceBased();
   
   // create a ListArrayListBased object for keeping track of current-round cards
   ListArrayListBased currentRound = new ListArrayListBased();
   
   // deal the cards into each player's pile (load into queue) until the deck is empty
   while (!(WarGame.deck.isEmpty()))
   {
   
   playerQ.enqueue(WarGame.deck.dealCard());
   compQ.enqueue(WarGame.deck.dealCard());
   
   }
   
   try
   {
      
   
   // start round if both piles have cards remaining
   while (!playerQ.isEmpty() && !compQ.isEmpty())
   {
   
   // add top card of each pile to currentRound list and compare them
   currentRound.add(1,playerQ.dequeue());
   playerPile--;
   currentRound.add(1,compQ.dequeue());
   compPile--;
   // if ranks are the same, add another card from each pile to the list, then compare next
   if (((Card)currentRound.get(1)).equals((Card)currentRound.get(2)))
   {
   System.out.println("WAR!! Now put a card face down, and battle with the next card!"); 
   // each player puts a card face-down
   currentRound.add(1,playerQ.dequeue());
   playerPile--;
   currentRound.add(1,compQ.dequeue());
   compPile--;
   
   // each add another card to list, and compare
   currentRound.add(1,playerQ.dequeue());
   playerPile--;
   currentRound.add(1,compQ.dequeue());
   compPile--;
   
      if (((Card)currentRound.get(1)).equals(((Card)currentRound.get(2))))
      {
      
         System.out.println("WAR!! You know what that means...");
         // each player puts a card face-down
         currentRound.add(1,playerQ.dequeue());
         playerPile--;
         currentRound.add(1,compQ.dequeue());
         compPile--;

         // each add another card to list, and compare
         currentRound.add(1,playerQ.dequeue());
         playerPile--;
         currentRound.add(1,compQ.dequeue());
         compPile--;
         
            if (((Card)currentRound.get(1)).equals(((Card)currentRound.get(2))))
            {
            
                     System.out.println("WAR? What a coincidence");
                     
                     // each player puts a card face-down
                     currentRound.add(1,playerQ.dequeue());
                     playerPile--;
                     currentRound.add(1,compQ.dequeue());
                     compPile--;
               
                     // each add another card to list, and compare
                     currentRound.add(1,playerQ.dequeue());
                     playerPile--;
                     currentRound.add(1,compQ.dequeue());
                     compPile--;
                     
                     if (((Card)currentRound.get(1)).equals(((Card)currentRound.get(2))))
                        System.out.println("Man, you need to shuffle these cards");
                        
                     else if (((Card)currentRound.get(1)).getRank() > ((Card)currentRound.get(2)).getRank())
                     {
                     
                     System.out.println("Player: "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank());
                     
                     // add all elements to winner's queue
                     compPile += currentRound.size();
                     
                        for (int i = 1; i <= currentRound.size(); i++)
                        {
               
                           compQ.enqueue(currentRound.get(i));
                  
                        }
                  
                     // clear the list
                     currentRound.removeAll();

                     
                     }
                     
                     else
                     {
                     
                     System.out.println("Player: "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank());
                     
                     // add all elements to winner's queue
                     playerPile += currentRound.size();
                     
                        for (int i = 1; i <= currentRound.size(); i++)
                        {
               
                           playerQ.enqueue(currentRound.get(i));
                  
                        }
                  
               // clear the list
               currentRound.removeAll();
                     
                     }
         
            }
            
            else if (((Card)currentRound.get(1)).getRank() > ((Card)currentRound.get(2)).getRank())

            {
            
               System.out.println("Player: "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank());
            
               // add all elements to winner's queue
               compPile += currentRound.size();
               for (int i = 1; i <= currentRound.size(); i++)
               {
               
                  compQ.enqueue(currentRound.get(i));
                  
               }
                  
               // clear the list
               currentRound.removeAll();
            
            }
            
            else
            {
            
               System.out.println("Player: "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank());
            
               // add all elements to winner's queue
               playerPile += currentRound.size();
               for (int i = 1; i <= currentRound.size(); i++)
               {
               
                  playerQ.enqueue(currentRound.get(i));
                  
               }
                  
               // clear the list
               currentRound.removeAll();
      
            
            }
      
      }
      else if (((Card)currentRound.get(1)).getRank() > ((Card)currentRound.get(2)).getRank())
      {
      
         System.out.println("Player: "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank());
      
         // add all elements to winner's queue
         compPile += currentRound.size();
         for (int i = 1; i <= currentRound.size(); i++)
         {
         
            compQ.enqueue(currentRound.get(i));
            
         }
            
         // clear the list
         currentRound.removeAll();
      
      }
      
      else
      {
      
         System.out.println("Player: "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank());
      
         // add all elements to winner's queue
         playerPile += currentRound.size();
         for (int i = 1; i <= currentRound.size(); i++)
         {
         
            playerQ.enqueue(currentRound.get(i));
            
         }
            
         // clear the list
         currentRound.removeAll();
      
      }
   
   }
   // player with the higher ranked card adds all cards in the list to his/her queue
   else if (((Card)currentRound.get(1)).getRank() > ((Card)currentRound.get(2)).getRank())
   {
   
      System.out.println("Player: "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank());
   
      // add all elements to winner's queue
      compPile += currentRound.size();
      for (int i = 1; i <= currentRound.size(); i++)
      {
      
         compQ.enqueue(currentRound.get(i));
         
      }
         
      // clear the list
      currentRound.removeAll();
   
   }
   
   else
   {
   
      System.out.println("Player: "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank());
   
      // add all elements to winner's queue
      playerPile += currentRound.size();
      for (int i = 1; i <= currentRound.size(); i++)
      {
      
         playerQ.enqueue(currentRound.get(i));
         
      }
         
      // clear the list
      currentRound.removeAll();

   
   }
   
   // see if either player has lost after each iteration
   if (playerQ.isEmpty())
      System.out.println("Computer Wins!");
      
   if (compQ.isEmpty())
      System.out.println("Player Wins!");
   
   }
      

   }
   
   catch (QueueException e)
   {
   
   if (playerQ.isEmpty())
      System.out.println("Computer Wins!");
   
   if (compQ.isEmpty())
      System.out.println("Player Wins!");
   
   }
         
   }
   
   private void buildPanel()
   {
   
      // create message label
      messageLabel = new JLabel("woo");
      
      // create button
      button = new JButton("OK");
      
      // add action listener
      button.addActionListener(new ButtonListener());
      
      // create panel
      panel = new JPanel();
      
      // add fields
      panel.add(messageLabel);
      panel.add(button);
   
   }
   
   private class ButtonListener implements ActionListener
   {
   
      public void actionPerformed(ActionEvent e)
      {
      
      setVisible(false);
      
      }
   
   }
   
}