package model.entity;


import model.exception.logic.IllegalPopularityException;
import model.exception.logic.IllgealYearOfPublication;

public abstract class PublicationEntity {
    private String genre;
    static String author;
    private String title;
    private int yearOfPublication;
    private int popularity;
    private String qualityOfPaper;

    public PublicationEntity() {

    }

    public PublicationEntity(String genre, String author, String title, int yearOfPublication, int popularity, String qualityOfPaper) {
        this.genre = genre;
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.popularity = popularity;
        this.qualityOfPaper = qualityOfPaper;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) throws IllgealYearOfPublication {
        if (yearOfPublication <= 0) {
            throw new IllgealYearOfPublication();
        }
        this.yearOfPublication = yearOfPublication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getTitle() {
        return title;
    }

    public void setPopularity(int popularity) throws IllegalPopularityException {
        if (popularity <= 0){
            throw  new IllegalPopularityException();
        }
        this.popularity = popularity;
    }
    public String getQualityOfPaper() {
        return qualityOfPaper;
    }


    @Override
    public String toString() {
        return "Genre = " + getGenre() +
                ", Author Name is " + getAuthor() +
                ", Title is " + "\'" + getTitle() + "\'" +
                ", year of publication = " + getYearOfPublication() +
                ", popularity = " + getPopularity();
    }


}
