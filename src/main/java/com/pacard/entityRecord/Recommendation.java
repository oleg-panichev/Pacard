package com.pacard.entityRecord;

import javax.persistence.*;

/**
 * Created by Алена on 01.06.14.
 */
@Entity
@Table(name="RECOMMENDATION")
public class Recommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recommendationID;
    private String recommendationName;

    public Recommendation() {
    }

    public Long getRecommendationID() {
        return recommendationID;
    }

    public void setRecommendationID(Long recommendationID) {
        this.recommendationID = recommendationID;
    }

    public String getRecommendationName() {
        return recommendationName;
    }

    public void setRecommendationName(String recommendationName) {
        this.recommendationName = recommendationName;
    }
}
