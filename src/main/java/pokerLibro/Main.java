package pokerLibro;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	private static void insert(Set<Card> cards, Card card) {
		if (!cards.contains(card)) {
			LOGGER.debug("insertamos la carta: {}", card);
			cards.add(card);
		} else {
			LOGGER.debug("la carta: {} ya estaba en el conjunto", card);
		}
	}

	public static void main(String[] args) {
		Set<Card> cards = new HashSet<>();
		Card[] cards2Insert = { 
				new Card(Card.Suit.CLUB, Card.Rank.ACE), 
				new Card(Card.Suit.CLUB, Card.Rank.TWO),
				new Card(Card.Suit.CLUB, Card.Rank.TRHEE), 
				new Card(Card.Suit.CLUB, Card.Rank.ACE), 
				new Card(Card.Suit.CLUB, null)
				};
		
		for (Card card : cards2Insert) {
			insert(cards, card);
		}

	}

}
