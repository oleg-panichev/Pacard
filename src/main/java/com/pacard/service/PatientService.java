package com.pacard.service;

import com.pacard.dao.PatientDao;
import com.pacard.entityPeople.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class PatientService {
    @Autowired
    private PatientDao dao;

    @Transactional
    public void savePatient(Patient patient){
        dao.savePatient(patient);
    }

    @Transactional
    public Patient findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public Patient findByName(String name, String surname) {
        return dao.findByName(name, surname);
    }

    @Transactional
    public List<Patient> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updatePatient(Patient patient) {
        dao.updatePatient(patient);
    }

    @Transactional
    public void removePatient(Patient patient) {
        dao.removePatient(patient);
    }
}