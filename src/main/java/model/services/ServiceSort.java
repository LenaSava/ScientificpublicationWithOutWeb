package model.services;

import model.entity.Book;
import model.entity.PublicationEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import view.View;

public class ServiceSort implements Service {

    @Override
    public List<PublicationEntity> sortByYear(List<PublicationEntity> publ) {
        publ.sort(Comparator.comparing(PublicationEntity::getYearOfPublication));
        return publ;

    }

    @Override
    public List<PublicationEntity> sortByPopularity(List<PublicationEntity> publ) {
        publ.sort(Comparator.comparing(PublicationEntity::getPopularity));
        return publ;
    }

    @Override
    public List<PublicationEntity> sortByAutor(List<PublicationEntity> publ) {
        publ.sort(Comparator.comparing(PublicationEntity::getAuthor));
        return publ;
    }

    @Override
    public List<PublicationEntity> findByParameters(List<PublicationEntity> publ, String authorName) {
        System.out.println(authorName);
        System.out.println(publ.stream()
                .filter(x -> authorName.equals(x.getAuthor()))
                .findAny()
                .orElse(null));
        return publ;

    }
}