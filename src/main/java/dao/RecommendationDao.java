package com.pacard.dao;

import com.pacard.entityRecord.NevrostatusType;
import com.pacard.entityRecord.Recommendation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Алена on 07.06.14.
 */
@Repository
public class RecommendationDao {
    @PersistenceContext
    private EntityManager em;

    public void saveRecommendation(Recommendation recommendation){
        em.persist(recommendation);
    }

    public Recommendation findById(int id) {
        return (Recommendation)em.createQuery("SELECT o from Recommendation o WHERE o.recommendationID=:id").
                setParameter("id", id).getSingleResult();
    }

    public Recommendation findByName(String name) {
        return (Recommendation)em.createQuery("SELECT o from Recommendation o WHERE o.recommendationName=:n").
                setParameter("n", name).getSingleResult();
    }

    public List<Recommendation> findAll() {
        return (List<Recommendation>)em.createQuery("SELECT o from Recommendation o").getResultList();
    }

    public void updateRecommendation(Recommendation recommendation) {
        em.merge(recommendation);
    }

    public void removeRecommendation(Recommendation recommendation) {
        em.remove(recommendation);
    }
}
