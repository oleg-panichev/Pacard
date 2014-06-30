package com.pacard.dao;

import com.pacard.entityRecord.Anamnesis;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class AnamnesisDao {
    @PersistenceContext
    private EntityManager em;

    public void saveAnamnesis (Anamnesis anamnesis){
        em.persist(anamnesis);
    }

    public Anamnesis findById(int id) {
        return (Anamnesis)em.createQuery("SELECT o from Anamnesis o WHERE o.anamnesisID=:id").
                setParameter("id", id).getSingleResult();
    }

    public Anamnesis findByName(String name) {
        return (Anamnesis)em.createQuery("SELECT o from Anamnesis o WHERE o.anamnesisName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<Anamnesis> findAll() {
        return (List<Anamnesis>)em.createQuery("SELECT o from Anamnesis o").getResultList();
    }

    public void updateAnamnesis(Anamnesis anamnesis) {
        em.merge(anamnesis);
    }

    public void removeAnamnesis(Anamnesis anamnesis) {
        em.remove(anamnesis);
    }
}