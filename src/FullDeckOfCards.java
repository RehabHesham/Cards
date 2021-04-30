public class FullDeckOfCards {
    private final static PlayingCard[] cards = new PlayingCard[52];
    public FullDeckOfCards(){
        int i=0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new PlayingCard(rank, suit);
            }
        }
    }
    public String ShowDeck(){
        String fullDeck = "";
        for (PlayingCard card : FullDeckOfCards.cards){
            fullDeck += card.toString() + "\n";
        }
        return fullDeck;
    }
}
