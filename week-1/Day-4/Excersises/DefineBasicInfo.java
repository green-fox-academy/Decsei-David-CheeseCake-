package Excersises;

public class DefineBasicInfo {
    public static <string> void main(String[] args) {
        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean
        String myName = "David";
        int myAge = 25;
        double myHeight = 1.93;
        boolean married_boolean = false;
        String married = "";

        if (!married_boolean) {
            married = "no, i'm not married.";
        }


        System.out.println("My name is " + myName + " \n" +
                "I'm " + myAge + " years old. \n" +
                "I'm " + myHeight + " m tall \n" +
                "And " + married);
    }
}