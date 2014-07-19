package com.pacard.service;

import com.pacard.dao.RecommendationDao;
import com.pacard.entityRecord.Recommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */

@Service
public class RecommendationService {
    @Autowired
    private RecommendationDao dao;

    @Transactional
    public void saveRecommendation(Recommendation recommendation){
        dao.saveRecommendation(recommendation);
    }

    @Transactional
    public Recommendation findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public Recommendation findByName(String name) {
        return dao.findByName(name);
    }

    @Transactional
    public List<Recommendation> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateRecommendation(Recommendation recommendation) {
        dao.updateRecommendation(recommendation);
    }

    @Transactional
    public void removeRecommendation(Recommendation recommendation) {
        dao.removeRecommendation(recommendation);
    }
}