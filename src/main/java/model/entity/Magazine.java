package model.entity;

public class Magazine extends PublicationEntity {
    private boolean withHotNews;


    public Magazine(String genre, String author, String title, int yearOfPublication, int popularity, String qualityOfPaper, boolean withHotNews) {
        super(genre,author,title,yearOfPublication, popularity, qualityOfPaper);
        this.withHotNews = withHotNews;
    }

    public boolean isWithHotNews() {
        return withHotNews;
    }

    public void setWithHotNews(boolean withHotNews) {
        this.withHotNews = withHotNews;
    }

    @Override
    public String toString() {
        return "Magazine :" + super.toString() +
                ", Is this hot news? " + isWithHotNews() + '\n';
    }

}

