import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
        public static void main(String[] args) {
                Scanner output = new Scanner(System.in);
                System.out.print("Enter a String : ");
                char a  = output.next().charAt(0);
                System.out.println("Input String is : "+a);
        }
}
