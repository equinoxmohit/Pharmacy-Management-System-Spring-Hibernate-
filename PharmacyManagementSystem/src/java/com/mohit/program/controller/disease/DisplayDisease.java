/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.controller.disease;

import com.mohit.program.DAO.DiseaseDAO;
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
@RequestMapping(value = "/view")
public class DisplayDisease {

    @Autowired
    DiseaseDAO diseaseDao;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(ModelMap map) {
        map.addAttribute("disease", diseaseDao.getAll());
        return "disease/display";
    }
}
