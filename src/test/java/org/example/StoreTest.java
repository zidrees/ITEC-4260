package org.example;

import Assignment3.Store;
import org.junit.Assert;
import org.junit.Test;


public class StoreTest {

    @Test
    public void testLoadInventory() {
        Store gamestop = new Store();
        gamestop.loadInventoryFromWeb("pastebin.com/raw/UnZQxLJL");
        Assert.assertEquals(6, gamestop.getInventory().getSize());
    }

    @Test
    public void testfindCheapestGame() {
        Store gamestop = new Store();
        gamestop.loadInventoryFromWeb("pastebin.com/raw/UnZQxLJL");
        Assert.assertEquals("Pokemon Crystal", gamestop.getInventory().findCheapestGame());
    }

    @Test
    public void testfindMostExpensiveGame() {
        Store gamestop = new Store();
        gamestop.loadInventoryFromWeb("pastebin.com/raw/UnZQxLJL");
        Assert.assertEquals("Cyberpunk 2077", gamestop.getInventory().findMostExpensiveGame());
    }

    public void testFinaAverage() {
        Store gamestop = new Store();
        gamestop.loadInventoryFromWeb("pastebin.com/raw/UnZQxLJL");
        Assert.assertEquals(319.97, gamestop.getInventory().findAveragePriceOfGames());

    }


}
