/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.DAO.impl;

import com.mohit.program.DAO.LoginDAO;
import com.mohit.program.entity.Admin;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mohit
 */
@Repository(value="loginDao")
public class LoginDAOImpl implements LoginDAO {

    private List<Admin> adminList = new ArrayList<>();

    @Override
    public List<Admin> getAll() {
        adminList.add(new Admin(1, "admin", "password"));
        return adminList;
    }

    @Override
    public Admin login(String username, String password) {
        for (Admin a : getAll()) {
            if (((a.getUsername().equals(username)) && (a.getPassword().equals(password)))) {
                return a;
            }
        }
        return null;
    }

}
