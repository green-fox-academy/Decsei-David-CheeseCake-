public class ReverseAnyString {

    public static void main(String... args){
        String reversed = "input to reverse"; //a "reversed" változó szövege fog tovább menni a methodba
        System.out.println(reverse(reversed)); // a method értéke a "reversed" értékét írja felül
    }

    public static StringBuilder reverse(String a) {
        StringBuilder rev = new StringBuilder();

        rev.append(a);
        rev = rev.reverse();

        return rev;
    }

}
