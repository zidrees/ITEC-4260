package project1;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

public class myStonks {
    HashMap<String, Integer> portfolio = new HashMap<>();

    public myStonks() {

    }

    public BigDecimal getStockPrice(String stockName) throws Exception {
        Stock stonk;
        stonk = YahooFinance.get(stockName);
        return stonk.getQuote().getPrice();
    }

    public void addStocksPortfolio(Stock stock, int quantity) {
        portfolio.put(stock.getName(), quantity);
    }

    public void removeStocksPortfolio(String stockName) throws IOException {
        portfolio.remove(YahooFinance.get(stockName));
    }

    public BigDecimal getValuePortfolio() throws Exception {
        BigDecimal total = BigDecimal.valueOf(0);
        ArrayList<String> listStocks = new ArrayList<>(portfolio.keySet());
        for (int i = 0; i < portfolio.size(); i++) {

            BigDecimal currentPrice = YahooFinance.get(listStocks.get(i)).getQuote().getPrice();
            total.add(currentPrice.multiply(BigDecimal.valueOf(portfolio.get(i))));

        }
        return total;
    }


}
