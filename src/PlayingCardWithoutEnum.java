import java.util.Arrays;

public class PlayingCardWithoutEnum {
    private final String rank;
    private final String suit;

    //available suits
    public final static String[] Suits =  {"DIAMONDS" , "CLUBS" ,"HEARTS" ,"SPADES" };

    // available ranks
    public final static String[] Ranks = {"ACE" ,"TWO" , "THREE" , "FOUR"  ,"FIVE" ,
            "SIX"  ,"SEVEN" ,"EIGHT" , "NINE" , "TEN" , "JACK" , "QUEEN","KING" };

    public PlayingCardWithoutEnum(String rank, String suit) {
        assert isValidRank(rank);
        assert isValidSuit(suit);
        this.rank = rank;
        this.suit = suit;
    }

    public PlayingCardWithoutEnum(int rank, int suit) {
        String currRank = rankToString(rank);
        String currSuit = suitToString(suit);
        assert isValidRank(currRank) ;
        assert isValidSuit(currSuit);
        this.rank = currRank ;
        this.suit = currSuit;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public static boolean isValidRank(String rank) {
        for(String currRank : Ranks){
            if (currRank.compareToIgnoreCase(rank) == 0)
                return true;
        }
        return false;
    }

    public static boolean isValidSuit(String suit) {
        for(String currSuit : Suits){
            if (currSuit.compareToIgnoreCase(suit) == 0)
                return true;
        }
        return false;
    }

    public static String rankToString(int rank) {
        switch (rank) {
            case 1:
                return "ACE";
            case 2:
                return "TWO";
            case 3:
                return "THREE";
            case 4:
                return "FOUR";
            case 5:
                return "FIVE";
            case 6:
                return "SIX";
            case 7:
                return "SEVEN";
            case 8:
                return "EIGHT";
            case 9:
                return "NINE";
            case 10:
                return "TEN";
            case 11:
                return "JACK";
            case 12:
                return "QUEEN";
            case 13:
                return "KING";
            default:
                return null;
        }
    }

    public static String suitToString(int suit) {
        switch (suit) {
            case 1:
                return "DIAMONDS";
            case 2:
                return "CLUBS";
            case 3:
                return "HEARTS";
            case 4:
                return "SPADES";
            default:
                return null;
        }
    }

    public static int rankToInt(String rank) {
        switch (rank) {
            case "ACE":
                return 1;
            case "TOW":
                return 2;
            case "THREE":
                return 3;
            case "FOUR":
                return 4;
            case "FIVE":
                return 5;
            case "SIX":
                return 6;
            case "SEVEN":
                return 7;
            case "EIGHT":
                return 8;
            case "NINE":
                return 9;
            case "TEN":
                return 10;
            case "JACK":
                return 11;
            case "QUEEN":
                return 12;
            case "KING":
                return 13;
            default:
                return 0;
        }
    }

    public static int suitToInt(String suit) {
        switch (suit) {
            case "DIAMONDS":
                return 1;
            case "CLUBS":
                return 14;
            case "HEARTS":
                return 27;
            case "SPADES":
                return 40;
            default:
                return 0;
        }
    }


}
