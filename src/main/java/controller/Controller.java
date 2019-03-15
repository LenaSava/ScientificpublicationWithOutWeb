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
    List<PublicationEntity> library = new ArrayList<>();

    public Controller(View view) {
        this.view = view;
    }


    public void processUser() {


        PublicationEntity scientPub = PublicationType.valueOf("SCIENTIFICRESERCH").factory();
        library.add(scientPub);
        PublicationEntity scientPub2 = PublicationType.valueOf("SCIENTIFICRESERCH2").factory();
        library.add(scientPub2);
        PublicationEntity scientPub3 = PublicationType.valueOf("SCIENTIFICRESERCH3").factory();
        library.add(scientPub3);
        PublicationEntity scientBook = PublicationType.valueOf("BOOK").factory();
        library.add(scientBook);
        PublicationEntity scientBook2 = PublicationType.valueOf("BOOK2").factory();
        library.add(scientBook2);
        PublicationEntity scientBook3 = PublicationType.valueOf("BOOK3").factory();
        library.add(scientBook3);
        PublicationEntity magazine = PublicationType.valueOf("MAGAZINE").factory();
        library.add(magazine);
        PublicationEntity magazine2 = PublicationType.valueOf("MAGAZINE2").factory();
        library.add(magazine2);
        PublicationEntity magazine3 = PublicationType.valueOf("MAGAZINE3").factory();
        library.add(magazine3);

        view.printStringInput(LIST_OF_PUBLICATIONS);
        view.printMessage(library);
        sort.sortByAutor(library);
        view.printStringInput(SORTED_LIST_PUBLICATIONS_AUTOR);
        view.printMessage(library);
        sort.sortByYear(library);
        view.printStringInput(SORTED_LIST_PUBLICATIONS_AGE);
        view.printMessage(library);
        sort.sortByPopularity(library);
        view.printStringInput(SORTED_LIST_PUBLICATIONS_POPULARITY);
        view.printMessage(library);
        view.printStringInput(SEARCH_RESULT_AUTHOR_NAME);
        view.printMessage("Zoë Lescaze");
        sort.findByParameters(library, "Zoë Lescaze");



    }

}