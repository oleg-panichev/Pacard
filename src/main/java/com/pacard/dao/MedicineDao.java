package com.pacard.dao;

import com.pacard.entityRecord.Medicine;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class MedicineDao {
    @PersistenceContext
private EntityManager em;

    public void saveMedicine (Medicine medicine){
        em.persist(medicine);
    }

    public Medicine findById(Long id) {
        return em.find(Medicine.class, id);
    }

    public Medicine findByName(String name) {
        return (Medicine)em.createQuery("SELECT o from Medicine o WHERE o.medicineName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<Medicine> findAll() {
        return (List<Medicine>)em.createQuery("SELECT o from Medicine o").getResultList();
    }

    public void updateMedicine(Medicine medicine) {
        em.merge(medicine);
    }

    public void removeMedicine(Medicine medicine) {
        em.remove(medicine);
    }
}