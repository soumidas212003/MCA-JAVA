//2. Write a Java program to check whether the input string is palindrome or not.
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    String org_str=str;
    String rev="";
    int len=str.length();
    for(int i=len-1;i>=0;i--){
        rev+=str.charAt(i);
    }
    if(org_str.equals(rev)){
        System.out.println("String is Palindrome");
    }
    else{
        System.out.println("String is not Palindrome");
    }
    sc.close();   
    }
}
