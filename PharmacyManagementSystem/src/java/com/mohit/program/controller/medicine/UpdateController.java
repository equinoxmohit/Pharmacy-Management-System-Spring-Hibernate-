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
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mohit
 */
@Controller
@RequestMapping(value = "/edit")
public class UpdateController {

    @Autowired
    MedicineDAO medicineDao;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String doGet(@PathVariable("id") int id, ModelMap map) {
        Medicine medicine = medicineDao.getById(id);
        if (medicine == null) {
            return "redirect:/display?error";
        }
        map.addAttribute("med", medicine);
        return "medicine/edit";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String doPost(@PathVariable("id") int id) {
       medicineDao.update(id);
        return "redirect:/display?success";
    }

}
