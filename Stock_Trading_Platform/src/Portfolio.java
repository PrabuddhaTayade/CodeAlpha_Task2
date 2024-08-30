
import java.util.HashMap;
	import java.util.Map;

public class Portfolio {
	    private Map<String, Integer> holdings = new HashMap<>();

	    public void buyStock(Stock stock, int quantity) {
	        holdings.put(stock.getSymbol(), holdings.getOrDefault(stock.getSymbol(), 0) + quantity);
	    }

	    public void sellStock(Stock stock, int quantity) {
	        if (holdings.containsKey(stock.getSymbol()) && holdings.get(stock.getSymbol()) >= quantity) {
	            holdings.put(stock.getSymbol(), holdings.get(stock.getSymbol()) - quantity);
	            if (holdings.get(stock.getSymbol()) == 0) {
	                holdings.remove(stock.getSymbol());
	            }
	        } else {
	            System.out.println("Not enough stock to sell.");
	        }
	    }

	    public void displayPortfolio(Market market) {
	        System.out.println("Portfolio:");
	        for (Map.Entry<String, Integer> entry : holdings.entrySet()) {
	            String symbol = entry.getKey();
	            int quantity = entry.getValue();
	            Stock stock = market.getStock(symbol);
	            double value = quantity * stock.getPrice();
	            System.out.println(symbol + ": " + quantity + " shares, Value: " + value);
	        }
	    }
	}

