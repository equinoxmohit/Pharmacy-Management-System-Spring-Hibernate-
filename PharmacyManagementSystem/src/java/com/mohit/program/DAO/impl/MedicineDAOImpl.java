/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.DAO.impl;

import com.mohit.program.DAO.MedicineDAO;
import com.mohit.program.entity.Medicine;
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
@Repository(value = "medicineDao")
public class MedicineDAOImpl implements MedicineDAO {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;

    @Override
    public void insert(Medicine medicine) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.save(medicine);
        trans.commit();
        session.close();
    }

    @Override
    public List<Medicine> getAll() {
        session = sessionFactory.openSession();
        List<Medicine> medicineList = (List<Medicine>) session.createQuery("SELECT m FROM Medicine m").list();
        session.close();
        return medicineList;
    }

    @Override
    public void delete(int id) {
        Medicine medicine = getById(id);
        if (medicine != null) {
            session = sessionFactory.openSession();
            trans = session.beginTransaction();
            session.delete(medicine);
            trans.commit();
            session.close();
        }

    }

    @Override
    public Medicine getById(int id) {
        Medicine medicine = null;
        session = sessionFactory.openSession();
        medicine = (Medicine) session.get(Medicine.class, id);
        session.close();
        return medicine;
    }

    @Override
    public void update(int id) {
        Medicine m = getById(id);
        if (m != null) {
            session = sessionFactory.openSession();
            trans = session.beginTransaction();
            session.update(m);
            trans.commit();
            session.close();
        }
    }

}
