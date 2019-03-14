package model.entity;

public class Booklet extends PublicationEntity {
    private int popularity;


    public Booklet(String genre, String author, String title, int yearOfPublication, int popularity, String qualityOfPaper) {
        super(genre,author,title,yearOfPublication, popularity, qualityOfPaper);
        this.popularity = popularity;

    }


    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Booklet : " + super.toString() +
                ", QualityOfPaper = " + getQualityOfPaper() +
                '\n';
    }

}
