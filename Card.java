/**
Jack Steffens
CS 110
Homework 5-3
Playing Card Game
*/


public class Card
{

public static final int SPADES = 1;
public static final int HEARTS = 2;
public static final int DIAMONDS = 3;
public static final int CLUBS = 4;
public static final int ACE = 1;
public static final int JACK = 11;
public static final int QUEEN = 12;
public static final int KING = 13;
private int suit;
private int rank;

   /** This is a constructer with suit and rank parameters
       @param suit the suit of a card
       @param rank the rank of a card*/
       
   public Card(int rank, int suit)
   {
   
   this.suit = suit;
   this.rank = rank;
   
   
   }
   
   /** This method will get the suit of the card
       @return suit integer referencing suit */
   
   public int getSuit()
   {
   
   return suit;
   
   }
   
   /** This method will return the rank of the card
       @return rank the rank of the card in integer form*/
   
   public int getRank()
   {
   
   return rank;
   
   }
   
   /**
   this method converts rank to string value
   @return rank as a string
   */
   public String rankString()
   {
   
   if (rank==ACE)
      return "Ace";
   if (rank==2)
      return "2";
   if (rank==3)
      return "3";
   if (rank==4)
      return "4";
   if (rank==5)
      return "5";
   if (rank==6)
      return "6";
   if (rank==7)
      return "7";
   if (rank==8)
      return "8";
   if (rank==9)
      return "9";
   if (rank==10)
      return "10";
   if (rank==JACK)
      return "Jack";
   if (rank==QUEEN)
      return "Queen";
   else
      return "King";
   
   }
   
   /**
   this method converts suit to string value
   @return suit as string
   */
   public String suitString()
   {
   
   if (suit==SPADES)
      return "Spades";
   if (suit==HEARTS)
      return "Hearts";
   if (suit==DIAMONDS)
      return "Diamonds";
   else
      return "Clubs";
   
   }
   
   /**This method displays the rank and suit
      @return str string displaying rank and suit */
   
   public String toString()
   {
      
   String str = "Rank: " + rankString() + " Suit: " + suitString();
      
   return str;
 
   
   }
   
   /**
   This method determines whether two card objects are equal
   @param otherCard card object to compare to
   @return boolean status for whether two cards are equal
   */
   
   public boolean equals(Card otherCard)
   {
   
   //declare boolean variable
   boolean status;
   if (this.rank == otherCard.rank)
      status = true;
   else
      status = false;
      
   return status;
   
   
   }

}