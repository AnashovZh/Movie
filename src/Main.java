import movie.model.*;
import movie.serviceImpl.FindableImpl;
import movie.serviceImpl.SortAbleImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       // Movie:

      /**  private String name;
        private int year;
        private String genre;
        private Director director;
        private List<Cast> cast;
        Cast:
        private String actorFullName;
        private String role;
        Director:
        private String name;
        private String lastName;
        Findable:
        List<Movie>getAllMovies(List<Movie>movies);
        void findMovieByFullNameOrPartName(List<Movie>movies);
        void findMovieByActorName(List<Movie>movies);
        void findMovieByYear(List<Movie>movies);
        void findMovieByDirector(List<Movie>movies);
        void findMovieByGenre(List<Movie>movies);
        void findMovieByRole(List<Movie>movies);
        Sortable:
        void sortByMovieName(List<Movie>movies);
        -from A to Z
        -from Z to A
        void sortByYear(List<Movie>movies);
        -Ascending
        -Descending
        void sortByDirector(List<Movie>movies);
****** Main де кайсыл иш аракетти аткаргыбыз келсе ошол метод switch case аркылуу чакырылып иштесин.
                Бардык маалыматтар туура жана так болуп консольго чыксын.*/
      LinkedList<Cast>casts=new LinkedList<>(List.of(
//              new Cast("Altynbek Kenjebekov","bala"),
//              new Cast("Samagan Baitikov","ak sakal"),
              new Cast("Bybysara Beishenalieva","chon apa"),
              new Cast("Farhat Turatov","aidoochu")));
      LinkedList<Cast>casts1=new LinkedList<>(List.of(
              new Cast("Altynbek Kenjebekov","bala")));

      LinkedList<Director>directors=new LinkedList<>(List.of(
              new Director("Asan ","Kubatov"),
              new Director("Tolomush  ","Okeev"),
              new Director("Ulan ","Sherikov"),
              new Director("Chyngyz ","Mambetov")));
      LinkedList<Cast>casts2=new LinkedList<>();
      Director director1=new Director("Davran","Janyshov");
      Director director2=new Director("Erjigit","Sansyzbaev");
      Director director3=new Director("Adilet","Almanbetov");
      Director director4=new Director("Kasym","Anarbekov");
      Director director5=new Director("Yaryslav","Sergei");
        LinkedList<Movie>movies=new LinkedList<>(List.of(
                new Movie("Ak keme",1999, Genre.DRAMA,director1,casts),
                new Movie("Samancynyn jolu",1980,Genre.WESTERN,director2,casts1),
                new Movie("Derbish",2010,Genre.WAR,director3,casts),
                new Movie("Jalbyz",2022,Genre.DRAMA,director4,casts),
                new Movie("Titanik",1990,Genre.HISTORY,director5,casts)));

        SortAbleImpl sortAble=new SortAbleImpl();
        FindableImpl findable=new FindableImpl();
      while (true){
        System.out.println(
                "\n1->Sort by movie name AZ:"+
                "\n2->Sort by movie name ZA:"+
                "\n3->Sort by year ascending movie:"+
                "\n4->Sort by year descending movie:"+
                "\n5->Sort by name director AZ:"+
                "\n6->Sort by name director ZA:"+
                "\n7->Sort by last name director AZ:"+
                "\n8->Sort by last name director ZA:"+
                "\n9->Get all movies: "+
                "\n10->Find movie by full name or part name:"+
                "\n11->Find by actor name:"+
                "\n12->Find by movie year:"+
                "\n13->Find by director name:"+
                "\n14->Find by genre movie:"+
                "\n15->Find by movie role:");
        Scanner d=new Scanner(System.in);
        int n= d.nextInt();
        switch (n){
          case 1:
            System.out.println("Sort by movie name AZ:");
            sortAble.sortByMovieNameAZ(movies);
            break;
          case 2:
            System.out.println("Sort by movie name ZA:");
            sortAble.sortByMovieNameZA(movies);
            break;
          case 3:
            System.out.println("Sort by year ascending movie:");
            sortAble.sortByYearAscending(movies);
            break;
          case 4:
            System.out.println("Sort by year descending movie:");
            sortAble.sortByYearDescending(movies);
            break;
          case 5:
            System.out.println("Sort by name director AZ:");
            sortAble.sortByDirectorNameAZ(movies);
            break;
          case 6:
            System.out.println("Sort by name director ZA:");
            sortAble.sortByDirectorNameZA(movies);
            break;
          case 7:
            System.out.println("Sort by last name director AZ:");
            sortAble.sortByDirectorLastNameAZ(movies);
            break;
          case 8:
            System.out.println("Sort by last name director ZA:");
            sortAble.sortByDirectorLastNameZA(movies);
            break;
          case 9:
            System.out.println("Get all movies: ");
            System.out.println(findable.getAllMovies(movies));
            break;
          case 10:
            System.out.println("Find movie by full name or part name: ");
            findable.findMovieByFullNameOrPartName(movies);
            break;
          case 11:
            System.out.println("Find by actor name :");
            findable.findMovieByActorName(movies);
            break;
          case 12:
            System.out.println("Find by movie year:");
            findable.findMovieByYear(movies);
            break ;
          case 13:
            System.out.println("Find by director name:");
            findable.findMovieByDirector(movies);
            break;
          case 14:
            System.out.println("Find by genre movie:");
            findable.findMovieByGenre(movies);
            break;
          case 15:
            System.out.println("Find by movie role:");
            findable.findMovieByRole(movies);
            break;
          default:
        }
      }
    }
}
