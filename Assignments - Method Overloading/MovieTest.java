
class Movie {
    String title;
    String director;

    Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public void play() {
        System.out.println("Playing a generic movie.");
    }
}


class RomComMovie extends Movie {

    RomComMovie(String title, String director) {
        super(title, director);
    }

    @Override
    public void play() {
        System.out.println("Playing Rom-Com Movie: " + title + " directed by " + director);
    }
}


class ThrillerMovie extends Movie {

    ThrillerMovie(String title, String director) {
        super(title, director);
    }

    @Override
    public void play() {
        System.out.println("Playing Thriller Movie: " + title + " directed by " + director);
    }
}


public class MovieTest {
    public static void main(String[] args) {
        Movie m1 = new RomComMovie("Crazy Love", "Nora Smith");
        Movie m2 = new ThrillerMovie("Dark Secrets", "John Wick");

        m1.play(); // runtime polymorphism
        m2.play();
    }
}
