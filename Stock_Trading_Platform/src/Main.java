
public class Main {
	    public static void main(String[] args) {
	        Market market = new Market();
	        market.addStock(new Stock("AAPL", "Apple Inc.", 150.00));
	        market.addStock(new Stock("GOOGL", "Alphabet Inc.", 2800.00));
	        market.addStock(new Stock("AMZN", "Amazon.com Inc.", 3400.00));

	        User user = new User("John Doe");
	        TradingPlatform platform = new TradingPlatform(market, user);
	        platform.start();
	    }
	}

