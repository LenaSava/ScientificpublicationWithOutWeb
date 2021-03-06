package model.services;

import model.DataBase.PublicationType;
import model.entity.PublicationEntity;

import java.util.Comparator;
import java.util.List;


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
    public PublicationEntity findByParameters(List<PublicationEntity> publ, String authorName) {

return publ.stream()
                .filter(x -> authorName.equals(x.getAuthor()))
                .findAny()
                .orElse(null);


}
}