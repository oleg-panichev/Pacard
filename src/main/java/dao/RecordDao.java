package com.pacard.dao;

import com.pacard.entityRecord.Recommendation;
import com.pacard.entityRecord.Record;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class RecordDao {
    @PersistenceContext
    private EntityManager em;

    public void saveRecord(Record record){
        em.persist(record);
    }

    public Record findById(int id) {
        return (Record)em.createQuery("SELECT o from Record o WHERE o.recordID=:id").
                setParameter("id", id).getSingleResult();
    }

    public Record findByName(String name) {
        return (Record)em.createQuery("SELECT o from Record o WHERE o.recordName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<Record> findByPatient(int patientID) {
        return (List<Record>)em.createQuery("SELECT o from Record o WHERE o.patient.patientID=:n").
                setParameter("n", patientID).getResultList();
    }

    public List<Record> findAll() {
        return (List<Record>)em.createQuery("SELECT o from Record o").getResultList();
    }

    public void updateRecord(Record record) {
        em.merge(record);
    }

    public void removeRecord(Record record) {
        em.remove(record);
    }
}