/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Mohit
 */
@Entity
@Table(name = "tbl_patient")
@NamedQueries({
    @NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p")})
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Integer patientId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "contact_number")
    private String contactNumber;
    @Column(name = "enquired_date", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date enquiredDate;
    @JoinColumn(name = "disease_id", referencedColumnName = "disease_id")
    @ManyToOne(optional = false)
    private Disease diseaseId;
    @JoinColumn(name = "medicine_id", referencedColumnName = "medicine_id")
    @ManyToOne(optional = false)
    private Medicine medicineId;

    public Patient() {
    }

    public Patient(Integer patientId) {
        this.patientId = patientId;
    }

    public Patient(Integer patientId, String firstName, String lastName, String emailId, String contactNumber, Date enquiredDate) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.enquiredDate = enquiredDate;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getEnquiredDate() {
        return enquiredDate;
    }

    public void setEnquiredDate(Date enquiredDate) {
        this.enquiredDate = enquiredDate;
    }

    public Disease getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Disease diseaseId) {
        this.diseaseId = diseaseId;
    }

    public Medicine getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Medicine medicineId) {
        this.medicineId = medicineId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientId != null ? patientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.patientId == null && other.patientId != null) || (this.patientId != null && !this.patientId.equals(other.patientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mohit.program.controller.Patient[ patientId=" + patientId + " ]";
    }

}
