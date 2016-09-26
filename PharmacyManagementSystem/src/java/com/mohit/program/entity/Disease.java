/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.program.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Mohit
 */
@Entity
@Table(name = "tbl_disease")
public class Disease implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "disease_id")
    private Integer diseaseId;
    @Column(name = "disease_name")
    private String diseaseName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diseaseId")
    private List<Patient> patientList;

    public Disease() {
    }

    public Disease(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public Disease(Integer diseaseId, String diseaseName) {
        this.diseaseId = diseaseId;
        this.diseaseName = diseaseName;
    }

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diseaseId != null ? diseaseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disease)) {
            return false;
        }
        Disease other = (Disease) object;
        if ((this.diseaseId == null && other.diseaseId != null) || (this.diseaseId != null && !this.diseaseId.equals(other.diseaseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mohit.program.controller.Disease[ diseaseId=" + diseaseId + " ]";
    }

}
