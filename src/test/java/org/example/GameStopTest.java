package org.example;

import org.junit.Test;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class GameStopTest {
    @Test
    public void printGameStopStock() throws Exception {
        Stock stock;
        stock = YahooFinance.get("GME");
        System.out.println(stock.getQuote().getPrice());
    }
}
