package org.example.config;

import org.example.domain.Movie;
import org.springframework.context.annotation.Bean;

public class MovieConfig {
    @Bean("movie1")
    public Movie getMovie1()
    {
        return new Movie("Jersey","Drama",1.40,50);
    }

    @Bean("movie2")
    public Movie getMovie2()
    {
        return new Movie("Ek villan Return","Thriller",1.34,45);
    }

    @Bean("movie3")
    public Movie getMovie3()
    {
        return new Movie("Ek villan","Thriller",2.10,60);
    }

    @Bean("movie4")
    public Movie getMovie4()
    {
        return new Movie("RRR","Action",2.45,100);
    }

    @Bean("movie5")
    public Movie getMovie5()
    {
        return new Movie("Runway 34","Action",1.50,75);
    }




}
