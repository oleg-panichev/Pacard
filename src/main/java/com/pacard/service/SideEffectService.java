package com.pacard.service;

import com.pacard.dao.SideEffectDao;
import com.pacard.entityRecord.SideEffect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class SideEffectService {
    @Autowired
    private SideEffectDao dao;

    @Transactional
    public void saveSideEffect(SideEffect effect){
        dao.saveSideEffect(effect);
    }

    @Transactional
    public SideEffect findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public List<SideEffect> findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<SideEffect> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateSideEffect(SideEffect effect) {
        dao.updateSideEffect(effect);
    }

    @Transactional
    public void removeSideEffect(SideEffect effect) {
        dao.removeSideEffect(effect);
    }
}