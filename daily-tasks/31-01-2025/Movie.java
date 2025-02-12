package javaassignments;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    public Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getCompany() {
        return company;
    }

    public String getGenre() {
        return genre;
    }

    public int getBudget() {
        return budget;
    }
}

class Solution {
    public static Movie[] getMovieByGenre(Movie[] movies, String searchGenre) {
        List<Movie> filteredMovies = new ArrayList<>();
        
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                filteredMovies.add(movie);
            }
        }
        
        return filteredMovies.toArray(new Movie[0]);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Movie[] movies = new Movie[4];
        for (int i = 0; i < 4; i++) {
            String movieName = scanner.nextLine();
            String company = scanner.nextLine();
            String genre = scanner.nextLine();
            int budget = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            movies[i] = new Movie(movieName, company, genre, budget);
        }
        
        String searchGenre = scanner.nextLine();
        
        Movie[] resultMovies = Solution.getMovieByGenre(movies, searchGenre);
        
        if (resultMovies.length == 0) {
            System.out.println("No movies found for the given genre");
        } else {
            for (Movie movie : resultMovies) {
                if (movie.getBudget() > 80000000) {
                    System.out.println("High Budget Movie");
                } else {
                    System.out.println("Low Budget Movie");
                }
            }
        }
        
        scanner.close();
    }
}
