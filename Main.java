import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        //System.out.println("This is my final project!");
        Scanner input = new Scanner(System.in);

        ArrayList<Book> read = new ArrayList<Book>();
        ArrayList<Book> tbr = new ArrayList<Book>();
        ArrayList<Book> topTen = new ArrayList<Book>();

        int userChoice = 0;
        String userAction = "idk";

        while(userChoice != 1 && userChoice != 2) {
            System.out.println("What would you like to do? \nAccess your lists(1) \nAdd to a list(2)");
            userChoice = input.nextInt();

            if (userChoice == 1) {
                System.out.println("Which list would you like to access? \nTBR(1) \nRead(2)");
                userChoice = input.nextInt();
                if (userChoice == 1){
                    userAction = "accessTBR";
                }
                else if (userChoice == 2){
                    userAction = "accessRead";
                }
                else{
                    System.out.println("That wasn't an option, you should try again");
                }

            }
            else if (userChoice == 2) {
                System.out.println("Which list would you like to add to? \nTBR(1) \nRead(2)");
                userChoice = input.nextInt();

                if (userChoice == 1){
                    userAction = "modifyTBR";
                }
                else if (userChoice == 2){
                    userAction = "modifyRead";
                }
                else{
                    System.out.println("That wasn't an option, you should try again");
                }

            }
            if(userChoice != 1 && userChoice != 2){
                System.out.println("That wasn't an option, you should try again");
            }
        }

        //System.out.println(userChoice);

        if(userAction.equals("modifyTBR")){
            System.out.println("Title:");
            String title = input.next();

            System.out.println("Type:");
            String type = input.next();

            System.out.println("Author:");
            String author = input.next();

            System.out.println("Pages:");
            int numPages = input.nextInt();

            Book myBook = new Book(title, author, type, numPages);
            tbr.add(myBook);

            FileWriter fWriter = new FileWriter("tbr.txt");
            fWriter.write(String.valueOf(myBook));
        }
        else if(userAction.equals("modifyRead")){
            System.out.println("Title:");
            String title = input.next();

            System.out.println("Type:");
            String type = input.next();

            System.out.println("Author:");
            String author = input.next();

            System.out.println("Pages:");
            int numPages = input.nextInt();

            System.out.println("Rating:");
            double rating = input.nextFloat();

            Book myBook = new Book(title, author, type, numPages, rating);
            read.add(myBook);

            FileWriter fWriter = new FileWriter("read.txt");
            fWriter.write(String.valueOf(myBook));
        }
        else if(userAction.equals("accessTBR")){
            File file = new File("tbr.txt");
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }
        }
        else if(userAction.equals("accessRead")){
            File file = new File("read.txt");
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }
        }

    }
}
