public class Movie
{
    private String title;
    private String studio;
    private String rating;

    Movie(String title, String studio, String rating)
    {
        this.rating = rating;
        this.studio = studio;
        this.title = title;
    }

    Movie(String title, String studio)
    {
        this.studio = studio;
        this.title = title;
        this.rating = "PG";
    }

    public String getRating() {
        return rating;
    }

    public Movie[] getPg(Movie[] movies)
    {
        Movie[] pgMovies = new Movie[movies.length];
        int index =0;
        for(int iterator = 0; iterator < movies.length; iterator++)
        {
            if(movies[iterator].getRating() == "PG")
            {
                pgMovies[index]=movies[iterator];
                index++;
            }
        }
        return pgMovies;
    }

    public void printDetails()
    {
        System.out.println(title);
        System.out.println(studio+"   "+rating);
    }
}
