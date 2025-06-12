//1. Write a Java program to show the abbreviation of a given input string
// Ex: Aditya Das 
// Display: A.D.
import java.util.Scanner;
public class Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String str=sc.nextLine().toUpperCase()+" ";
        System.out.print("Output: ");
        String word="";
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(Character.isWhitespace(ch)){
                System.out.print(word.charAt(0)+".");
                word="";
            }else{
                word+=ch;
            }
        }
        sc.close();
    }
}
