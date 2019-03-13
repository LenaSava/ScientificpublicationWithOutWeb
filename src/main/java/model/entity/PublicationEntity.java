package model.entity;


import model.exception.logic.IllegalPopularityException;
import model.exception.logic.IllgealAmountOfPagesException;

public abstract class PublicationEntity {
    private String genre;
    private String author;
    private String title;
    private int amountOfPages;
    private int popularity;
    static String qualityOfPaper;

    public PublicationEntity() {

    }

    public PublicationEntity(String genre, String author, String title, int amountOfPages, int popularity, String qualityOfPaper) {
        this.genre = genre;
        this.author = author;
        this.title = "Ololo";
        this.amountOfPages = amountOfPages;
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

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) throws IllgealAmountOfPagesException {
        if (amountOfPages <= 0) {
            throw new IllgealAmountOfPagesException();
        }
        this.amountOfPages = amountOfPages;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PublicationEntity that = (PublicationEntity) o;

        if (amountOfPages != that.amountOfPages) return false;
        if (popularity != that.popularity) return false;
        if (!genre.equals(that.genre)) return false;
        if (!title.equals(that.title)) return false;
        if (!author.equals(that.author)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = amountOfPages;
        result = 31 * result + genre.hashCode();
        result = 31 * result + popularity;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Genre = " + getGenre() +
                ", Autor Name is " + getAuthor() +
                ", Title is " + getTitle() +
                ", amountOfPages = " + getAmountOfPages() +
                ", popularity = " + getPopularity();
    }


}
