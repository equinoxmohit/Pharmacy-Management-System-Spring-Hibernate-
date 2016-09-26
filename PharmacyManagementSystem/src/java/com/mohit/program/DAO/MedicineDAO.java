/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.DAO;

import com.mohit.program.entity.Medicine;
import java.util.List;

/**
 *
 * @author Mohit
 */
public interface MedicineDAO {

    void insert(Medicine medicine);

    List<Medicine> getAll();

    void delete(int id);

    Medicine getById(int id);

    void update(int id);
}
