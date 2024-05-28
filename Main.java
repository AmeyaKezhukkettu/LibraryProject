import java.util.*;
public class Main {
    public static void main(String args[]){
        //System.out.println("This is my final project!");
        Scanner input = new Scanner(System.in);

        ArrayList<Book> read = new ArrayList<Book>();
        ArrayList<Book> tbr = new ArrayList<Book>();
        ArrayList<Book> topTen = new ArrayList<Book>();
        int userChoice = 0;

        while(userChoice != 1 && userChoice != 2) {
            System.out.println("What would you like to do? \nAccess your lists(1) \nAdd to a list(2)");
            userChoice = input.nextInt();

            if (userChoice == 1) {
                System.out.println("Which list would you like to access? \nTBR(1) \nRead(2)");
                userChoice = input.nextInt();

            }
            else if (userChoice == 2) {
                System.out.println("Which list would you like to add to? \nTBR(1) \nRead(2)");
                userChoice = input.nextInt();

            }
            if(userChoice != 1 || userChoice != 2){
                System.out.println("That wasn't an option, you should try again");
            }
        }

        System.out.println(userChoice);

    }
}
