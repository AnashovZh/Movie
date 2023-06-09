package movie.serviceImpl;
import movie.service.Sortable;
import movie.model.Movie;
import java.util.*;
public class SortAbleImpl  implements Sortable  {

    @Override
    public void sortByMovieNameAZ(List<Movie> movies) {
        Collections.sort(movies,SortAbleImpl.sortByMovieNameAZ);
        System.out.println(movies);

    }

    @Override
    public void sortByMovieNameZA(List<Movie> movies) {
        Collections.sort(movies,SortAbleImpl.sortByMovieNameZA);
        System.out.println(movies);
    }

    @Override
    public void sortByYearAscending(List<Movie> movies) {
        Collections.sort(movies,SortAbleImpl.sortByYearAscending);
        System.out.println(movies);
    }

    @Override
    public void sortByYearDescending(List<Movie> movies) {
        Collections.sort(movies,SortAbleImpl.sortByDescending);
        System.out.println(movies);
    }

    @Override
    public void sortByDirectorNameAZ(List<Movie> movies) {
        Collections.sort(movies,SortAbleImpl.sortByDirectorNameAZ);
        System.out.println(movies);
    }

    @Override
    public void sortByDirectorNameZA(List<Movie> movies) {
        Collections.sort(movies,SortAbleImpl.sortByDirectorLastNameZA);
        System.out.println(movies);
    }

    @Override
    public void sortByDirectorLastNameAZ(List<Movie> movies) {
        Collections.sort(movies,SortAbleImpl.sortByDirectorLastNameAZ);
        System.out.println(movies);
    }

    @Override
    public void sortByDirectorLastNameZA(List<Movie> movies) {
        Collections.sort(movies,SortAbleImpl.sortByDirectorLastNameZA);
        System.out.println(movies);
    }

    public static Comparator<Movie>sortByMovieNameAZ=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Movie>sortByMovieNameZA=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };
    public static Comparator<Movie>sortByYearAscending=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear()-o2.getYear();
        }
    };
    public static Comparator<Movie>sortByDescending=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear()-o1.getYear();
        }
    };
    public static Comparator<Movie> sortByDirectorNameAZ =new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };
    public static Comparator<Movie>sortByDirectorNameZA=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getDirector().getName().compareTo(o1.getDirector().getName());
        }
    };
    public static Comparator<Movie>sortByDirectorLastNameAZ=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getLastName().compareTo(o2.getDirector().getLastName());
        }
    };
    public static Comparator<Movie>sortByDirectorLastNameZA=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getDirector().getLastName().compareTo(o1.getDirector().getLastName());
        }
    };

}
