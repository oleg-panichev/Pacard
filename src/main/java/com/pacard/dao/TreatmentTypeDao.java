package com.pacard.dao;

import com.pacard.entityRecord.SyndromeType;
import com.pacard.entityRecord.TreatmentType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class TreatmentTypeDao {
    @PersistenceContext
    private EntityManager em;

    public void saveTreatmentType(TreatmentType type){
        em.persist(type);
    }

    public TreatmentType findById(int id) {
        return (TreatmentType)em.createQuery("SELECT o from Treatment_Type o WHERE o.treatmentTypeID=:id").
                setParameter("id", id).getSingleResult();
    }

    public TreatmentType findByName(String name) {
        return (TreatmentType)em.createQuery("SELECT o from Treatment_Type o WHERE o.treatmentTypeName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<TreatmentType> findAll() {
        return (List<TreatmentType>)em.createQuery("SELECT o from Treatment_Type o").getResultList();
    }

    public void updateTreatmentType(TreatmentType type) {
        em.merge(type);
    }

    public void removeTreatmentType(TreatmentType type) {
        em.remove(type);
    }
}