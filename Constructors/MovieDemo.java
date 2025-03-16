//package com.vignesh.zohotask;

import java.util.*;

public class MovieDemo {

    public static void main(String[] args) {
        Movie twelfthFail = new Movie(1, "12th Fail", "Drama", "Vidhu Vinod Chopra", "2023-10-27", "147", 8, "Hindi",
                "Vikrant Massey, Medha Shankar, Anant V Joshi", "A struggling student");
        
        Movie interstellar = new Movie(2, "Interstellar", "Sci-Fi", "Christopher Nolan", "2014-11-07", "169", 9, "English",
                "Matthew McConaughey, Anne Hathaway, Jessica Chastain", "A space journey through wormholes to save humanity");

        Movie pursuitOfHappyness = new Movie(3, "The Pursuit of Happyness", "Biography, Drama", "Gabriele Muccino", "2006-12-15", "117", 9, "English",
                "Will Smith, Jaden Smith, Thandie Newton", "A struggling salesman fights for a better life for his son");

        Movie forrestGump = new Movie(4, "Forrest Gump", "Drama, Romance", "Robert Zemeckis", "1994-07-06", "142", 9, "English",
                "Tom Hanks, Robin Wright, Gary Sinise", "A simple man influences history with kindness");

        Movie shawshankRedemption = new Movie(5, "The Shawshank Redemption", "Drama", "Frank Darabont", "1994-09-22", "142", 9, "English",
                "Tim Robbins, Morgan Freeman, Bob Gunton", "A banker sentenced to life in Shawshank prison plans his escape");

        Movie intoTheWild = new Movie(6, "Into the Wild", "Adventure, Biography, Drama", "Sean Penn", "2007-09-21", "148", 8, "English",
                "Emile Hirsch, Vince Vaughn, Catherine Keener", "A man leaves everything behind to live in the Alaskan wilderness");

        Movie anbeSivam = new Movie(7, "Anbe Sivam", "Drama", "Sundar C.", "2003-01-14", "160", 9, "Tamil",
                "Kamal Haasan, Madhavan, Kiran Rathod", "A journey of two strangers that changes their perception of life and humanity.");

        
        Movie sooraraiPottru = new Movie(8, "Soorarai Pottru", "Drama, Biography", "Sudha Kongara", "2020-11-12", "153", 9, "Tamil",
                "Suriya, Aparna Balamurali, Paresh Rawal", "The inspiring story of a man who revolutionizes the airline industry to make air travel affordable for everyone.");

        Movie goodWillHunting = new Movie(9, "Good Will Hunting", "Drama", "Gus Van Sant", "1997-12-05", "126", 9, "English",
                "Matt Damon, Robin Williams, Ben Affleck", "A genius janitor discovers his true potential with the help of a therapist");

        Movie lifeOfPi = new Movie(10, "Life of Pi", "Adventure, Drama", "Ang Lee", "2012-11-21", "127", 8, "English",
                "Suraj Sharma, Irrfan Khan, Tabu", "A young boy survives on a lifeboat with a Bengal tiger");

        Movie.printAll();
    }
}



public class Movie {
	private int movieId;
	private String title;
	private String genre;
	private String director;
	private String releaseDate;
	private String duration;
	private int rating;
	private String language;
	private String cast;
	private String synopsis;
	
	private static List<Movie> movieList = new ArrayList<>();
	
	public Movie() {}
	
	public Movie(int movieId, String title, String genre, String director, String releaseDate, String duration,
			int rating, String language, String cast, String synopsis) {
		
		//super();
		
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.rating = rating;
		this.language = language;
		this.cast = cast;
		this.synopsis = synopsis;
		
		movieList.add(this);
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getSynopsis() {
		return synopsis;
	}
	
	public static void printAll(){
	    for(Movie m: movieList){
	        System.out.println(m);
	        System.out.println();
	    }
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", genre=" + genre + ", director=" + director
				+ ", releaseDate=" + releaseDate + ", duration=" + duration + ", rating=" + rating + ", language="
				+ language + ", cast=" + cast + ", synopsis=" + synopsis + "]";
	}
	
}
