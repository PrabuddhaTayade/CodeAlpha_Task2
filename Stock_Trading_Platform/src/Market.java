
	import java.util.HashMap;
	import java.util.Map;
public class Market {

	    private Map<String, Stock> stocks = new HashMap<>();

	    public void addStock(Stock stock) {
	        stocks.put(stock.getSymbol(), stock);
	    }

	    public Stock getStock(String symbol) {
	        return stocks.get(symbol);
	    }

	    public void updateStockPrice(String symbol, double newPrice) {
	        Stock stock = stocks.get(symbol);
	        if (stock != null) {
	            stock.setPrice(newPrice);
	        }
	    }

	    public void displayMarketData() {
	        for (Stock stock : stocks.values()) {
	            System.out.println(stock.getSymbol() + " " + stock.getName() + ": " + stock.getPrice());
	        }
	    }
	}
