public class Fiction extends Book{
    private String trope;
    public Fiction(String title, String author, String type, String trope, int pages, double rating){
        super(title, author, type, pages, rating);
        this.trope = trope;
    }
    public Fiction(String title, String author, String type, String trope, int pages){
        super(title, author, type, pages);
        this.trope = trope;
    }
    public String toString(){
        if(super.getRating() != -23) {
            return super.getRating() + ": " + super.getTitle() + " is a " + super.getType() + " with a " + trope + " by " + super.getAuthor() + " with " + super.getPages() + " pages";
        }
        else{
            return super.getTitle() + " is a " + super.getType() + " with a " + trope + " by " + super.getAuthor() + " with " + super.getPages() + " pages";
        }
    }
}
