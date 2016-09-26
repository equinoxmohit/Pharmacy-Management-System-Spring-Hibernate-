/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.DAO.impl;

import com.mohit.program.DAO.PatientDAO;
import com.mohit.program.entity.Patient;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mohit
 */
@Repository(value = "patientDao")
public class PatientDAOImpl implements PatientDAO {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;

    @Override
    public void insert(Patient p) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.save(p);
        trans.commit();
        session.close();
    }

    @Override
    public List<Patient> getAll() {
        session = sessionFactory.openSession();
        List<Patient> patientList = (List<Patient>) session.createQuery("SELECT p FROM Patient p").list();
        session.close();
        return patientList;
    }

}
