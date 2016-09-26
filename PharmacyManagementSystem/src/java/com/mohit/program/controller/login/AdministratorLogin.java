/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.controller.login;

import com.mohit.program.DAO.LoginDAO;
import com.mohit.program.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Mohit
 */
@Controller
@RequestMapping(value = "/admin")
public class AdministratorLogin {
    
    @Autowired
    LoginDAO loginDao;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet() {
        return "admin/login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doPost(Admin admin) {
        admin=loginDao.login(admin.getUsername(), admin.getPassword());
        if(admin!=null){
            return "redirect:/display?success";
        }
        return "redirect:/?error";
    }

}
