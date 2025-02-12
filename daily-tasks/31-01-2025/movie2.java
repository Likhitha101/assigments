package javaassignments;
class Movie2 {
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    public Movie2(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

class Solution {
    public static double findAvgBudgetByDirector(Movie2[] movies, String director) {
        int totalBudget = 0;
        int count = 0;
        for (Movie2 movie : movies) {
            if (movie.getDirector().equalsIgnoreCase(director)) {
                totalBudget += movie.getBudget();
                count++;
            }
        }
        return count == 0 ? 0 : (double) totalBudget / count;
    }

    public static Movie2 getMovieByRatingBudget(int rating, int budget, Movie2[] movies) {
        for (Movie2 movie : movies) {
            if (movie.getRating() == rating && movie.getBudget() == budget) {
                if (budget % rating == 0) {
                    return movie;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Movie2[] movies = {
            new Movie2(1, "Christopher Nolan", 9, 100),
            new Movie2(2, "Steven Spielberg", 8, 200),
            new Movie2(3, "Christopher Nolan", 7, 150),
            new Movie2(4, "James Cameron", 8, 120)
        };

        String director = "Christopher Nolan";
        double avgBudget = findAvgBudgetByDirector(movies, director);
        System.out.println("Average Budget of Movies Directed by " + director + ": " + avgBudget);

        int rating = 8;
        int budget = 200;
        Movie2 movie = getMovieByRatingBudget(rating, budget, movies);
        if (movie != null) {
            System.out.println("Movie Found: " + movie.getMovieId());
        } else {
            System.out.println("No movie found matching the criteria.");
        }
    }
}

