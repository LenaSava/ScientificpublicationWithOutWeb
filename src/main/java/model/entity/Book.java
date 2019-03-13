package model.entity;

public class Book extends PublicationEntity {
    private String cover;
    private Object link;


    public Book(String genre, String author, String title, int amountOfPages, int popularity, String qualityOfPaper, String cover) {
        super(genre,author,title,amountOfPages, popularity, qualityOfPaper);
        this.cover = cover;
        this.link = super.getClass();
    }

    public String getCover() {
        return cover;
    }

    public Object getLink() {
        return link;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Book :    " + super.toString() +
                ", Cover is " + getCover() +
                ", Link is " + getLink() + "\n";
    }

}
