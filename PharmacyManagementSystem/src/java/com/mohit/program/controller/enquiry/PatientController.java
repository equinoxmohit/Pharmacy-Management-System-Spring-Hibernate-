/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.controller.enquiry;

import com.mohit.program.DAO.DiseaseDAO;
import com.mohit.program.DAO.MedicineDAO;
import com.mohit.program.DAO.PatientDAO;
import com.mohit.program.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mohit
 */
@Controller
@RequestMapping(value = "/enquiry")
public class PatientController {

    @Autowired
    DiseaseDAO diseaseDao;
    @Autowired
    MedicineDAO medicineDao;
    @Autowired
    PatientDAO patientDao;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(ModelMap map) {
        map.addAttribute("disease", diseaseDao.getAll());
        map.addAttribute("medicine", medicineDao.getAll());
        return "enquiry/add";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doPost(Patient p) {
        patientDao.insert(p);
        return "redirect:/display?success";
    }
}
