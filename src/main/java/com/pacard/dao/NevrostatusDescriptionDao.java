package org.pacard.dao;

import org.pacard.entityRecord.NevrostatusDescription;
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

    public void saveNevrostatusDescription (NevrostatusDescription description){
        em.persist(description);
    }

    public NevrostatusDescription findById(int id) {
        return (NevrostatusDescription)em.createQuery("SELECT o from Nevrostatus_Description o WHERE o.nevrostatusDescriptionID=:id").
                setParameter("id", id).getSingleResult();
    }

    public NevrostatusDescription findByName(String name) {
        return (NevrostatusDescription)em.createQuery("SELECT o from Nevrostatus_Description o WHERE o.nevrostatusDescriptionName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<NevrostatusDescription> findAll() {
        return (List<NevrostatusDescription>)em.createQuery("SELECT o from Nevrostatus_Description o").getResultList();
    }

    public void updateNevrostatusDescription(NevrostatusDescription description) {
        em.merge(description);
    }

    public void removeNevrostatusDescription(NevrostatusDescription description) {
        em.remove(description);
    }
}