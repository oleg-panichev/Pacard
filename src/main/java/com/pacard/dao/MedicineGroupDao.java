package com.pacard.dao;

import com.pacard.entityRecord.Medicine;
import com.pacard.entityRecord.MedicineGroup;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class MedicineGroupDao {
    @PersistenceContext
    private EntityManager em;

    public void saveMedicineGroup (MedicineGroup group){
        em.persist(group);
    }

    public MedicineGroup findById(int id) {
        return (MedicineGroup)em.createQuery("SELECT o from Medicine_Group o WHERE o.medicineGroupID=:id").
                setParameter("id", id).getSingleResult();
    }

    public MedicineGroup findByName(String name) {
        return (MedicineGroup)em.createQuery("SELECT o from Medicine_Group o WHERE o.medicineGroupName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<MedicineGroup> findAll() {
        return (List<MedicineGroup>)em.createQuery("SELECT o from Medicine_Group o").getResultList();
    }

    public void updateMedicineGroup(MedicineGroup group) {
        em.merge(group);
    }

    public void removeMedicineGroup(MedicineGroup group) {
        em.remove(group);
    }
}