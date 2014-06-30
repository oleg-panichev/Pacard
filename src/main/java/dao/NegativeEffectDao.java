package com.pacard.dao;

import com.pacard.entityRecord.MedicineGroup;
import com.pacard.entityRecord.NegativeEffect;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class NegativeEffectDao {
    @PersistenceContext
    private EntityManager em;

    public void saveNegativeEffect (NegativeEffect effect){
        em.persist(effect);
    }

    public NegativeEffect findById(int id) {
        return (NegativeEffect)em.createQuery("SELECT o from Negative_Effect o WHERE o.negativeEffectID=:id").
                setParameter("id", id).getSingleResult();
    }

    public NegativeEffect findByName(String name) {
        return (NegativeEffect)em.createQuery("SELECT o from Negative_Effect o WHERE o.negativeEffectName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<NegativeEffect> findAll() {
        return (List<NegativeEffect>)em.createQuery("SELECT o from Negative_Effect o").getResultList();
    }

    public void updateNegativeEffect(NegativeEffect effect) {
        em.merge(effect);
    }

    public void removeNegativeEffect(NegativeEffect effect) {
        em.remove(effect);
    }
}