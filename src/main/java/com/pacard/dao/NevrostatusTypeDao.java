package com.pacard.dao;

import com.pacard.entityRecord.NevrostatusType;
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

    public void saveNevrostatusType (NevrostatusType type){
        em.persist(type);
    }

    public NevrostatusType findById(int id) {
        return (NevrostatusType)em.createQuery("SELECT o from Nevrostatus_Type o WHERE o.nevrostatusTypeID=:id").
                setParameter("id", id).getSingleResult();
    }

    public NevrostatusType findByName(String name) {
        return (NevrostatusType)em.createQuery("SELECT o from Nevrostatus_Type o WHERE o.nevrostatusTypeName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<NevrostatusType> findAll() {
        return (List<NevrostatusType>)em.createQuery("SELECT o from Nevrostatus_Type o").getResultList();
    }

    public void updateNevrostatusType(NevrostatusType type) {
        em.merge(type);
    }

    public void removeNevrostatusType(NevrostatusType type) {
        em.remove(type);
    }
}