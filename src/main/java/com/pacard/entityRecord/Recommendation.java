package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 01.06.14.
 */
@Entity
public class Recommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recommendationId;

    private String recommendationName;

    public Recommendation() {
    }

    public Long getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(Long recommendationId) {
        this.recommendationId = recommendationId;
    }

    public String getRecommendationName() {
        return recommendationName;
    }

    public void setRecommendationName(String recommendationName) {
        this.recommendationName = recommendationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recommendation)) return false;

        Recommendation that = (Recommendation) o;

        if (!recommendationName.equals(that.recommendationName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return recommendationName.hashCode();
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "recommendationId=" + recommendationId +
                ", recommendationName='" + recommendationName + '\'' +
                '}';
    }
}
