/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.DAO.impl;

import com.mohit.program.DAO.DiseaseDAO;
import com.mohit.program.entity.Disease;
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
@Repository(value = "diseaseDao")
public class DiseaseDAOImpl implements DiseaseDAO {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction trans;

    @Override
    public void insert(Disease disease) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.save(disease);
        trans.commit();
        session.close();
    }

    @Override
    public List<Disease> getAll() {
        session = sessionFactory.openSession();
        List<Disease> diseaseList = (List<Disease>) session.createQuery("SELECT d FROM Disease d").list();
        session.close();
        return diseaseList;
    }

}
