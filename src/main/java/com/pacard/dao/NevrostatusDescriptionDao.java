package com.pacard.dao;

import com.pacard.entityRecord.NeurostatusDescription;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class NevrostatusDescriptionDao {
    @PersistenceContext
    private EntityManager em;

    public void saveNevrostatusDescription (NeurostatusDescription description){
        em.persist(description);
    }

    public NeurostatusDescription findById(Long id) {
        return em.find(NeurostatusDescription.class, id);
    }

    public NeurostatusDescription findByName(String name) {
        return (NeurostatusDescription)em.createQuery("SELECT o from Nevrostatus_Description o WHERE o.nevrostatusDescriptionName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<NeurostatusDescription> findAll() {
        return (List<NeurostatusDescription>)em.createQuery("SELECT o from Nevrostatus_Description o").getResultList();
    }

    public void updateNevrostatusDescription(NeurostatusDescription description) {
        em.merge(description);
    }

    public void removeNevrostatusDescription(NeurostatusDescription description) {
        em.remove(description);
    }
}