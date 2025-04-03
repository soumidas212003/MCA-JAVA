//1. Write a Java program to show the abbreviation of a given input string
//Ex: Aditya Das 
//Display: A.D.
import java.util.Scanner;
class Qs_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        
        String s1 = "";
        
        // Add the first character (first letter of first word)
        s1 += s.charAt(0) + ".";

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i + 1 < s.length() && s.charAt(i + 1) != ' ') {
                s1 += s.charAt(i + 1) + ".";
            }
        }
        
        System.out.println("Abbreviation: " + s1);
    }
}
