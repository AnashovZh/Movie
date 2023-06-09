package movie.model;

import java.util.List;

public class Movie {
    private String name;
    private int year;
    private Genre genre;
    private Director director;
    private List<Cast> cast;

    public Movie(String name, int year, Genre genre, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return  "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~"+
                "\nMovie->" +
                "\nname:" +"<<"+ name + ">>"+
                "\nyear:" + "*"+year+"*" +
                "\ngenre:" + genre +
                "\ndirector:" + director +
                "\ncast:" + cast ;
    }
}
