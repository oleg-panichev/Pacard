package com.pacard.service;

import com.pacard.dao.AnalysisDescriptionDao;
import com.pacard.entityRecord.AnalysisDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class AnalysisDescriptionService {
    @Autowired
    private AnalysisDescriptionDao dao;

    @Transactional
    public void saveAnalysisDescription(AnalysisDescription description){
        dao.saveAnalysisDescription(description);
    }

    @Transactional
    public AnalysisDescription findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public List<AnalysisDescription> findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<AnalysisDescription> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateAnalysisDescription(AnalysisDescription description) {
        dao.updateAnalysisDescription(description);
    }

    @Transactional
    public void removeAnalysisDescription(AnalysisDescription description) {
        dao.removeAnalysisDescription(description);
    }
}