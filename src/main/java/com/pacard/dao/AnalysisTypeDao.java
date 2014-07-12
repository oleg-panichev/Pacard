package com.pacard.dao;

import com.pacard.entityRecord.AnalysisType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class AnalysisTypeDao {
    @PersistenceContext
    private EntityManager em;

    public void saveAnalysisType (AnalysisType type){
        em.persist(type);
    }

    public AnalysisType findById(Long id) {
        return em.find(AnalysisType.class, id);
    }

    public AnalysisType findByName(String name) {
        return (AnalysisType)em.createQuery("SELECT o from Analysis_Type o WHERE o.analysisTypeName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<AnalysisType> findAll() {
        return (List<AnalysisType>)em.createQuery("SELECT o from Analysis_Type o").getResultList();
    }

    public void updateAnalysisType(AnalysisType type) {
        em.merge(type);
    }

    public void removeAnalysisType(AnalysisType type) {
        em.remove(type);
    }
}