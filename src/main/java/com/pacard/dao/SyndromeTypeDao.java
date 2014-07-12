package com.pacard.dao;

import com.pacard.entityRecord.SideEffect;
import com.pacard.entityRecord.SyndromeType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class SyndromeTypeDao {
    @PersistenceContext
    private EntityManager em;

    public void saveSyndromeType(SyndromeType type){
        em.persist(type);
    }

    public SyndromeType findById(Long id) {
        return em.find(SyndromeType.class, id);
    }

    public SyndromeType findByName(String name) {
        return (SyndromeType)em.createQuery("SELECT o from Syndrome_Type o WHERE o.syndromeTypeName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<SyndromeType> findAll() {
        return (List<SyndromeType>)em.createQuery("SELECT o from Syndrome_Type o").getResultList();
    }

    public void updateSyndromeType(SyndromeType type) {
        em.merge(type);
    }

    public void removeSyndromeType(SyndromeType type) {
        em.remove(type);
    }
}