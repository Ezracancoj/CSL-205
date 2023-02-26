import java.util.Arrays;


public class DeckOfCards {
	

	public static void main(String[] args) {
		Deck cardDeck = new Deck();
		
		
		int firstArg = 0;
		try {
			firstArg = Integer.parseInt(args[0]);
		}catch(NumberFormatException e){
			System.out.println("Enter a number");
			System.exit(DeckConstants.BADINT);//?
		}catch(ArrayIndexOutOfBoundsException w) {
			System.out.println("Enter an argument");
			System.exit(DeckConstants.BADNUMBEROFARGUMENTS);//?
		}
		Card player1[]= null;
		Card player2[]= null;
		Card player3[]= null;
		Card player4[]= null;
		 try {
			 
			 player1 = Deck.deal(firstArg);
			 //System.out.println(Arrays.toString(player1));
			 player2 = Deck.deal(5);
			 player3 = Deck.deal(5);
			 player4 = Deck.deal(5);
			 
			 } catch(DeckException exception) {
			 System.err.println("Cannot deal " + exception);
			 exception.printStackTrace();
			} 
		 
		 Rank rank;
		 int valFor1= 0;
		 for(Card i : player1) {
			 rank = i.getRank();
			 valFor1 = valFor1 + rank.ordinal();
		 }
		 
		 int valFor2= 0;
		 for(Card i : player2) {
			 rank = i.getRank();
			 valFor2 = valFor2 + rank.ordinal();
		 }
		 
		 int valFor3 =0;
		 for(Card i : player3) {
			 rank = i.getRank();
			 valFor3 = valFor3 + rank.ordinal();
		 }
		 
		 int valFor4 = 0;
		 for(Card i : player4) {
			 rank = i.getRank();
			 valFor4 = valFor4 + rank.ordinal();
		 }
		 if(valFor4 < valFor3 && valFor4 < valFor2 && valFor4 < valFor1) {
			 System.out.println("Player4 has the lowest value hand");
		 }
		 if(valFor3 < valFor4 && valFor3 < valFor2 && valFor3 < valFor4) {
			 System.out.println("Player3 has the lowest value hand");
		 }
		 if(valFor1 > valFor2 && valFor2 < valFor3 && valFor2 < valFor4) {
			 System.out.println("Player2 has the lowest value hand");
		 }
		 if(valFor1 < valFor2 && valFor1 < valFor3 && valFor1 < valFor4) {
			 System.out.println("Player1 has the lowest value hand");
		 }
		 //System.out.println("--------------------------------");
		 //System.out.println(Arrays.toString(cardDeck.allPlayers(player1,player2,player3,player4)));
		 System.out.println("--------------------------------");
		 System.out.println(Arrays.toString(cardDeck.cardSet(player1, 3)));
		 System.out.println("--------------------------------");
		 System.out.println("player 1 hand: " + Arrays.toString(player1) + "---end of player hand---");
		 Card aCard = new Card(Rank.ACE,Suit.CLUB);
		 System.out.println(cardDeck.search(player1, aCard));
		 
		//Deck cardDeck = new Deck();
		
		
		/*
		Deck cardDeck = new Deck();
		System.out.println(cardDeck);
		System.out.println("---------------------------");
		System.out.println(cardDeck.draw());
		System.out.println(Arrays.toString(cardDeck.cardsMissing()));
		System.out.println("---------------------------");
		System.out.println(cardDeck.draw());
		System.out.println(Arrays.toString(cardDeck.cardsMissing()));
	*/
	}
}