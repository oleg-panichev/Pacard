package org.pacard.dao;

import org.pacard.entityRecord.ResearchType;
import org.pacard.entityRecord.Symptom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class SymptomDao {
    @PersistenceContext
    private EntityManager em;

    public void saveSymptom(Symptom symptom){
        em.persist(symptom);
    }

    public Symptom findById(int id) {
        return (Symptom)em.createQuery("SELECT o from Symptom o WHERE o.symptomID=:id").
                setParameter("id", id).getSingleResult();
    }

    public Symptom findByName(String name) {
        return (Symptom)em.createQuery("SELECT o from Symptom o WHERE o.symptomTypeName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<Symptom> findAll() {
        return (List<Symptom>)em.createQuery("SELECT o from Symptom o").getResultList();
    }

    public void updateSymptom(Symptom symptom) {
        em.merge(symptom);
    }

    public void removeSymptom(Symptom symptom) {
        em.remove(symptom);
    }
}