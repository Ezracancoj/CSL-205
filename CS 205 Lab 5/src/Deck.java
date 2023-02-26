import java.util.Arrays;
import java.util.Random;

public class Deck {
	private static Card[] missingCards = new Card [DeckConstants.MAXCARDSINDECK];
	private static int missingCardsNum = 0;
	
	private static Card[] cards = new Card [DeckConstants.MAXCARDSINDECK];
	
	public Deck() {
		/* int k = 0;
		for(int i =DeckConstants.MINSUIT; i <= DeckConstants.MAXSUIT; ++i) {
			for(int j =DeckConstants.MINRANK; j <= DeckConstants.MAXRANK; ++j) {
				cards[k] = new Card(j,i);
				System.out.println("cards[" + k + " = " + cards[k]);
				k++;
				}
			}
				*/
		int k =0;
		for (Suit j : Suit.values()) {
			for(Rank i : Rank.values()) {
				cards[k] = new Card(i,j);
				//System.out.println("cards[" + k + " = " + cards[k]);
				k++;
			}
		}
	
	}
	
	public void shuffle() {
		Random rand = new Random();
		for (int i = 0; i<cards.length; i++) {
			int randomInt = rand.nextInt(cards.length);
			Card temp = cards[randomInt];
			cards[randomInt] = cards[i];
			cards[i] = temp;
		}
	}
	public static Card draw() throws DeckException{
		
		int numOfCards = cardsLeft();
		if(numOfCards < 1) {
			throw new DeckException("No cards left");
		}
	
		Random rand = new Random();
		int upperbound = cardsLeft();
		
		
	    int randomInt = rand.nextInt(upperbound);
	    Card returnCard= cards[randomInt];
	    Card[] cardsCopy = new Card[cards.length-1 ];
	    
	    for(int i =0; i <cards.length-1;  ++i) {
	    	if(cards[randomInt] != null) {
	    		cardsCopy[i] = cards[i];
	    		
	    	}
	    }
	
	    missingCards[missingCardsNum] = returnCard;
	    missingCardsNum++;
	    cards = cardsCopy;
	    return returnCard;
		
	  
	}
	
	public static Card[] cardsMissing() {
		
		return  missingCards;
		
	    }
	    
	public static int cardsLeft() {
		int numOfCards = 0;
		for(int i =0; i <cards.length-1;  ++i) {
					numOfCards += 1;
		}
		//System.out.println(numOfCards);
		return numOfCards;
	}
	
	public static Card [] deal(int cardsToDeal) throws DeckException{
		Card [] cardsInHand = new Card[cardsToDeal];
		for(int i =0; i < cardsToDeal; i++) {
			if(cardsLeft()>=1) {
				cardsInHand[i] = draw();
				System.out.println(cardsInHand[i]);
			}else {
				cardsToDeal = i;
				System.out.println("No more cards to draw.");
				break;
				
			}
			
		}
		return cardsInHand;
	}
	public Card[] cardSet(Card[] hand, int num){
		Rank rank;
		Card[] cardSet = null;
		int ArrayLeng= 0;
		if(num > 0 && num < 13) {
			ArrayLeng = hand.length;
			cardSet = new Card[ArrayLeng];
			int count = 0;
			for(Card i : hand){
				rank = i.getRank();
				if(rank.ordinal() >= num){
					//Card newCard = new Card();
					cardSet[count] = i;
				}
				count++;
			}
		
			
	
		}
		return cardSet;
		
	}
	
	public Card[] allPlayers(Card[] hand1, Card[] hand2,Card[] hand3, Card[] hand4) {
		int ArrayLength = hand1.length+hand2.length+hand3.length+hand4.length;
		Card[] allHands = new Card[ArrayLength];
		int num =0;
	      for (int i = 0; i < hand1.length; i++) {
	         allHands[num] = hand1[i];
	         num++;
	      }
	      for (int i = 0; i < hand2.length; i++) {
	    	  num++;
		         allHands[i] = hand2[i];
		      }
	      for (int i = 0; i < hand3.length; i++) {
	    	  num++;
		         allHands[num] = hand3[i];
		      }
	      num++;
	      for (int i = 0; i < hand1.length; i++) {
		         allHands[num] = hand4[i];
		         num++;
		      }
		return allHands;
		
	}
	
	public Card search(Card[] hand, Card searchCard) {
		System.out.println("Card to search for: " + searchCard);
		Card cardFound = null;
		for(Card i : hand) {
			if(i.equals(cardFound)) {
				cardFound = i;
				System.out.println("card found");
			}else { 
				System.out.println("card not found");
			}
			
		}
		return cardFound;
		
	}

	@Override
	public String toString() {
		return Arrays.toString(cards);
		/*
		StringBuilder returnValue = new StringBuilder();
		for(int i =0; i <cards.length-1;  ++i) {
			returnValue.append("Suit: " + cards[i].getSuit() + " Rank: " + cards[i].getRank());
		}
		return returnValue.toString();
		*/
	}
}
