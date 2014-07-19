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
public class NeurostatusDescriptionDao {
    @PersistenceContext
    private EntityManager em;

    public void saveNeurostatusDescription (NeurostatusDescription description){
        em.persist(description);
    }

    public NeurostatusDescription findById(Long id) {
        return em.find(NeurostatusDescription.class, id);
    }

    public List<NeurostatusDescription> findByName(String name) {
        return (List<NeurostatusDescription>)em.createQuery("SELECT o from Neurostatus_Description o " +
                "WHERE o.neurostatusDescriptionName=:n").setParameter("n", name).getResultList();
    }

    public List<NeurostatusDescription> findAll() {
        return (List<NeurostatusDescription>)em.createQuery("SELECT o from Neurostatus_Description o").getResultList();
    }

    public void updateNeurostatusDescription(NeurostatusDescription description) {
        em.merge(description);
    }

    public void removeNeurostatusDescription(NeurostatusDescription description) {
        em.remove(description);
    }
}