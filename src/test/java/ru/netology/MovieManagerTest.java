package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    void testAddMovie() {
        MovieManager manager = new MovieManager();
        String movie1 = "The Lord of the Rings";
        String movie2 = "The Two Towers";
        String movie3 = "The Return of the King";

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLessLimit() {

        MovieManager manager = new MovieManager();
        String movie1 = "The Lord of the Rings";
        String movie2 = "The Two Towers";
        String movie3 = "The Return of the King";

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindALastMoreLimit() {

        MovieManager manager = new MovieManager(6);
        String movie1 = "The Lord of the Rings";
        String movie2 = "The Two Towers";
        String movie3 = "The Return of the King";
        String movie4 = "Back to the Future";
        String movie5 = "Love and Pigeons";
        String movie6 = "The Gentlemen";
        String movie7 = "Coraline ";


        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);


        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2};
        Assertions.assertArrayEquals(expected, actual);
    }
}



