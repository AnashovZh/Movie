package movie.model;

import java.util.LinkedList;

public class Database {
    private LinkedList<Movie>movies=new LinkedList<>();
    private LinkedList<Cast>casts=new LinkedList<>();
    private LinkedList<Director>directors=new LinkedList<>();

    public Database(LinkedList<Movie> movies, LinkedList<Cast> casts, LinkedList<Director> directors) {
        this.movies = movies;
        this.casts = casts;
        this.directors = directors;
    }

    public Database() {
    }

    public LinkedList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(LinkedList<Movie> movies) {
        this.movies = movies;
    }

    public LinkedList<Cast> getCasts() {
        return casts;
    }

    public void setCasts(LinkedList<Cast> casts) {
        this.casts = casts;
    }

    public LinkedList<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(LinkedList<Director> directors) {
        this.directors = directors;
    }
}
