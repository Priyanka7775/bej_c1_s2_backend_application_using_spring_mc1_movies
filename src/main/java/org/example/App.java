package org.example;

import org.example.config.MovieConfig;
import org.example.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);

        Movie m1=context.getBean("movie1",Movie.class);
        System.out.println(m1);

        Movie m2=context.getBean("movie2",Movie.class);
        System.out.println(m2);

        Movie m3=context.getBean("movie3",Movie.class);
        System.out.println(m3);

        Movie m4=context.getBean("movie4",Movie.class);
        System.out.println(m4);

        Movie m5=context.getBean("movie5",Movie.class);
        System.out.println(m5);

    }
}
