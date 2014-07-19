package com.pacard.dao;

import com.pacard.entityRecord.SideEffect;
import com.pacard.entityRecord.Symptom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class SideEffectDao {
    @PersistenceContext
    private EntityManager em;

    public void saveSideEffect(SideEffect effect){
        em.persist(effect);
    }

    public SideEffect findById(Long id) {
        return em.find(SideEffect.class, id);
    }

    public List<SideEffect> findByName(String name) {
        return (List<SideEffect>)em.createQuery("SELECT o from Side_Effect o WHERE o.sideEffectName=:n").
                setParameter("n", name).getResultList();
    }

    public List<SideEffect> findAll() {
        return (List<SideEffect>)em.createQuery("SELECT o from Side_Effect o").getResultList();
    }

    public void updateSideEffect(SideEffect effect) {
        em.merge(effect);
    }

    public void removeSideEffect(SideEffect effect) {
        em.remove(effect);
    }
}