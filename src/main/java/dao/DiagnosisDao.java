package com.pacard.dao;

import com.pacard.entityRecord.Diagnosis;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class DiagnosisDao {
    @PersistenceContext
    private EntityManager em;

    public void saveDiagnosis (Diagnosis diagnosis){
        em.persist(diagnosis);
    }

    public Diagnosis findById(int id) {
        return (Diagnosis)em.createQuery("SELECT o from Diagnosis o WHERE o.diagnosisID=:id").
                setParameter("id", id).getSingleResult();
    }

    public Diagnosis findByName(String name) {
        return (Diagnosis)em.createQuery("SELECT o from Diagnosis o WHERE o.diagnosisName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<Diagnosis> findAll() {
        return (List<Diagnosis>)em.createQuery("SELECT o from Diagnosis o").getResultList();
    }

    public void updateDiagnosis(Diagnosis diagnosis) {
        em.merge(diagnosis);
    }

    public void removeDiagnosis(Diagnosis diagnosis) {
        em.remove(diagnosis);
    }
}