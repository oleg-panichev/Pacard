package com.pacard.entityRecord;

/**
 * Created by Алена on 31.05.14.
 */
public class Neurostatus {
    private NeurostatusType type;
    private NeurostatusDescription description;

    public NeurostatusType getType() {
        return type;
    }

    public void setType(NeurostatusType type) {
        this.type = type;
    }

    public NeurostatusDescription getDescription() {
        return description;
    }

    public void setDescription(NeurostatusDescription description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Neurostatus{" +
                "type=" + type +
                ", description=" + description +
                '}';
    }
}
