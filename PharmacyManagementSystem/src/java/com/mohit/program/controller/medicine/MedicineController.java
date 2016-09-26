/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.controller.medicine;

import com.mohit.program.DAO.MedicineDAO;
import com.mohit.program.entity.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mohit
 */
@Controller
@RequestMapping(value = "/medicine")
public class MedicineController {
    
    @Autowired
    MedicineDAO medicineDao;
    
    
    @RequestMapping(method = RequestMethod.GET)
    public String doGet()
    {
        return "medicine/add";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String doPost(Medicine m)
    {
        medicineDao.insert(m);
       return "redirect:/display?success";
    }
}
