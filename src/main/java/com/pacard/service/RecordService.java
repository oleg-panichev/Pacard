package com.pacard.service;

import com.pacard.dao.RecordDao;
import com.pacard.entityRecord.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Алена on 14.07.14.
 */
@Service
public class RecordService {
    @Autowired
    private RecordDao dao;

    @Transactional
    public void saveRecord(Record record){
        dao.saveRecord(record);
    }

    @Transactional
    public Record findById(Long id) {
        return dao.findById(id);
    }

    @Transactional
    public List<Record> findByUsername(String name) {
        return dao.findByUsername(name);
    }

    @Transactional
    public List<Record> findByPatientId(Long id) {
        return dao.findByPatientId(id);
    }

    @Transactional
    public List<Record> findAll() {
        return dao.findAll();
    }

    @Transactional
    public void updateRecord(Record record) {
        dao.updateRecord(record);
    }

    @Transactional
    public void removeRecord(Record record) {
        dao.removeRecord(record);
    }
}