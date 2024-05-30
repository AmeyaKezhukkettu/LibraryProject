/**
 * Book class creates a book object that stores different
 * values so it can be added to lists
 */
public class Book {
    private String title;
    private String author;
    private String type;
    private int pages;
    private double rating;
    //2 constructors(with and without rating)

    /**
     *
     * @param title
     * @param author
     * @param type
     * @param pages
     * @param rating
     */
    public Book(String title, String author, String type, int pages, double rating){
        this.title = title;
        this.author = author;
        this.type = type;
        this.pages = pages;
        this.rating = rating;
    }

    /**
     *
     * @param title
     * @param author
     * @param type
     * @param pages
     */
    public Book(String title, String author, String type, int pages){
        this.title = title;
        this.author = author;
        this.type = type;
        this.pages = pages;
        this.rating = -23;
    }
    //all the getter methods (we don't need setters)

    /**
     *
     * @return title
     */
    public String getTitle(){
        return title;
    }

    /**
     *
     * @return author
     */
    public String getAuthor(){
        return author;
    }

    /**
     *
     * @return type
     */
    public String getType(){
        return type;
    }

    /**
     *
     * @return pages
     */
    public int getPages(){
        return pages;
    }

    /**
     *
     * @return rating
     */
    public double getRating(){
        return rating;
    }

    /**
     *
     * @return
     */
    //To String is what's stored in the lists

    public String toString(){
        if(rating == -23) {
            return title + " is a " + type + " by " + author + " with " + pages + " pages";
        }
        else{
            return rating + ": " + title + " is a " + type + " by " + author + " with " + pages + " pages";
        }
    }
}
