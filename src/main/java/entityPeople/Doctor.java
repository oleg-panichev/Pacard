package com.pacard.entityPeople;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Oleg on 30.05.14.
 */
@Entity
@Table(name="DOCTOR")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long doctorId;
    public String doctorName;
    public String doctorPost;
    public String phoneNumber;
    public String note;
}
