package com.pacard.dao;

import com.pacard.entityRecord.NeurostatusType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class NevrostatusTypeDao {
    @PersistenceContext
    private EntityManager em;

    public void saveNevrostatusType (NeurostatusType type){
        em.persist(type);
    }

    public NeurostatusType findById(Long id) {
        return em.find(NeurostatusType.class, id);
    }

    public NeurostatusType findByName(String name) {
        return (NeurostatusType)em.createQuery("SELECT o from Nevrostatus_Type o WHERE o.nevrostatusTypeName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<NeurostatusType> findAll() {
        return (List<NeurostatusType>)em.createQuery("SELECT o from Nevrostatus_Type o").getResultList();
    }

    public void updateNevrostatusType(NeurostatusType type) {
        em.merge(type);
    }

    public void removeNevrostatusType(NeurostatusType type) {
        em.remove(type);
    }
}