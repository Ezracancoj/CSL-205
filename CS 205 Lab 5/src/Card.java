
public class Card {
	private Rank rank;
	private Suit suit;
	public int MAXRANK = 13;
	public int MINRANK = 1;
	public int MAXSUIT = 4;
	public int MINSUIT = 1;
	
	public Card(Rank j, Suit i){
		setRank(j);
		setSuit(i);
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public void setSuit(Suit i) {
		this.suit = i;
		
	}
	
	public void setRank(Rank j) {
		this.rank = j;
		
	}

	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}
	
	

}
