package com.pacard.service;

import com.pacard.dao.MedicineGroupDao;
import com.pacard.entityRecord.MedicineGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class MedicineGroupService {
    @Autowired
    private MedicineGroupDao dao;

    @Transactional
    public void saveMedicineGroup(MedicineGroup group){
        dao.saveMedicineGroup(group);
    }

    @Transactional
    public MedicineGroup findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public MedicineGroup findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<MedicineGroup> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateMedicineGroup(MedicineGroup group) {
        dao.updateMedicineGroup(group);
    }

    @Transactional
    public void removeMedicineGroup(MedicineGroup group) {
        dao.removeMedicineGroup(group);
    }
}