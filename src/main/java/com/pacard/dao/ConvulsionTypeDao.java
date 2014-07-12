package com.pacard.dao;

import com.pacard.entityRecord.ConvulsionType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class ConvulsionTypeDao {
    @PersistenceContext
    private EntityManager em;

    public void saveConvulsionType (ConvulsionType type){
        em.persist(type);
    }

    public ConvulsionType findById(Long id) {
        return em.find(ConvulsionType.class, id);
    }

    public ConvulsionType findByName(String name) {
        return (ConvulsionType)em.createQuery("SELECT o from Convulsion_Type o WHERE o.convulsionTypeName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<ConvulsionType> findAll() {
        return (List<ConvulsionType>)em.createQuery("SELECT o from Convulsion_Type o").getResultList();
    }

    public void updateConvulsionType(ConvulsionType type) {
        em.merge(type);
    }

    public void removeConvulsionType(ConvulsionType type) {
        em.remove(type);
    }
}