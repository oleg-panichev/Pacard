package com.pacard.entityRecord;

/**
 * Created by Алена on 31.05.14.
 */
public class Research {
    private ResearchType type;
    private ResearchDescription description;

    public Research() {
    }

    public ResearchType getType() {
        return type;
    }

    public void setType(ResearchType type) {
        this.type = type;
    }

    public ResearchDescription getDescription() {
        return description;
    }

    public void setDescription(ResearchDescription description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Research{" +
                "type=" + type +
                ", description=" + description +
                '}';
    }
}
