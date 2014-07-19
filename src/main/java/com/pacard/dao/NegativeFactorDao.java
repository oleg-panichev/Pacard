package com.pacard.dao;

import com.pacard.entityRecord.MedicineGroup;
import com.pacard.entityRecord.NegativeFactor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class NegativeFactorDao {
    @PersistenceContext
    private EntityManager em;

    public void saveNegativeFactor (NegativeFactor factor){
        em.persist(factor);
    }

    public NegativeFactor findById(Long id) {
        return em.find(NegativeFactor.class, id);
    }

    public NegativeFactor findByName(String name) {
        return (NegativeFactor)em.createQuery("SELECT o from Negative_Factor o WHERE o.negativeFactorName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<NegativeFactor> findAll() {
        return (List<NegativeFactor>)em.createQuery("SELECT o from Negative_Factor o").getResultList();
    }

    public void updateNegativeFactor(NegativeFactor factor) {
        em.merge(factor);
    }

    public void removeNegativeFactor(NegativeFactor factor) {
        em.remove(factor);
    }
}