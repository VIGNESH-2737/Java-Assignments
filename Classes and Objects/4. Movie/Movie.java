package com.vignesh.zohotask;

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
	
	public Movie() {}
	
	public Movie(int movieId, String title, String genre, String director, String releaseDate, String duration,
			int rating, String language, String cast, String synopsis) {
		
		super();
		
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
