package com.pacard.dao;

import com.pacard.entityRecord.DebutDescription;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class DebutDescriptionDao {
    @PersistenceContext
    private EntityManager em;

    public void saveDebutDescription (DebutDescription description){
        em.persist(description);
    }

    public DebutDescription findById(Long id) {
        return em.find(DebutDescription.class, id);
    }

    public List<DebutDescription> findByName(String name) {
        return (List<DebutDescription>)em.createQuery("SELECT o from Debut_Description o WHERE o.debutDescriptionName=:n").
                setParameter("n", name).getResultList();
    }

    public List<DebutDescription> findAll() {
        return (List<DebutDescription>)em.createQuery("SELECT o from Debut_Description o").getResultList();
    }

    public void updateDebutDescription(DebutDescription description) {
        em.merge(description);
    }

    public void removeDebutDescription(DebutDescription description) {
        em.remove(description);
    }
}