package com.pacard.dao;

import com.pacard.entityPeople.Patient;
import com.pacard.entityRecord.Medicine;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Oleg on 30.05.14.
 */
@Repository
public class PatientDao {
    @PersistenceContext
    private EntityManager em;

    public void savePatient (Patient patient){
        em.persist(patient);
    }

    public Patient findById(Long id) {
        return em.find(Patient.class, id);
    }

    public Patient findByName(String name) {
        return (Patient)em.createQuery("SELECT o from Patient o WHERE o.patientName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<Patient> findAll() {
        return (List<Patient>)em.createQuery("SELECT o from Patient o").getResultList();
    }

    public void updatePatient(Patient patient) {
        em.merge(patient);
    }

    public void removePatient(Patient patient) {
        em.remove(patient);
    }
}