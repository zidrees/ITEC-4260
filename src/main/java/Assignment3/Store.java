package Assignment3;

import Assignment2.Inventory;
import assignment1.Game;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Store {


    private Inventory inventory;

    /**
     * Create a store with empty inventory
     */
    public Store() {
        inventory = new Inventory();
    }

    /**
     * Given a line that describes a game, for example in this way,
     * <pre>platform, name, date, publisher, genre, price, rating, score</pre>
     * create a game object based on the values and return it
     *
     * <strong> multiple values are separated using a semi-colon </strong>
     *
     * @param line comma separated values that describe a game
     * @return a game object
     */
    public static Game getGameFromLine(String line) {
        // a line is expected to be in this arbitrary format :-(
        // TODO - used XML or JSON
        // platform, name, date, publisher, genre, price, rating, score
        String[] words = line.split(",");
        List<String> platform = Arrays.asList(words[0].split(";"));
        String name = words[1];
        String[] temp = words[2].split("/");
        LocalDate date = LocalDate.of(Integer.parseInt(temp[2]),
                Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        String publisher = words[3];
        List<String> genres = Arrays.asList(words[4].split(";"));
        BigDecimal price = new BigDecimal(StringUtils.trim(words[5]));
        String rating = words[6];
        int score = Integer.parseInt(StringUtils.trim(words[7]));
        Game game = new Game(platform, name, date, publisher, genres, price, rating, score);
        return game;
    }

    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Load inventory using a csv file, the csv file is located at an URL
     *
     * @param url csv file of inventory data
     */
    public void loadInventoryFromWeb(String url) {
        try {
            URL u = new URL(url);
            String str = IOUtils.toString(u.openStream(), "UTF-8");
            String[] lines = str.split("\n");
            for (int i = 0; i < lines.length; i++) {
                inventory.addGame(getGameFromLine(lines[i]));
            }
        } catch (IOException e) {
            throw new RuntimeException("could not get csv file");
        }
    }
}
