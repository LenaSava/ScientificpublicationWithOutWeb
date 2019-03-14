package model.entity;
import model.entity.Booklet;

public class Book extends PublicationEntity {
    private String cover;
    private String link;


    public Book(String genre, String author, String title, int amountOfPages, int popularity, String qualityOfPaper, String cover) {
        super(genre,author,title,amountOfPages, popularity, qualityOfPaper);
        this.cover = cover;
        this.link = link;
    }

    public String getCover() {
        return cover;
    }

    public Object getLink() {
        return link;
    }

    public Object setLink(String link) {
        return link;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Book :    " + super.toString() +
                ", Cover is " + getCover() +
                ", Link is " + setLink("Martin Oscar 'Sciense father''") + "\n";
    }

}
