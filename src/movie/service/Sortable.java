package movie.service;

import movie.model.Movie;

import java.util.List;

public interface Sortable {
    void sortByMovieNameAZ(List<Movie> movies);
    void sortByMovieNameZA(List<Movie> movies);
//        -from A to Z
//        -from Z to A
    void sortByYearAscending(List<Movie>movies);
    void sortByYearDescending(List<Movie>movies);
//        -Ascending
//        -Descending
    void sortByDirectorNameAZ(List<Movie>movies);
    void sortByDirectorNameZA(List<Movie>movies);
    void sortByDirectorLastNameAZ(List<Movie>movies);
    void sortByDirectorLastNameZA(List<Movie>movies);
}
