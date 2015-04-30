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

   // variable for num cards in each pile
   int playerPile = 26;
   int compPile = 26;
   
   // create a queue object for player and computer card piles
   QueueReferenceBased playerQ = new QueueReferenceBased();
   QueueReferenceBased compQ = new QueueReferenceBased();
   
   // create a ListArrayListBased object for keeping track of current-round cards
   ListArrayListBased currentRound = new ListArrayListBased();
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
   

   
   // deal the cards into each player's pile (load into queue) until the deck is empty
   while (!(WarGame.deck.isEmpty()))
   {
   
   playerQ.enqueue(WarGame.deck.dealCard());
   compQ.enqueue(WarGame.deck.dealCard());
   
   }
            
   }
   
   protected void StartRound()
   {
      
   try
   {
         
   // start round if both piles have cards remaining
   if (!playerQ.isEmpty() && !compQ.isEmpty())
   {
   
   // add top card of each pile to currentRound list and compare them
   currentRound.add(1,playerQ.dequeue());
   playerPile--;
   currentRound.add(1,compQ.dequeue());
   compPile--;
   
   // if ranks are the same, add another card from each pile to the list, then compare next
   if (((Card)currentRound.get(1)).equals((Card)currentRound.get(2)))
   {
   
   String str1 = (((Card)currentRound.get(1)).rankString());
   char str12 = (((Card)currentRound.get(1)).suitString()).charAt(0);
   String str2 = (((Card)currentRound.get(2)).rankString());
   char str22 = (((Card)currentRound.get(2)).suitString()).charAt(0);
   
   String str111 = str1+str12;
   String str112 = str2+str22;
   
   ImageIcon icon1 = new ImageIcon("cardpics//"+ str111);
   ImageIcon icon2 = new ImageIcon("cardpics//"+ str112);
   
   JLabel[] arr = {new JLabel("WAR!! Now put a card face down, and battle with the next card!", icon1, JLabel.LEFT), new JLabel(icon2)};

   
   JOptionPane.showMessageDialog(null, arr, "Who won?", JOptionPane.PLAIN_MESSAGE); 
   
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
      

      
         
         JOptionPane.showMessageDialog(null, arr, "Who won?", JOptionPane.PLAIN_MESSAGE);
         
         
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
                        JOptionPane.showMessageDialog(null, "Man, you need to shuffle these cards", "Who won?", JOptionPane.PLAIN_MESSAGE);
                        
                     else if (((Card)currentRound.get(1)).getRank() > ((Card)currentRound.get(2)).getRank())
                     {
                     
                     JOptionPane.showMessageDialog(null, NamePrompt.name+ ": "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank(), "Who won?", JOptionPane.PLAIN_MESSAGE);
                     
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
                     
                     JOptionPane.showMessageDialog(null, NamePrompt.name+ ": "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank(), "Who won?", JOptionPane.PLAIN_MESSAGE);
                     
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
            
               JOptionPane.showMessageDialog(null, NamePrompt.name+ ": "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank(), "Who won?", JOptionPane.PLAIN_MESSAGE);
            
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
            
               JOptionPane.showMessageDialog(null, NamePrompt.name+ ": "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank(), "Who won?", JOptionPane.PLAIN_MESSAGE);
            
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
      
         JOptionPane.showMessageDialog(null, NamePrompt.name+ ": "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank(), "Who won?", JOptionPane.PLAIN_MESSAGE);
      
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
      
         JOptionPane.showMessageDialog(null, NamePrompt.name+ ": "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank(), "Who won?", JOptionPane.PLAIN_MESSAGE);
      
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
   
      JOptionPane.showMessageDialog(null, NamePrompt.name+ ": "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank(), "Who won?", JOptionPane.PLAIN_MESSAGE);
   
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
   
      JOptionPane.showMessageDialog(null, NamePrompt.name+ ": "+((Card)currentRound.get(2)).getRank()+
                                       " Computer: "+((Card)currentRound.get(1)).getRank(), "Who won?", JOptionPane.PLAIN_MESSAGE);
   
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
      JOptionPane.showMessageDialog(null, "Computer Wins!", "Who won?", JOptionPane.PLAIN_MESSAGE);
      
   if (compQ.isEmpty())
      JOptionPane.showMessageDialog(null, NamePrompt.name+ " Wins!", "Who won?", JOptionPane.PLAIN_MESSAGE);
   
   }
   
   }
   
   catch (QueueException e)
   {
   
   if (playerQ.isEmpty())
      JOptionPane.showMessageDialog(null, "Computer Wins!", "Who won?", JOptionPane.PLAIN_MESSAGE);
   
   if (compQ.isEmpty())
      JOptionPane.showMessageDialog(null, NamePrompt.name+ " Wins!", "Who won?", JOptionPane.PLAIN_MESSAGE);
   
   }

   
   }
      
}