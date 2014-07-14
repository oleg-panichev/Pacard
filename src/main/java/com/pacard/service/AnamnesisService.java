package com.pacard.service;

import com.pacard.dao.AnamnesisDao;
import com.pacard.entityRecord.Anamnesis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class AnamnesisService {
    @Autowired
    private AnamnesisDao dao;

    @Transactional
    public void saveAnamnesis(Anamnesis anamnesis){
        dao.saveAnamnesis(anamnesis);
    }

    @Transactional
    public Anamnesis findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public Anamnesis findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<Anamnesis> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateAnamnesis(Anamnesis anamnesis) {
        dao.updateAnamnesis(anamnesis);
    }

    @Transactional
    public void removeAnamnesis(Anamnesis anamnesis) {
        dao.removeAnamnesis(anamnesis);
    }
}