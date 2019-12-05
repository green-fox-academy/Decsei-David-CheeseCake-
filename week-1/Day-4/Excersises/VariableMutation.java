package Excersises;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a = a+10;

        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b = b-7;

        System.out.println(b);

        int c = 44;
        // please double c's value
        c = c*2;

        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d = d/5;

        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e = (int) Math.pow(e, 2);

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        if (f1>f2){
            System.out.println("True");
        }   else{
            System.out.println("False");
        }

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        if ((g2*2)>g1){
            System.out.println("True");
        }   else{
            System.out.println("False");
        }

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        if (h % 11 == 0) {                 //if num can be divided without remainder then print the
            System.out.print(h + " can be divided with 11 without remainder.");
        }
            else{
            System.out.print(h + " cant be divided with 11 without remainder. \n"
            + "Because it will be: " + (double)h/11 + "\n");
        }


        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        if (i1>(Math.pow(i2,2)) && i1<(Math.pow(i2,3))) { //10 > 3^2 (true) AND 10 < 3+3 (true) will be TRUE
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        if (j % 3 == 0) {                 //if num can be divided without remainder
            System.out.print(j + " can be divided with 3 without remainder. \n"
                    + "And it will be: " + (int)j/3 + " so its True");
        } else if (j % 5 == 0){
            System.out.print(j + " can be divided with 5 without remainder. \n"
                    + "And it will be: " + (int)j/5 + " so its True");
        } else {
            System.out.print(j + " cant be divided with 3 or 5 without remainder. \n");
        }
    }
}