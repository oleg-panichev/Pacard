package com.pacard.service;

import com.pacard.dao.SymptomDao;
import com.pacard.entityRecord.Symptom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class SymptomService {
    @Autowired
    private SymptomDao dao;

    @Transactional
    public void saveSymptom(Symptom symptom){
        dao.saveSymptom(symptom);
    }

    @Transactional
    public Symptom findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public Symptom findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<Symptom> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateSymptom(Symptom symptom) {
        dao.updateSymptom(symptom);
    }

    @Transactional
    public void removeSymptom(Symptom symptom) {
        dao.removeSymptom(symptom);
    }
}