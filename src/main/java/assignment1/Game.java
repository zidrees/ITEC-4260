package assignment1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Game {


    String Name;
    LocalDate ReleaseDate;
    String Developer;
    int score;
    List<String> platform;
    List<String> Genre;
    BigDecimal RetailPrice;
    String Rating;

    public Game() {
    }

    public Game(List<String> platform, String name, LocalDate releaseDate, String developer, List<String> genre, BigDecimal retailPrice, String rating, int score) {
        this.platform = platform;
        this.Name = name;
        this.ReleaseDate = releaseDate;
        this.Developer = developer;
        this.Genre = genre;
        this.RetailPrice = retailPrice;
        this.Rating = rating;
        this.score = score;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getDeveloper() {
        return Developer;
    }

    public void setDeveloper(String developer) {
        Developer = developer;
    }

    public BigDecimal getRetailPrice(BigDecimal retailPrice) {
        return RetailPrice;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public BigDecimal getRetailPrice() {
        return RetailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        RetailPrice = retailPrice;
    }

    public List<String> getPlatform() {
        return platform;
    }

    public void setPlatform(List<String> platform) {
        this.platform = platform;
    }

    public List<String> getGenre() {
        return Genre;
    }

    public void setGenre(List<String> genre) {
        Genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return score == game.score &&
                platform.equals(game.platform) &&
                Name.equals(game.Name) &&
                ReleaseDate.equals(game.ReleaseDate) &&
                Developer.equals(game.Developer) &&
                Genre.equals(game.Genre) &&
                RetailPrice.equals(game.RetailPrice) &&
                Rating.equals(game.Rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platform, Name, ReleaseDate, Developer, score, Genre, RetailPrice, Rating);
    }

    public void printGame() {
        System.out.println(platform);
        System.out.println(Name);
        System.out.println(ReleaseDate);
        System.out.println(Developer);
        System.out.println(Genre);
        System.out.println(RetailPrice);
        System.out.println(Rating);
        System.out.println(score);
    }

}
