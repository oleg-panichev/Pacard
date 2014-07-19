package com.pacard.service;

import com.pacard.dao.DiagnosisDao;
import com.pacard.entityRecord.Diagnosis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class DiagnosisService {
    @Autowired
    private DiagnosisDao dao;

    @Transactional
    public void saveDiagnosis(Diagnosis diagnosis){
        dao.saveDiagnosis(diagnosis);
    }

    @Transactional
    public Diagnosis findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public Diagnosis findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<Diagnosis> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateDiagnosis(Diagnosis diagnosis) {
        dao.updateDiagnosis(diagnosis);
    }

    @Transactional
    public void removeDiagnosis(Diagnosis diagnosis) {
        dao.removeDiagnosis(diagnosis);
    }
}