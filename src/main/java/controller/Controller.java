package controller;

import model.DataBase.PublicationType;
import model.entity.PublicationEntity;
import model.services.Service;
import model.services.ServiceSort;
import view.View;

import java.util.ArrayList;
import java.util.List;

import static view.TextConstants.*;

public class Controller {

    private View view;
    Service sort = new ServiceSort();
    List<PublicationEntity> model = new ArrayList<>();

    public Controller(View view) {
        this.view = view;
    }

    public void processUser() {


        PublicationEntity scientPub = PublicationType.valueOf("SCIENTIFICRESERCH").factory();
        model.add(scientPub);
        PublicationEntity scientPub2 = PublicationType.valueOf("SCIENTIFICRESERCH2").factory();
        model.add(scientPub2);
        PublicationEntity scientPub3 = PublicationType.valueOf("SCIENTIFICRESERCH3").factory();
        model.add(scientPub3);
        PublicationEntity scientBook = PublicationType.valueOf("BOOK").factory();
        model.add(scientBook);
        PublicationEntity scientBook2 = PublicationType.valueOf("BOOK2").factory();
        model.add(scientBook2);
        PublicationEntity scientBook3 = PublicationType.valueOf("BOOK3").factory();
        model.add(scientBook3);
        PublicationEntity magazine = PublicationType.valueOf("MAGAZINE").factory();
        model.add(magazine);
        PublicationEntity magazine2 = PublicationType.valueOf("MAGAZINE2").factory();
        model.add(magazine2);
        PublicationEntity magazine3 = PublicationType.valueOf("MAGAZINE3").factory();
        model.add(magazine3);

        view.printStringInput(LIST_OF_PUBLICATIONS);
        view.printMessage(model);
        sort.sortByAutor(model);
        view.printStringInput(SORTED_LIST_PUBLICATIONS_AUTOR);
        view.printMessage(model);
        sort.sortByYear(model);
        view.printStringInput(SORTED_LIST_PUBLICATIONS_AGE);
        view.printMessage(model);
        sort.sortByPopularity(model);
        view.printStringInput(SORTED_LIST_PUBLICATIONS_POPULARITY);
        view.printMessage(model);
        view.printStringInput(SEARCH_RESULT_AUTHOR_NAME);
        sort.findByParameters(model, "Harry Collins");



    }
}
