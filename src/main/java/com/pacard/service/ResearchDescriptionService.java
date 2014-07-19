package com.pacard.service;

import com.pacard.dao.ResearchDescriptionDao;
import com.pacard.entityRecord.ResearchDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class ResearchDescriptionService {
    @Autowired
    private ResearchDescriptionDao dao;

    @Transactional
    public void saveResearchDescription(ResearchDescription description){
        dao.saveResearchDescription(description);
    }

    @Transactional
    public ResearchDescription findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public List<ResearchDescription> findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<ResearchDescription> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateResearchDescription(ResearchDescription description) {
        dao.updateResearchDescription(description);
    }

    @Transactional
    public void removeResearchDescription(ResearchDescription description) {
        dao.removeResearchDescription(description);
    }
}