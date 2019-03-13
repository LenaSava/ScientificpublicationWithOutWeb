package model.services;

import model.entity.PublicationEntity;

import java.util.List;

public interface Service {

    public abstract List<PublicationEntity> sortByPages(List<PublicationEntity> publ);

    public abstract List<PublicationEntity> sortByPopularity(List<PublicationEntity> publ);

    public abstract List<PublicationEntity> sortByAutor(List<PublicationEntity> publ);

    public abstract List<PublicationEntity> findByParameters(List<PublicationEntity> publ, Object o);


}
