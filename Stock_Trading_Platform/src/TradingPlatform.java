
import java.util.Scanner;
public class TradingPlatform {


	    private Market market;
	    private User user;

	    public TradingPlatform(Market market, User user) {
	        this.market = market;
	        this.user = user;
	    }

	    public void start() {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("1. View Market Data");
	            System.out.println("2. Buy Stock");
	            System.out.println("3. Sell Stock");
	            System.out.println("4. View Portfolio");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    market.displayMarketData();
	                    break;
	                case 2:
	                    buyStock(scanner);
	                    break;
	                case 3:
	                    sellStock(scanner);
	                    break;
	                case 4:
	                    user.getPortfolio().displayPortfolio(market);
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }

	    private void buyStock(Scanner scanner) {
	        System.out.print("Enter stock symbol: ");
	        String symbol = scanner.next();
	        Stock stock = market.getStock(symbol);
	        if (stock != null) {
	            System.out.print("Enter quantity: ");
	            int quantity = scanner.nextInt();
	            user.getPortfolio().buyStock(stock, quantity);
	            System.out.println("Bought " + quantity + " shares of " + symbol);
	        } else {
	            System.out.println("Stock not found.");
	        }
	    }

	    private void sellStock(Scanner scanner) {
	        System.out.print("Enter stock symbol: ");
	        String symbol = scanner.next();
	        Stock stock = market.getStock(symbol);
	        if (stock != null) {
	            System.out.print("Enter quantity: ");
	            int quantity = scanner.nextInt();
	            user.getPortfolio().sellStock(stock, quantity);
	            System.out.println("Sold " + quantity + " shares of " + symbol);
	        } else {
	            System.out.println("Stock not found.");
	        }
	    }
	}

