package com.pacard.dao;

import com.pacard.entityRecord.ResearchDescription;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class ResearchDescriptionDao {
    @PersistenceContext
    private EntityManager em;

    public void saveResearchDescription(ResearchDescription description){
        em.persist(description);
    }

    public ResearchDescription findById(Long id) {
        return em.find(ResearchDescription.class, id);
    }

    public ResearchDescription findByName(String name) {
        return (ResearchDescription)em.createQuery("SELECT o from Research_Description o WHERE o.researchDescriptionName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<ResearchDescription> findAll() {
        return (List<ResearchDescription>)em.createQuery("SELECT o from Research_Description o").getResultList();
    }

    public void updateResearchDescription(ResearchDescription description) {
        em.merge(description);
    }

    public void removeResearchDescription(ResearchDescription description) {
        em.remove(description);
    }
}