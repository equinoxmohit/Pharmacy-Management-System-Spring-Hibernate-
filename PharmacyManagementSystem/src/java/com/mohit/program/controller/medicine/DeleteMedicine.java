/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.controller.medicine;

import com.mohit.program.DAO.MedicineDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Mohit
 */
@Controller
@RequestMapping(value = "/delete")
public class DeleteMedicine {
    
    @Autowired
    MedicineDAO medicineDao;
    
    @RequestMapping(value = "/{id}")
    public String doGet(@PathVariable("id") int id)
    {
        medicineDao.delete(id);
        return "redirect:/display?success";
    }
}
