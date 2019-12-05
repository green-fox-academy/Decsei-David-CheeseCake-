package Excersises;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
int daily_coding = 6;
int semester = 17;
int workdays = 5;
int weekly_coding = 52;
int time_spent = semester*workdays*daily_coding;
int average_week = weekly_coding*semester;
float perc_coding = (float)time_spent/average_week*100;



        System.out.println("If we assume that there's no holidays in the entire semester then an \n" +
                "average attendee spends " + time_spent + " hours with coding." );
        /* Since its 17 weeks with 5 workdays, that's 105 workdays and 6 hours every day is 630 hours spent with coding
         */

        System.out.println(" \n That's an average of " + perc_coding + "% coding hours.");

    }
}