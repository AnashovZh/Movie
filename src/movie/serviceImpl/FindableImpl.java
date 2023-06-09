package movie.serviceImpl;

import movie.exseption.MyException;
import movie.exseption.MyExseption2;
import movie.model.Cast;
import movie.model.Database;
import movie.model.Genre;
import movie.service.Findable;
import movie.model.Movie;

import java.util.List;
import java.util.Scanner;

public class FindableImpl implements Findable {




    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
       return movies;
    }

    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in);
        String fullName=scanner.nextLine();
        for (Movie m:movies) {
            if (m.getName().toLowerCase().startsWith(fullName)||m.getName().equalsIgnoreCase(fullName)||m.getName().toLowerCase().endsWith(fullName)){
            System.out.println(m.getName()+" "+m.getYear()+m);
          }else   System.out.println("Not found this film.");
        }
    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in);
            String name=scanner.nextLine();
        for (Movie n:movies) {
            for (Cast c:n.getCast()) {
                if (c.getActorFullName().equalsIgnoreCase(name)||c.getActorFullName().toLowerCase().startsWith(name)||c.getActorFullName().toLowerCase().endsWith(name)){
                    System.out.println(c.getActorFullName()+" "+n.getName()+" "+n);
                }else System.out.println("not found this movie");
            }
        }
    }


    @Override
    public void findMovieByYear(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in );
        int n=scanner.nextInt();
        for (Movie m: movies) {
            if (m.getYear()==n){
                System.out.println(m.getName()+" "+m.getYear()+" "+m);
            }else System.out.println("not found this movie.");
        }

    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        for (Movie m:movies) {
            if (m.getDirector().getName().toLowerCase().startsWith(name)||m.getDirector().getName().equalsIgnoreCase(name)
            ||m.getDirector().getLastName().toLowerCase().startsWith(name)||m.getDirector().getLastName().equalsIgnoreCase(name)){
                System.out.println(m.getDirector().getLastName()+" "+m.getDirector().getName()+" "+m);
            }else System.out.println("Not found this director movie");
        }
    }

    @Override
    public void findMovieByGenre(List<Movie> movies) {
     Scanner scanner=new Scanner(System.in);
     String genre=scanner.nextLine();
        for (Movie b:movies) {
            if (b.getGenre().equals(Genre.valueOf(genre))){
                System.out.println(b);
            }else System.out.println("Not found this film!");
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        Scanner scanner=new Scanner(System.in);
        String role=scanner.nextLine();
        for (Movie m:movies) {
            for (Cast c: m.getCast()) {
                if (c.getRole().equalsIgnoreCase(role)){
                    System.out.println(c.getActorFullName()+" "+c.getRole()+" "+m);
                }
            }
        }


    }

}
