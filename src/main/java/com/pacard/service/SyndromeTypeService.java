package com.pacard.service;

import com.pacard.dao.SyndromeTypeDao;
import com.pacard.entityRecord.SyndromeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class SyndromeTypeService {
    @Autowired
    private SyndromeTypeDao dao;

    @Transactional
    public void saveSyndromeType(SyndromeType type){
        dao.saveSyndromeType(type);
    }

    @Transactional
    public SyndromeType findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public SyndromeType findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<SyndromeType> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateSyndromeType(SyndromeType type) {
        dao.updateSyndromeType(type);
    }

    @Transactional
    public void removeSyndromeType(SyndromeType type) {
        dao.removeSyndromeType(type);
    }
}