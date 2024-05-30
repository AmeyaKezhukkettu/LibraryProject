/**
 * Fiction class inherits from Book class, and is specific to
 * fiction books as it has the extra parameter; trope
 */
public class Fiction extends Book{
    private String trope; //it's basically the same thing, but trope is an extra thing

    /**
     *
     * @param title
     * @param author
     * @param type
     * @param trope
     * @param pages
     * @param rating
     */
    public Fiction(String title, String author, String type, String trope, int pages, double rating){
        super(title, author, type, pages, rating);
        this.trope = trope;
    }

    /**
     *
     * @param title
     * @param author
     * @param type
     * @param trope
     * @param pages
     */
    public Fiction(String title, String author, String type, String trope, int pages){
        super(title, author, type, pages);
        this.trope = trope;
    }

    /**
     *
     * @return
     */
    public String toString(){
        if(super.getRating() != -23) {
            return super.getRating() + ": " + super.getTitle() + " is a " + super.getType() + " with a " + trope + " by " + super.getAuthor() + " with " + super.getPages() + " pages";
        }
        else{
            return super.getTitle() + " is a " + super.getType() + " with a " + trope + " by " + super.getAuthor() + " with " + super.getPages() + " pages";
        }
    }
}
