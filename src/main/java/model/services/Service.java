package model.services;

import model.entity.PublicationEntity;

import java.util.List;

public interface Service {


    public abstract List<PublicationEntity> sortByYear(List<PublicationEntity> publ);

    public abstract List<PublicationEntity> sortByPopularity(List<PublicationEntity> publ);

    public abstract List<PublicationEntity> sortByAutor(List<PublicationEntity> publ);

    public abstract List<PublicationEntity> findByParameters(List<PublicationEntity> publ, String o);


}
