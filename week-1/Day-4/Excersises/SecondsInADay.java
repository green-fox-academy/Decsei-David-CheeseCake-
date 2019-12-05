package Excersises;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int day = 24-currentHours;
        int minutes = 60-currentMinutes;
        int seconds = 60-currentSeconds;

        System.out.println("Még " + day + " óra " + minutes + " perc és " + seconds + " másodperc van hátra.");
    }
}