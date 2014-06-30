package com.pacard.dao;

import com.pacard.entityRecord.ResearchType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class ResearchTypeDao {
    @PersistenceContext
    private EntityManager em;

    public void saveResearchType(ResearchType type){
        em.persist(type);
    }

    public ResearchType findById(int id) {
        return (ResearchType)em.createQuery("SELECT o from Research_Type o WHERE o.researchTypeID=:id").
                setParameter("id", id).getSingleResult();
    }

    public ResearchType findByName(String name) {
        return (ResearchType)em.createQuery("SELECT o from Research_Type o WHERE o.researchTypeName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<ResearchType> findAll() {
        return (List<ResearchType>)em.createQuery("SELECT o from Research_Type o").getResultList();
    }

    public void updateResearchType(ResearchType type) {
        em.merge(type);
    }

    public void removeResearchType(ResearchType type) {
        em.remove(type);
    }
}