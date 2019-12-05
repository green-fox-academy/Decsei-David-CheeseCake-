package Excersises;

import java.text.DecimalFormat;

public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        // BMI = massInKg / heightInM^2

        double height_M2 = (Math.pow(heightInM, 2)); //Height m2
        double BMI = massInKg / height_M2; // Long BMI number

        //Here is the decimal format to reduce BMI decimals to 2 numbers.
        DecimalFormat df = new DecimalFormat("0.00");
        String BMI_format = df.format(BMI);

        System.out.println("The (Metric) BMI formula is Kg / Height(in Meter).");
        System.out.println("So the BMI is " + BMI_format + " based on a person with a weight of \n"
        + massInKg + " kg and " + heightInM + "m height.");
    }
}
