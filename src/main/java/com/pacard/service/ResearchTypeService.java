package com.pacard.service;

import com.pacard.dao.ResearchTypeDao;
import com.pacard.entityRecord.ResearchType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class ResearchTypeService {
    @Autowired
    private ResearchTypeDao dao;

    @Transactional
    public void saveResearchType(ResearchType type){
        dao.saveResearchType(type);
    }

    @Transactional
    public ResearchType findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public ResearchType findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<ResearchType> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateResearchType(ResearchType type) {
        dao.updateResearchType(type);
    }

    @Transactional
    public void removeResearchType(ResearchType type) {
        dao.removeResearchType(type);
    }
}