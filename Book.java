public class Book {
    private String title;
    private String author;
    private String type;
    private int pages;
    private double rating;

    public Book(String title, String author, String type, int pages, double rating){
        this.title = title;
        this.author = author;
        this.type = type;
        this.pages = pages;
        this.rating = rating;
    }

    public Book(String title, String author, String type, int pages){
        this.title = title;
        this.author = author;
        this.type = type;
        this.pages = pages;
        this.rating = -23;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getType(){
        return type;
    }
    public int getPages(){
        return pages;
    }
    public double getRating(){
        return rating;
    }

    public String toString(){
        if(rating == -23) {
            return title + " is a " + type + " by " + author + " with " + pages + " pages";
        }
        else{
            return rating + ": " + title + " is a " + type + " by " + author + " with " + pages + " pages";
        }
    }
}
