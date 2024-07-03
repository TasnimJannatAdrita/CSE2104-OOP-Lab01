/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movie;


public class Movie {
     String TITLE;
     String GENRE;
     String LEADACTOR;
     String DIRECTOR;
     int RELEASEYEAR;
     double RATING;
     String REVIEW;
    public Movie(String title, String genre, String lead_Actor, String director, int Release_Year, double rating) {
        this.TITLE = title;
        this.GENRE = genre;
        this.LEADACTOR = lead_Actor;
        this.DIRECTOR = director;
        this.RELEASEYEAR = Release_Year;
        this.RATING = rating;
        if (rating < 5) {
            this.REVIEW = "Not Good";
        } else {
            this.REVIEW = "Good";
        }
    }
    public void Display_Details() {
        System.out.println("Title = " + TITLE);
        System.out.println("Genre = " + GENRE);
        System.out.println("Lead Actor = " + LEADACTOR);
        System.out.println("Director = " + DIRECTOR);
        System.out.println("Release Year = " + RELEASEYEAR);
        System.out.println("Rating = " + RATING);
        System.out.println("Review = " + REVIEW);
    }
    public static void main(String[] args) {
        Movie m1 = new Movie("Agun ", "Thriller", "Janina", "Kemne Bolbo", 2019, 0);
        Movie m2 = new Movie("Sir Ra Pera Day", "Maramari", "SMDT", "MGK", 2024, 10);
        System.out.println("Ek Number Movie  :- ");
        m1.Display_Details();
        System.out.println("\nDui Number Movie :- ");
        m2.Display_Details();
    }
}