package org.pacard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 * Created by Oleg on 30.05.14.
 */
@Entity
@Table(name="RECORD")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordId;

    @ManyToOne
    @JoinColumn(name="patientId")
    private Patient patient;

    // Информация об обследовании
    private Calendar surveyDate;

    @OneToOne
    @JoinColumn(name="doctorId")
    private Doctor doctor;

    private int patientAge;

    // Карточка
    private Collection<Diagnosis> diagnosis = new ArrayList<Diagnosis>();
    private Collection<Syndrome> syndrome = new ArrayList<Syndrome>();

    public String summary;

    public Record() {
    }
}
