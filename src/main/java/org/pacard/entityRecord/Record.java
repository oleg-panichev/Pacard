package org.pacard.entityRecord;

import org.pacard.entityPeople.PacardUser;
import org.pacard.entityPeople.Patient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.*;

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
    private Calendar date;

    @ManyToOne
    @JoinColumn(name="doctorId")
    private PacardUser doctor;

    private int patientAge;

    // Карточка
    private Map<Diagnosis, String> diagnosis = new TreeMap<Diagnosis, String>();
    public Map<Anamnesis, String> anamnesis = new TreeMap<Anamnesis, String>();
    public Map<Debut, String> debut = new TreeMap<Debut, String>();
    public Map<Convulsion, String> convulsions = new TreeMap<Convulsion, String>();

    private Map<Syndrome, String> syndromes = new TreeMap<Syndrome, String>();
    public Map<Nevrostatus, String> nevrostatus = new TreeMap<Nevrostatus, String>();
    public Map<Analysis, String> analysis = new TreeMap<Analysis, String>();
    public Map<Research, String> research = new TreeMap<Research, String>();

    private Map<Recommendation, String> recommendations = new TreeMap<Recommendation, String>();
    private Map<MedicineGroup, String> medicines = new TreeMap<MedicineGroup, String>();
    private Map<Treatment, String> treatment = new TreeMap<Treatment, String>();
    private Map<Effect, String> effects = new TreeMap<Effect, String>();
    public String summary;

    public Record() {
    }
}
