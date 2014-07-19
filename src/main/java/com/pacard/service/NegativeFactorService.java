package com.pacard.service;

import com.pacard.dao.NegativeFactorDao;
import com.pacard.entityRecord.NegativeFactor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class NegativeFactorService {
    @Autowired
    private NegativeFactorDao dao;

    @Transactional
    public void saveNegativeFactor(NegativeFactor factor){
        dao.saveNegativeFactor(factor);
    }

    @Transactional
    public NegativeFactor findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public NegativeFactor findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<NegativeFactor> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateNegativeFactor(NegativeFactor factor) {
        dao.updateNegativeFactor(factor);
    }

    @Transactional
    public void removeNegativeFactor(NegativeFactor factor) {
        dao.removeNegativeFactor(factor);
    }
}