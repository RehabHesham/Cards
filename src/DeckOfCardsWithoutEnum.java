public class DeckOfCardsWithoutEnum {
    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;

    private PlayingCardWithoutEnum[] cards;

    public DeckOfCardsWithoutEnum() {
        cards = new PlayingCardWithoutEnum[numCards];
        int i = 0;
        for (String suit : PlayingCardWithoutEnum.Suits) {
            for (String rank : PlayingCardWithoutEnum.Ranks) {
                cards[i++] = new PlayingCardWithoutEnum(rank, suit);
            }
        }
    }

    public PlayingCardWithoutEnum getCard(int rank, int suit) {
        switch (suit){
            case 1: suit = 1; break;
            case 2: suit = 14; break;
            case 3: suit = 27; break;
            case 4: suit = 40; break;
        }
        return cards[(suit-1) + (rank-1)];
    }

    public PlayingCardWithoutEnum getCard(String rank, String suit) {
        int rankNum = PlayingCardWithoutEnum.rankToInt(rank);
        int suitNum = PlayingCardWithoutEnum.suitToInt(suit);
        if(rankNum == 0 || suitNum == 0)
            return null;
        return cards[(suitNum-1) + (rankNum-1)];
    }
    public String ShowDeck(){
        String fullDeck = "";
        for (PlayingCardWithoutEnum card : cards){
            fullDeck += card.toString() + "\n";
        }
        return fullDeck;
    }
}
