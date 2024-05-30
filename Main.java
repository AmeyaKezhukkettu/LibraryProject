import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import java.nio.*;
public class Main {

    public static void main(String args[]) throws IOException {
        //System.out.println("This is my final project!");
        boolean done = false;
        while(!done) {
            Scanner input = new Scanner(System.in);

            ArrayList<Double> read = new ArrayList<Double>();

            int userChoice = 0;
            String userAction = "idk";

            while (userChoice != 1 && userChoice != 2) {
                System.out.println("\nWhat would you like to do? \nAccess your lists(1) \nAdd to a list(2) \nQuit(3)");
                userChoice = input.nextInt();

                if (userChoice == 1) {
                    System.out.println("Which list would you like to access? \nTBR(1) \nRead(2)");
                    userChoice = input.nextInt();
                    if (userChoice == 1) {
                        userAction = "accessTBR";
                    } else if (userChoice == 2) {
                        userAction = "accessRead";
                    } else {
                        System.out.println("That wasn't an option, you should try again");
                    }

                } else if (userChoice == 2) {
                    System.out.println("Which list would you like to add to? \nTBR(1) \nRead(2)");
                    userChoice = input.nextInt();

                    if (userChoice == 1) {
                        userAction = "modifyTBR";
                    } else if (userChoice == 2) {
                        userAction = "modifyRead";
                    } else {
                        System.out.println("That wasn't an option, you should try again");
                    }

                }
                else if(userChoice == 3){
                    done = true;
                    break;
                }
                if (userChoice != 1 && userChoice != 2 && userChoice != 3) {
                    System.out.println("That wasn't an option, you should try again");
                }
            }

            input.nextLine();

            if (userAction.equals("modifyTBR")) {
                System.out.println("Title:");
                String title = input.nextLine();

                System.out.println("Type:");
                String type = input.nextLine();

                System.out.println("Trope:");
                String trope = input.nextLine();

                System.out.println("Author:");
                String author = input.nextLine();

                System.out.println("Pages:");
                int numPages = input.nextInt();

                Book myBook;

                if(trope.equals("")){
                    myBook = new Fiction(title, author, type, trope, numPages);
                }
                else{
                    myBook = new Book(title, author, type, numPages);
                }

                FileWriter fWriter = new FileWriter("C:\\Users\\Ameya\\IdeaProjects\\LibraryProject\\tbr.txt", true);
                fWriter.write(String.valueOf(myBook) + "\n");
                fWriter.close();

            } else if (userAction.equals("modifyRead")) {
                System.out.println("Title:");
                String title = input.nextLine();

                System.out.println("Type:");
                String type = input.nextLine();

                System.out.println("Trope:");
                String trope = input.nextLine();

                System.out.println("Author:");
                String author = input.nextLine();

                System.out.println("Pages:");
                int numPages = input.nextInt();

                System.out.println("Rating:");
                double rating = input.nextFloat();

                Book myBook;

            if(trope.equals("")){
                myBook = new Fiction(title, author, type, trope, numPages);
            }
            else{
                myBook = new Book(title, author, type, numPages);
            }



                myBook = new Fiction(title, author, type, trope, numPages, rating);

                getReadRatingsAndPos(myBook, read);
            } else if (userAction.equals("accessTBR")) {
                File file = new File("tbr.txt");
                Scanner fileReader = new Scanner(file);

                while (fileReader.hasNextLine()) {
                    System.out.println(fileReader.nextLine());
                }
            } else if (userAction.equals("accessRead")) {
                File file = new File("read.txt");
                Scanner fileReader = new Scanner(file);

                while (fileReader.hasNextLine()) {
                    System.out.println(fileReader.nextLine());
                }
            }
        }

    }
    public static void getReadRatingsAndPos(Book newFav, ArrayList<Double> ratings) throws IOException {
        double rating = newFav.getRating();
        String currentLine;
        File file = new File("read.txt");
        Scanner fileReader = new Scanner(file);

        while (fileReader.hasNextLine()){
            currentLine = fileReader.nextLine();
            currentLine = currentLine.substring(0, 3);
            ratings.add(Double.parseDouble(currentLine));
        }
        for(int i = 0; i < ratings.size();i++){
            if(rating > ratings.get(i)){
                addToRead(i, newFav);
                return;
            }
        }

    }

    public static void addToRead(int pos, Book newBook) throws IOException {
        Path path = Paths.get("C:\\Users\\Ameya\\IdeaProjects\\LibraryProject\\read.txt");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        lines.add(pos, String.valueOf(newBook));
        Files.write(path, lines, StandardCharsets.UTF_8);

    }
}
