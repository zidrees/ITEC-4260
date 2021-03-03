package assignment1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        ArrayList<Game> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        String line;
        LocalDate ReleaseDate;
        List<String> instanceList = null;
        BigDecimal RetailPrice;
        String condition = "";

        while (condition.equalsIgnoreCase("yes")) {
            Game game = new Game();
            line = scanner.next();
            instanceList.add(line);
            instanceList.clear();
            game.setPlatform(instanceList);
            line = scanner.next();
            game.setName(line);
            for (int j = 0; j < 2; j++) {
                int year = scanner.nextInt();
                int month = scanner.nextInt();
                int day = scanner.nextInt();
                game.setReleaseDate(LocalDate.of(year, month, day));
            }
            line = scanner.next();
            game.setDeveloper(line);
            line = scanner.next();
            instanceList.add(line);
            game.setGenre(instanceList);
            RetailPrice = scanner.nextBigDecimal();
            game.getRetailPrice(RetailPrice);
            line = scanner.next();
            game.setRating(line);
            int score = scanner.nextInt();
            game.setScore(score);
            instanceList.clear();
            list.add(game);
            System.out.println("Are you done?");
            condition = scanner.next();
        }
        for (Game game : list) {
            game.printGame();
        }

    }
}
