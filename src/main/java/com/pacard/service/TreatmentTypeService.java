package com.pacard.service;

import com.pacard.dao.SyndromeTypeDao;
import com.pacard.dao.TreatmentTypeDao;
import com.pacard.entityRecord.SyndromeType;
import com.pacard.entityRecord.TreatmentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class TreatmentTypeService {
    @Autowired
    private TreatmentTypeDao dao;

    @Transactional
    public void saveTreatmentType(TreatmentType type){
        dao.saveTreatmentType(type);
    }

    @Transactional
    public TreatmentType findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public TreatmentType findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<TreatmentType> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateTreatmentType(TreatmentType type) {
        dao.updateTreatmentType(type);
    }

    @Transactional
    public void removeTreatmentType(TreatmentType type) {
        dao.removeTreatmentType(type);
    }
}