public class TakesLonger {

    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // Hofstadter's Law: It always takes longer than you expect, even when you take into account Hofstadter's Law.

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote);
        System.out.println();

        StringBuilder missing = new StringBuilder("always takes longer than");
        String start = quote.substring(quote.indexOf("H"), quote.indexOf("you"));
        String rest = quote.substring(quote.indexOf(" you"));
        System.out.println(start + missing + rest);

        System.out.println("Hofstadter's Law: It always takes longer than you expect, even when you take into account Hofstadter's Law.");


        System.out.println();


    }

}
