package com.pacard.service;

import com.pacard.dao.DebutDescriptionDao;
import com.pacard.entityRecord.DebutDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class DebutDescriptionService {
    @Autowired
    private DebutDescriptionDao dao;

    @Transactional
    public void saveDebutDescription(DebutDescription description){
        dao.saveDebutDescription(description);
    }

    @Transactional
    public DebutDescription findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public List<DebutDescription> findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<DebutDescription> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateDebutDescription(DebutDescription description) {
        dao.updateDebutDescription(description);
    }

    @Transactional
    public void removeDebutDescription(DebutDescription description) {
        dao.removeDebutDescription(description);
    }
}