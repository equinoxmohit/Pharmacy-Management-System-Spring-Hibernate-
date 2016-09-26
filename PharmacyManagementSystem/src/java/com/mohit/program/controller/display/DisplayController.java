/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.controller.display;

import com.mohit.program.DAO.MedicineDAO;
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
@RequestMapping(value = "/display")
public class DisplayController {
    
    @Autowired
    MedicineDAO medicineDao;
    
    @RequestMapping(method = RequestMethod.GET)
    public String doGet(ModelMap map)
    {
        map.addAttribute("medicine", medicineDao.getAll());
        return "display/display";
    }
    
    
    
}
