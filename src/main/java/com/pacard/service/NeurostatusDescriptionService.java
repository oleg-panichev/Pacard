package com.pacard.service;

import com.pacard.dao.NeurostatusDescriptionDao;
import com.pacard.entityRecord.NeurostatusDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class NeurostatusDescriptionService {
    @Autowired
    private NeurostatusDescriptionDao dao;

    @Transactional
    public void saveNeurostatusDescription(NeurostatusDescription description){
        dao.saveNeurostatusDescription(description);
    }

    @Transactional
    public NeurostatusDescription findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public List<NeurostatusDescription> findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<NeurostatusDescription> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateNeurostatusDescription(NeurostatusDescription description) {
        dao.updateNeurostatusDescription(description);
    }

    @Transactional
    public void removeNeurostatusDescription(NeurostatusDescription description) {
        dao.removeNeurostatusDescription(description);
    }
}