package com.pacard.service;

import com.pacard.dao.ConvulsionTypeDao;
import com.pacard.entityRecord.ConvulsionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class ConvulsionTypeService {
    @Autowired
    private ConvulsionTypeDao dao;

    @Transactional
    public void saveConvulsionType(ConvulsionType type){
        dao.saveConvulsionType(type);
    }

    @Transactional
    public ConvulsionType findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public ConvulsionType findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<ConvulsionType> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateConvulsionType(ConvulsionType type) {
        dao.updateConvulsionType(type);
    }

    @Transactional
    public void removeConvulsionType(ConvulsionType type) {
        dao.removeConvulsionType(type);
    }
}