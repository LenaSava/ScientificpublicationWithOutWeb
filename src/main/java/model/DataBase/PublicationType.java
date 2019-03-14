package model.DataBase;

import model.entity.Book;
import model.entity.Booklet;
import model.entity.Magazine;
import model.entity.PublicationEntity;

public enum PublicationType {
    SCIENTIFICRESERCH {
        public PublicationEntity factory() {
            return new Booklet("ReserchPublic", "Andrey Voronin", "Patients and the public", 1923, 9, "Normal");
        }
    },
    SCIENTIFICRESERCH2 {
        public PublicationEntity factory() {
            return new Booklet("Filogenetic", "Kumar C.", "Minimum evolution", 1803, 1, "Well");
        }
    },
    SCIENTIFICRESERCH3 {
        public PublicationEntity factory() {
            return new Booklet("Statistic", "Duglas Altman", "Our life in statistic", 1203, 3, "Good");
        }
    },
    BOOK {
        public PublicationEntity factory() {
            return new Book("History", "Zoë Lescaze", "Paleoart", 2004, 4, "Well", "Soft");
        }
    },
    BOOK2 {
        public PublicationEntity factory() {
            return new Book("Endanger human health", "Maryna McKenna","Big Chicken", 2016,  7, "Normal", "Soft" );
        }
    },
    BOOK3 {
        public PublicationEntity factory() {
            return new Book("History", "Liza Mundy","Code Girls",2006, 10, "Normal","Soft");
        }
    },
    MAGAZINE {
        public PublicationEntity factory() {
            return new Magazine("Fantastic", "Megan Watz","Magnitude",1977, 6, "Normal", false);
        }
    },
    MAGAZINE2 {
        public PublicationEntity factory() {
            return new Magazine("Hot news", "Alan Burdick","Why Time Flies", 2016, 2, "Well", true);
        }
    },
    MAGAZINE3 {
        public PublicationEntity factory() {
            return new Magazine("Gravitational waves ", "Harry Collins","Gravity's Kiss", 2017, 5, "Well", false);
        }
    };


    public abstract PublicationEntity factory();
}