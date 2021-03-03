package Assignment2;

import assignment1.Game;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * This class keeps track of an inventory of Games
 * Designed to maintain a list of games and list interesting properties of games
 */
public class Inventory {
    ArrayList<Game> gameInventory = new ArrayList();

    public Inventory() {
    }

    /**
     * Gets the size of the inventory
     *
     * @return Inventory size method
     */
    public int getSize() {
        return gameInventory.size();
    }

    /**
     * Add a {@code Game } object to the inventory
     *
     * @param game a non-null game to the inventory
     */
    public void addGame(Game game) {
        gameInventory.add(game);
    }

    /**
     * Remove a {@code Game } object to the inventory but only the </b>first<b></b> instance
     *
     * @param game non-null game from the inventory
     */
    public void removeGame(Game game) {
        gameInventory.remove(game);
    }

    public String findCheapestGame() {
        BigDecimal min = BigDecimal.valueOf(1000000000.00);
        Game cheapestGame = new Game();
        for (Game game : gameInventory) {
            if (min.compareTo(game.getRetailPrice()) > 0) {
                min = game.getRetailPrice();
                cheapestGame = game;
            }
        }
        return cheapestGame.getName();
    }

    public String findMostExpensiveGame() {
        BigDecimal max = BigDecimal.valueOf(-1000000000.00);
        Game cheapestGame = new Game();
        for (Game game : gameInventory) {
            if (max.compareTo(game.getRetailPrice()) < 0) {
                max = game.getRetailPrice();
                cheapestGame = game;
            }
        }
        return cheapestGame.getName();

    }

    /**
     * Finds {@code Game } highest rated object to the inventory
     *
     * @return returns highest rated game
     */
    public String findMostHighlyRatedGame() {
        int score = 0;
        String name = "";
        for (Game game : gameInventory) {
            if (score < game.getScore()) {
                score = game.getScore();
                name = game.getName();
            }
        }
        return name;

    }

    /**
     * Finds {@code Game } average price of all objects to the inventory
     *
     * @return returns average price of games in inventory
     */
    public BigDecimal findAveragePriceOfGames() {
        BigDecimal average = BigDecimal.valueOf(0.00);
        for (int i = 0; i < gameInventory.size(); i++) {
            average.add(gameInventory.get(i).getRetailPrice());
        }
        average.divide(BigDecimal.valueOf(gameInventory.size()));
        return average;

    }

    public ArrayList<Game> getGameInventory() {
        return gameInventory;
    }
}
