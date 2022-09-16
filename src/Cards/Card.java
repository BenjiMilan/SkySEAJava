package Cards;

public class Card {

    private rankEnum rank;
    private suitEnum suit;

    public Card(rankEnum rank, suitEnum suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public suitEnum getSuit() {
        return suit;
    }

    public rankEnum getRank() {
        return rank;
    }

    public void setRank(rankEnum rank) {
        this.rank = rank;
    }

    public void setSuit(suitEnum suit) {
        this.suit = suit;
    }

    public static void main(String[] args) {
        Card card = new Card(rankEnum.ACE, suitEnum.SPADES);
        System.out.println(card.getRank().toString() + " " + card.getSuit().toString());
    }
}
