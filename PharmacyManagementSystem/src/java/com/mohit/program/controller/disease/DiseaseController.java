/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.controller.disease;

import com.mohit.program.DAO.DiseaseDAO;
import com.mohit.program.entity.Disease;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mohit
 */
@Controller
@RequestMapping(value = "/disease")
public class DiseaseController {

    @Autowired
    DiseaseDAO diseaseDao;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet() {
        return "disease/add";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doPost(Disease disease) {
        diseaseDao.insert(disease);
        return "redirect:/view?success";
    }

}
