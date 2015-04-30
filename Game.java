import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
Jack Steffens
CS 110
Game Class

This class is the superclass of all games
it shuffles a new deck of cards and asks
for the player's name
*/

public class Game extends JFrame
{

   protected static Deck1 deck;
   /**
   This is the default constructor for all games that creates
   a deck and shuffles cards
   */
   public Game()
   {
   
      // create deck of cards
      deck = new Deck1();

      // shuffle deck
      deck.shuffle();
   
   }
   
   /**
   main method
   */
   
   public static void main(String[] args)
   {
   
   new Game();
   
   }

}