package com.example.models.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "karyawan_training")
public class KaryawanTraining implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdDate;
    private Date deletedDate;
    private Date updatedDate;
    private Date tanggalTraining;
    private String karyawanId;
    private String trainingId;

    public KaryawanTraining() {
    }

    public KaryawanTraining(Date createdDate, Date deletedDate, Date updatedDate, Date tanggalTraining,
            String karyawanId, String trainingId) {
        this.createdDate = createdDate;
        this.deletedDate = deletedDate;
        this.updatedDate = updatedDate;
        this.tanggalTraining = tanggalTraining;
        this.karyawanId = karyawanId;
        this.trainingId = trainingId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getTanggalTraining() {
        return tanggalTraining;
    }

    public void setTanggalTraining(Date tanggalTraining) {
        this.tanggalTraining = tanggalTraining;
    }

    public String getKaryawanId() {
        return karyawanId;
    }

    public void setKaryawanId(String karyawanId) {
        this.karyawanId = karyawanId;
    }

    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }
}
