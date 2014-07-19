package com.pacard.service;

import com.pacard.dao.NeurostatusTypeDao;
import com.pacard.entityRecord.NeurostatusType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class NeurostatusTypeService {
    @Autowired
    private NeurostatusTypeDao dao;

    @Transactional
    public void saveNeurostatusType(NeurostatusType type){
        dao.saveNeurostatusType(type);
    }

    @Transactional
    public NeurostatusType findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public NeurostatusType findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<NeurostatusType> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateNeurostatusType(NeurostatusType type) {
        dao.updateNeurostatusType(type);
    }

    @Transactional
    public void removeNeurostatusType(NeurostatusType type) {
        dao.removeNeurostatusType(type);
    }
}