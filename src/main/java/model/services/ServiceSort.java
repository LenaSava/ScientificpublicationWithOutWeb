package model.services;

import model.entity.PublicationEntity;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import view.View;

public class ServiceSort implements Service {

    @Override
    public List<PublicationEntity> sortByPages(List<PublicationEntity> publ) {
        publ.sort(Comparator.comparing(PublicationEntity::getAmountOfPages));
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
    public List<PublicationEntity> findByParameters(List<PublicationEntity> publ, Object qualityOfPaper) {
        System.out.println(qualityOfPaper);
        publ.stream().filter(x -> qualityOfPaper.equals(x.getQualityOfPaper())).collect(Collectors.toList());
        return publ;


    }
}