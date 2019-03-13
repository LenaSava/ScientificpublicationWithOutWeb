package model.services;

import controller.Controller;
import model.entity.Book;
import model.entity.Booklet;
import model.entity.Magazine;
import model.entity.PublicationEntity;
import org.junit.Test;
import org.junit.Before;
import view.View;

import static org.junit.Assert.*;

public class ServiceSortTest {
    private View view;
    private Controller controlle;
    private ServiceSort service;
    private PublicationEntity book;
    private PublicationEntity booklet;
    private PublicationEntity magazine;

    @Before
    public void initialization() {
        controlle = new Controller(view);
        service = new ServiceSort();
        book = new Book("Endanger human health", "Maryna McKenna","Big Chicken", 2016,  7, "Normal", "Soft" );
        booklet = new Booklet("Statistic", "Duglas Altman", "Our life in statistic", 1203, 3, "Good");
        magazine = new Magazine("Gravitational waves ", "Harry Collins","Gravity's Kiss", 2017, 5, "Well", false);
    }
    @Test
    public void sortByPages() {

    }

    @Test
    public void sortByPopularity() {
    }

    @Test
    public void sortByAutor() {
    }

    @Test
    public void findByParameters() {
    }
}