package com.pacard.service;

import com.pacard.dao.MedicineDao;
import com.pacard.entityRecord.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class MedicineService {
    @Autowired
    private MedicineDao dao;

    @Transactional
    public void saveMedicine(Medicine medicine){
        dao.saveMedicine(medicine);
    }

    @Transactional
    public Medicine findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public Medicine findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<Medicine> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateMedicine(Medicine medicine) {
        dao.updateMedicine(medicine);
    }

    @Transactional
    public void removeMedicine(Medicine medicine) {
        dao.removeMedicine(medicine);
    }
}