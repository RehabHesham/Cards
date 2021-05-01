public class MainClass {
    public static void main(String [] args){
        System.out.println("Deck with Enum Types: ");
        FullDeckOfCards deck1 = new FullDeckOfCards();
        System.out.println(deck1.ShowDeck());

        System.out.println("Deck without Enum Types: ");
        DeckOfCardsWithoutEnum deck2 = new DeckOfCardsWithoutEnum();
        System.out.println(deck2.ShowDeck());

        System.out.println("the Card FOUR of DIAMONDS:");
        System.out.println(deck2.getCard("FOUR","DIAMONDS"));
        System.out.println("the Card FOUR of CLUBS:");
        System.out.println(deck2.getCard(4,2));
    }
}
