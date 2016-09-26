/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.DAO;

import com.mohit.program.entity.Admin;
import java.util.List;

/**
 *
 * @author Mohit
 */
public interface LoginDAO {

    List<Admin> getAll();

    Admin login(String username, String password);

}
