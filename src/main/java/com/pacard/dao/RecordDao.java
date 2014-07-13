package com.pacard.dao;

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
        return em.find(Record.class, id);
    }

    public List<Record> findByUsername(String username) {
        return (List<Record>)em.createQuery("SELECT o from Record, app_user o WHERE o.record.user.username=:n").
                setParameter("n", username).getResultList();
    }

    public List<Record> findByPatient(int patientId) {
        return (List<Record>)em.createQuery("SELECT o from Record, Patient o WHERE o.patient.patientId=:n").
                setParameter("n", patientId).getResultList();
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