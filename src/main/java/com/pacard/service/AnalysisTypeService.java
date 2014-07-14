package com.pacard.service;

import com.pacard.dao.AnalysisTypeDao;
import com.pacard.entityRecord.AnalysisType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class AnalysisTypeService {
    @Autowired
    private AnalysisTypeDao dao;

    @Transactional
    public void saveAnalysisType(AnalysisType type){
        dao.saveAnalysisType(type);
    }

    @Transactional
    public AnalysisType findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public AnalysisType findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<AnalysisType> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateAnalysisType(AnalysisType type) {
        dao.updateAnalysisType(type);
    }

    @Transactional
    public void removeAnalysisType(AnalysisType type) {
        dao.removeAnalysisType(type);
    }
}