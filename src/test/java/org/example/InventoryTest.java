package org.example;

import Assignment2.Inventory;
import assignment1.Game;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InventoryTest {
    @Test
    public void testEmptyInventory() {
        Inventory inv = new Inventory();
        Assert.assertEquals(0, inv.getSize());

    }

    @Test
    public void testAddInventory() {
        Inventory inv = new Inventory();
        Game game = new Game(RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphabetic(10), LocalDate.of(RandomUtils.nextInt(), RandomUtils.nextInt(), RandomUtils.nextInt()), RandomStringUtils.randomAlphabetic(12), RandomStringUtils.randomAlphabetic(5), BigDecimal.valueOf(RandomUtils.nextDouble()), RandomStringUtils.randomNumeric(10), RandomUtils.nextInt());
        inv.addGame(game);
        Assert.assertEquals(1, inv.getSize());

    }

    @Test
    public void testRemoveInventory() {
        Inventory inv = new Inventory();
        Game game = new Game(RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphabetic(10), LocalDate.of(RandomUtils.nextInt(), RandomUtils.nextInt(), RandomUtils.nextInt()), RandomStringUtils.randomAlphabetic(12), RandomStringUtils.randomAlphabetic(5), BigDecimal.valueOf(RandomUtils.nextDouble()), RandomStringUtils.randomNumeric(10), RandomUtils.nextInt());
        inv.addGame(game);
        inv.removeGame(game);
        Assert.assertEquals(0, inv.getSize());

    }

    @Test
    public void testHighRating() {
        Inventory inv = new Inventory();
        Game game = new Game(RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphabetic(10), LocalDate.of(RandomUtils.nextInt(), RandomUtils.nextInt(), RandomUtils.nextInt()), RandomStringUtils.randomAlphabetic(12), RandomStringUtils.randomAlphabetic(5), BigDecimal.valueOf(RandomUtils.nextDouble()), RandomStringUtils.randomNumeric(10), 1);
        Game game1 = new Game(RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphabetic(10), LocalDate.of(RandomUtils.nextInt(), RandomUtils.nextInt(), RandomUtils.nextInt()), RandomStringUtils.randomAlphabetic(12), RandomStringUtils.randomAlphabetic(5), BigDecimal.valueOf(RandomUtils.nextDouble()), RandomStringUtils.randomNumeric(10), 2);
        inv.addGame(game);
        inv.addGame(game1);
        Assert.assertEquals(game1.getName(), inv.findMostHighlyRatedGame());
    }

    @Test
    public void testAveragePrice() {
        Inventory inv = new Inventory();
        Game game = new Game(RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphabetic(10), LocalDate.of(RandomUtils.nextInt(), RandomUtils.nextInt(), RandomUtils.nextInt()), RandomStringUtils.randomAlphabetic(12), RandomStringUtils.randomAlphabetic(5), BigDecimal.valueOf(RandomUtils.nextDouble()), RandomStringUtils.randomNumeric(10), RandomUtils.nextInt());
        Game game1 = new Game(RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphabetic(10), LocalDate.of(RandomUtils.nextInt(), RandomUtils.nextInt(), RandomUtils.nextInt()), RandomStringUtils.randomAlphabetic(12), RandomStringUtils.randomAlphabetic(5), BigDecimal.valueOf(RandomUtils.nextDouble()), RandomStringUtils.randomNumeric(10), RandomUtils.nextInt());
        inv.addGame(game);
        inv.addGame(game1);
        Assert.assertEquals(game.getRetailPrice().add(game1.getRetailPrice().divide(BigDecimal.valueOf(2))), inv.findAveragePriceOfGames());

    }
}
