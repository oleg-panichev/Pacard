package com.pacard.dao;

import com.pacard.entityRecord.AnalysisDescription;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class AnalysisDescriptionDao {
    @PersistenceContext
    private EntityManager em;

    public void saveAnalysisDescription (AnalysisDescription description){
        em.persist(description);
    }

    public AnalysisDescription findById(Long id) {
        return em.find(AnalysisDescription.class, id);
    }

    public List<AnalysisDescription> findByName(String name) {
        return (List<AnalysisDescription>)em.createQuery("SELECT o from Analysis_Description o WHERE o.analysisDescriptionName=:n").
                setParameter("n", name).getResultList();
    }

    public List<AnalysisDescription> findAll() {
        return (List<AnalysisDescription>)em.createQuery("SELECT o from Analysis_Description o").getResultList();
    }

    public void updateAnalysisDescription(AnalysisDescription description) {
        em.merge(description);
    }

    public void removeAnalysisDescription(AnalysisDescription description) {
        em.remove(description);
    }
}